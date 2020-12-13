package ro.upt.ac.pcbe.news.politics;

public class PoliticsUSA extends PoliticsTopic {
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
