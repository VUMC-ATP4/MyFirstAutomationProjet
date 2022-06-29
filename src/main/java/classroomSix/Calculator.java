package classroomSix;

import classroomSix.homeWork8.Customer;

import java.util.Scanner;

public class Calculator {
    Customer customer;
    private int solution;
    private static int x;
    private static int y;
    private char operators;

    public Calculator() {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);

    }

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        solution = x / y;
        return solution;
    }

    public void calc(int ops) {
        x = 4;
        System.out.println("operand 2: ");
        y = 5;

        switch (ops) {
            case (1):
                System.out.println(addition(x, y));

                //    operands.next();
                break;
            case (2):
                System.out.println(subtraction(x, y));
                // operands.next();
                break;
            case (3):
                System.out.println(multiplication(x, y));
                //  operands.next();
                break;
            case (4):
                System.out.println(division(x, y));
                //  operands.next();
                break;
        }
    }
}