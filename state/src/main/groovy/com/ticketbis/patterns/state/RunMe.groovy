package com.ticketbis.patterns.state

import com.ticketbis.patterns.state.model.Payment

class RunMe {

    public static void main(String[] args) {

        [new Payment(999), new Payment(1001)].each { Payment payment ->

            payment.paying()
            payment.paying()
            payment.paid()
            payment.paid()
            payment.completed()
            payment.completed()
            payment.rejected()
            payment.rejected()
        }


    }
}
