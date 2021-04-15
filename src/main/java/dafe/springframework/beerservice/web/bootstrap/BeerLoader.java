package dafe.springframework.beerservice.web.bootstrap;

import dafe.springframework.beerservice.domain.Beer;
import dafe.springframework.beerservice.web.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

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
                    .upc(3324875993L)
                    .price(new BigDecimal(25.95))
                    .minOnHand(34)
                    .build());


            beerRepository.save(Beer.builder().beerName("Guinness Beer")
                    .beerStyle("Small Stout")
                    .quantityToBrew(530)
                    .upc(5428875993L)
                    .price(new BigDecimal(67.95))
                    .minOnHand(49)
                    .build());
        }
        System.out.println("Loaded " +beerRepository.count() + " successfully");
    }
}
