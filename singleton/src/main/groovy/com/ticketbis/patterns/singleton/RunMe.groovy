package com.ticketbis.patterns.singleton

import com.ticketbis.patterns.singleton.mysingleton.Semaphore

class RunMe {

    static void main(String[] args) {

        // Ten cars share the same semaphore instance without knowing it
        // Sychronized builder makes it thread safe
        // Heavy loading of the semaphore (which happens just once) makes car nº 1 (at least) to start waiting
        // Cars checking the semaphore randomly makes each execution different!

        boolean debugModeOn = false
        (1..10).each {
            int carNo = it
            Thread.start {
                new Car(carNo, Semaphore.getInstance(), debugModeOn).move()
            }
        }

    }
}
