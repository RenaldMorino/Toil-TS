package com.wono.Models;

import java.util.ArrayList;
import com.wono.Utils.Iterators.BrownPaperDispenserIterator;
import com.wono.Utils.Iterators.HandDryerIterator;
import com.wono.Utils.Iterators.SinkIterator;
import com.wono.Utils.Iterators.ToiletIterator;
import com.wono.Utils.Iterators.UrinalIterator;

/**
 * Washroom is a class that contains a list of Sinks, Toilets, and Urinals
 */
public class Washroom extends Room{
  private ArrayList<Sink> sinks;
  private ArrayList<Toilet> toilets;
  private ArrayList<Urinal> urinals;
  private ArrayList<HandDryer> handDryers;
  private ArrayList<BrownPaperDispenser> brownPaperDispensers;

  // region Sinks methods
  /**
   * This function returns an iterator that iterates over the sinks of the graph.
   * 
   * @return A SinkIterator object.
   */
  public SinkIterator getSinks() {
    return new SinkIterator(this.sinks);
  }

  /**
   * This function adds a sink to the list of sinks
   * 
   * @param pSink The sink to add to the list of sinks.
   */
  public void addSink(Sink pSink) {
    this.sinks.add(pSink);
  }

  /**
   * This function removes a sink from the list of sinks
   * 
   * @param pSink The sink to be removed from the list of sinks.
   */
  public void removeSink(Sink pSink) {
    this.sinks.remove(pSink);
  }
  // endregion

  // region Toilets methods
  /**
   * This function returns an iterator that iterates over the toilets in the building.
   * 
   * @return A new ToiletIterator object.
   */
  public ToiletIterator getToilets() {
    return new ToiletIterator(this.toilets);
  }

  /**
   * This function adds a toilet to the list of toilets
   * 
   * @param pToilet The toilet to add to the list of toilets.
   */
  public void addToilet(Toilet pToilet) {
    this.toilets.add(pToilet);
  }

  /**
   * This function removes a toilet from the list of toilets
   * 
   * @param pToilet The toilet to be removed from the list.
   */
  public void removeToilet(Toilet pToilet) {
    this.toilets.remove(pToilet);
  }
  // endregion

  // region Urinals methods
  /**
   * This function returns an iterator that iterates over the urinals in the bathroom.
   * 
   * @return An iterator object that can be used to iterate over the urinals in the bathroom.
   */
  public UrinalIterator getUrinals() {
    return new UrinalIterator(this.urinals);
  }

  /**
   * This function adds a urinal to the list of urinals
   * 
   * @param pUrinal The urinal to add to the list of urinals.
   */
  public void addUrinal(Urinal pUrinal) {
    this.urinals.add(pUrinal);
  }

  /**
   * This function removes a urinal from the list of urinals
   * 
   * @param pUrinal The urinal to be removed from the list.
   */
  public void removeUrinal(Urinal pUrinal) {
    this.urinals.remove(pUrinal);
  }
  // endregion

  //region HandDryers methods
  /**
   * This function returns an iterator that iterates over the hand dryers in the bathroom.
   * 
   * @return A new HandDryerIterator object.
   */
  public HandDryerIterator getHandDryers() {
    return new HandDryerIterator(this.handDryers);
  }

  /**
   * This function adds a hand dryer to the list of hand dryers
   * 
   * @param pHandDryer The HandDryer object to add to the list.
   */
  public void addHandDryer(HandDryer pHandDryer) {
    this.handDryers.add(pHandDryer);
  }

  /**
   * This function removes a hand dryer from the list of hand dryers
   * 
   * @param pHandDryer The HandDryer object to be removed from the list.
   */
  public void removeHandDryer(HandDryer pHandDryer) {
    this.handDryers.remove(pHandDryer);
  }
  //endregion

  //region BrownPaperDispensers methods
  public BrownPaperDispenserIterator getBrownPaperDispensers() {
    return new BrownPaperDispenserIterator(this.brownPaperDispensers);
  }

  public void addBrownPaperDispenser(BrownPaperDispenser pBrownPaperDispenser) {
    this.brownPaperDispensers.add(pBrownPaperDispenser);
  }

  public void removeBrownPaperDispenser(BrownPaperDispenser pBrownPaperDispenser) {
    this.brownPaperDispensers.remove(pBrownPaperDispenser);
  }
  //endregion
  
  // A constructor that takes a room number and creates a new washroom object.
  public Washroom(String pRoomNumber) {
    super(pRoomNumber);
    this.sinks = new ArrayList<>();
    this.toilets = new ArrayList<>();
    this.urinals = new ArrayList<>();
    this.handDryers = new ArrayList<>();
    this.brownPaperDispensers = new ArrayList<>();
  }
}
