package lab9_2;

import java.util.*;

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
                System.out.println("Введите вершины, которые вы хотите соединить ребром");
                System.out.println("Вершина 1:");
                int vertex1 = scanner.nextInt();
                System.out.println("Вершина 2:");
                int vertex2 = scanner.nextInt();

                graph.removeRib(vertex1,vertex2);
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
        Set<Rib> ribs = new HashSet<>(graph.getRibs());
        int count = 0;
        for (Rib rib : ribs){
            System.out.println("Ребро с номер " + (count+1) + " связывает вершины " + rib.getVertex1() + " и " + rib.getVertex2());
            count++;
        }
    }
}
