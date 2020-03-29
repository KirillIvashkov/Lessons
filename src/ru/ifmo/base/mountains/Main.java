package ru.ifmo.base.mountains;

public class Main {
    public static void main(String[] args) {
        Mountains mountain1 = new Mountains("Эльбрус", "Россия", 5642);
        Mountains mountain2 = new Mountains("Петрос", "Украина", 2020);
        Mountains mountain3 = new Mountains("Триглав", "Словения", 2846);


        Climber climber1 = new Climber("Федор", "Санкт - Петербург");
        Climber climber2 = new Climber("Степан", "Воронеж");
        Climber climber3 = new Climber("Джон", "Нью - Йорк");
        Climber climber4 = new Climber("Филипп", "Прага");
        Climber climber5 = new Climber("Евгения", "Алматы");
        Climber climber6 = new Climber("Коллин" , "Лондон");
        Climber climber7 = new Climber("Джессика", "Мехико");

        Group group1 = new Group(false, new Climber[]{climber1,climber2,climber3}, mountain1);
        Group group2 = new Group(false, new Climber[]{climber4,climber5}, mountain2);
        Group group3 = new Group(false, new Climber[]{climber6,climber7}, mountain3);















    }
}
