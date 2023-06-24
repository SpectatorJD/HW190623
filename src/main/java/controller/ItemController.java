package controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

@RestController
@RequestParam("/order")
public class ItemController {
    private final OrderService orderService;
    public ItemController(OrderService orderService){
        this.orderService=orderService;
    }
}
