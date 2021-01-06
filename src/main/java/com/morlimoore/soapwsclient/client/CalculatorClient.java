package com.morlimoore.soapwsclient.client;

import com.morlimoore.soapwsclient.calculator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class CalculatorClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private final String SOAP_SERVICE_URI = "http://www.dneonline.com/calculator.asmx";

    private WebServiceTemplate template;

    public AddResponse getAddResponse(Add numbers) {
        template = new WebServiceTemplate(marshaller);
        AddResponse addResponse = (AddResponse) template.marshalSendAndReceive(SOAP_SERVICE_URI, numbers,
                new SoapActionCallback("http://tempuri.org/Add"));
        return addResponse;
    }

    public MultiplyResponse getMultiplyResponse(Multiply numbers) {
        template = new WebServiceTemplate(marshaller);
        MultiplyResponse multiplyResponse = (MultiplyResponse) template.marshalSendAndReceive(SOAP_SERVICE_URI, numbers,
                new SoapActionCallback("http://tempuri.org/Multiply"));
        return multiplyResponse;
    }

    public DivideResponse getDivideResponse(Divide numbers) {
        template = new WebServiceTemplate(marshaller);
        DivideResponse divideResponse = (DivideResponse) template.marshalSendAndReceive(SOAP_SERVICE_URI, numbers,
                new SoapActionCallback("http://tempuri.org/Divide"));
        return divideResponse;
    }

    public SubtractResponse getSubtractResponse(Subtract numbers) {
        template = new WebServiceTemplate(marshaller);
        SubtractResponse subtractResponse = (SubtractResponse) template.marshalSendAndReceive(SOAP_SERVICE_URI, numbers,
                new SoapActionCallback("http://tempuri.org/Subtract"));
        return subtractResponse;
    }
}