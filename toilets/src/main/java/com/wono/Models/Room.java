package com.wono.Models;

public class Room {
  public Character Pavilion;
  public Integer Floor;
  public String RoomNumber;

  public Room(Character pPavilion, Integer pFloor, String pRoomNumber){
    this.Pavilion = pPavilion;
    this.Floor = pFloor;
    this.RoomNumber = pRoomNumber;
  }
}
