package dev.gavinthomas.odyssey;

import java.util.function.Consumer;

public class Command {
  private boolean enabled = true;
  private final Consumer<Object[]> runner;

  private Command(Command.Builder bldr) {
    this.runner = bldr.runner;
  }

  public void enable(boolean tog) {

  }

  public final Getters get = new Getters();
  public final Setters set = new Setters();

  public final class Getters {
    public boolean enabled() {
      return Command.this.enabled;
    }
  }
  public final class Setters {
    public void enabled(boolean tog) {
      Command.this.enabled = tog;
    }
  }

  public static class Builder {
    private final String name, id;
    private final Consumer<Object[]> runner;

    private String description;

    public Builder(String name, String id, Consumer<Object[]> runner) {
      this.name = name;
      this.id = id;
      this.runner = runner;
    }

    public Builder desc(String str) {
      this.description = str;
      return this;
    }
  }
}
