package montego.gitems.service;

import montego.gitems.repo.ItemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemTypeService {
    private final ItemTypeRepository itemTypeRepository;

    @Autowired
    public ItemTypeService(ItemTypeRepository itemTypeRepository) {
        this.itemTypeRepository = itemTypeRepository;
    }
}
