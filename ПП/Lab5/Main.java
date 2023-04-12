package Lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<MedicinalPreparations> arrayMedicinalPreparations = new ArrayList<>();
        arrayMedicinalPreparations.add(new MedicinalPreparations("Таблетка Ацц", 5, "Разрешено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Лекарство Нормакс", 6, "Запрещено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Мазь Ренацен", 4, "По рецепту"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Раствор Зеленка", 2, "Разрешено"));
        arrayMedicinalPreparations.add(new MedicinalPreparations("Таблетка Грамедин", 8, "Запрещено"));
        MedicinalPreparations substance = new MedicinalPreparations();
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
                    arrayMedicinalPreparations.add(substance.addMedicinalPreparations());
                    break;
                case 2:
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

}
