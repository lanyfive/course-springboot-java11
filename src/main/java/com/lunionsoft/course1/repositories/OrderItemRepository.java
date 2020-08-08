package com.lunionsoft.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunionsoft.course1.entities.OrderItem;
import com.lunionsoft.course1.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
