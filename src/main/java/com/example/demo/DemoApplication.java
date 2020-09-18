package com.example.demo;

import com.example.demo.repo.BeerRepository;
import com.example.demo.web.model.BeerDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
private BeerRepository beerRepository;

    public DemoApplication(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        beerRepository.save(new BeerDto(UUID.randomUUID(),"Royal Challenge Premium","Larger",110L));
        beerRepository.save(new BeerDto(UUID.randomUUID(),"Zingaro","Lemon",180L));
        beerRepository.save(new BeerDto(UUID.randomUUID(),"Haywards","Ginger",110L));

    }
}
