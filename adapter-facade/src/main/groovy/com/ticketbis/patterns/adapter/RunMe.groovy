package com.ticketbis.patterns.adapter

import com.ticketbis.patterns.adapter.engine.EngineAdapter
import com.ticketbis.patterns.adapter.engine.NewEngine
import com.ticketbis.patterns.adapter.engine.OldEngine
import com.ticketbis.patterns.adapter.facade.EngineFacade
import com.ticketbis.patterns.adapter.engine.newImpl.Adrien
import com.ticketbis.patterns.adapter.engine.oldImpl.MundialCollect

class RunMe {

    public static void main(String[] args) {

        OldEngine oldImplementation = new MundialCollect()

        EngineFacade buyProcessor = new EngineFacade(oldImplementation)
        buyProcessor.buy()

        NewEngine newImplementation = new Adrien()
        OldEngine adapter = new EngineAdapter(newImplementation)

        buyProcessor = new EngineFacade(adapter)
        buyProcessor.buy()

    }
}
