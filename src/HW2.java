public class HW2 {

        public static int a = 5;
        public static int b = 10;

        public static void main(String[] args) {
            sumNumbers();
            System.out.println(sumNumbers());
            numberTwo();
            numberThree();
            System.out.println(numberThree());
            numberFour();
        }
        public static boolean sumNumbers() {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void numberTwo() {
            if (a >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }
        public static boolean numberThree() {
            return a < 0;
        }
        public static void numberFour() {
            int count = a;
            for (int i = 1; i <= count; i++) {
                System.out.println("Number" + i);
            }
        }
}
