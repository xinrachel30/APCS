TNPG: MAX swag (Anjini, Xinqing, Micheal)
APCS
HW 03 -- Codify the Revisions (revised version of binary algos)
2021-09-23


0. The base in 'base X number system' refers to the number of unique digits in said number system. For example, in a base 4 number system, the possible range of digits would be 0-3, inclusive. 

1. Binary is a base 2 number system. We care about this system because computers use this system for processing data, and it is one of the most basic ways to directly communicate with the computer. 

2. Binary -> Decimal
Reading from right to left:
    a) Establish that n = 0 in 2^n
    b) B is the decimal value given, that needs to be translated
    c) Starting from the right-most digit of B, assign it the value of n. Then reassign the value of n to n + 1
    d) Move to the next digit and reassign it the value of n, as well as reassigning the value of n to n + 1
    e) Repeat step d for all the remaining digits 
    f) Set B equal to each digit multiplied by 2^n and add all the products together
    g) Your B value is now in its decimal form

3. Decimal -> Binary
    a) Find the power of 2, either equal to or less than decimal value, B, and set the number its raised to, as n. 
    b) To find how many digits B will be in its binary form, add 1 to n
    c) Set the left-most digit to 1
    d) Reassign B to be the subtraction of 2^n from B
    e) Repeat steps a, c and d until the B value is 0
    f) If the B value is 0, set any remaining digits to 0
    