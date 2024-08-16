// package app;

// import java.util.ArrayList;

//Comparable interface implemented with the instantiation of the Edge class
public class extent implements Comparable<extent> {
    private Locations source;
    private Locations destination;
    private long time;
    private int distance;

    // Edge object structure definition
    public extent(Locations source, Locations destination, int distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.time = -1;
    }

    public extent(Locations source, Locations destination, int distance, long time) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.time = time;
    }

    public Locations getDestination() {
        return destination;
    }

    public Locations getSource() {
        return source;
    }

    public int getDistance() {
        return distance;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return source.getName() + " -> " + destination.getName() + " " + getDistance();
    }

    @Override
    public int compareTo(extent other) {
        if (getDistance() > other.getDistance())
            return 1;
        else if (getDistance() < other.getDistance())
            return -1;
        return 0;
    }

}
