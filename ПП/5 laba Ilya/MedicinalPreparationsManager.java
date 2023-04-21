package Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicinalPreparationsManager implements Opportunities {
    ArrayList<Tablet> tablets = new ArrayList<>();
    ArrayList<Medicine> medicines = new ArrayList<>();
    ArrayList<Ointment> ointments = new ArrayList<>();
    ArrayList<Solution> solutions = new ArrayList<>();
    @Override
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
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
        return substance;
    }

    @Override
    public int calculateDosage(MedicinalPreparations substance) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массу тело ");
        int weightBody = in.nextInt();
        int dosage = weightBody * substance.concentration;
        return dosage;
    }

    @Override
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
        }
        return substance;
    }

    @Override
    public MedicinalPreparations changeInformation(MedicinalPreparations substance) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете действие");
        System.out.println("1:Получить информацию о преперате");
        System.out.println("2:Изменить информацию о преперате");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                substance.toString(substance);
                break;
            case 2:
                System.out.println("Выберете пункт изменения препарата");
                System.out.println("1:Название препарата");
                System.out.println("2:Концентрация");
                System.out.println("3:Статус препарата");
                int choiceChange = in.nextInt();
                switch (choiceChange) {
                    case 1:
                        System.out.println("Изначальное значение= " + substance.name);
                        System.out.println("Введите новое назвение ");
                        substance.name = in.next();
                        break;
                    case 2:
                        System.out.println("Изначальная концентрация= " + substance.concentration);
                        System.out.println("Введите новую концентрацию");
                        substance.concentration = in.nextInt();
                        break;
                    case 3:
                        System.out.println("Изначальный статус" + substance.statusSubstance);
                        System.out.println("Выбере новый статус");
                        substance = changeStatus(substance);
                        break;
                }
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
    public void setAllMedicinalsPreparationOnNumbers(List<MedicinalPreparations> substance) {
        int i = 1;
        System.out.println("===============================");
        for (MedicinalPreparations strArr : substance) {
            System.out.println(i + " -  Медецинский препарарат");
            strArr.toString(strArr);
            i += 1;
        }
        System.out.println("===============================");
        System.out.println();
    }
    @Override
    public MedicinalPreparations choiseMedicinalPreparations(List<MedicinalPreparations> arrayMedicinalPreparations) {
        Scanner in = new Scanner(System.in);
        MedicinalPreparations rightSubstance = new MedicinalPreparations();
        setAllMedicinalsPreparationOnNumbers(arrayMedicinalPreparations);
        System.out.println("Выберете нужный препарат");
        int numberPreparation = in.nextInt();
        int i = 1;
        for (MedicinalPreparations substance : arrayMedicinalPreparations) {
            if (i == numberPreparation) {
                rightSubstance = substance;
            }
            i++;
        }
        return rightSubstance;
    }
}
