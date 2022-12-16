package dev.gavinthomas.odyssey.ui.util;

import java.awt.Dimension;

public class DimPercent extends Dimension {
  public DimPercent(Dimension dim, double xper, double yper) {
    this(dim.getWidth(), dim.getHeight(), xper, yper);
  }

  public DimPercent(double x, double y, double xper, double yper) {
    super((int) Math.round(x * (xper / 100)), (int) Math.round(y * (xper / 100)));
  }
}
