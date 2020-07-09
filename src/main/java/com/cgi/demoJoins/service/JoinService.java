package com.cgi.demoJoins.service;

import com.cgi.demoJoins.domain.Customer;
import com.cgi.demoJoins.dto.OrderRequest;
import com.cgi.demoJoins.dto.OrderResponse;

import java.util.List;

public interface JoinService {

    Customer saveData(OrderRequest request);
    List<Customer> getData();
    List<OrderResponse> getJoinInfo();
}
