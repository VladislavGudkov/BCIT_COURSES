// Filename:  Complex.cpp
// Version:  1.0
// Author: Vladislav Gudkov (A00921638)
// Date: November 19, 2020

#include "Complex.h"
#include <iostream>
#include <iomanip>
using namespace std;

Complex::Complex(const double &realPart, const double &imaginaryPart)
	:realPart(realPart), imaginaryPart(imaginaryPart){} // End constructor

// accesor for realPart
double Complex::getRealPart() const
{
	return realPart;
}

// accesor for imaginaryPart
double Complex::getImginaryPart() const
{
	return imaginaryPart;
}

// mutator for realPart
void Complex::setRealPart(const double& RealPart)
{
	this -> realPart = RealPart;
} 

// mutator for imaginaryPart
void Complex::setImginaryPart(const double& imginaryPart)
{
	this -> imaginaryPart = imginaryPart;
}

//plusEq function adds complex numbers
const Complex& Complex::plusEq(const Complex &add)
{
	realPart = realPart + add.getRealPart();
	imaginaryPart = imaginaryPart + add.getImginaryPart();

	return (*this);
} 

//minusEq function subtracts complex numbers
const Complex& Complex::minusEq(const Complex &subtract)
{
	realPart = realPart - subtract.getRealPart();
	imaginaryPart = imaginaryPart - subtract.getImginaryPart();

	return (*this);
} 

//display function displays the complex number results 
void Complex::display() const
{
	cout << fixed << setprecision(4);
	cout << "( " << getRealPart() << " , " << getImginaryPart() << " )";
} 