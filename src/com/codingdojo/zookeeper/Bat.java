package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Fwup fwup fwup fwup");
		this.decreaseEnergyLevel(50);
	}
	
	public void eatHumans() {
		System.out.println("AAAAAARRRRRGHHHHH");
		this.increaseEnergyLevel(25);
	}
	public void attackTown() {
		System.out.println("BLAM AAAAAOOOOWW SSSSSSSS OH MY LEG!!!");
		this.decreaseEnergyLevel(100);
	}
}
