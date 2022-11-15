package com.wono.Models;

/**
 * A Room is a class that has a pavilion, a floor and a room number.
 */
public class Room {
  public Character Pavilion;
  public Integer Floor;
  public String RoomNumber;

  // A constructor.
  public Room(Character pPavilion, Integer pFloor, String pRoomNumber){
    this.Pavilion = pPavilion;
    this.Floor = pFloor;
    this.RoomNumber = pRoomNumber;
  }
}
