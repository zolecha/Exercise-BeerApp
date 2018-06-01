package pl.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import pl.exercise.model.Beer;
import pl.exercise.repository.BeerRepository;

@Service
public class BeerService {
	
	@Autowired
    private BeerRepository beerRepository;
    
    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }
 
    public Iterable<Beer> list() {
        return beerRepository.findAll();
    }
 
    public Beer save(Beer beer) {
        return beerRepository.save(beer);
    }
    
    public Iterable<Beer> save(List<Beer> beers) {
    	return beerRepository.saveAll(beers);
    }
    
	 public List<Beer> findBeersByNamePhrase(String phrase){
		 return beerRepository.findBeersByNamePhrase(phrase);
	 }
	
	 //Should fix

//	 public List<Beer> findBeersByFoodPairingPhrase(String phrase){
//		 return beerRepository.findBeersByFoodPairingPhrase(phrase);
//	 }
}
