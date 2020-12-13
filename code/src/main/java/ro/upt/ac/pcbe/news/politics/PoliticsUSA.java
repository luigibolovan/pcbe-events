package ro.upt.ac.pcbe.news.politics;

public class PoliticsUSA extends PoliticsTopic {
    private static int interestedInThisTopic;

    public void notifyInterest() {
        interestedInThisTopic++;
    }
}
