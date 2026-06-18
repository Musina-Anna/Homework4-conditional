import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if ( age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия,нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 25;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов,нужно надеть шапку");
            if (temperature > 5) ;
        } else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
            if (speed < 60) ;
        } else {
            System.out.println("Если скорость " + speed + " можно ехать спокойно");
        }


        System.out.println("Задача 4");
        int years = 27;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в университет");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int childAge = 16;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка ребенка равен " + childAge + " ,то ему можно кататься без сопровождения взрослых");
        }
        System.out.println("Задача 6");
        int place = 11;
        if (place <= 60) {
            System.out.println("Если в вагоне занято " + place + " мест ,то есть сидячие места");
        } else if (place > 60 && place <= 102) {
            System.out.println("Если в вагоне занято " + place + " мест ,то есть стоячие места");
        } else if (place > 102) {
            System.out.println("Если в вагоне занято " + place + " места ,то вагон окажется переполнен");
        }
        System.out.println("Задача 7");
        int one = 613;
        int two = 27;
        int three = -2;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > three && two > one) {
            System.out.println("Второе число самое большое");
        } else if (three > one && three > two) {
            System.out.println("Третье число самое большое");
        }
    }
}




























