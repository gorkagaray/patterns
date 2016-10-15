package com.ticketbis.patterns.observer.observer

import com.ticketbis.patterns.observer.observable.Recruiter

class UnhappyEmployed implements Observer {

    private String newJobOffer

    public void update(Observable obs, Object arg) {
        if (obs instanceof Recruiter) {
            Recruiter recruiter = (Recruiter)obs

            // Do not bother me with worse jobs that the one I have
            if (recruiter.job.premiumJob) {
                newJobOffer = recruiter.job.name
                println "${this.class.name} has been offered a new job! (${newJobOffer})"
            }
        }
    }
}
