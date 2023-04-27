package Lab5.Lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberPreparation = 0;
        List<MedicinalPreparations> arrayMedicinalPreparations = new ArrayList<>();
        arrayMedicinalPreparations.add(new MedicinalPreparations("Таблетка Ацц", 5, "Разрешено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Лекарство Нормакс", 6, "Запрещено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Мазь Ренацен", 4, "По рецепту"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Раствор Зеленка", 2, "Разрешено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Таблетка Грамедин", 8, "Запрещено"));
        MedicinalPreparations substance = new MedicinalPreparations();
        MedicinalPreparations rightSubstance = new MedicinalPreparations();
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
                    System.out.println("Выберете препарат который хотите добавить");
                    System.out.println("1:Таблетка ");
                    System.out.println("2:Лекартсво ");
                    System.out.println("3:Мазь ");
                    System.out.println("4:Раствор ");
                    choice= in.nextInt();
                    switch (choice){
                        case 1:
                            printMenuAddMP();
                            String name = in.next();
                            int concentration = in.nextInt();
                            int statusSubstance = in.nextInt();
                            arrayMedicinalPreparations.add(substance.addMedicinalPreparations(rightSubstance,name,concentration,statusSubstance));
                    }
                    break;
                case 2:
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
                            String name = in.next();
                            int concentration = in.nextInt();
                            int statusSubstance = in.nextInt();
                            substance = substance.changeInformation(substance,name,concentration,statusSubstance);
                    }
                    break;
                case 5:

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
    public static int choiceMP(MedicinalPreparations rightSubstance,List<MedicinalPreparations> arrayMedicinalPreparations,MedicinalPreparations substance){
        Scanner in = new Scanner(System.in);
        substance.setAllMedicinalsPreparationOnNumbers(arrayMedicinalPreparations);
        System.out.println("Выберете нужный препарат");
        int numberPreparation = in.nextInt();
        return numberPreparation;
    }
    public static int choiceStatus(MedicinalPreparations substance,int choice){
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
}