package com.ticketbis.patterns.abstractfactory.factory

import com.ticketbis.patterns.abstractfactory.validator.CuitValidator
import com.ticketbis.patterns.abstractfactory.validator.RutValidator

class ValidatorFactory {

    static getValidator(String documentName) {
        switch (documentName) {
            case "rut": new RutValidator()
                break
            case "cuit": new CuitValidator()
                break
            default: throw new Exception("Document Unsoported")
        }
    }

}
