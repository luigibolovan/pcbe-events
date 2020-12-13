package ro.upt.ac.pcbe.subscribers;

import ro.upt.ac.pcbe.sys.NewsSys;

public class Registrable {
    protected NewsSys sys;

    public Registrable(NewsSys sys) {
        this.sys = sys;
    }

    public void register() {
        sys.registerSubscriber(this);
    }
    public void unregister() {
        sys.unregisterSubscriber(this);
    }
}
