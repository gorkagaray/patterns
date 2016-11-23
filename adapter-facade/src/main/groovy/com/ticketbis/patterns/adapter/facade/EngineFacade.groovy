package com.ticketbis.patterns.adapter.facade

import com.ticketbis.patterns.adapter.engine.OldEngine

class EngineFacade {

    OldEngine engine

    EngineFacade(OldEngine engine) {
        println "Using ${engine} as payment engine"
        this.engine = engine
    }

    void buy() {
        engine.pay()
        engine.callback()
    }
}
