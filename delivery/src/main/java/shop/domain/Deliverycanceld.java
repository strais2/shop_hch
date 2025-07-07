package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Deliverycanceld extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private String status;
    private String address;
    private Long qty;

    public Deliverycanceld(Delivery aggregate) {
        super(aggregate);
    }

    public Deliverycanceld() {
        super();
    }
}
//>>> DDD / Domain Event
