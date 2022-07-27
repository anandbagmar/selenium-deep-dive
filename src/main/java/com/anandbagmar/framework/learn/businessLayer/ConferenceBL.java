package com.anandbagmar.framework.learn.businessLayer;

import com.anandbagmar.framework.learn.pages.ConferenceLandingPage;
import com.anandbagmar.framework.learn.pages.LandingPage;

public class ConferenceBL {

    public ConferenceBL selectUpcomingConference(String conferenceName) {
        new LandingPage().selectFromUpcomingConferences()
                         .selectConference(conferenceName);
        return this;
    }

    public ScheduleBL viewSchedule() {
        new ConferenceLandingPage().viewSchedule();
        return new ScheduleBL();
    }

    public ConferenceBL selectConferenceFromPast(String conferenceName) {
        new LandingPage().selectFromPastConferences()
                         .selectConference(conferenceName);
        return this;
    }
}