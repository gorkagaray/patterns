package com.ticketbis.patterns.adapter.engine.newImpl

import com.ticketbis.patterns.adapter.engine.NewEngine

class Adrien implements NewEngine {

    void buy() {
        println "${this.class.name} Buying!"
    }

    void callback() {
        println "${this.class.name} Back in town"
    }
}
