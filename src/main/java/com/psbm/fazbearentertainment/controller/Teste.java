package com.psbm.fazbearentertainment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Teste {
    
    @RequestMapping(method = RequestMethod.GET, path = "/teste", produces = "application/json")
    @ResponseBody
    public String teste(){
        return "Get teste";
    }
}
