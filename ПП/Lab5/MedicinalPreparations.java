package Lab5;

import java.util.List;

public class MedicinalPreparations implements Opportunities {
    String name;
    int concentration;
    String statusSubstance;

    MedicinalPreparations() {
    }

    MedicinalPreparations(String name, int concentration, String statusSubstance) {
        this.name = name;
        this.concentration = concentration;
        this.statusSubstance = statusSubstance;
    }

    @Override
    public MedicinalPreparations addMedicinalPreparations(MedicinalPreparations substance,String name,int concentration,int statusSubstance) {
        substance.name = name;
        substance.concentration = concentration;
        switch (statusSubstance){
            case 1:
                substance.statusSubstance = "Запрещено";
                break;
            case 2:
                substance.statusSubstance = "По рецепту";
                break;
            case 3:
                substance.statusSubstance = "Разрешено";
                break;
        }
        return substance;
    }

    @Override
    public int calculateDosage(MedicinalPreparations substance,int weightBody) {
        int dosage = weightBody * substance.concentration;
        return dosage;
    }

    @Override
    public MedicinalPreparations changeStatus(MedicinalPreparations substance,int choice) {
        switch (choice){
            case 1:
                substance.statusSubstance = "По рецепту";
                break;
            case 2:
                substance.statusSubstance = "Разрешено";
                break;
            case 3:
                substance.statusSubstance = "Запрещено";
                break;
        }
        return substance;
    }

    @Override
    public MedicinalPreparations changeInformation(MedicinalPreparations substance,String name,int concentration,int statusSubstance) {
        substance.name = name;
        substance.concentration = concentration;
        switch (statusSubstance){
            case 1:
                substance.statusSubstance = "Запрещено";
                break;
            case 2:
                substance.statusSubstance = "По рецепту";
                break;
            case 3:
                substance.statusSubstance = "Разрешено";
                break;
        }
        return substance;
    }

    @Override
    public void toString(MedicinalPreparations substance) {
        System.out.println("Назввание: " + substance.name);
        System.out.println("Концентраиция: " + substance.concentration);
        System.out.println("Статсу вещества: " + substance.statusSubstance);
    }
    @Override
    public void setAllMedicinalsPreparationOnNumbers(List<Opportunities> substance) {
        int i = 1;
        System.out.println("===============================");
        for (Opportunities strArr : substance) {
            System.out.println(i + " -  Медецинский препарарат");
            strArr.toString((MedicinalPreparations) strArr);
            i += 1;
        }
        System.out.println("===============================");
        System.out.println();
    }
    @Override
    public MedicinalPreparations choiseMedicinalPreparations(List<Opportunities> arrayMedicinalPreparations,int numberPreparation,MedicinalPreparations rightSubstance) {
        int i = 1;
        for (Opportunities substance : arrayMedicinalPreparations) {
            if (i == numberPreparation) {
                rightSubstance = (MedicinalPreparations) substance;
            }
            i++;
        }
        return rightSubstance;
    }
}