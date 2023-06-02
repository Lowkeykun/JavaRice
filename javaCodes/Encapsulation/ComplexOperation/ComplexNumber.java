package Encapsulation.ComplexOperation;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add (double real, double imaginary){
        this.real = getReal() + real;
        this.imaginary = getImaginary() + imaginary;
    }

    public void add (ComplexNumber num){
//        this.real = getReal() + num.getReal();
//        this.imaginary = getImaginary() + num.getImaginary();
        add(num.getReal(), num.getImaginary());
    }

    public void subtract (double real, double imaginary){
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;
    }

    public void subtract (ComplexNumber num){
//        this.real = getReal() - num.getReal();
//        this.imaginary = getImaginary() - num.getImaginary();
        subtract(num.getReal(), num.getImaginary());
    }
}
