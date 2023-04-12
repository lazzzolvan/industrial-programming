import java.util.Scanner;

public class laba4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // firstGroup stones = new firstGroup();
        firstGroup[] arrayStonersFirst =new firstGroup[5];
        int lastAddFirstStones = 5;
        arrayStonersFirst[0] = new firstGroup("name",3,2);
        arrayStonersFirst[1] = new firstGroup("name",3,2);
        arrayStonersFirst[2] = new firstGroup("name",3,2);
        arrayStonersFirst[3] = new firstGroup("name",3,2);
        arrayStonersFirst[4] = new firstGroup("name",3,2);
        secondGroup[] arrayStonesSecond = new secondGroup[5];
        int lastAddSecondStones = 5;
        arrayStonesSecond[0] = new secondGroup("name",3,2);
        arrayStonesSecond[1] = new secondGroup("name",3,2);
        arrayStonesSecond[2] = new secondGroup("name",3,2);
        arrayStonesSecond[3] = new secondGroup("name",3,2);
        arrayStonesSecond[4] = new secondGroup("name",3,2);
        thirdGroup[] arrayStonesThird = new thirdGroup[5];
        int lastAddThirdStones = 5;
        arrayStonesThird[0] = new thirdGroup("name",3,2);
        arrayStonesThird[1] = new thirdGroup("name",3,2);
        arrayStonesThird[2] = new thirdGroup("name",3,2);
        arrayStonesThird[3] = new thirdGroup("name",3,2);
        arrayStonesThird[4] = new thirdGroup("name",3,2);
        int n;
        int t = 0;
        while (t!=1){
            System.out.println("1:Добавить новый камень ");
            System.out.println("2:Собрать ожерелье ");
            System.out.println("3:Посчитать вес и стоимость ожерелья ");
            System.out.println("4:Найти камень заданому диапозону прозрачности");
            System.out.println("5: Завершить программу");
            n = in.nextInt();
            switch (n){
                case 1:
                    System.out.println("Введите прозрачность камня (%)");
                    int TransparencyInputPerson = in.nextInt();
                    if (TransparencyInputPerson < 40){
                        arrayStonesThird[lastAddThirdStones].setPreciousStones(arrayStonesThird[lastAddThirdStones]);
                        lastAddThirdStones+=1;
                    }
                    if ((TransparencyInputPerson > 40)&&(TransparencyInputPerson<60)){
                        arrayStonesSecond[lastAddSecondStones].setPreciousStones(arrayStonesSecond[lastAddSecondStones]);
                        lastAddSecondStones+=1;
                    }
                    if (TransparencyInputPerson > 60){
                        arrayStonersFirst[lastAddFirstStones].setPreciousStones(arrayStonersFirst[lastAddFirstStones]);
                        lastAddFirstStones+=1;
                    }
                    break;
                case 2:
                    System.out.println("Введите количество камней входящих в ожерелье ");
                    int countStonesForDecoration = in.nextInt();
                    PreciousStones[] decoration = new PreciousStones[countStonesForDecoration];
                    for (int i=0;i<countStonesForDecoration;i++){
                        System.out.println("Введите группу "+(i+1)+ " камня");
                        int StonesDecoration = in.nextInt();
                        int indexStones;
                        switch(StonesDecoration){
                            case 1:
                                for (int j = 0; j < arrayStonersFirst.length; j++) {
                                    System.out.print(j+1+" ");
                                    arrayStonersFirst[j].toString(arrayStonersFirst[j]);
                                }
                                System.out.println("Введите индекс камня");
                                indexStones = in.nextInt();
                                decoration[i] = arrayStonersFirst[indexStones-1];
                                System.out.println("Введите вес камня:");
                                decoration[i].carat = in.nextInt();
                                break;
                            case 2:
                                for (int j = 0; j < arrayStonersFirst.length; j++) {
                                    System.out.print(j+1+" ");
                                    arrayStonersFirst[j].toString(arrayStonesSecond[j]);
                                }
                                System.out.println("Введите индекс камня");
                                indexStones = in.nextInt();
                                decoration[i] = arrayStonersFirst[indexStones-1];
                                System.out.println("Введите вес камня:");
                                decoration[i].carat = in.nextInt();
                                break;
                            case 3:
                                for (int j = 0; j < arrayStonersFirst.length; j++) {
                                    System.out.print(j+1+" ");
                                    arrayStonersFirst[j].toString(arrayStonesThird[j]);
                                }
                                System.out.println("Введите индекс камня");
                                indexStones = in.nextInt();
                                decoration[i] = arrayStonersFirst[indexStones-1];
                                System.out.println("Введите вес камня:");
                                decoration[i].carat = in.nextInt();
                                break;
                        }
                    }
                    System.out.println("Ожирелье состоит:");
                    for (int i = 0; i < decoration.length; i++) {
                        System.out.println((i+1)+" Камень " + decoration[i].name);
                    }
                case 5:
                    t = 1;
                    break;
            }
        }

    }
    /*public void setStones(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите прозрачность камня (%)");
        int TransparencyInputPerson = in.nextInt();
        if (TransparencyInputPerson < 40){
            thirdGroup
        }
    }*/
}
