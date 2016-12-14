package com.ticketbis.patterns.state.states

import com.ticketbis.patterns.state.model.Payment

class CompletedState implements State {

    Payment payment

    CompletedState(Payment payment) {
        this.payment = payment
    }

    @Override
    void paying() {
        println "Payment has already been successfully paid"
    }

    @Override
    void paid() {
        println "Payment has already been successfully paid"
    }

    @Override
    void completed() {
        println "Payment has already been successfully paid"
    }

    @Override
    void rejected() {
        println "Payment has already been successfully paid"
    }

    @Override
    void next() {
        println "Completed is a final state"
    }
}
