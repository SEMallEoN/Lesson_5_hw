package ru.geekbrains.lesson_5_hw.semenov;

public class Main {
    public static void main(String[] args) {
        employeeArray();
    }

    public static void employeeArray() {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Федор", "Сумкин", 45, 150, "Директор");
        employeeArray[1] = new Employee("Галя", "Овечкина", 23, 15, "Секретарь");
        employeeArray[2] = new Employee("Сергей", "Васильев", 33, 250, "Сис. админ");
        employeeArray[3] = new Employee("Жанна", "Фридриховна", 60, 16, "Бухгалтер");
        employeeArray[4] = new Employee("Вася", "Головач", 28, 100, "Грузчик");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age > 40){
                employeeArray[i].printInfo();
            }
        }
    }
}
