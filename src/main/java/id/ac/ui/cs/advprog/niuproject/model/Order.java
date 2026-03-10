package id.ac.ui.cs.advprog.niuproject.model;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

enum OrderStatus {
    WAITING_PAYMENT,
    FAILED,
    CANCELLED,
    SUCCESS
}

@Getter @Setter
public class Order {
    private String orderId;
    private List<Product> products;
    private String author;
    private OrderStatus status = OrderStatus.WAITING_PAYMENT;
}

