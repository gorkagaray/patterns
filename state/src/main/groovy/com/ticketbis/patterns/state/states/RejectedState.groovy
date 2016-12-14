package com.ticketbis.patterns.state.states

import com.ticketbis.patterns.state.model.Payment

class RejectedState implements State {

    Payment payment

    RejectedState(Payment payment) {
        this.payment = payment
    }

    @Override
    void paying() {
        println "Payment has already been rejected"
    }

    @Override
    void paid() {
        println "Payment has already been rejected"
    }

    @Override
    void completed() {
        println "Payment has already been rejected"
    }

    @Override
    void rejected() {
        println "Payment has already been rejected"
    }

    @Override
    void next() {
        println "Rejected is a final state"
    }
}
