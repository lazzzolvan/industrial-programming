package Lab5;

public class Tablet extends MedicinalPreparations{

    public Tablet() {
    }

    public Tablet(String name, int concentration, Status statusSubstance) {
        super(name, concentration, statusSubstance);
    }

    public void acceptTablet () {
        System.out.println("Вы приняли таблетку");
    }
}
