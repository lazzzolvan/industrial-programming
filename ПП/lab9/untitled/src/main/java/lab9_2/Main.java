package lab9_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вершин:");
        int countVertex = scanner.nextInt();;

        Graph graph = new Graph(countVertex);

        int command = 0;
        while (command != 4) {
            printMenu();
            command = scanner.nextInt();;
            if (command == 1) {
                System.out.println("Введите вершины, которые вы хотите соединить ребром");
                System.out.println("Вершина 1:");
                int vertex1 = scanner.nextInt();
                System.out.println("Вершина 2:");
                int vertex2 = scanner.nextInt();

                graph.addRib(vertex1, vertex2);
            }
            if (command == 2) {
                System.out.println("Введите номер ребра который хотите удалить:");
                int numberRib = scanner.nextInt();

                graph.removeRib(numberRib);
            }
            if (command == 3) {
                printRibs(graph);
            }
        }
    }
    public static void printMenu() {
        System.out.println("Выберите что хотите сделать с графом:");
        System.out.println("1 - Добавить ребро");
        System.out.println("2 - Удалить ребро");
        System.out.println("3 - Показать ребра (связи вершин)");
        System.out.println("4 - Выход");
    }

    public static void printRibs(Graph graph) {
        Map<Integer, Vertex> ribs = new HashMap<>(graph.getRibs());
        for (Map.Entry<Integer, Vertex> integerVertexEntry : ribs.entrySet()) {
            System.out.println("Ребро с номер " + integerVertexEntry.getKey() + " связывает вершины " + integerVertexEntry.getValue().getVertex1() + " и " + integerVertexEntry.getValue().getVertex2());
        }
    }
}
