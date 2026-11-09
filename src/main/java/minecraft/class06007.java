package minecraft;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class class06007 {
   private final LongSupplier N;
   private final IntSupplier y;
   private final BooleanSupplier L;
   private class04657 u = class04687.N;

   public void L() {
      this.u = new class05011(this.N, this.y, this.L);
   }

   public class06007(LongSupplier var1, IntSupplier var2, BooleanSupplier var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class04681 i() {
      return this.u.u();
   }

   public class04643 u() {
      return this.u;
   }

   public void y() {
      this.u = class04687.N;
   }

   public boolean N() {
      return this.u != class04687.N;
   }
}
