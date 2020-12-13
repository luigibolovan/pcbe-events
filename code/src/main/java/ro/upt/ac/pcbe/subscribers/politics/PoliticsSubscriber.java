package ro.upt.ac.pcbe.subscribers.politics;

import ro.upt.ac.pcbe.subscribers.Registerable;
import ro.upt.ac.pcbe.sys.NewsSys;

public abstract class PoliticsSubscriber extends Registerable {
    public PoliticsSubscriber(NewsSys sys) {
        super(sys);
    }
}
