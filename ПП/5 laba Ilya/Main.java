package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<MedicinalPreparations> arrayMedicinalPreparations = new ArrayList<>();
        MedicinalPreparationsManager medicinalPreparationsManager = new MedicinalPreparationsManager();
        medicinalPreparationsManager.tablets.add(new Tablet("Таблетка Ацц", 5, Status.Allowed));
        medicinalPreparationsManager.medicines.add(new Medicine("Лекарство Нормакс", 6, Status.Forbidden));
        medicinalPreparationsManager.ointments.add(new Ointment("Мазь Ренацен", 4, Status.On_PreScription));
        medicinalPreparationsManager.solutions.add(new Solution("Раствор Зеленка", 2, Status.Allowed));
        medicinalPreparationsManager. tablets.add(new Tablet("Таблетка Грамедин", 8, Status.Forbidden));
       // MedicinalPreparations substance = new MedicinalPreparations();
        int endOfCycle = 0;
        while (endOfCycle == 0) {
            System.out.println("Меню");
            System.out.println("1:Добавить преперат");
            System.out.println("2:Расчитать дозу препарата");
            System.out.println("3:Изменить статус");
            System.out.println("4:Получить или изменить информацию о веществе");
            System.out.println(("5:Дополнительные действия с определнными лекарствами"));
            System.out.println("6:Выход");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
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
                            break;
                    }
                    break;
                case 2:
                    printMenu();
                    command = in.nextInt();
                    int Dosage = 0;
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations);
                    Dosage = Dosage = substance.calculateDosage(substance);
                    System.out.println("Дозировка: " + Dosage + "г");
                    break;
                case 3:
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations);
                    substance = substance.changeStatus(substance);
                    break;
                case 4:
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations);
                    substance = substance.changeInformation(substance);
                    break;
                case 5:
                    substance = substance.choiseMedicinalPreparations(arrayMedicinalPreparations);
                    additionalActions(substance);
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
    public static void additionalActions(MedicinalPreparations substance) {
        String[] words = substance.name.split(" ");
        for (String word: words){
            if(word.equals("Таблетка")){
                takePill(substance);
            }
            if(word.equals("Лекарство")){
                takeMedicine(substance);
            }
            if(word.equals("Мазь")){
                spreadOintment(substance);
            }
            if(word.equals("Расствор")){
                mixSolution(substance);
            }
        }
    }
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
