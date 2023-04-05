import java.util.Scanner;

public class PreciousStones {
        String name;
        int pricePerCarat;
        int carat;
        int transparency;

        public PreciousStones(String name, int pricePerCarat, int transparency) {
                this.name = name;
                this.pricePerCarat = pricePerCarat;
                this.transparency = transparency;
        }

        public PreciousStones() {}

        public PreciousStones setPreciousStones(PreciousStones stones){
                Scanner in = new Scanner(System.in);
                System.out.println("Введите название камня");
                stones.name = in.next();
                System.out.println("Введите цену камня за карат ");
                stones.pricePerCarat = in.nextInt();
                System.out.println("Введите прозрачность камня");
                stones.transparency = in.nextInt();
                return stones;
        }
        public int setCaratForPreciousStones(PreciousStones stones){
                Scanner in = new Scanner(System.in);
                System.out.println("Введите вес используемого для ожерелья камня");
                stones.carat = in.nextInt();
                return stones.carat;
        }
        public PreciousStones[] setArrayPreciousStones (PreciousStones[] arrayPreciousStones,int lastAddStones){
                arrayPreciousStones[lastAddStones].setPreciousStones(arrayPreciousStones[lastAddStones]);
                return arrayPreciousStones;
        }
        public void toString(PreciousStones stones){
                System.out.println("Камень: "+stones.name+"; с ценой за карат = "+stones.pricePerCarat+ " и прозрачностью: " +stones.transparency);
        }
}