package com.example.demo.services;
import com.example.demo.repo.BeerRepository;
import com.example.demo.web.model.BeerDto;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class BeerServiceImpl implements BeerService {
    private Logger logger=Logger.getLogger("BeerServiceImpl.class");
    private BeerRepository beerRepository;

    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return beerRepository.findById(beerId).get();

    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
      return beerRepository.save(beerDto);
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        logger.info("Deleting a beer...");
    }

    @Override
    public Iterable<BeerDto> getAllBeer() {
        return beerRepository.findAll();
    }
}
