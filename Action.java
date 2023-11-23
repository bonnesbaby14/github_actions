import java.util.Random;

class Action {
  public static void main(String... args) {
    System.out.printf("Hello %s.%n", args.length == 0 ? "Java" : args[0]);
    var gaussian = new Random().nextGaussian();
    GitHub.setOutput("random-number", gaussian);
    System.out.println("Goodbye and have fun with: " + gaussian);
  }

  /** GitHub Actions helper. */
  static class GitHub {
    /** Sets an action's output parameter. */
    static void setOutput(String name, Object value) {
      //...
    }
  }
}