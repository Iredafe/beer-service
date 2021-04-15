package dafe.springframework.beerservice.web.bootstrap;

import dafe.springframework.beerservice.domain.Beer;
import dafe.springframework.beerservice.web.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository=beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    loadBeerObject();
    }

    private void loadBeerObject() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder().beerName("Gulder Beer")
                    .beerStyle("Lager")
                    .quantityToBrew(200)
                    .build());
        }
    }
}
