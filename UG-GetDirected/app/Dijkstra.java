// package app;

import java.util.ArrayList;
import java.util.HashMap;

public class Dijkstra {
    // Keep track of all Vertex in the graph that haven't been visited yet.
    private static ArrayList<Locations> NOT_VISITED = new ArrayList<>();

    // A map of each vertex, along with the minimum cost/distance between them.
    private static HashMap<Locations, Integer> DISTANCE_MAP = new HashMap<>();

    // A vertex's map and the preceding vertex from which it was reached. Later, it
    // was used to recreate the minimum path.
    private static HashMap<Locations, Locations> PREVIOUS_VERTEX = new HashMap<>();

    public static void findShortestPath(Graph graph, Locations source, Locations destination) {
        if (source == destination) {
            System.out.print(source.getName());
            return;
        }

        // Set the cost to reach each vertex to infinity.
        for (Locations vertex : graph.getNodes()) {
            DISTANCE_MAP.put(vertex, Integer.MAX_VALUE);
            PREVIOUS_VERTEX.put(vertex, null);
            NOT_VISITED.add(vertex);
        }

        // Set the cost to reach the source vertex to zero.
        DISTANCE_MAP.put(source, 0);

        // Find the vertex with least distance to reach.
        Locations minNode = findVertexWithMinDist();
        while (NOT_VISITED.size() > 0 && minNode != null) {
            // Find the vertex with least distance to reach.
            minNode = findVertexWithMinDist();

            // Mark this vertex as visited.
            NOT_VISITED.remove(minNode);

            // Explore all the neighbors of this vertex.
            ArrayList<extent> edges = graph.getDestinationEdges(minNode);
            for (extent edge : edges) {
                // Checking for cycles: i.e., if we've not already visited this vertex.
                if (NOT_VISITED.contains(edge.getDestination())) {

                    // Calculate alternative cost
                    int alt = DISTANCE_MAP.get(minNode) + edge.getDistance();

                    if (alt < DISTANCE_MAP.get(edge.getDestination())) { // If the alternative cost is smaller than the
                                                                         // current cost.
                        // Update the min cost to reach this vertex.
                        DISTANCE_MAP.put(edge.getDestination(), alt);

                        // Update the previous vertex to reach this current vertex.
                        PREVIOUS_VERTEX.put(edge.getDestination(), minNode);
                    }
                }
            }
        }
    }

    public static String getTotalDistance(Locations destination) {
        return String.format("%.3f", DISTANCE_MAP.get(destination) / 1000f) + "km";
    }

    public static String getShortestPath(Locations source, Locations destination) {
        ArrayList<Locations> path = new ArrayList<>();

        while (PREVIOUS_VERTEX.get(destination) != null) {
            path.add(destination);
            destination = PREVIOUS_VERTEX.get(destination);
        }
        path.add(source);

        StringBuilder builder = new StringBuilder();
        for (int i = path.size() - 1; i >= 0; i--) {
            Locations vertex = path.get(i);
            builder.append(vertex.getName());
            builder.append(" => ");
        }
        return builder.toString();
    }

    private static Locations findVertexWithMinDist() {
        // Linear search for the min cost vertex based on the distance.
        Locations minNode = null;
        long minDistance = Long.MAX_VALUE;
        for (HashMap.Entry<Locations, Integer> entry : DISTANCE_MAP.entrySet()) {
            Locations vertex = entry.getKey();
            int distance = entry.getValue();
            if (NOT_VISITED.contains(vertex) && distance < minDistance) {
                minDistance = distance;
                minNode = vertex;
            }
        }
        return minNode;
    }
}
