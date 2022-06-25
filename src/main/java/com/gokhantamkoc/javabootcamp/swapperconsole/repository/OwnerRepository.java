package com.gokhantamkoc.javabootcamp.swapperconsole.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.gokhantamkoc.javabootcamp.swapperconsole.model.Owner;

public class OwnerRepository {
	private List<Owner> owners;

	public OwnerRepository() {
		this.owners = new ArrayList<Owner>();
		this.owners.add(new Owner(1, "Gökhan", "Tamkoç", 738971241)); // 0
		this.owners.add(new Owner(2, "Serif", "Geyik", 89729411));		//  1
		this.owners.add(new Owner(3, "Hatice", "Kılıçer", 897294110)); // 2
	}
	
	public void addOwner(Owner owner) {
		this.owners.add(owner);
	}
	
	public void removeOwner(int ownerId) {
		int idx = 0;
		for (Owner owner : this.owners) {
			if (owner.getId() == ownerId) {
				this.owners.remove(idx);
				return;
			}
			idx++;
		}
	}
	
	public void removeOwnerWithIterator(int ownerId) {
		Iterator<Owner> iterateOwnerHandler = this.getOwners().iterator();
		while (iterateOwnerHandler.hasNext()) {
			Owner owner = iterateOwnerHandler.next();
			if (owner.getId() == ownerId) {
				iterateOwnerHandler.remove();
				return;
			}
		}
	}

	public List<Owner> getOwners() {
		return owners;
	}
}
