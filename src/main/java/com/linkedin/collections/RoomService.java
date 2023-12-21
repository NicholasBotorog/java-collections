package com.linkedin.collections;

import java.util.Collection;

public class RoomService {

	// 1. Declare a Collection to store Room Inventory
	private Collection<Room> roomInventory;

	public RoomService() {
		
	// 2. Initialize Collection and assign it to the Room Inventory
	this.roomInventory = new ArrayList<>();
	}

	public Collection<Room> getInventory(){
		
	// 3. Return the Room Inventory
		
		return new HashSet<>(this.inventory);
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
	
	// 4. Add a new Room to the Room Inventory using the provided parameters
	this.roomInventory.add(new Room(name, type, capacity, rate));

	}

	public void createRooms(Room[] rooms) {
	
	// 5. Add the Rooms provided in the Array to the Room Inventory
	this.roomInventory.addAll(Array.asList(rooms));
	}
	
	public void removeRoom(Room room) {
		
	// 6. Remove the provided Room from the Room Inventory
	this.roomInventory.remove(room));
	}

}
