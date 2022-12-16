package dev.gavinthomas.odyssey.ui;

public enum Dock {
  LT("LEFT_TOP"),
  LB("LEFT_BOTTOM"),
  RT("RIGHT_TOP"),
  RB("RIGHT_BOTTOM"),
  BL("BOTTOM_LEFT"),
  BR("BOTTOM_RIGHT"),
  TL("TOP_LEFT"),
  TR("TOP_RIGHT");

  public final String fullName;

  Dock(String fullName) {
    this.fullName = fullName;
  }



  public static Dock get(String name) {
    for (Dock d : Dock.values()) {
      if (d.fullName.equals(name)) {
        return d;
      }
    }
    return null;
  }
}
