package com.cgi.demoJoins.dto;

import com.cgi.demoJoins.domain.Customer;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;
}
