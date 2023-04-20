package Laba6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int term = 0;
        int durationSession=1;
        String[] nameCredit = new String[4];
        int[] statusCredit = new int[4];
        String[] nameExam = new String[4];
        int[] mark= new int[4];
        CreditBook creditBook = new CreditBook(211,2,new CreditBook.Student("Сенькин","Сергей","Сергеевич",20));
        for (int i =0;i<creditBook.quantitySession;i++){
            System.out.println("Введите номер семестра");
            term = in.nextInt();
            System.out.println("Введите продолжительность сессии");
            durationSession = in.nextInt();
            for (int j = 0; j < creditBook.session.get(j).nameCredit.length; j++) {
                nameCredit[i] = in.next();
            }
            for (int j = 0; j < creditBook.session.get(j).nameCredit.length; j++) {
                statusCredit[i] = in.nextInt();
            }
            for (int j = 0; j < creditBook.session.get(j).nameCredit.length; j++) {
                nameExam[i] = in.next();
            }
            for (int j = 0; j < creditBook.session.get(j).nameCredit.length; j++) {
                mark[i] = in.nextInt();
            }
        }
        creditBook.session.add(term,durationSession,nameCredit,statusCredit,nameExam,mark);
        CreditBook creditBook1 = new CreditBook(111,3,new CreditBook.Student("Лазарев","Илья","Сергеевич",19));
        for (int i=0;i<creditBook.quantitySession;i++){
            creditBook.setSession();
        }
        creditBook.displayInfo(creditBook);
        creditBook.displayInfo(creditBook1);
    }
}