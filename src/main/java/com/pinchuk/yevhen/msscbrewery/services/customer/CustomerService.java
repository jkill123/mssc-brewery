package com.pinchuk.yevhen.msscbrewery.services.customer;

import com.pinchuk.yevhen.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 11:51
 */
public interface CustomerService {
    CustomerDto getBeerById(UUID customerId);
}
