package dev.gavinthomas.odyssey.ui.util;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GBC extends GridBagConstraints {
  public GBC() {

  }

  public GBC(int x, int y) {
    this.gridxy(x, y);
  }

  public GBC(int x, int y, int w, int h) {
    this.gridxy(x, y).gridwh(w, h);
  }

  public GBC weight(double x, double y) {
    super.weightx = x;
    super.weighty = y;
    return this;
  }

  public GBC gridxy(int x, int y) {
    super.gridx = x;
    super.gridy = y;
    return this;
  }

  public GBC gridwh(int w, int h) {
    super.gridwidth = w;
    super.gridheight = h;
    return this;
  }

  public GBC ipad(int x, int y) {
    super.ipadx = x;
    super.ipady = y;
    return this;
  }

  public GBC anchor(int val) {
    super.anchor = val;
    return this;
  }

  public GBC fill(int val) {
    super.fill = val;
    return this;
  }

  public GBC insets(Insets inset) {
    super.insets = inset;
    return this;
  }

  public GBC insets(int top, int left, int bottom, int right) {
    super.insets = new Insets(top, left, bottom, right);
    return this;
  }
}
