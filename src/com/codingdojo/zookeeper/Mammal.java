package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void increaseEnergyLevel(int increaseAmount) {
		this.energyLevel += increaseAmount;
	}
	
	public void decreaseEnergyLevel(int decreaseAmount) {
		this.energyLevel -= decreaseAmount;
	}
	
	public String displayEnergy() {
		String currentEnergyLevel = "Current energy level: " + getEnergyLevel();
		System.out.println(currentEnergyLevel);
		return currentEnergyLevel;
	}
}
