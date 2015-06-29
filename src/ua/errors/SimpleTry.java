package ua.errors;


/**
 * Created by melnir on 6/29/15.
 */
public class SimpleTry {
    public static void main(String[] args) {
        double a = 10;
        try {
            System.out.println(a / 3);
        } catch (ArithmeticException e) {
            System.out.println("В рамках вашей компетенции это недопустимая арифметическая операция");
        }
    }

}
