package lessons_EU7.practice;

public class Number_SumOfDigitsOfInteger {

    /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6

     */


    public int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }


}
