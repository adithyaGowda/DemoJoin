package com.cgi.demoJoins.controller;

import com.cgi.demoJoins.dto.OrderRequest;
import com.cgi.demoJoins.service.JoinService;
import com.cgi.demoJoins.service.JoinServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class JoinController {
    @Autowired
    private JoinService joinService;

    @PostMapping("/placeOrder")
    public ResponseEntity<?> placeOrder(@RequestBody OrderRequest request) {
        return new ResponseEntity(joinService.saveData(request), HttpStatus.ACCEPTED);
    }

    @GetMapping("/findAllOrders")
    public ResponseEntity<?> findAllOrders() {
        return new ResponseEntity(joinService.getData(), HttpStatus.OK);
    }

    @GetMapping("/getJoinInfo")
    public ResponseEntity<?> getJoinInfo() {
        return new ResponseEntity(joinService.getJoinInfo(), HttpStatus.OK);
    }

}
