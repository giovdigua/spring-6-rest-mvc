package com.giovdigua.spring6restmvc.services;

import com.giovdigua.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}
