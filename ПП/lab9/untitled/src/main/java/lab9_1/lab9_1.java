package lab9_1;

import java.util.*;

public class lab9_1 {
    public static void main(String[] args) {
        String poem1 = " Сегодня нищий, завтра я король,\n" +
                "  Банкир или любовник страстный.\n" +
                "  Надеюсь, что чужую  роль,\n" +
                "  Играя, прожил не напрасно.";
        String poem2 = " Стихи уж точно не слова\n" +
                "  С набором рифм и расстановкой точек,\n" +
                "  Пускай  их целая глава,\n" +
                "  Стихи лишь то, что сказано меж строчек.";
        String poem3 = "  Слышу, ветер запутался в листьях,\n" +
                "  Там  на ветке качнулась луна.\n" +
                "  Разве может быть несколько истин,\n" +
                "  Разве можно любовь не узнать?";

/*        List <String> poemList1 = new LinkedList<>();
        List <String> poemList2 = new LinkedList<>();
        List <String> poemList3 = new LinkedList<>();*/
        List<Poem> poemList = new ArrayList<Poem>();

poemList.add(new Poem(poem1));


        poemList1.addList(poem1);
        poemList2.addList(poem2);
        poemList3.addList(poem3);

        System.out.println("Изначальные стиховторения:");
        poemList1.printPoem(poemList1);
        poemList2.printPoem(poemList2);
        poemList3.printPoem(poemList3);
/*        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        for (int i = 0; i < poemList1.size() - 1; i++) {
            for (int j = i + 1; j < poemList1.size(); j++) {
                String s = "";
                if (comparator.compare(poemList1.get(i), poemList1.get(j)) > 0) {
                    s = poemList1.get(i);
                    poemList1.add(i, poemList1.get(j));
                    poemList1.remove(i+1);
                    poemList1.add(j, s);
                    poemList1.remove(j+1);
                }
            }
        }*/
        int currentLength = -1;


    }

/*    public static List<String> addList(String s) {
        List<String> poemList = new ArrayList<String>(Arrays.asList(s.split("\n")));
        return poemList;
    }

    public static void printPoem (List<String> poemList) {
        for (String s : poemList) {
            System.out.println(s);
        }
        System.out.println();
    }*/

}