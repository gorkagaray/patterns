package com.ticketbis.patterns.state.states

import com.ticketbis.patterns.state.model.Payment

class PaidState implements State {

    Payment payment

    PaidState(Payment payment) {
        this.payment = payment
    }

    @Override
    void paying() {
        println "Payment is already being paid"
    }

    @Override
    void paid() {
        println "Payment is paid"
        next()
    }

    @Override
    void completed() {
        println "Payment cannot be completed from paying"
    }

    @Override
    void rejected() {
        println "Payment cannot be rejectd from paying"
    }

    @Override
    void next() {
        payment.state = payment.amount <= 1000 ? payment.completedState : payment.rejectedState
    }
}
