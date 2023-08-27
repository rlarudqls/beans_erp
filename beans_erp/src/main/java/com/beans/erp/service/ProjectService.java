package com.beans.erp.service;

import com.beans.erp.model.Project;

import java.util.List;

public interface ProjectService {
	List<Project> getAllProjects();

	void saveProject(Project project);
}
