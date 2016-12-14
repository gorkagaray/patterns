package com.ticketbis.patterns.template

import com.ticketbis.patterns.template.payments.methods.AdrienPaymentMethod
import com.ticketbis.patterns.template.payments.methods.MundialCollectPaymentMethod

class RunMe {

    public static void main (String[] args) {

        AdrienPaymentMethod adrienPaymentMethod = new AdrienPaymentMethod()
        adrienPaymentMethod.buy()

        MundialCollectPaymentMethod mundialCollectPaymentMethod = new MundialCollectPaymentMethod()
        mundialCollectPaymentMethod.buy()

    }
}
