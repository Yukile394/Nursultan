package minecraft;

public record class01937(String value, boolean negated) {
   private static final String L = "!";

   public class01937(String value, boolean negated) {
      if (value.isEmpty()) {
         throw new IllegalArgumentException("Empty term");
      } else {
         this.value = value;
         this.negated = negated;
      }
   }

   @Override
   public String toString() {
      return this.negated ? "!" + this.value : this.value;
   }

   public boolean y() {
      return this.negated;
   }

   public String N() {
      return this.value;
   }

   public static class01937 N(String var0) {
      return var0.startsWith("!") ? new class01937(var0.substring(1), true) : new class01937(var0, false);
   }
}
