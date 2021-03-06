package com.jfcosta.course.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jfcosta.course.entities.pk.OrderItemPK;

@Entity
@Table (name = "tb_order_item")
public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();;
	private Integer quantity;
	private BigDecimal price;

	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, BigDecimal price) {
		this.id.setOrder(order);
		this.id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder() {
		return this.id.getOrder();
	}
	
	public void setOrder(Order order) {
		this.id.setOrder(order);
	}

	public Product getProduct() {
		return this.id.getProduct();
	}
	
	public void setProduct(Product product) {
		this.id.setProduct(product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public BigDecimal getSubTotal() {
		return price.multiply(BigDecimal.valueOf(quantity)).setScale(2);
	}
}
