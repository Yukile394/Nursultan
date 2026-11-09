package minecraft;

import java.util.OptionalInt;

public final class class01168 extends class01191 {
   private final int N;
   private final int y;

   @Override
   public OptionalInt L() {
      return OptionalInt.of(this.N);
   }

   public int M() {
      return this.y - this.N - 1;
   }

   protected class01168(int var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
      if (this.M() < 0) {
         throw new IllegalArgumentException("Column of negative height: " + this);
      }
   }

   @Override
   public String toString() {
      return "C(" + this.y + "-" + this.N + ")";
   }

   public int i() {
      return this.y;
   }

   @Override
   public OptionalInt u() {
      return OptionalInt.of(this.M());
   }

   @Override
   public OptionalInt y() {
      return OptionalInt.of(this.y);
   }

   public int R() {
      return this.N;
   }
}
