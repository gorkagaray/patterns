package com.ticketbis.patterns.singleton.mysingleton

class Semaphore {

    static Semaphore uniqueInstance

    // non-static check, guaranteed by Semaphore uniqueness
    boolean free = true

    private Semaphore() {
        // Extremely heavy load here...
        (1..10).each {
            print "."
            sleep(1000)
        }
    }

    static Semaphore getInstance() {
        if (!uniqueInstance) {
            synchronized (this) {
                if (!uniqueInstance) {
                    print "Heavy loading. Should happen only once. Please, wait"
                    uniqueInstance = new Semaphore()
                    println ""
                }
            }
        }

        uniqueInstance
    }
}
