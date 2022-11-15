package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Sink;

public class SinkIterator implements Iterator {
  private ArrayList<Sink> sinks;
  private int position = 0;

  public SinkIterator(ArrayList<Sink> pSinks) {
    this.sinks = pSinks;
  }

  @Override
  public boolean hasNext() {
    return !(position >= sinks.size() || sinks.get(position) == null);
  }

  @Override
  public Object next() {
    return sinks.get(position++);
  }
}
