package service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service
@Scope("prototype")
public class OrderServiceImpl implements OrderService{


    private final Cart cart;
    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItems(List<Integer>ItemIds){
        cart.addItems(ItemIds);

    }
    @Override
    public List<Integer> getItems(){
        return cart.getItems();
    }
}
