package com.ticketbis.patterns.strategy.engines.impl

import com.ticketbis.patterns.strategy.engines.PaymentEngine

class DefaultEngine implements PaymentEngine {

    def buy() {
        println("${this.class.name} can buy!")
    }

    def callback() {
        println("${this.class.name} does have a callback")
    }

    def notification() {
        println("${this.class.name} notifies payment state")
    }

}