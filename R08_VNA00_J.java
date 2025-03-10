final class ControlledStop implements Runnable {
    private volatile boolean done = false;

    @override public void run() {
        while (!done) {
            try {
                // ...
                Thread.currentThread().sleep(1000); // Do something
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt(); // Reset interrupted status
            }
        }
    }

    public void shutdown() {
        done = true;
    }
}