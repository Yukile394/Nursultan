package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class07017 extends class00494 {
   private static final class07185[] N = class07185.values();
   private DoubleList[] y;

   @Override
   public DoubleList method_1109(class07185 var1) {
      return this.y[var1.ordinal()];
   }

   public class07017(class07739 var1) {
      super(var1);
      this.N(var1, null);
   }

   private void N(class07739 var1, CallbackInfo var2) {
      this.y = new DoubleList[N.length];
      int i = N.length;

      for (int j = 0; j < i; j++) {
         class07185 class07185 = N[j];
         this.y[class07185.ordinal()] = new class06857(var1.method_1051(class07185));
      }
   }

   @Override
   public int method_1100(class07185 var1, double var2) {
      int i = this.field_1401.method_1051(var1);
      return class04995.N(class04995.N(var2 * i, -1.0, (double)i));
   }
}
