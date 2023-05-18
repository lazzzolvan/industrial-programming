package lab9_2;

import java.util.Objects;

public class Vertex {
    private int vertex1;
    private int vertex2;

    public Vertex(int vertex1, int vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex() {
    }

    public int getVertex1() {
        return vertex1;
    }

    public void setVertex1(int vertex1) {
        this.vertex1 = vertex1;
    }

    public int getVertex2() {
        return vertex2;
    }

    public void setVertex2(int vertex2) {
        this.vertex2 = vertex2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return vertex1 == vertex.vertex1 && vertex2 == vertex.vertex2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertex1, vertex2);
    }
}
