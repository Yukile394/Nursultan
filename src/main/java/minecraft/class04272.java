package minecraft;

public record class04272(int numberOfTries, boolean haltOnFailure) {
   private static final class04272 L = new class04272(1, true);

   public boolean L() {
      return this.numberOfTries != 1;
   }

   public class04272(int numberOfTries, boolean haltOnFailure) {
      super();
      this.numberOfTries = numberOfTries;
      this.haltOnFailure = haltOnFailure;
   }

   public boolean i() {
      return this.haltOnFailure;
   }

   public int u() {
      return this.numberOfTries;
   }

   public boolean y() {
      return this.numberOfTries < 1;
   }

   public boolean N(int var1, int var2) {
      boolean flag = var1 != var2;
      return (this.y() || var1 < this.numberOfTries) && (!flag || !this.haltOnFailure);
   }

   public static class04272 N() {
      return L;
   }
}
