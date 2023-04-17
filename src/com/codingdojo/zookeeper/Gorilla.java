package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		this.setEnergyLevel(100);
	}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		this.decreaseEnergyLevel(5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla is satisfied.");
		this.increaseEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		this.decreaseEnergyLevel(10);
	}
}
