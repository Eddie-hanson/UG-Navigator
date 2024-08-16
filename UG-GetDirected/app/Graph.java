// package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Graph {
    protected final HashMap<Locations, ArrayList<Locations>> map = new HashMap<>();
    protected final ArrayList<extent> ghu = new ArrayList<>();
    private int vertexSize = 0;

    public void addVertex(Locations vertex) {
        if (!map.containsKey(vertex)) {
            map.put(vertex, new ArrayList<>());
            vertexSize++;
        }
    }

    public void addEdge(extent edge) {
        if (ghu.contains(edge))
            return;

        this.ghu.add(edge);
        for (Locations source : map.keySet()) {
            if (source == edge.getSource()) {
                map.get(source).add(edge.getDestination());
            }
        }
    }

    public ArrayList<extent> getDestinationEdges(Locations source) {
        ArrayList<extent> destinations = new ArrayList<>();
        for (extent edge : this.ghu) {
            if (edge.getSource() == source) {
                destinations.add(edge);
            }
        }
        return destinations;
    }

    public extent getEdge(Locations source, Locations destination) {
        for (extent edge : this.ghu) {
            if (edge.getSource() == source && edge.getDestination() == destination) {
                return edge;
            }
        }
        return null;
    }

    public Locations getNodeByName(String name) {
        for (Locations vertex : map.keySet()) {
            if (vertex.getName().toLowerCase().equals(name.toLowerCase())) {
                return vertex;
            }
        }
        return null;
    }

    public Set<Locations> getNodes() {
        return this.map.keySet();
    }

    public int getNodeSize() {
        return vertexSize;
    }

    public void listPlaces(Locations except) {
        int index = 1;
        for (Locations vertex : map.keySet()) {
            if (vertex != except) {
                System.out.println(index + ". " + vertex.getName());
            }
            index++;
        }
    }

}
