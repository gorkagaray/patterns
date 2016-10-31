package com.ticketbis.patterns.abstractfactory.validator

import com.ticketbis.patterns.abstractfactory.document.Document

class RutValidator extends Validator {

    boolean validate(Document document) {
        String rut = document.value
        if (rut && rut.size() == 10) {
            rut = rut.toUpperCase().replaceAll("[^(\\d|K)]", "") // remove all non numeric chars
            if (rut && rut.size() == 9) {
                int rutValue = rut.substring(0, rut.length()-1) as int// this will be the RUT
                char cd = rut.substring(rut.length()-1) as char // this will be the control value
                int multiplier = 0, s = 1;
                for (; rutValue != 0; rutValue /= 10) {
                    s = (s + rutValue % 10 * (9 - multiplier++ % 6)) % 11;
                }
                return cd == (char) (s != 0 ? s + 47 : 75)
            }
        }
        return false
    }
}
