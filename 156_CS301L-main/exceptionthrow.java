public class exceptionthrow {
    public static void main(String[] args) {
            int age = 15;
            try {
                if (age < 18) {
                    throw new ArithmeticException("Not eligible to vote");
                } else {
                    System.out.println("eligible to vote");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
    }

}