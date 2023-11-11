public class Task2_2_1_2 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 1. Многопоточность, Thread.
                    Задание 2. Переопределить метод run().
                    В цикле for вывести на консоль символ 100 раз.

                Решение:\s""");

        System.out.println("Выводим на консоль символ '№' 100 раз");
        Thread t = new NewThread2();
        t.start();
    }
}

class NewThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("№: " + i + " раз");
        }
    }
}