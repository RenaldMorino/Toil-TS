package com.wono.Models;

import java.util.ArrayList;

import com.wono.Utils.Iterators.SinkIterator;
import com.wono.Utils.Iterators.ToiletIterator;
import com.wono.Utils.Iterators.UrinalIterator;
import com.wono.Utils.StaticMethods.RoomMethods;

/**
 * Washroom is a class that contains a list of Sinks, Toilets, and Urinals
 */
public class Washroom {
  private ArrayList<Sink> Sinks;
  private ArrayList<Toilet> Toilets;
  private ArrayList<Urinal> Urinals;
  private Room Room;

  // region Sinks methods
  public SinkIterator getSinks() {
    return new SinkIterator(this.Sinks);
  }

  public void addSink(Sink pSink) {
    this.Sinks.add(pSink);
  }

  public void removeSink(Sink pSink) {
    this.Sinks.remove(pSink);
  }
  // endregion

  // region Toilets methods
  public ToiletIterator getToilets() {
    return new ToiletIterator(this.Toilets);
  }

  public void addToilet(Toilet pToilet) {
    this.Toilets.add(pToilet);
  }

  public void removeToilet(Toilet pToilet) {
    this.Toilets.remove(pToilet);
  }
  // endregion

  // region Urinals methods
  public UrinalIterator getUrinals() {
    return new UrinalIterator(this.Urinals);
  }

  public void addUrinal(Urinal pUrinal) {
    this.Urinals.add(pUrinal);
  }

  public void removeUrinal(Urinal pUrinal) {
    this.Urinals.remove(pUrinal);
  }
  // endregion

  public Washroom(String pRoomNumber) {
    this.Sinks = new ArrayList<>();
    this.Toilets = new ArrayList<>();
    this.Urinals = new ArrayList<>();
    this.Room = RoomMethods.RoomFromNumber(pRoomNumber);
  }

  // public Washroom(ArrayList<Sink> pSinks, ArrayList<Toilet> pToilets) {
  // this.Sinks = pSinks;
  // this.Toilets = pToilets;
  // }

  // public Washroom(ArrayList<Sink> pSinks, ArrayList<Toilet> pToilets,
  // ArrayList<Urinal> pUrinals) {
  // this.Sinks = pSinks;
  // this.Toilets = pToilets;
  // this.Urinals = pUrinals;
  // }
}
