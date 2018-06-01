package pl.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.exercise.model.Beer;
import pl.exercise.service.BeerService;

@RestController
@RequestMapping("/beers")
public class BeerController {

	@Autowired
    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
    
    @GetMapping("/list")
    public Iterable<Beer> list() {
        return beerService.list();
    }
}
