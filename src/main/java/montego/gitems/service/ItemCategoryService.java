package montego.gitems.service;

import montego.gitems.repo.ItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryService {
    private final ItemCategoryRepository itemCategoryRepository;
    @Autowired
    public ItemCategoryService(ItemCategoryRepository itemCategoryRepository) {
        this.itemCategoryRepository = itemCategoryRepository;
    }
}
