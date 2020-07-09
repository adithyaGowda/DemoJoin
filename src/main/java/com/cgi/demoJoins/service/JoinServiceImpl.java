package com.cgi.demoJoins.service;

import com.cgi.demoJoins.domain.Customer;
import com.cgi.demoJoins.domain.Product;
import com.cgi.demoJoins.dto.OrderRequest;
import com.cgi.demoJoins.dto.OrderResponse;
import com.cgi.demoJoins.repo.CustomerRepo;
import com.cgi.demoJoins.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinServiceImpl implements JoinService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ProductRepo productRepo;

    @Override
    public Customer saveData(OrderRequest request) {
        return customerRepo.save(request.getCustomer());
    }

    @Override
    public List<Customer> getData() {
        return customerRepo.findAll();
    }

    @Override
    public List<OrderResponse> getJoinInfo() {
        return customerRepo.getJoinInformation();
    }
}
