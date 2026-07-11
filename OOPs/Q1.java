//Print the sum , difference and the product of two complex numbers by creating a class named 'Complex'with separate methods for each operation whose real and imaginary parts are entered by the user.
import java.util.Scanner;

class Complex{
        int real;
        int imag;

    public Complex (int r, int i){
        real = r;
        imag = i;
    }

public static Complex add(Complex a, Complex b){
    return new Complex((a.real + b.real), (a.imag + b.imag));
}

public static Complex diff(Complex a, Complex b){
    return new Complex((a.real - b.real), (a.imag - b.imag));
}

public static Complex product(Complex a, Complex b){
    int realPart = (a.real * b.real) - (a.imag * b.imag);
    int imagPart = (a.real * b.imag) + (a.imag * b.real);
    return new Complex(realPart, imagPart);
}

public void printComplex(){
    if(real == 0 && imag != 0){
        System.out.println(imag + "i");
    }else if(imag == 0 && real != 0){
            System.out.println(real);
    }else{
        System.out.println(real + "+" + imag + "i");
    }
    }


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter real and imaginary part of first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter real and imaginary part of second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        // Perform operations
        Complex sumResult = Complex.add(c1, c2);
        Complex diffResult = Complex.diff(c1, c2);
        Complex prodResult = Complex.product(c1, c2);

        // Print results
        System.out.print("Sum: ");
        sumResult.printComplex();

        System.out.print("Difference: ");
        diffResult.printComplex();

        System.out.print("Product: ");
        prodResult.printComplex();
        
        sc.close();
}
}