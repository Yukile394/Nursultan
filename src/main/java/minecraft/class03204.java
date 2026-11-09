package minecraft;

import java.util.Map;

public record class03204(Map<String, Double> allocationsPerSecondByThread) {
   public class03204(Map<String, Double> allocationsPerSecondByThread) {
      super();
      this.allocationsPerSecondByThread = allocationsPerSecondByThread;
   }

   public Map<String, Double> N() {
      return this.allocationsPerSecondByThread;
   }
}
