package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    public HelloClass (String name,String period) {
        this.message = "Hello " + name + "!" + "  preiod: "+period;
    }
    
    public HelloClass (String name,int duration) {
        this.message = "The " + name + "'s!" + "  duration: "+duration;
    }

    public String getMessage() {
        return message;
    }
}
