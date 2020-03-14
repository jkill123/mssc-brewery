package com.pinchuk.yevhen.msscbrewery.services.beer.impl;

import com.pinchuk.yevhen.msscbrewery.services.beer.BeerService;
import com.pinchuk.yevhen.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 11:26
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale ale")
                .build();
    }
}
