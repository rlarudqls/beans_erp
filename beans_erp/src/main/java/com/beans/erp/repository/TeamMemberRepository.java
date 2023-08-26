// TeamMemberRepository.java
package com.beans.erp.repository;

import com.beans.erp.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
    // 추가적인 메서드나 쿼리 메소드를 선언할 수 있습니다.
}