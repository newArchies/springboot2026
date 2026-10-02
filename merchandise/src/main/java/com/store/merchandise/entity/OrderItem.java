package com.store.merchandise.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="order_items")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class OrderItem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Integer quantity;
	
	@Column(nullable=false, name="price_at_purchase")
	private BigDecimal priceAtPurchase;
	
	@ManyToOne
	@JoinColumn(name="order_id",nullable=false)
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="product_id",nullable=false)
	private Product product;
}
