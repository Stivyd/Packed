package ru.netology.services;

public class MonthCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        int restPay = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                restPay = (money - expenses) - ((money - expenses) / 3);
                System.out.println("Месяц " + (month) + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + restPay);
                count++;
                money = (money - expenses) / 3;

            } else {
                System.out.println("Месяц " + (month) + ". Денег " + money + ". Придётся поработать. Заработал +" + income + ", потратил -" + expenses);
                money = money - expenses + income;

            }
        }
        System.out.println("Итого, за год, можно отдохнуть " + count + " раза (месяца)");
        return count;
    }
}