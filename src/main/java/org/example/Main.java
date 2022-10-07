package org.example;

public class Main {
    public static void main(String[] args) {
        //This is the old way
//        MainGreeting greeter = new MainGreeting();
//        greeter.greeting();

        //This is how we implemented Lambdas
        MyLambda greeting = () -> System.out.print("Now this is coming from a lambda");


        //Now think of Lambdas as a shorter way because they eliminate the use of a whole class
        //We no longer have to implement the interface with another class.
        //The greeting above can be thought of as an instance of the interface
        //We see this because after writing the Lambda we then have to call the method defined in the interface

        //This is done below
        greeting.greeting();

        //The method in the lambda is what is called an abstract method.
        //It is opposed to what is called an implementation method. These are seen in normal classes.

        //When implementing an interface, ensure the signatures are alike.

        //Interfaces with only one abstract method are called functional interfaces.


        //Using type inference to write even shorter lambda
        //This uses the method printHi, that takes an argument of the type MyLambda and executes its greeting method.
        //At the point of calling printHi, we must write a lamda that implements the greeting method.

        printHi(() -> System.out.print("\nHello from the argument"));

        //What happens is, rather than creating an instance that holds the implementation of printHi, we used a lamda
        //This lambda is the l parameter in the printHi declaration.
        //The printHi tells the compiler that l is of type myLambda.
        //This way the compiler infers from this to be able to tell that the implementation is of type MyLambda


        //Below this, we instantiate a class Runnable example.
        //At this point it implements the Runnable interface.
        //This is the old way done to appreciate using anonymous inner classes.
        //We need to create this object and provide it to the Thread object.
        //The goal will therefore be to make a thread that executes the run method.

//        Thread thread = new Thread(new RunnableExample());
//
//        thread.run();


        // The class below now shows how to use anonymous inner functions to create a thread.
        //This will also be accompanied by writing lambdas where applicable
        Thread myThread = new Thread(() -> System.out.print("\nThis is from a runnable in anonymous class"));

        myThread.run();

    }
    public static void printHi(MyLambda l){
        l.greeting();
    };
}
