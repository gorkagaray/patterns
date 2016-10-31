package com.ticketbis.patterns.abstractfactory.factory

import com.ticketbis.patterns.abstractfactory.document.Document

abstract class DocumentFactory {

    protected abstract Document createDocument(String value)
}
