package nwd.java;

public class Main {

    static void iBSL(){
                	/*find more info on Primitive Data Types at
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html*/

        System.out.println("~~~~~~~~~~~ int, byte, short, long ~~~~~~~~~~~");

//int- Integer
        /*By default, the int data type is a 32-bit signed two's complement integer,
        which has a minimum value of -231 and a maximum value of 231-1.
        In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer,
        which has a minimum value of 0 and a maximum value of 232-1.
        Use the Integer class to use int data type as an unsigned integer.
        See the section The Number Classes for more information.
        Static methods like compareUnsigned, divideUnsigned etc. have been added to the Integer class
        to support the arithmetic operations for unsigned integers.*/

        int myMinIntValue = Integer.MIN_VALUE;

        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("~~Integer Values~~");
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        System.out.println(System.lineSeparator());

//byte
        /*The byte data type is an 8-bit signed two's complement integer.
        It has a minimum value of -128 and a maximum value of 127 (inclusive).
        The byte data type can be useful for saving memory in large arrays,
        where the memory savings actually matters.
        They can also be used in place of int where their limits help to clarify your code;
        the fact that a variable's range is limited can serve as a form of documentation.*/

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("~~Byte Values~~");
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted MAX value = " + (myMaxByteValue + 1));
        System.out.println("Busted Min Value = " + (myMinByteValue - 1));
        System.out.println(System.lineSeparator());

// Short
        /*short: The short data type is a 16-bit signed two's complement integer.
        It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        As with byte, the same guidelines apply: you can use a short to save memory in large arrays,
        in situations where the memory savings actually matters*/

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("~~Short Values~~");
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted MAX value = " + (myMaxShortValue + 1));
        System.out.println("Busted Min Value = " + (myMinShortValue - 1));
        System.out.println(System.lineSeparator());

// long
        /*The long data type is a 64-bit two's complement integer.
        The signed long has a minimum value of -263 and a maximum value of 263-1.
        In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long,
        which has a minimum value of 0 and a maximum value of 264-1.
        Use this data type when you need a range of values wider than those provided by int.
        The Long class also contains methods like compareUnsigned,
        divideUnsigned etc. to support arithmetic operations for unsigned long.*/

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("~~Long Values~~");
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted MAX value = " + (myMaxLongValue + 1));
        System.out.println("Busted Min Value = " + (myMinLongValue - 1));

        long myLongValue = 100L;
        System.out.println(myLongValue);

        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);
        System.out.println(System.lineSeparator());

// Arithmetic + Casting
        /* Casting means to treat or convert a number from one type to another.
         * We put the type we want the number to be in parentheses like so: (byte) (myMinByteValue/2); */
        System.out.println("~~~~~~~~~~~ Arithmetic + Casting ~~~~~~~~~~~");
//Arithmetic
        int myTotal = (myMinIntValue / 2);
        System.out.println("~~Arithmetic~~");
        System.out.println(myTotal);
        System.out.println(System.lineSeparator());

//Casting
        System.out.println("~~Casting~~");
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println(myNewShortValue);
        System.out.println(System.lineSeparator());

//Primitive Types Challenge
        /*Create a byte variable and set it to any valid byte number.
         * Create a short variable and set it to any valid short number.
         * Create an int variable and set it to any valid int number.
         * Create a variable of type long and make it equal to 50000...
         * ...plus 10 times the sum of the byte, short and int values.*/
        System.out.println("~~ Primitive Types Challenge ~~\n" +
                "        Create a byte variable and set it to any valid byte number.\n" +
                "        Create a short variable and set it to any valid short number.\n" +
                "        Create an int variable and set it to any valid int number.\n" +
                "        Create a variable of type long and make it equal to 50000...\n" +
                "        ...plus 10 times the sum of the byte, short and int values.*/");
        System.out.println(System.lineSeparator());
        byte a = 10;
        short b = 20;
        int c = 50;
        long challengeTotal = /*code goes here*/;


        System.out.println("Challenge Total = " + challengeTotal);
    }

    public static void main(String[] args) {
iBSL();
    }
}





























































//Answers: Don't peek until you are done!
/* Primitive Types Challenge
* long challengeTotal = 50000L + 10L * (a + b + c)*/