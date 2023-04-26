package ua.com.hrv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//------------1
        System.out.println("Завдання 1!");
        System.out.println("Введіть слово паліндром");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() >= 5 && s.equalsIgnoreCase(s)) {
            System.out.println("Слово паліндром прийято");
        } else {
            System.err.println("Мало букв, напишіть слово на 5 букв і більше");
        }

//-----------2
        System.out.println("Завдання 2!");
        String s2 = "Замініть всі голосні букви в строці на тире";
        System.out.println(s2);
        String s3 = s2.replaceAll("а", "-");
        String s4 = s3.replaceAll("о", "-");
        String s5 = s4.replaceAll("і", "-");
        String s6 = s5.replaceAll("и", "-");
        String s7 = s6.replaceAll("у", "-");
        String s8 = s7.replaceAll("е", "-");
        System.out.println(s8);

//------------3
        System.out.println("Завдання 3!");
        String st = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String[] srr = st.split(" ");
        int i = 0;
        boolean count;
        for (String si : srr) {
            if (srr.length != 0) {
                i++;
            }
        }
        System.out.println("В реченні " + i + " слів");

//-------------4
        System.out.println("Завдання 4!");
        String st1 = "Lorem Ipsum is simply dummy text of the printing and typesetting printing industry";
        String[] srr1 = st1.split(" ");
        for (int j = 0; j < srr1.length; j++) {
            for (int y = j + 1; y < srr1.length; y++) {
                if (srr1[j].equals(srr1[y])) {
                    System.out.println(srr1[y] + " ");
                }
            }
        }


    }
}
