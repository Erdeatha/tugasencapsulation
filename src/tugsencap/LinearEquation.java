package tugsencap;

import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.f = 1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation();
        equation.a = a;
        equation.b = b;
        equation.c = c;
        equation.d = d;
        equation.e = e;
        equation.f = f;

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk x adalah: " + equation.getX());
            System.out.println("Solusi untuk y adalah: " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        input.close();
    }
}
