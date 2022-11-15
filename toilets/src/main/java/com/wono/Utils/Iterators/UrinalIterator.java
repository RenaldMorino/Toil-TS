package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Urinal;

public class UrinalIterator implements Iterator {
  private ArrayList<Urinal> urinals;
  private int position = 0;

  public UrinalIterator(ArrayList<Urinal> pUrinal) {
    this.urinals = pUrinal;
  }

  @Override
  public boolean hasNext() {
    return !(position >= urinals.size() || urinals.get(position) == null);
  }

  @Override
  public Object next() {
    return urinals.get(position++);
  }
}
