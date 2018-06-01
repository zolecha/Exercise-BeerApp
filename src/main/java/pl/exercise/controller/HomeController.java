package pl.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.exercise.model.Beer;

import pl.exercise.service.BeerService;




@Controller
public class HomeController {
	
	@Autowired
    private BeerService beerService;
	
	 @GetMapping("/")
	    public String home(){
	        return "home";
		}
	    
	    @GetMapping("/addBeer")
	    public String addBeerForm(Model model){
	    	model.addAttribute("beer", new Beer());
	        return "addBeer";
		}
	    
	    @PostMapping("/added")
	    public String addBeer(@ModelAttribute Beer beer){
	    	beer = beerService.save(beer);
	    	return "redirect:/addBeer?added";
	    }
	    
	    
	    @GetMapping("/search/name/{phrase}")
	    public String searchBeerName(Model model, @PathVariable String phrase) {
	    	List<Beer> beer = beerService.findBeersByNamePhrase(phrase);
			model.addAttribute("beer", beer);    	
	    	return "beers";
	    }
	    
	    
//	    @GetMapping("/search/{phrase}")
//	    public String searchBeerDesc(Model model, @PathVariable String phrase) {	    	
//	    	System.out.println(beerService.findBeersByFoodPairingPhrase(phrase));
//	    	return "redirect:/home";
//	    }
	    


}
