package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<Integer> items = new ArrayList<>();
    public void addItems(List<Integer> itemsIds){
        items.addAll(itemsIds);
    }
    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
