package com.gokhantamkoc.javabootcamp.swapperconsole.model.ownerhelper;

import java.util.Comparator;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Owner;

public class OrderByOwnerName implements Comparator<Owner> {

	@Override
	public int compare(Owner o1, Owner o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
