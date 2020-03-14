package com.pinchuk.yevhen.msscbrewery.web.controller.v2;

import com.pinchuk.yevhen.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 18:26
 */
public interface BeerServiceV2 {
    Object getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeer(UUID beerId);
}
