package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        MonthCalcService service = new MonthCalcService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        System.out.println("Входные параметры:");
        System.out.println("Доход = " + income);
        System.out.println("Обязательные расходы = " + expenses);
        System.out.println("Минимальная сумма для отдыха = " + threshold);
        System.out.println("");

        int count = service.calculate(income, expenses, threshold);
        System.out.println("Итого, за год, можно отдохнуть " + count + " раза (месяца)");


    }
}