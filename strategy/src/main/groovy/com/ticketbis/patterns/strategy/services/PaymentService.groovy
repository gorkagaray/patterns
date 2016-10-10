package com.ticketbis.patterns.strategy.services

import com.ticketbis.patterns.strategy.engines.PaymentEngine
import com.ticketbis.patterns.strategy.engines.impl.DefaultEngine

class PaymentService {

    private PaymentEngine paymentEngine

    PaymentService() {
        this.paymentEngine = new DefaultEngine()
    }

    PaymentEngine getPaymentEngine() {
        return paymentEngine
    }

    void setPaymentEngine(PaymentEngine paymentEngineToUse) {
        this.paymentEngine = paymentEngineToUse
    }

    def buy() {
        paymentEngine.buy()
    }

    def callback() {
        paymentEngine.callback()
    }

    def notification() {
        paymentEngine.notification()
    }
}