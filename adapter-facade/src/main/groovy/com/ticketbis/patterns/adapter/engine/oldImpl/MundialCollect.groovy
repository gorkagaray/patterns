package com.ticketbis.patterns.adapter.engine.oldImpl

import com.ticketbis.patterns.adapter.engine.OldEngine

class MundialCollect implements OldEngine {

    @Override
    void pay() {
        println "${this.class.name} Paying!"
    }

    @Override
    void callback() {
        println "${this.class.name} Back in town"
    }

    @Override
    String toString() {
        this.class.name
    }
}
