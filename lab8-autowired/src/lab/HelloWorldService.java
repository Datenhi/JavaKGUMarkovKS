package src.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService{

	private final HelloWorldProvider helloWorldProvider;

    @Autowired
    public HelloWorldService(HelloWorldProvider helloWorldProvider) {
        this.helloWorldProvider = helloWorldProvider;
    }
	
	public void getMessage() {
		System.out.println(helloWorldProvider.getMessage());
	}
	
}