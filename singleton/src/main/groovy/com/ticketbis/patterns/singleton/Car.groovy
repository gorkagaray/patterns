package com.ticketbis.patterns.singleton

import com.ticketbis.patterns.singleton.mysingleton.Semaphore

class Car {

    Semaphore semaphore
    int number
    boolean debugModeOn = false

    Car(int number, Semaphore semaphore, boolean debugModeOn = false) {
        this.number = number
        this.semaphore = semaphore
        this.debugModeOn = debugModeOn
    }

    void move() {
        if (semaphore.free) {
            semaphore.free = false
            println "I (car nº ${number}) move, therefore, I am"
            sleep(1000)
            semaphore.free = true
        } else {
            if (debugModeOn) {
                println "-----> ${number} waiting for semaphore to be free..."
            }
            sleep((100 * Math.random()) as int)
            move()
        }
    }
}
