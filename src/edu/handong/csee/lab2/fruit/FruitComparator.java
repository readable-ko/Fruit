package edu.handong.csee.lab2.fruit;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
