package com.mhfusetbuilder.Classes;

public enum Rarity {

	RARITY_1(1, "Low"),
	RARITY_2(2, "Low"),
	RARITY_3(3, "Low"),
	RARITY_4(4, "Low"),
	RARITY_5(5, "Low"),
	RARITY_6(6, "High"),
	RARITY_7(7, "High"),
	RARITY_8(8, "High"),
	RARITY_9(9, "G"),
	RARITY_10(10, "G");

	private final int rarityNumber;

	private final String rank;

	Rarity(int rarity, String rank){
		this.rarityNumber = rarity;
		this.rank = rank;
	}

	public int getRarityNumber() {
		return rarityNumber;
	}

	public String getRank() {
		return rank;
	}
}
