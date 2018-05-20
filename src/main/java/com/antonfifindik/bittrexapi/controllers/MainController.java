package com.antonfifindik.bittrexapi.controllers;

import com.antonfifindik.bittrexapi.service.BittrexApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    BittrexApiClient bittrexApiClient;

    @RequestMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("responseList", bittrexApiClient.getAll());
        return "index";
    }
}
