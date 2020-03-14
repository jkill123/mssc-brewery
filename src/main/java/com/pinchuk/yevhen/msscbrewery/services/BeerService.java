package com.pinchuk.yevhen.msscbrewery.services;

import com.pinchuk.yevhen.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 11:24
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
