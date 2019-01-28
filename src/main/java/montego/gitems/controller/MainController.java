package montego.gitems.controller;

import montego.gitems.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final ItemRepository itemService;

    @Autowired
    public MainController(ItemRepository itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

//    @GetMapping("/main/movies")
//    public String moviesList(Model model, @PathVariable ItemCategory itemCategory) {
//        model.addAttribute("movies", itemService.findByCategory(itemCategory))
//    }


}
