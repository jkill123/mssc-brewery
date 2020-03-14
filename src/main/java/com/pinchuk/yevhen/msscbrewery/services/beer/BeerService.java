package com.pinchuk.yevhen.msscbrewery.services.beer;

import com.pinchuk.yevhen.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 11:24
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);
    void updateBeer(UUID beerId, BeerDto beerDto);
    void deleteBeer(UUID beerId);
}
