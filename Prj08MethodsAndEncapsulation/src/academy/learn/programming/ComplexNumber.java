package academy.learn.programming;

public class ComplexNumber {

    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary= imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // this method creates a defensive copy of the object
    public ComplexNumber plus(ComplexNumber b){
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new ComplexNumber(newReal, newImaginary);

    }

    // this method creates a defensive copy of the object
    public ComplexNumber minus(ComplexNumber b){
        double newReal = real - b.real;
        double newImaginary = imaginary - b.imaginary;
        return new ComplexNumber(newReal, newImaginary);

    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 8.0);
        ComplexNumber b = new ComplexNumber(7.8, 2.9);

        ComplexNumber aPlusB = a.plus(b);


        System.out.println("A " + a.toString());
        System.out.println("B " + b.toString());
    }
}