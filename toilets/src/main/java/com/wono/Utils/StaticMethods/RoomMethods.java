package com.wono.Utils.StaticMethods;

import com.wono.Models.Room;

/**
 * It takes a string and returns a Room object
 */
public class RoomMethods {

  /**
   * It takes a string and returns a Room object.
   * 
   * @param pRoomNumber The room number as a string.
   * @return A new Room object with the parameters of the room number.
   */
  public static Room RoomFromNumber(String pRoomNumber) {
    return new Room(pRoomNumber.charAt(0), Integer.parseInt(pRoomNumber.substring(1, 2)), pRoomNumber);
  }
}
