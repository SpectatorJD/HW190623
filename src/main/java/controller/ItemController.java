package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemController {
    private final OrderService orderService;
    public ItemController(OrderService orderService){
        this.orderService=orderService;
    }
    @GetMapping("/add")
    public void addItems (@RequestParam List<Integer> itemIds){
        orderService.addItems(itemIds);
    }
    @GetMapping("/get")
    public List<Integer> getItems(){
        return orderService.getItems();
    }

}
