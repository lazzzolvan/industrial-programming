package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD:ПП/Lab5/Main.java
        int numberPreparation = 0;
        List<Opportunities> arrayMedicinalPreparations = new ArrayList<Opportunities>();
        arrayMedicinalPreparations.add(new Medicine("Нормакс",6,"Разрешено"));
        arrayMedicinalPreparations.add(new Tablet("Ацц",5,"Запрещено"));
        arrayMedicinalPreparations.add(new Ointment("Ренацен",4,"По рецепту"));
        arrayMedicinalPreparations.add(new Solution("Зеленка",2,"Разрешено"));
        List<MedicinalPreparations> arrayMedicinalPreparations1 = new ArrayList<>();
        MedicinalPreparations substance = new MedicinalPreparations();
        MedicinalPreparations rightSubstance = new MedicinalPreparations();
=======
        List<MedicinalPreparations> arrayMedicinalPreparations = new ArrayList<>();
        MedicinalPreparationsManager medicinalPreparationsManager = new MedicinalPreparationsManager();
        medicinalPreparationsManager.tablets.add(new Tablet("Таблетка Ацц", 5, Status.Allowed));
        medicinalPreparationsManager.medicines.add(new Medicine("Лекарство Нормакс", 6, Status.Forbidden));
        medicinalPreparationsManager.ointments.add(new Ointment("Мазь Ренацен", 4, Status.On_PreScription));
        medicinalPreparationsManager.solutions.add(new Solution("Раствор Зеленка", 2, Status.Allowed));
        medicinalPreparationsManager. tablets.add(new Tablet("Таблетка Грамедин", 8, Status.Forbidden));
       // MedicinalPreparations substance = new MedicinalPreparations();
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/Main.java
        int endOfCycle = 0;
        while (endOfCycle == 0) {
            System.out.println("Меню");
            System.out.println("1:Добавить преперат");
            System.out.println("2:Расчитать дозу препарата");
            System.out.println("3:Изменить статус");
            System.out.println("4:Получить или изменить информацию о веществе");
            System.out.println(("5:Дополнительные действия с определнными лекарствами"));
            System.out.println("6:Выход");
            int mainChoice = in.nextInt();
            int choice = 0;
            switch (mainChoice) {
                case 1:
<<<<<<< HEAD:ПП/Lab5/Main.java
                    System.out.println("Выберете препарат который хотите добавить");
                    System.out.println("1:Таблетка ");
                    System.out.println("2:Лекартсво ");
                    System.out.println("3:Мазь ");
                    System.out.println("4:Раствор ");
                    choice= in.nextInt();
                    String name = "";
                    int concentration = 0;
                    int statusSubstance =0;
                    switch (choice){
                        case 1:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            arrayMedicinalPreparations.add(new Tablet());
                            arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1).addMedicinalPreparations(((Tablet)arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1)),name,concentration,statusSubstance);
                            break;
                        case 2:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            arrayMedicinalPreparations.add(new Medicine());
                            arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1).addMedicinalPreparations(((Medicine)arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1)),name,concentration,statusSubstance);
                            break;
                        case 3:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            arrayMedicinalPreparations.add(new Ointment());
                            arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1).addMedicinalPreparations(((Ointment)arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1)),name,concentration,statusSubstance);
                            break;
                        case 4:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            arrayMedicinalPreparations.add(new Solution());
                            arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1).addMedicinalPreparations(((Solution)arrayMedicinalPreparations.get(arrayMedicinalPreparations.size()-1)),name,concentration,statusSubstance);
                            break;
                        default:
                            System.out.println("Введено некорректное число");
=======
                    printMenu();
                    int command = in.nextInt();
                    switch (command){
                        case 1:
                            medicinalPreparationsManager.tablets.add(medicinalPreparationsManager.addTablet());
                            break;
                        case 2:
                            medicinalPreparationsManager.medicines.add(medicinalPreparationsManager.addMedicine());
                            break;
                        case 3:
                            medicinalPreparationsManager.ointments.add(medicinalPreparationsManager.addOintment());
                            break;
                        case 4:
                            medicinalPreparationsManager.solutions.add(medicinalPreparationsManager.addSolution());
                            break;
                        default:
                            System.out.println("Введено некорректное значение");
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/Main.java
                            break;
                    }
                    break;
                case 2:
                    printMenu();
                    command = in.nextInt();
                    int Dosage = 0;
                    System.out.println("Введите массу тело ");
                    int weightBody = in.nextInt();
                    numberPreparation = choiceMP(rightSubstance,arrayMedicinalPreparations,substance);
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation,rightSubstance);
                    Dosage = substance.calculateDosage(substance,weightBody);
                    System.out.println("Дозировка: " + Dosage + "г");
                    break;
                case 3:
                    numberPreparation = choiceMP(rightSubstance,arrayMedicinalPreparations,substance);
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation,rightSubstance);
                    System.out.println("Текущий статус  = "+substance.statusSubstance);
                    choice = choiceStatus(substance,choice);
                    substance = substance.changeStatus(substance,choice);
                    break;
                case 4:
                    numberPreparation = choiceMP(rightSubstance,arrayMedicinalPreparations,substance);
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation,rightSubstance);
                    System.out.println("Выберете действие");
                    System.out.println("1:Получить информацию о преперате");
                    System.out.println("2:Изменить информацию о преперате");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            substance.toString(substance);
                            break;
                        case 2:
                            printMenuAddMP();
                            name = in.next();
                            concentration = in.nextInt();
                            statusSubstance = in.nextInt();
                            substance = substance.changeInformation(substance,name,concentration,statusSubstance);
                    }
                    break;
                case 5:
                    numberPreparation = choiceMP(rightSubstance,arrayMedicinalPreparations,substance);
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations,numberPreparation,rightSubstance);
                    dopDo(substance);
                    break;
                case 6:
                    endOfCycle = 1;
                    break;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }
        }
    }
    public static void printMenuAddMP(){
        System.out.println("Введите название вещества ");
        System.out.println("Введите концентрацию вещества ");
        System.out.println("Выберете статус вещества ");
        System.out.println("1:Запрещено ");
        System.out.println("2:По рецепту ");
        System.out.println("3:Разрешено ");
    }
    public static int choiceMP(MedicinalPreparations rightSubstance,List<Opportunities> arrayMedicinalPreparations,MedicinalPreparations substance){
        Scanner in = new Scanner(System.in);
        substance.setAllMedicinalsPreparationOnNumbers(arrayMedicinalPreparations);
        System.out.println("Выберете нужный препарат");
        int numberPreparation = in.nextInt();
        return numberPreparation;
    }
    public static int choiceStatus(MedicinalPreparations substance,int choice) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете новый статус");
        if ((substance.statusSubstance.equals("Запрещено"))) {
            System.out.println("1:По рецепту");
            System.out.println("2:Разрешено");
        }
        if ((substance.statusSubstance.equals("Разрешено"))) {
            System.out.println("1:По рецепту");
            System.out.println("3:Запрещено");
        }
        if ((substance.statusSubstance.equals("По рецепту"))) {
            System.out.println("2:Разрешено");
            System.out.println("3:Запрещено");
        }
        choice = in.nextInt();
        return choice;
    }
    public static void dopDo(MedicinalPreparations substance){
        if (substance instanceof Tablet){
            ((Tablet)substance).drinkTablet(((Tablet) substance));
        }
        if (substance instanceof Medicine){
            ((Medicine)substance).drinkMedicine(((Medicine) substance));
        }
        if (substance instanceof Ointment){
            ((Ointment)substance).spreadOintment(((Ointment) substance));
        }
        if (substance instanceof Solution){
            ((Solution)substance).drinkSolution(((Solution) substance));
        }
    }
<<<<<<< HEAD:ПП/Lab5/Main.java
}
=======
    public static void takePill (MedicinalPreparations substance){
        System.out.println("Была выпита "+substance.name);
    }
    public static void takeMedicine (MedicinalPreparations substance){
        System.out.println("Было выпито "+substance.name);
    }
    public static void spreadOintment (MedicinalPreparations substance){
        System.out.println("Была намазана "+substance.name);
    }
    public static void mixSolution (MedicinalPreparations substance){
        System.out.println("Был размешан  "+substance.name);
    }

    public static void printMenu () {
        System.out.println("Выберете препарат:");
        System.out.println("1 - Таблетка");
        System.out.println("2 - Лекарство");
        System.out.println("3 - Мазт");
        System.out.println("4 - Расствор");
    }

}
>>>>>>> 0466cafa0f64065623d39cd2b834e953373db1b2:ПП/5 laba Ilya/Main.java
