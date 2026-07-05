package in.SpringBoot.SpringBootCore;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();

        System.out.println("Order placed");

    }
}
