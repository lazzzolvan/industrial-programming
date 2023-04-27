package Lab5;

public class Solution extends MedicinalPreparations{
    Solution(){}
    Solution(String name, int concentration, String statusSubstance) {
        this.name = name;
        this.concentration = concentration;
        this.statusSubstance = statusSubstance;
    }
    public void drinkSolution(Solution solution){
        System.out.println("Вы замешали раство "+solution.name);
    }
}