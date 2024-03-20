package com.geekcap.vmturbo;
import java.io.Serializable;

public class Thing implements Serializable{
  private int n = 0;

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }
}
