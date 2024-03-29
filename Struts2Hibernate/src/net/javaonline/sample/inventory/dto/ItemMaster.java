package net.javaonline.sample.inventory.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="Items")
public class ItemMaster implements Serializable{
		
	private static final long serialVersionUID = -1883317581153939034L;
	
	private Long item_code;
	private String item_name;
	private String category;
	private double price  ;
	private int qty;
	//private Date createdOn;
	
	@Temporal(TemporalType.DATE)
	@Column (name="createdOn")
	private Date createdOn;

	
public Date getCreatedOn() {
		//return new Date();
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Id
	@GeneratedValue
	@Column(name="item_code")
	public Long getItem_code() {
		return item_code;
	}
	public void setItem_code(Long item_code) {
		this.item_code = item_code;
	}
	@Column(name="item_name")
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	@Column(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Column(name="price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name="qty")
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	 
	
}
