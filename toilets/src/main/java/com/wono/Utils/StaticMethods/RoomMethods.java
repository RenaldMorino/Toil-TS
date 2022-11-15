package com.wono.Utils.StaticMethods;

import com.wono.Models.Room;

public class RoomMethods {

  public static Room RoomFromNumber(String pRoomNumber) {
    return new Room(pRoomNumber.charAt(0), Integer.parseInt(pRoomNumber.substring(1, 2)), pRoomNumber);
  }
}
