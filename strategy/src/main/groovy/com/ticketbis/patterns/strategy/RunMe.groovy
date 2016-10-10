package com.ticketbis.patterns.strategy

import com.ticketbis.patterns.strategy.engines.impl.*
import com.ticketbis.patterns.strategy.services.PaymentService

class RunMe {

    private static PaymentService paymentService

    public static void main(String[] args) {
        paymentService = new PaymentService()

        // Default
        paymentService.buy()
        paymentService.callback()
        paymentService.notification()

        // AdrienEngine
        paymentService.setPaymentEngine(new AdrienEngine())
        paymentService.buy()
        paymentService.callback()
        paymentService.notification()

        // MercadoPaymentEngine
        paymentService.setPaymentEngine(new MercadoPaymentEngine())
        paymentService.buy()
        paymentService.callback()
        paymentService.notification()

        // PeiPolEngine
        paymentService.setPaymentEngine(new PeiPolEngine())
        paymentService.buy()
        paymentService.callback()
        paymentService.notification()

        // WorldCollectEngine
        paymentService.setPaymentEngine(new WorldCollectEngine())
        paymentService.buy()
        paymentService.callback()
        paymentService.notification()
    }

}