package com.example.demo;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;
@Document
@Data
public class Item
{
	@Id
private String itemId;
	private String itemName;
	private double itemPrice;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dateToday;
	public Item(String itemId, String itemName, double itemPrice, LocalDate dateToday) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.dateToday = dateToday;
	}
	
}
