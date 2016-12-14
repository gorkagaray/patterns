package com.ticketbis.patterns.template.payments

abstract class AbstractPaymentMethod {

    final void buy() {
        bookTickets()
        pay()
        if (!paymentStatusOk()) {
            unbookTickets()
        }

        if (shouldDoFinally()) {
            doFinally()
        }
     }

    protected void bookTickets() {
        println "Tickets booked!"
    }

    protected abstract void pay()

    protected abstract boolean paymentStatusOk()

    protected void unbookTickets() {
        println "Unsuccessful payment process, tickets unbooked."
    }

    protected void doFinally() {}
    protected boolean shouldDoFinally() {
        false
    }
}
