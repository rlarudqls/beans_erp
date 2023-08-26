package com.beans.erp.service;

import java.util.List;

//com.beans.erp.service.ProjectService

import com.beans.erp.model.Project;

public interface ProjectService {
 void saveProject(Project project);
 List<Project> getAllProjects();
 // 다른 메서드들...
}
