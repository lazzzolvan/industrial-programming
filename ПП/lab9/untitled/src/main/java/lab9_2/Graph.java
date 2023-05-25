package lab9_2;

import java.util.*;

public class Graph {
    private int countVertexes;
    private Set<Rib> ribs;
    private int countRibs = 1;

    public Graph(int countVertexes) {
        this.countVertexes = countVertexes;
        ribs = new HashSet<>();
    }

    public int getCountVertexes() {
        return countVertexes;
    }

    public void addRib (int vertex1, int vertex2) {
        Rib rib = new Rib(vertex1, vertex2);
        if (vertex1 == vertex2)
            System.out.println("Одну и ту же вершину нельзя соединить ребром");
        ribs.add(rib);
        countRibs++;
    }

    public void removeRib (int vertex1, int vertex2) {
        ribs.remove(new Rib(vertex1, vertex2));
    }

    public Set<Rib> getRibs() {
        return ribs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        return countVertexes == graph.countVertexes && countRibs == graph.countRibs && Objects.equals(ribs, graph.ribs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countVertexes, ribs, countRibs);
    }
}
