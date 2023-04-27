package Lab5;

import java.util.ArrayList;
import java.util.List;

public class MedicinalPreparationsManager implements Opportunities {
    ArrayList<Tablet> tablets = new ArrayList<>();
    ArrayList<Medicine> medicines = new ArrayList<>();
    ArrayList<Ointment> ointments = new ArrayList<>();
    ArrayList<Solution> solutions = new ArrayList<>();
    @Override
<<<<<<< HEAD:ПП/Lab5/MedicinalPreparations.java
    public MedicinalPreparations addMedicinalPreparations(MedicinalPreparations substance,String name,int concentration,int statusSubstance) {
        substance.name = name;
        substance.concentration = concentration;
        switch (statusSubstance){
=======
    public  Tablet addTablet() {
        Scanner in = new Scanner(System.in);
        Tablet substance = new Tablet();
        System.out.println("Введите название вещества ");
        substance.name = in.next();
        System.out.println("Введите концентрацию вещества ");
        substance.concentration = in.nextInt();
        System.out.println("Выберете статус вещества ");
        System.out.println("1:Запрещено ");
        System.out.println("2:По рецепту ");
        System.out.println("3:Разрешено ");
        int choice = in.nextInt();
        switch (choice) {
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/MedicinalPreparationsManager.java
            case 1:
                substance.statusSubstance = Status.Forbidden;
                break;
            case 2:
                substance.statusSubstance = Status.On_PreScription;
                break;
            case 3:
                substance.statusSubstance = Status.Allowed;
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
        return substance;
    }

    @Override
    public  Medicine addMedicine() {
        Scanner in = new Scanner(System.in);
        Medicine substance = new Medicine();
        System.out.println("Введите название вещества ");
        substance.name = in.next();
        System.out.println("Введите концентрацию вещества ");
        substance.concentration = in.nextInt();
        System.out.println("Выберете статус вещества ");
        System.out.println("1:Запрещено ");
        System.out.println("2:По рецепту ");
        System.out.println("3:Разрешено ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                substance.statusSubstance = Status.Forbidden;
                break;
            case 2:
                substance.statusSubstance = Status.On_PreScription;
                break;
            case 3:
                substance.statusSubstance = Status.Allowed;
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
        return substance;
    }

    @Override
    public  Ointment addOintment() {
        Scanner in = new Scanner(System.in);
        Ointment substance = new Ointment();
        System.out.println("Введите название вещества ");
        substance.name = in.next();
        System.out.println("Введите концентрацию вещества ");
        substance.concentration = in.nextInt();
        System.out.println("Выберете статус вещества ");
        System.out.println("1:Запрещено ");
        System.out.println("2:По рецепту ");
        System.out.println("3:Разрешено ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                substance.statusSubstance = Status.Forbidden;
                break;
            case 2:
                substance.statusSubstance = Status.On_PreScription;
                break;
            case 3:
                substance.statusSubstance = Status.Allowed;
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
        return substance;
    }

    @Override
    public  Solution addSolution() {
        Scanner in = new Scanner(System.in);
        Solution     substance = new Solution();
        System.out.println("Введите название вещества ");
        substance.name = in.next();
        System.out.println("Введите концентрацию вещества ");
        substance.concentration = in.nextInt();
        System.out.println("Выберете статус вещества ");
        System.out.println("1:Запрещено ");
        System.out.println("2:По рецепту ");
        System.out.println("3:Разрешено ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                substance.statusSubstance = Status.Forbidden;
                break;
            case 2:
                substance.statusSubstance = Status.On_PreScription;
                break;
            case 3:
                substance.statusSubstance = Status.Allowed;
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
<<<<<<< HEAD:ПП/Lab5/MedicinalPreparations.java
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
=======
    public MedicinalPreparations changeStatus(MedicinalPreparations substance) {
        Scanner in = new Scanner(System.in);
        System.out.print("Изменить статус вещесвтва ");
        System.out.println(substance.statusSubstance);
        int endChange = 0;
        int choice;
        if ((substance.statusSubstance.equals("Запрещено")) && (endChange != 1)) {
            System.out.println("1:По рецепту");
            System.out.println("2:Разрешено");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    substance.statusSubstance = Status.On_PreScription;
                    endChange = 1;
                    break;
                case 2:
                    substance.statusSubstance = Status.Allowed;
                    endChange = 1;
                    break;
                default:
                    System.out.println("Введено некорректное число");
                    break;
            }
        }
        if ((substance.statusSubstance.equals("По рецепту")) && (endChange != 1)) {
            System.out.println("1:Запрещено");
            System.out.println("2:Разрешено");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    substance.statusSubstance = Status.Forbidden;
                    endChange = 1;
                    break;
                case 2:
                    substance.statusSubstance = Status.Allowed;
                    endChange = 1;
                    break;
                default:
                    System.out.println("Введено некорректное число");
                    break;
            }
        }
        if ((substance.statusSubstance.equals("Разрешено")) && (endChange != 1)) {
            System.out.println("1:По рецепту");
            System.out.println("2:Запрещено");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    substance.statusSubstance = Status.On_PreScription;
                    endChange = 1;
                    break;
                case 2:
                    substance.statusSubstance = Status.Forbidden;
                    endChange = 1;
                    break;
                default:
                    System.out.println("Введено некорректное число");
                    break;
            }
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/MedicinalPreparationsManager.java
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
