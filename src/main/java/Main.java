package main.java;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(2, 1);
        int d = calc.abs.apply(0);

        calc.println.accept(d);
    }
}