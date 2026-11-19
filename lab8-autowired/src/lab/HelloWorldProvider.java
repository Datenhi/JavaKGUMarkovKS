package src.lab;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldProvider {

    private final String message = "HelloWorld!";

    public String getMessage() {
        return message;
    }
}