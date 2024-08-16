// package app;

public class map extends Graph {
    extent dg;

    @Override
    public void addEdge(extent edge) {

        this.dg = edge;
        if (ghu.contains(edge))
            return;

        this.ghu.add(edge);
        this.ghu.add(new extent(edge.getDestination(), edge.getSource(), edge.getDistance()));
        for (Locations vertex : map.keySet()) {
            if (vertex == edge.getSource()) {
                map.get(vertex).add(edge.getDestination());
            }
        }

        for (Locations vertex : map.keySet()) {
            if (vertex == edge.getDestination()) {
                map.get(vertex).add(edge.getSource());
            }
        }
    }

    public int getDistance(Locations locations, Locations locations1) {
        return dg.getDistance();
    }
}
