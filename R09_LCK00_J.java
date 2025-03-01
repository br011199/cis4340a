public class SomeObject {
    public final Object lock = new Object();

    public void changeValue() {
        synchronized (lock) {
            // ...
        }
    }
}