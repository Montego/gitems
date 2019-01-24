package montego.gitems.controller;

import montego.gitems.entity.Item;
import montego.gitems.repo.ItemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Item> listItem() {
        return itemRepository.findAll();
    }

    @GetMapping("{id}")
    public Item getOneItem(@PathVariable("id") Item item) {
        return item;
    }

    @PostMapping()
    public Item createOneItem(@RequestBody Item item) {
        item.setCreationDate(LocalDateTime.now());
        return itemRepository.save(item);
    }

    @PostMapping("{id}")
    public Item updateOneItem(@PathVariable("id") Item itemFromDB,
                              @RequestBody Item item){
        BeanUtils.copyProperties(item, itemFromDB, "id");
        return itemRepository.save(itemFromDB);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Item item){
        itemRepository.delete(item);
    }
}
