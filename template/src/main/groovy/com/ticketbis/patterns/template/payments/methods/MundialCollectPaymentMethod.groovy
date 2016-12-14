package com.ticketbis.patterns.template.payments.methods

import com.ticketbis.patterns.template.payments.AbstractPaymentMethod

class MundialCollectPaymentMethod extends AbstractPaymentMethod {

    boolean paymentStatusOk() {
        Math.random() > 0.3 // 30% of success payments :)
    }

    void pay() {
        println "Payment done through ${getClass().name}"
    }

    void doFinally() {
        println "${getClass().name} needs to log this after every process"
    }

    boolean shouldDoFinally() {
        true
    }

}
