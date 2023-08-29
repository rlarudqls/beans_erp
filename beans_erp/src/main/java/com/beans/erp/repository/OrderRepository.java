package com.beans.erp.repository;

import com.beans.erp.model.Order_beans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order_beans, Long> {
}