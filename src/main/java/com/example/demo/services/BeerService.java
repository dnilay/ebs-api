package com.example.demo.services;

import com.example.demo.web.model.BeerDto;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public void updateBeer(UUID beerId, BeerDto beerDto);

    public void deleteById(UUID beerId);
    public Iterable<BeerDto> getAllBeer();
}
