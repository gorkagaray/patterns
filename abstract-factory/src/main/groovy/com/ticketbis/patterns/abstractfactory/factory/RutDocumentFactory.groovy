package com.ticketbis.patterns.abstractfactory.factory

import com.ticketbis.patterns.abstractfactory.document.Document
import com.ticketbis.patterns.abstractfactory.document.RutDocument

class RutDocumentFactory extends DocumentFactory{

    Document createDocument(String value) {
        new RutDocument(value: value)
    }
}
