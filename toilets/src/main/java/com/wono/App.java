package com.wono;

import com.wono.Models.Room;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Room r = new Room(args[0]);
        System.out.println(r.getId());
    }
}
