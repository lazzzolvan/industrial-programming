package lab9_1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class lab9_1 {
    public static void main(String[] args) {
        List <String> poem = new LinkedList<>();
        poem = addList(poem);

        System.out.println("Изначальное стиховторение:");
        for (String s : poem) {
            System.out.println(s);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        for (int i = 0; i < poem.size() - 1; i++) {
            for (int j = i + 1; j < poem.size(); j++) {
                String s = "";
                if (comparator.compare(poem.get(i), poem.get(j)) > 0) {
                    s = poem.get(i);
                    poem.add(i, poem.get(j));
                    poem.remove(i+1);
                    poem.add(j, s);
                    poem.remove(j+1);
                }
            }
        }

        System.out.println();
        System.out.println("Отсортированное:");
        for (String s : poem) {
            System.out.println(s);
        }
    }

    public static List<String> addList(List<String> poemList) {
        poemList.add("Стихи уж точно не слова.");
        poemList.add("С набором рифм и расстановкой точек.");
        poemList.add("Пускай  их целая глава.");
        poemList.add("Стихи лишь то, что сказано меж строчек.");
        return poemList;
    }
}