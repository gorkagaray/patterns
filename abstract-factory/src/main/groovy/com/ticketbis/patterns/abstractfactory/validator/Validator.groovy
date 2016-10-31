package com.ticketbis.patterns.abstractfactory.validator

import com.ticketbis.patterns.abstractfactory.document.Document

abstract class Validator {

    abstract boolean validate(Document document)

}
