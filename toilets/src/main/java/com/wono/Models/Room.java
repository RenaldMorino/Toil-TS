package com.wono.Models;

/**
 * A Room is a class that has a pavilion, a floor and a room number.
 */
public class Room extends Entity {
  private Character pavilion;
  private Integer floor;
  private Integer roomNumber;
  private String fullname;

  /**
   * This function returns the pavilion where the room is.
   * 
   * @return The pavilion where the room is.
   */
  public Character getPavilion() {
    return this.pavilion;
  }

  /**
   * This function returns the floor of the room.
   * 
   * @return The floor number ozf the room.
   */
  public Integer getFloor() {
    return this.floor;
  }

  /**
   * This function returns the room number of the room
   * 
   * @return The room number.
   */
  public Integer getRoomNumber() {
    return this.roomNumber;
  }

  /**
   * This function returns the full name of the room
   * 
   * @return The full name of the room.
   */
  public String getFullname() {
    return this.fullname;
  }

  // A constructor for regular room numbers.
  public Room(String pRoomNumber) {
    super();
    this.pavilion = pRoomNumber.toUpperCase().charAt(0);
    if (pRoomNumber.substring(1, 2).equals("-"))
      this.floor = Integer.parseInt(pRoomNumber.substring(2, 3));
    else
      this.floor = Integer.parseInt(pRoomNumber.substring(1, 2));
    this.roomNumber = Integer.parseInt(pRoomNumber.substring(pRoomNumber.indexOf(this.floor.toString()), pRoomNumber.length()));
    this.fullname = this.pavilion + "-" + String.format("%04d", this.roomNumber);
  }

  // A constructor for rooms that aren't numbered regularly aka, starting with an S.
  // public Room(Character pPavilion, Integer pFloor, String pRoomNumber) {
  //   this.Pavilion = pPavilion;
  //   this.Floor = pFloor;
  //   this.RoomNumber = pRoomNumber;
  // }

  /**
   * This function returns the room as a string.
   * 
   * @return The room number, the pavilion and the floor.
   */
  @Override
  public String toString() {
    return "Le local " + this.fullname + " est dans le pavillon " + this.pavilion
        + " et à l'étage " + this.floor;
  }
}
