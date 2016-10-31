package com.ticketbis.patterns.abstractfactory.factory

import com.ticketbis.patterns.abstractfactory.document.Document
import com.ticketbis.patterns.abstractfactory.document.CuitDocument

class CuitDocumentFactory extends DocumentFactory{

    Document createDocument(String value) {
        new CuitDocument(value: value)
    }
}
