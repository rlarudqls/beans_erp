package com.beans.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeansErpController {

    @GetMapping("/home")
    public String redirectToHomePage() {
        return "redirect:/BeansHome";
    }

    @GetMapping("/BeansHome")
    public String showBeansHome(Model model) {
        return "BeansHome";
    }

    @GetMapping("/BeansOrderManagement")
    public String showOrderManagement(Model model) {
        return "BeansOrderManagement";
    }

    @GetMapping("/BeansInventoryLogistics")
    public String showInventoryLogistics(Model model) {
        return "BeansInventoryLogistics";
    }

    @GetMapping("/BeansHumanResources")
    public String showHumanResources(Model model) {
        return "BeansHumanResources";
    }

    @GetMapping("/BeansAccountingFinance")
    public String showAccountingFinance(Model model) {
        return "BeansAccountingFinance";
    }

    @GetMapping("/BeansProjectManagement")
    public String showProjectManagement(Model model) {
        return "BeansProjectManagement";
    }

    @GetMapping("/BeansReportingAnalysis")
    public String showReportingAnalysis(Model model) {
        return "BeansReportingAnalysis";
    }

    @GetMapping("/BeansDocumentManagement")
    public String showDocumentManagement(Model model) {
        return "BeansDocumentManagement";
    }

    @GetMapping("/BeansNotifications")
    public String showNotifications(Model model) {
        return "BeansNotifications";
    }

    @GetMapping("/BeansMemberInformation")
    public String showMemberInformation(Model model) {
        return "BeansMemberInformation";
    }
}
