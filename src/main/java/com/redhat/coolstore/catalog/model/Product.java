package com.redhat.coolstore.catalog.model;

import java.io.Serializable;
import java.util.HashMap;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject
public class Product implements Serializable {

	private static final long serialVersionUID = -6994655395272795259L;

	private String itemId;
	private String name;
	private String desc;
	private double price;

	public Product() {

	}

	public Product(JsonObject object) {
		itemId = object.getString("itemId");
		name = object.getString("name");
		desc = object.getString("desc");
		price = object.getDouble("price");
	}

	// -----
	// Add a constructor which takes a JSON object as parameter.
	// The JSON representation of the Product class is:
	//
	// {
	// "itemId" : "329199",
	// "name" : "Forge Laptop Sticker",
	// "desc" : "JBoss Community Forge Project Sticker",
	// "price" : 8.50
	// }
	//
	// -----

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

	// -----
	// Implement the toJson method which returns a JsonObject representing this
	// instance.
	// The JSON representation of the Product class is:
	//
	// {
	// "itemId" : "329199",
	// "name" : "Forge Laptop Sticker",
	// "desc" : "JBoss Community Forge Project Sticker",
	// "price" : 8.50
	// }
	//
	// -----
	public JsonObject toJson() {

		HashMap<String, Object> map = new HashMap<>();
		map.put("itemId", itemId);
		map.put("desc", desc);
		map.put("price", price);
		map.put("name", name);
		return new JsonObject(map);
	}
}
