#include <iostream>
using namespace std;

class Complex {
private:
    float real, imag;

public:
    Complex(float r = 0, float i = 0) {
        real = r;
        imag = i;
    }

    void display() {
        if (imag < 0)
            cout << real << " - " << -imag << "i" << endl;
        else
            cout << real << " + " << imag << "i" << endl;
    }
    Complex add(const Complex &other) {
        return Complex(real + other.real, imag + other.imag);
    }

    Complex subtract(const Complex &other) {
        return Complex(real - other.real, imag - other.imag);
    }

    Complex multiply(const Complex &other) {
        float r = (real * other.real) - (imag * other.imag);
        float i = (real * other.imag) + (imag * other.real);
        return Complex(r, i);
    }
};

int main() {
    float real1, imag1, real2, imag2;

    cout << "Enter the real and imaginary parts of first complex number: ";
    cin >> real1 >> imag1;

    cout << "Enter the real and imaginary parts of second complex number: ";
    cin >> real2 >> imag2;

    Complex num1(real1, imag1), num2(real2, imag2);

    cout << "\nFirst complex number: ";
    num1.display();
    cout << "Second complex number: ";
    num2.display();

    Complex sum = num1.add(num2);
    cout << "\nSum of the complex numbers: ";
    sum.display();

    Complex diff = num1.subtract(num2);
    cout << "Difference of the complex numbers: ";
    diff.display();

    Complex prod = num1.multiply(num2);
    cout << "Product of the complex numbers: ";
    prod.display();

    return 0;
}
