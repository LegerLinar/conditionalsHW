public class Main {
        public static void main(String[] args) {
            task1();
            task2();
        }

        public static void task1 () {
            System.out.println("Задача 1");

            int boy = 17;
            int man = 25;

            if(boy >= 18) {
                System.out.println("Если возраст человека равен " + boy + " он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + boy + " он не достиг совершеннолетия, нужно немного подождать");
            }

            if(man >= 18) {
                System.out.println("Если возраст человека равен " + man + " он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + man + " он не достиг совершеннолетия, нужно немного подождать");
            }

        }

        public static void task2 () {
            System.out.println("Задача 2");
//        ... // Пишем код для задачи 2
        }
}
