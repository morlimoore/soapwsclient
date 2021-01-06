package com.morlimoore.soapwsclient.controllers;

import com.morlimoore.soapwsclient.calculator.*;
import com.morlimoore.soapwsclient.client.CalculatorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorClient client;

    @PostMapping("/getAddResponse")
    public AddResponse getAddResponse(@RequestBody Add numbers) {
        return client.getAddResponse(numbers);
    }

    @PostMapping("/getMultiplyResponse")
    public MultiplyResponse getMultiplyResponse(@RequestBody Multiply numbers) {
        return client.getMultiplyResponse(numbers);
    }

    @PostMapping("/getDivideResponse")
    public DivideResponse getDivideResponse(@RequestBody Divide numbers) {
        return client.getDivideResponse(numbers);
    }

    @PostMapping("/getSubtractResponse")
    public SubtractResponse getSubtractResponse(@RequestBody Subtract numbers) {
        return client.getSubtractResponse(numbers);
    }
}