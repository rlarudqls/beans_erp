package com.beans.erp.repository;

import com.beans.erp.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // 추가적인 메서드나 쿼리 메서드를 정의할 수 있습니다.
}
