package com.ticketbis.patterns.abstractfactory.validator

import com.ticketbis.patterns.abstractfactory.document.Document

class CuitValidator extends Validator {

    private static final List SERIE = [2, 3, 4, 5, 6, 7, 2, 3, 4, 5]

    boolean validate(Document document) {
        String cuit = document.value
        if (cuit && cuit.size() == 13) {
            def arr = cuit.split('-')
            if (arr.length == 3) {
                if (arr[0].size() == 2 && arr[1].size() == 8 && arr[2].size() == 1) {
                    String number = arr[0] + arr[1]
                    int validator = arr[2] as int

                    int acum = 0
                    number.eachWithIndex { c, i ->
                        int v = (c as int) * SERIE[9 - i]
                        acum += v
                    }

                    int digit = 11 - acum % 11
                    digit = digit == 11 ? 0 : digit
                    digit = digit == 10 ? 9 : digit
                    return validator == digit
                }
            }
        }
        return false
    }
}
