package model;

import java.util.Map;

public class DrinkOrder {
	public String type;
	String size;
	String ice;
	Integer price;
	private static final Map<String, Map<String,Integer>> priceMap =
			Map.of("greenTea",Map.of("S",30,"M",50,"L",50),
					"blackTea",Map.of("S",45,"M",55,"L",65),
					"milkTea",Map.of("S",40,"M",45,"L",60));
	
	public DrinkOrder(String type, String size, String ice) {
		this.type = type;
		this.size = size;
		this.ice = ice;
		this.price = priceMap.get(type).get(size);
	}
	public String getInfo() {
		String iceText = switch(ice) {
			case "yes"-> "with ice";
			case "no"-> "without ice";
			default -> "no-data";
		};
		return String.format("You order a %s (%s %s), price is $%d.",type,size,iceText,price)+
		String.format("你點了一杯 %s (%s %s), 價格是 %d.",type,size,iceText,price);
	}
}
