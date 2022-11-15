package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Toilet;

public class ToiletIterator implements Iterator {
  private ArrayList<Toilet> toilets;
  private int position = 0;

  public ToiletIterator(ArrayList<Toilet> pToilet) {
    this.toilets = pToilet;
  }

  @Override
  public boolean hasNext() {
    return !(position >= toilets.size() || toilets.get(position) == null);
  }

  @Override
  public Object next() {
    return toilets.get(position++);
  }
}
