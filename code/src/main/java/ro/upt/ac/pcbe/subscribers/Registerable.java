package ro.upt.ac.pcbe.subscribers;

import ro.upt.ac.pcbe.sys.NewsSys;

public class Registerable {
    protected NewsSys sys;

    public Registerable(NewsSys sys) {
        this.sys = sys;
    }

    public void register() {
        sys.registerSubscriber(this);
    }
    public void unregister() {
        sys.unregisterSubscriber(this);
    }
}
