public class Main {

    public static void main(String[] args) {
        int intOperandA = 62;
        int intOperandB = 13;
        int intSum = 42;
        int intProduct = 7;
        int intDifference = 85;
        int intQuotient = 1;
        int intModulo = 72;

        double doubleOperandA = 62;
        double doubleOperandB = 13;
        double doubleSum = 42;
        double doubleProduct = 7;
        double doubleDifference = 85;
        double doubleQuotient = 1;

        intSum = intOperandA + intOperandB; // calculates the sum of A and B and stores it in intSum
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // outputs the sum calculated above
        intProduct = intOperandA * intOperandB; // calculates the product of A and B and stores it in intProduct
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct); // outputs the product calculated above
        intDifference = intOperandA - intOperandB; // calculates the difference between A and B and stores the value in intDifference
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference); // outputs the difference calculated above
        intQuotient = intOperandA / intOperandB; // calculates the quotient A divided by B and stores the value in intQuotient as a whole/integer number (rounding down)
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient); // outputs the quotient calculated above
        intModulo = intOperandA % intOperandB; // calculates A divided by B and stores the remainder in intModulo (62/13 is 4 with a remainder of 10 so intModulo = 10)
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo); // outputs the remainder when A is divided by B
        doubleSum = doubleOperandA + doubleOperandB; // calculates the sum of A and B and stores it in doubleSum
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum); // outputs the sum calculated above
        doubleProduct = doubleOperandA * doubleOperandB; // calculates the product of A and B and stores it in doubleProduct
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct); // outputs the product calculated above
        doubleDifference = doubleOperandA - doubleOperandB; // calculates the difference between A and B and stores the value in doubleDifference
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference); // outputs the difference calculated above
        doubleQuotient = doubleOperandA / doubleOperandB; // calculates the quotient A divided by B and stores the value in doubleQuotient as a fractional number
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient); // outputs the quotient calculated above

        double myLunchCost = 8.50;
        System.out.println("The cost of my lunch is $" + myLunchCost); // outputs the cost of my lunch based on what was initialized
        int howManyKids = 2;
        System.out.println("The number of kids in my family is " + howManyKids); // outputs the number of kids in my family based on what was initialized
        boolean isRaining = false;
        System.out.println("The answer to is it raining outside right now is " + isRaining); // outputs the answer to "is it raining?" based on what was initialized
        double gasCost = 3.89;
        System.out.println("The price of a gallon of gas is $" + gasCost); // outputs the cost of a gallon of gas based on what was initialized
        int favNumber = 62;
        System.out.println("My favorite number is " + favNumber); // outputs my favorite number based on what was initialized
        double shoeSize = 8;
        System.out.println("The shoe size that I wear is " + shoeSize); // outputs the shoe size that was initialized
        String birthMonth = "February";
        System.out.println("My birth month is " + birthMonth); // outputs the birth month that was initialized
        String fullName = "Megan Elizabeth McCarren";
        System.out.println("My full name is " + fullName); // outputs the full name that was initialized

    }
}
