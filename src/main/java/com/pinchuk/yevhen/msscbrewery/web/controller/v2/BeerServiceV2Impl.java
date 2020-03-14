package com.pinchuk.yevhen.msscbrewery.web.controller.v2;

import com.pinchuk.yevhen.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 18:28
 */
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public Object getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
