package lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poem {
    List<String> poem;
    int averageLength;

    public Poem(String s) {
        this.poem = new ArrayList<String>(Arrays.asList(s.split("\n")));
        this.averageLength = findAverageLength(poem);
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    public List<String> getPoem() {
        return poem;
    }

    public void setPoem(List<String> poem) {
        this.poem = poem;
    }


    public void printPoem (Poem poem) {
        for (String s : poem.getPoem()) {
            System.out.println(s);
        }
        System.out.println();
    }

    public int findAverageLength(List<String> poem) {
        int currentLength = 0;
        int countLines = 0;

        for (String s : poem) {
            currentLength += s.length();
            countLines++;
        }
        return currentLength / countLines;
    }
}
