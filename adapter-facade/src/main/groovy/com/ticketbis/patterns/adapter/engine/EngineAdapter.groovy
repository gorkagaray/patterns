package com.ticketbis.patterns.adapter.engine

class EngineAdapter implements OldEngine {

    NewEngine engine

    EngineAdapter(NewEngine engine) {
        this.engine = engine
    }

    @Override
    void pay() {
        engine.buy()
    }

    @Override
    void callback() {
        engine.callback()
    }

    @Override
    String toString() {
        this.engine.class.name
    }
}
