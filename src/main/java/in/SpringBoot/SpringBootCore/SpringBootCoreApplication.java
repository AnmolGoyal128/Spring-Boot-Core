package in.SpringBoot.SpringBootCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication//(scanBasePackages = "in.SpringBoot")  Optional
public class SpringBootCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);
		//Our IOC container is already up we just collect its reference in context Variable
		OrderService orderService = context.getBean(OrderService.class);  //method of Spring Core
		orderService.placeOrder();

	}
	@Bean  //as @SpringBootConfiguration is child annotation of @SpringBootApplication
			//No need of written @ComponentScan as it is also written in @SpringBootApplication
			//No need to write Package name as it uses its own name ing convention where the main file is located it scans in that package only
	public UserService getUserServiceBean(){
		return new UserService();
	}

}
