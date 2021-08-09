// Filename:  Complex.h
// Version:  1.0
// Author: Vladislav Gudkov (A00921638)
// Date: November 19, 2020

#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
private:
	double realPart; //double variable to store real part of complex number
	double imaginaryPart; //double variable to store imaginary part of complex number

public:
	Complex(const double& = 1.0, const double& = 0.0); //Default constructor takes 2 default values

	//Accesors
	 double getRealPart() const; // Returns realPart
	 double getImginaryPart() const; // Returns imaginaryPart

	//mutators
	void setRealPart(const double&); // Sets realPart
	void setImginaryPart(const double&); // Sets imaginaryPart

	//Member Functions
	const Complex& plusEq(const Complex &); //function to add complex numbers
	const Complex& minusEq(const Complex &); //function to subtract complex numbers
	void display() const; //Display results 
};
#endif // !COMPLEX_H
