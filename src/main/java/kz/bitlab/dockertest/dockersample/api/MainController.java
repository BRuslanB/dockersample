package kz.bitlab.dockertest.dockersample.api;

import kz.bitlab.dockertest.dockersample.dto.Item;
import kz.bitlab.dockertest.dockersample.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class MainController {

    private final ItemService itemService;

    @GetMapping
    public List<Item> getItems(){
        return itemService.getItems();
    }

}
