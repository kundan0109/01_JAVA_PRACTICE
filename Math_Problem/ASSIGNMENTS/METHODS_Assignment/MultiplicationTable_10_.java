package Math_Problem.ASSIGNMENTS.METHODS_Assignment;
/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
        4! = 1*2*3*4 = 24
        3! = 3*2*1 = 6
        2! = 2*1 = 2
Also,
        1! = 1
        0! = 0*/
class table{

    public static void main(String[] args) {
        int number = 15;
        multiplicationTable(number, 1);
    }

    private static void multiplicationTable(int number, int i) {
        if (i > 10){
            return;
        }
        else {
            System.out.println(number + " * " + i + " = " + number * i);
            multiplicationTable(number , i+1);
        }

    }


}
