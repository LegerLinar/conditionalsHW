public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int boy = 17;
        int man = 25;

        if (boy >= 18) {
            System.out.println("Если возраст человека равен " + boy + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + boy + " он не достиг совершеннолетия, нужно немного подождать");
        }

        if (man >= 18) {
            System.out.println("Если возраст человека равен " + man + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + man + " он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
//        Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
//«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
//«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
//При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от результата) н
// ужно надеть шапку / можно идти без шапки».

        int temperature = 6;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня " + temperature + " градусов, тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
//        За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что:
//скорость превышена, если она больше 60 км/ч;
//превышения скорости нет, если она меньше 60 км/ч.
//При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …, то
// (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».
        int badDriver = 150;
        int goodDriver = 55;

        if (60 > badDriver) {
            System.out.println("Вы едете со скростью " + badDriver + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Вы едете со скоростью " + badDriver + " км/ч, придется заплатить штраф");
        }
        if (60 > goodDriver) {
            System.out.println("Вы едете со скростью " + goodDriver + " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Вы едете со скоростью " + goodDriver + " км/ч, придется заплатить штраф");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
//            Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:
//Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
//Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
//Если человеку больше 18 лет, но меньше 24, то его место в университете.
//А если человеку больше 24, то ему пора ходить на работу.
//При выполнении каждого условия программа должна выводить в консоль сообщение
// в формате: «Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».
        int baby = 4;
        int teenager = 15;
        int junior = 22;
        int adult = 26;

        if (baby > 2 && baby < 6) {
            System.out.println("Если возраст человека равен " + baby + ", то ему нужно ходить в детский сад");
        }

        if (teenager > 7 && teenager < 18) {
            System.out.println("Если возраст человека равен " + teenager + ", то ему нужно ходить в школу");
        }

        else if (junior > 18 && junior < 24) {
            System.out.println("Если возраст человека равен " + junior + ", то ему нужно ходить в университет");
        }

        if (adult > 25) {
            System.out.println("Если возраст человека больше " + adult + ", то ему пора на работу");
        } else {
            System.out.println("Человеку все равно куда-то надо ходить");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");

//            Задача 5
//Как правило, на аттракционах действуют ограничения для детей по возрасту:
//Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
//Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
//Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
//Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …, то ему …
// (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе,
// можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».

        int baby = 3;
        int child = 12;
        int teenager = 16;

        if (teenager < 5) {
            System.out.println("Если возраст ребенка равен " + baby + " - он не может кататься на аттракционе");
        }

        if (teenager > 5 && teenager < 14) {
            System.out.println("Если возраст ребенка равен " + child + " - он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + teenager + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
//            Задача 6
//Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
//С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение о том,
// есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.


        int availableTotalLoad = 102;
        int availableSits = 60;

        int passengerCounter = 104;

        boolean isAPlace = passengerCounter <= 102;
        boolean isASit = passengerCounter <= 60;


        if (isASit){
            System.out.println("Есть сидячее метсто");
        } else if(isAPlace){
            System.out.println("Есть стоячее место");
        } else {
            System.out.println("Местов нет");
        }

    }

    public static void task7(){
        System.out.println("Задача 7");

//        Даны три числа:
//int one;
//int two;
//int three;
//С помощью условного оператора и конструкции else напишите программу,
// которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.
        int one = 65;
        int two = 222;
        int three = 13;

        if(one > two && one > three){
            System.out.println("one - самое большое число");

        } else if (two > three) {
            System.out.println("two - самое большое число");
        } else {
            System.out.println("three - самое большое число");
        }
    }

}
