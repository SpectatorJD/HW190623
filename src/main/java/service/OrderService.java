package service;

import java.util.List;

public interface OrderService {
    void addItems(List<Integer> Itemsid);
    List<Integer> getItems();
}
