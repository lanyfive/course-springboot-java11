package com.lunionsoft.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunionsoft.course1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
