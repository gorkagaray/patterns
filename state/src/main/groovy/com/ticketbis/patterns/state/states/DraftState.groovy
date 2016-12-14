package com.ticketbis.patterns.state.states

import com.ticketbis.patterns.state.model.Payment

class DraftState implements State {

    Payment payment

    DraftState(Payment payment) {
        this.payment = payment
    }

    @Override
    void paying() {
        println "Payment is about to be paid"
        next()
    }

    @Override
    void paid() {
        println "Payment cannot be paid from draft"
    }

    @Override
    void completed() {
        println "Payment cannot be completed from draft"
    }

    @Override
    void rejected() {
        println "Payment cannot be rejected from draft"
    }

    @Override
    void next() {
        payment.state = payment.paidState
    }
}
