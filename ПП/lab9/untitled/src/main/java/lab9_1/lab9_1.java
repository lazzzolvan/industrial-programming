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
        List<Poem> poemList = new ArrayList<Poem>();

        poemList.add(new Poem(poem3));
        poemList.add(new Poem(poem1));
        poemList.add(new Poem(poem2));

        System.out.println("Исходные стихотворения:");
        for (Poem poem : poemList) {
            poem.printPoem(poem);
        }

        System.out.println("------------------------------------");
        for (int i = 1; i < poemList.size(); i++) {
            if (poemList.get(i).getAverageLength() < poemList.get(i - 1).getAverageLength()) {
                poemList.add(i-1, poemList.get(i));
                poemList.remove(i+1);
                poemList.add(i, poemList.get(i-1));
                poemList.remove(i);
            }
        }
        System.out.println("Отсортированные стиховторения");
        System.out.println();
        for (Poem poem : poemList) {
            poem.printPoem(poem);
        }
    }
}