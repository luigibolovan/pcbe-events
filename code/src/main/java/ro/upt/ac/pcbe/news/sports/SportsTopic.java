package ro.upt.ac.pcbe.news.sports;

import ro.upt.ac.pcbe.news.Topic;

public abstract class SportsTopic extends Topic {
    protected static int interestedInThisTopic;

    public void notifyInterest() {
        if (isNew()) {
            interestedInThisTopic++;
        }
    }

    public int getInterest() {
        return interestedInThisTopic;
    }
}
