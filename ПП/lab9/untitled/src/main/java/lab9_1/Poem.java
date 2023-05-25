package lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poem {
    List<String> poem;

    public Poem(String s) {
        this.poem = new ArrayList<String>(Arrays.asList(s.split("\n")));
    }

    public List<String> getPoem() {
        return poem;
    }

    public void setPoem(List<String> poem) {
        this.poem = poem;
    }

/*    public  List<String> addList(String s) {
        List<String> poemList = new ArrayList<String>(Arrays.asList(s.split("\n")));
        setPoem(poemList);
        return poemList;
    }*/

    public void printPoem (Poem poem) {
        for (String s : poem.getPoem()) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static int findMinLength(Poem poem) {
        int minLength = -1;
        for (String s : poem.getPoem()) {
            if (minLength > s.length())
                minLength = s.length();
        }
        return minLength;
    }
}
