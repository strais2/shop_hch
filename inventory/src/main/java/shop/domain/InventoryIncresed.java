package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncresed extends AbstractEvent {

    private Long id;
    private String name;

    public InventoryIncresed(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncresed() {
        super();
    }
}
//>>> DDD / Domain Event
