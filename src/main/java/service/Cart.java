package service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SessionScope
public class Cart {
    private final List<Integer> items = new ArrayList<>();
    public void addItems(List<Integer> itemsIds){
        items.addAll(itemsIds);
    }
    public List<Integer> getItems(){
        return Collections.unmodifiableList(items);
    }
}
