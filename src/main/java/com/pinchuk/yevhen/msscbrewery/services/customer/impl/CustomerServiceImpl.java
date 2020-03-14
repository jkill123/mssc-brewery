package com.pinchuk.yevhen.msscbrewery.services.customer.impl;

import com.pinchuk.yevhen.msscbrewery.services.customer.CustomerService;
import com.pinchuk.yevhen.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 14/03/2020 - 11:52
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getBeerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Dou")
                .build();
    }
}
