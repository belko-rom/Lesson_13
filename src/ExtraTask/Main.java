package ExtraTask;

public class Main {
    public static void main(String[] args) {
//        Оператор finally не будет выполнен, если:
//
//        -Произойдет выход из JVM (например, вызов System.exit(0)).
//        -Возникнет смертельная ошибка, которую JVM не может обработать (например, StackOverflowError или OutOfMemoryError).
//        -В блоке try или catch произошел бесконечный цикл.
        /*try {
            System.out.println("Try block");
            System.exit(0); // вызов системного выхода из программы
        } finally {
            System.out.println("Finally block"); // этот блок не будет выполнен
        }*/

        try {
            while (true) {
                System.out.println("цикл");// Бесконечный цикл
            }
        } finally {
            System.out.println("Этот код не будет выполнен из-за бесконечного цикла в блоке try");
        }
    }
}
