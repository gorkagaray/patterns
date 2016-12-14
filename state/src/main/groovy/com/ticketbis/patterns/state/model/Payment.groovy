package com.ticketbis.patterns.state.model

import com.ticketbis.patterns.state.states.CompletedState
import com.ticketbis.patterns.state.states.DraftState
import com.ticketbis.patterns.state.states.PaidState
import com.ticketbis.patterns.state.states.RejectedState
import com.ticketbis.patterns.state.states.State

class Payment {

    State draftState
    State paidState
    State completedState
    State rejectedState

    State state
    Double amount

    Payment(Double amount) {
        this.amount = amount
        draftState = new DraftState(this)
        paidState = new PaidState(this)
        completedState = new CompletedState(this)
        rejectedState = new RejectedState(this)

        state = draftState
    }

    void paying() {
        state.paying()
    }

    void paid() {
        state.paid()
    }

    void completed() {
        state.completed()
    }

    void rejected() {
        state.rejected()
    }
}
