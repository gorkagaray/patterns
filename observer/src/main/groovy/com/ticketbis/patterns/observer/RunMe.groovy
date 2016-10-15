package com.ticketbis.patterns.observer

import com.ticketbis.patterns.observer.observable.Job
import com.ticketbis.patterns.observer.observable.Recruiter
import com.ticketbis.patterns.observer.observer.Unemployed
import com.ticketbis.patterns.observer.observer.UnhappyEmployed

class RunMe {

    public static void main(String[] args) {

        // The real recruiter is: itjobs@ticketbis.com ;) ;)
        Recruiter mrStrabiz = new Recruiter()

        Job phpDev = new Job(name: "PHP 4.0 developer")
        // no one to notify yet
        mrStrabiz.setJob(phpDev)

        Unemployed mrSanchez = new Unemployed()
        mrStrabiz.addObserver(mrSanchez)

        Job silkDev = new Job(name: "Silk developer")
        mrStrabiz.setJob(silkDev)

        UnhappyEmployed mrRajoy = new UnhappyEmployed()
        mrStrabiz.addObserver(mrRajoy)

        Job javaDev = new Job(name: "Java developer", premiumJob: true)
        mrStrabiz.setJob(javaDev)
    }
}
