package ro.upt.ac.pcbe.news.sports;

public class BasketballTopic extends SportsTopic {
    private static int interestedInThisTopic;

    @Override
    public void notifyInterest() {
        if (isNew()) {
            interestedInThisTopic++;
        }
    }

    @Override
    public int getInterest() {
        return interestedInThisTopic;
    }
}
