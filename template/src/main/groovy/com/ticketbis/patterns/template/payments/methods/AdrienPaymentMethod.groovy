package com.ticketbis.patterns.template.payments.methods

import com.ticketbis.patterns.template.payments.AbstractPaymentMethod

class AdrienPaymentMethod extends AbstractPaymentMethod {

    boolean paymentStatusOk() {
        Math.random() > 0.7 // 70% of success payments :)
    }

    void pay() {
        println "Payment done through ${getClass().name}"
    }
}
