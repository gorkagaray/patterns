package com.ticketbis.patterns.abstractfactory

import com.ticketbis.patterns.abstractfactory.document.Document

import com.ticketbis.patterns.abstractfactory.factory.CuitDocumentFactory
import com.ticketbis.patterns.abstractfactory.factory.DocumentFactory
import com.ticketbis.patterns.abstractfactory.factory.RutDocumentFactory

import com.ticketbis.patterns.abstractfactory.factory.ValidatorFactory
import com.ticketbis.patterns.abstractfactory.validator.Validator

class RunMe {

    public static void main(String[] args) {

        DocumentFactory rutFactory = new RutDocumentFactory()
        Document rut = rutFactory.createDocument("18379410-8") // valid rut
        Validator rutValidator = ValidatorFactory.getValidator(rut.name)

        println rutValidator.validate(rut)

        DocumentFactory cuitFactory = new CuitDocumentFactory()
        Document cuit = cuitFactory.createDocument("20-11111111-9") //invalid cuit
        Validator cuitValidator = ValidatorFactory.getValidator(cuit.name)

        println cuitValidator.validate(rut)
    }
}
