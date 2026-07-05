package in.SpringBootCore.SpringBoot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner/*ApplicationRunner*/ {

    private Paymentgateway paymentgateway;

    public DemoRunner(Paymentgateway paymentgateway) {
        this.paymentgateway = paymentgateway;
    }

    @Override
    public void run(String... args) throws Exception {

        paymentgateway.print();

    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {  //to give some argument through terminal
//        paymentgateway.print();
//
//    }
}
