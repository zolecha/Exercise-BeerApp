package pl.exercise.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.exercise.model.Beer;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Long> {

	 @Query("SELECT b FROM Beer b WHERE b.name LIKE %?1%")
	 public List<Beer> findBeersByNamePhrase(String phrase);
	
	 //Should fix
//	 @Query("SELECT b FROM Beer b WHERE b.food_pairing LIKE %?1%")
//	 public List<Beer> findBeersByFoodPairingPhrase(String phrase);
	 
}
