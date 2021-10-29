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



    }
    static void fDT(){
        String s = System.lineSeparator();
            /*Float: The float data type is a single-precision 32-bit IEEE 754 floating point.
        Its range of values is beyond the scope of this discussion,
        but is specified here https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3.
        As with the recommendations for byte and short,
        use a float (instead of double) if you need to save memory in large arrays of
        floating point numbers. This data type should never be used for precise values,
        such as currency. For that, you will need to use the java.math.BigDecimal class instead.
        Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform. */

        /*Double: The double data type is a double-precision 64-bit IEEE 754 floating point.
        Its range of values is beyond the scope of this discussion,
        but is specified here https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3.
        For decimal values, this data type is generally the default choice.
        As mentioned above, this data type should never be used for precise values, such as currency.*/

//  Let's visualize these datatypes

        System.out.println("~~Float~~");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        System.out.println(s);

        System.out.println("~~Double~~");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        System.out.println(s);

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("As we can see here, integers are whole numbers, while floats and doubles are decimal numbers.");

        System.out.println("Integer Value = " + myIntValue);
        System.out.println("Float Value   = " + myFloatValue);
        System.out.println("Double Value  = " + myDoubleValue);

        System.out.println(s);
        System.out.println("However doubles are more precise than floats.");
        System.out.println("" +
                "Integer: 5 / 3 = " + (myIntValue / 3) + "\n"+
                "Float:   5 / 3 = " + (myFloatValue / 3f) + "\n"+
                "Double:  5 / 3 = " + (myDoubleValue / 3d));

        System.out.println(s);

        System.out.println(
                "Challenge: Convert a given number of pounds to kilograms" + "\n" +
                        "1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms." + "\n" +
                        "2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result" + "\n" + "in a 2nd appropriate variable." + "\n"+
                        "3. Print the result." + "\n" +
                        "HINT: 1 pound is equal to 0.45359237 of a kilogram."
        );
        System.out.println(s);
        System.out.println("Answer");

//      Code goes here

        System.out.println(s);
        System.out.println("!!_.~\"~._.~\"~._.~\"~._.~\"~._!!");
        System.out.println("To reiterate the commented definitions for floats and doubles, " + "\n" +
                "These are not to be used for precise calculations such as for currency. General calculations are okay.");
        System.out.println("!!_.~\"~._.~\"~._.~\"~._.~\"~._!!");
    }

    public static void main(String[] args) {
iBSL();
fDT();
    }
}





























































//Answers: Don't peek until you are done!
/* Primitive Types Challenge
* long challengeTotal = 50000L + 10L * (a + b + c);
System.out.println("Challenge Total = " + challengeTotal);*/

/*Pound to kilogram conversion
* int pound = any int;
* double kilo = 0.45359237;
* long conversion = pound * kilo;
* System.out.println("Conversion total = " + conversion)*/