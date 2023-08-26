package com.beans.erp.service;

import com.beans.erp.model.Project;
import com.beans.erp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
    @Override
    public void saveProject(Project project) {
        // 데이터베이스에 프로젝트를 저장하는 구현
        // 예를 들어, repository.save(project); 와 같은 코드가 여기에 들어갑니다.
    }
    // 기타 메서드 구현...
}
