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
  /**
   * This function returns an iterator that iterates over the sinks of the graph.
   * 
   * @return A SinkIterator object.
   */
  public SinkIterator getSinks() {
    return new SinkIterator(this.Sinks);
  }

  /**
   * This function adds a sink to the list of sinks
   * 
   * @param pSink The sink to add to the list of sinks.
   */
  public void addSink(Sink pSink) {
    this.Sinks.add(pSink);
  }

  /**
   * This function removes a sink from the list of sinks
   * 
   * @param pSink The sink to be removed from the list of sinks.
   */
  public void removeSink(Sink pSink) {
    this.Sinks.remove(pSink);
  }
  // endregion

  // region Toilets methods
  /**
   * This function returns an iterator that iterates over the toilets in the building.
   * 
   * @return A new ToiletIterator object.
   */
  public ToiletIterator getToilets() {
    return new ToiletIterator(this.Toilets);
  }

  /**
   * This function adds a toilet to the list of toilets
   * 
   * @param pToilet The toilet to add to the list of toilets.
   */
  public void addToilet(Toilet pToilet) {
    this.Toilets.add(pToilet);
  }

  /**
   * This function removes a toilet from the list of toilets
   * 
   * @param pToilet The toilet to be removed from the list.
   */
  public void removeToilet(Toilet pToilet) {
    this.Toilets.remove(pToilet);
  }
  // endregion

  // region Urinals methods
  /**
   * This function returns an iterator that iterates over the urinals in the bathroom.
   * 
   * @return An iterator object that can be used to iterate over the urinals in the bathroom.
   */
  public UrinalIterator getUrinals() {
    return new UrinalIterator(this.Urinals);
  }

  /**
   * This function adds a urinal to the list of urinals
   * 
   * @param pUrinal The urinal to add to the list of urinals.
   */
  public void addUrinal(Urinal pUrinal) {
    this.Urinals.add(pUrinal);
  }

  /**
   * This function removes a urinal from the list of urinals
   * 
   * @param pUrinal The urinal to be removed from the list.
   */
  public void removeUrinal(Urinal pUrinal) {
    this.Urinals.remove(pUrinal);
  }
  // endregion

  // A constructor that takes a room number and creates a new washroom object.
  public Washroom(String pRoomNumber) {
    this.Sinks = new ArrayList<>();
    this.Toilets = new ArrayList<>();
    this.Urinals = new ArrayList<>();
    this.Room = RoomMethods.RoomFromNumber(pRoomNumber);
  }
}
