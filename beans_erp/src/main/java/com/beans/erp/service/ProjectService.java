package com.beans.erp.service;

import com.beans.erp.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();
    // 기타 메서드...
    void saveProject(Project project);
}
