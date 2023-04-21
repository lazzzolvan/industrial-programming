package Lab5;

public class Solution extends MedicinalPreparations{
    public Solution(String name, int concentration, Status statusSubstance) {
        super(name, concentration, statusSubstance);
    }

    public void acceptSolution(){
        System.out.println("Вы приняли расствор");
    }
}
