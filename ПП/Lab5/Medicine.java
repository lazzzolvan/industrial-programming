package Lab5;

public class Medicine extends MedicinalPreparations{
    Medicine(){}
    Medicine(String name, int concentration, String statusSubstance) {
        this.name = name;
        this.concentration = concentration;
        this.statusSubstance = statusSubstance;
    }
    public void drinkMedicine(Medicine medicine){
        System.out.println("Вы выпили лекарство"+medicine.name);
    }
}