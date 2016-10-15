package com.ticketbis.patterns.observer.observable

class Recruiter extends Observable {

    private Job job

    void newJobOffered() {
        setChanged()
        notifyObservers()
    }

    void setJob(Job newJob) {
        job = newJob
        newJobOffered()
    }
}

class Job {
    private String name
    private boolean premiumJob = false
}