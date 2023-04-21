package Lab5;

public class Medicine extends MedicinalPreparations{
    public Medicine(String name, int concentration, Status statusSubstance) {
        super(name, concentration, statusSubstance);
    }

    public Medicine() {
    }

    public void acceptMedicine() {
        System.out.println("Вы приняли лекарство");
    }
}
