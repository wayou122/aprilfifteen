package model;

import java.util.Map;

public class CoffeeOrder {
	private static final Map<String,Map<String,Integer>> priceTable = Map.of(
			"Latte", Map.of("S",50,"M",70,"L",90),
			"Mocha", Map.of("S",45,"M",55,"L",65),
			"Americano", Map.of("S",40,"M",45,"L",60),
			"Cappuccino",Map.of("S",55,"M",80,"L",100)
			);
	private static final Map<String,String> sizeTable = Map.of(
			"S","小","M","中","L","大");
	private String type;
	private String size;
	private Integer price;
	private String sugar;
	
	public CoffeeOrder(String type, String size, String sugar) {
		this.type = type; this.size = size; this.sugar = sugar;
		this.price = priceTable.get(type).get(size);
	}
	
	public String getInfo() {
		String sizeText = sizeTable.get(size);
		String sugarText = sugar.equals("true") ? "(加糖)":"(無糖)";
		return String.format("您點了一杯%s杯%s咖啡%s價格：%d元", sizeText,type,sugarText,price);
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}

	public Integer getPrice() {
		return price;
	}

	public String getSugar() {
		return sugar;
	}
	
	
}
