package org.example;

public class MainGreeting implements MyLambda {
    public void greeting(){
        //This class and its attribute represent what Java 7 offered as far as abstraction is concerned.
        // We would need to instantiate the class here to use this method.
        System.out.print(
                "If you see this, at least you've got the gist of what an interface is"
        );

    }
}
