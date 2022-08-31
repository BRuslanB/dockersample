package kz.bitlab.dockertest.dockersample.services;

import kz.bitlab.dockertest.dockersample.dto.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1L,"IPhone 13", 20, 450000));
        items.add(new Item(2L,"IPhone 12", 10, 350000));
        items.add(new Item(3L,"IPhone 11", 15, 300000));
        items.add(new Item(4L,"IPhone 10", 30, 250000));
        return items;
    }
}
