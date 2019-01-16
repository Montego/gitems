package montego.gitems.service;

import montego.gitems.repo.ItemGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemGenreService {
    private final ItemGenreRepository itemGenreRepository;
    @Autowired
    public ItemGenreService(ItemGenreRepository itemGenreRepository) {
        this.itemGenreRepository = itemGenreRepository;
    }
}
