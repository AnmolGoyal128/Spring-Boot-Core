package in.SpringBootCore.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		//System.out.println("hello World");

		//Paymentgateway paymentgateway = context.getBean(Paymentgateway.class);
//		paymentgateway.setType("Paytm");
//		paymentgateway.setRetryCount(5);

//		System.out.println(paymentgateway.getType());
//		System.out.println(paymentgateway.getRetryCount());
//		System.out.println(paymentgateway.isEnabled());
//		System.out.println(paymentgateway.getTimeout());

		//paymentgateway.print();

	}

}
