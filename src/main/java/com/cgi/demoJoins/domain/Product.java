package com.cgi.demoJoins.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    private int productId;
    private String productName;
    private int qty;
    private int price;
}
