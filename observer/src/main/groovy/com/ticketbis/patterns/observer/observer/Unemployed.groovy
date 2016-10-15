package com.ticketbis.patterns.observer.observer

import com.ticketbis.patterns.observer.observable.Recruiter

class Unemployed implements Observer {

    private String jobOffer

    public void update(Observable obs, Object arg) {
        // Please, do not bother me if you are not a recruiter ;)
        if (obs instanceof Recruiter) {
            Recruiter recruiter = (Recruiter)obs
            jobOffer = recruiter.job.name
            println "${this.class.name} has been offered a new job! (${jobOffer})"
        }
    }
}
