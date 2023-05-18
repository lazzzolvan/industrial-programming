package lab9_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Graph {
    private int countVertexes;
    private Map<Integer, Vertex> ribs;
    private int countRibs = 1;

    public Graph(int countVertexes) {
        this.countVertexes = countVertexes;
        ribs = new HashMap<>();
    }

    public int getCountVertexes() {
        return countVertexes;
    }

    public void addRib (int vertex1, int vertex2) {
        Vertex vertex = new Vertex(vertex1, vertex2);
        if (ribs.containsValue(new Vertex(vertex1, vertex2)) || ribs.containsValue(new Vertex(vertex2, vertex1)))
            return;
        if (vertex1 == vertex2)
            System.out.println("Одну и ту же вершину нельзя соединить ребром");
        ribs.put(countRibs, vertex);
        countRibs++;
    }

    public void removeRib (int numberRib) {
        if (!ribs.containsKey(numberRib))
            return;
        ribs.remove(numberRib, ribs.get(numberRib));
    }

    public Map<Integer, Vertex> getRibs() {
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
