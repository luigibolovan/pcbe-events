package ro.upt.ac.pcbe.news.politics;

public class PoliticsUE extends PoliticsTopic{
    private static int interestedInThisTopic;

    public void notifyInterest() {
        interestedInThisTopic++;
    }
}
