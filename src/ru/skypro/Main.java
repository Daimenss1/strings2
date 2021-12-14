package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastname;
        System.out.println(" * Задача 1 ");
        System.out.println(" ФИО сотрудника — " + fullName);

        System.out.println(" * Задача 2 ");
        System.out.println(fullName.toUpperCase());

        System.out.println(" * Задача 3 ");
        String result = fullName.replace(" ", ";");
        System.out.println(" Данные ФИО сотрудника для административного отдела - " + result);


        String fullName2 = "Иванов Семён Семёнович";
        String chooseName = fullName2.replace('ё', 'е');
        System.out.println(" * Задача 4 ");
        System.out.println("Данные ФИО сотрудника - " + chooseName);
    }
}
