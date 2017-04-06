package com.redhat.coolstore.api_gateway.model;

public class Product  {

	public String itemId;
	public String name;
	public String desc;
	public double price;
	public String location;
	public int quantity;
	public String link;

	public Product() {

	}
	public Product(String itemId, String name, String desc, double price) {
		this.itemId = itemId;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String toString() {
		return ("Product toString: name:" + name + " id:" + itemId + " price:" + price + " desc:" +
				desc + " location: " + location + " quantity:" + quantity + " link: " + link);
	}
}
