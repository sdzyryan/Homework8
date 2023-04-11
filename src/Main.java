public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] massivOne = new int [3];
        massivOne [0] = 1;
        massivOne [1] = 2;
        massivOne [2] = 3;
        
        double [] massivTwo = {1.57, 7.654, 9.986};

        long [] massivThree = {7, 14, 21, 28};
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int [] massivOne = new int [3];
        massivOne [0] = 1;
        massivOne [1] = 2;
        massivOne [2] = 3;
        for (int i = 0; i < massivOne.length; i++) {
            if (i < massivOne.length - 1) {
                System.out.print(massivOne[i] + ", ");
            }
            if (i == massivOne.length - 1) {
                System.out.println(massivOne[i]);
            }
        }

        double [] massivTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < massivTwo.length; i++) {
            if (i < massivTwo.length - 1) {
                System.out.print(massivTwo[i] + ", ");
            }
            if (i == massivTwo.length - 1) {
                System.out.println(massivTwo[i]);
            }
        }

        long [] massivThree = {7, 14, 21, 28};
        for (int i = 0; i < massivThree.length; i++) {
            if (i < massivThree.length - 1) {
                System.out.print(massivThree[i] + ", ");
            }
            if (i == massivThree.length - 1) {
                System.out.println(massivThree[i]);
            }
        }
        }
}
