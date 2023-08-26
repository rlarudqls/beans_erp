package com.beans.erp.service; // 이전 패키지 경로와 일치시켜주세요
// com.beans.erp.service.ProjectServiceImpl

import com.beans.erp.model.Project;
import com.beans.erp.repository.ProjectRepository; // 프로젝트의 리포지토리를 import

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    @Transactional
    public void saveProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // 다른 메서드들...
}
