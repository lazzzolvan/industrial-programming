package Lab5;

public class Ointment extends MedicinalPreparations{
    public Ointment(String name, int concentration, Status statusSubstance) {
        super(name, concentration, statusSubstance);
    }

    public Ointment() {
    }

    public void acceptOintment() {
        System.out.println("Вы приняли мазь");
    }
}
