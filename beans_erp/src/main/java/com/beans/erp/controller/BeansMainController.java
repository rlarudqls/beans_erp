package com.beans.erp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeansMainController {

    @GetMapping("/")
    public String showMainPage() {
        return "main"; // main.html 템플릿 파일명
    }
}
