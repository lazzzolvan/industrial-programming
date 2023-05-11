package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static List<Double> readNumbers(String filename) throws InvalidNumberException {
        List<Double> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] s = line.split(" ");
                    double number = 0;
                    if (s[1].equals("US")) {
                        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
                        if (s[0].matches("^[0-9]+(\\.[0-9]+)?$")) {
                            number = nf.parse(s[0].trim()).doubleValue();
                        } else {
                            throw new NumberFormatException();
                        }
                    } else if (s[1].equals("UK")) {
                        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "UK"));
                        if (s[0].matches("^\\d+.+\\d+(,[0-9]+)?$")) {
                            number = nf.parse(s[0].trim()).doubleValue();
                        }else{
                            throw new NumberFormatException();
                        }
                    } else if (s[1].equals("IN")) {
                        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "IN"));
                        if (s[0].matches("^\\d+,+\\d+,+\\d+(.[0-9]+)?$")) {
                            number = nf.parse(s[0].trim()).doubleValue();
                        }else{
                            throw new NumberFormatException();
                        }
                    } else if (s[1].equals("RU")) {
                        NumberFormat nf = NumberFormat.getInstance(new Locale("ru", "RU"));
                        if (s[0].matches("^[0-9]+(\\,[0-9]+)?$"))                       {
                            number = nf.parse(s[0].trim()).doubleValue();
                        }else {
                            throw new NumberFormatException();
                        }
                    } else {
                        throw new InvalidNumberException("Ошибка локали!");
                    }
                    numbers.add(number);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                } catch (InvalidNumberException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (OutOfMemoryError error) {
            error.printStackTrace();
        }
        return numbers;
    }

    public static double calculateSum(List<Double> numbers) throws InvalidNumberException {
        double sum = 0;
        if (!numbers.isEmpty()) {
            for (double number : numbers) {
                sum += number;
            }
        } else {
            throw new InvalidNumberException("Не найдено чисел");
        }
        return sum;
    }

    public static double calculateAverage(List<Double> numbers) {
        try {
            return calculateSum(numbers) / numbers.size();
        } catch (InvalidNumberException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String filename = "D:\\важное\\gadik\\4 семестр\\ПП\\industrial-programming\\ПП\\lab8\\untitled\\src\\main\\resources\\number.txt";
        try {
            List<Double> numbers = readNumbers(filename);
            System.out.println("Числа: " + numbers);
            System.out.println("Сумма : " + calculateSum(numbers));
            System.out.println("Среднее значение: " + calculateAverage(numbers));
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
