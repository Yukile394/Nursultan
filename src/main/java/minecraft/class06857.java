package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06857 extends AbstractDoubleList {
   private final int N;
   private double y;

   public class06857(int var1) {
      super();
      if (var1 <= 0) {
         throw new IllegalArgumentException("Need at least 1 part");
      } else {
         this.N = var1;
         this.N(var1, null);
      }
   }

   public int size() {
      return this.N + 1;
   }

   public double getDouble(int var1) {
      return var1 * this.y;
   }

   public void N(int var1, CallbackInfo var2) {
      this.y = 1.0 / this.N;
   }
}
