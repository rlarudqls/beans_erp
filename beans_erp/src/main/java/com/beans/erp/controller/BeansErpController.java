package com.beans.erp.controller;

import com.beans.erp.model.Project;
import com.beans.erp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BeansErpController {

	private final ProjectService projectService;

	@Autowired
	public BeansErpController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/home")
	public String redirectToHomePage() {
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

	@GetMapping("/BeansProjectCreate")
	public String showProjectCreate(Model model) {
		return "BeansProjectCreate";
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

	@PostMapping("/api/createProject")
	public ResponseEntity<String> createProject(@RequestBody Project projectData) {
		projectService.saveProject(projectData);
		return ResponseEntity.ok("Project created successfully");
	}

	@GetMapping("/api/projects")
	@ResponseBody
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}
}
