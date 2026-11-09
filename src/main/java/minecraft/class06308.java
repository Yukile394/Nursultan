package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class class06308 extends class06466 {
   protected static final int field_43050 = 2;
   private static final class01883 field_45339 = new class01883(
      class01894.y("widget/button"), class01894.y("widget/button_disabled"), class01894.y("widget/button_highlighted")
   );
   @Nullable
   private Supplier<Boolean> field_64534;

   public class06308(int var1, int var2, int var3, int var4, class00392 var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (!this.method_37303()) {
         return false;
      } else if (var1.L()) {
         this.method_25354(class06202.Nq().Nr());
         this.method_25306(var1);
         return true;
      } else {
         return false;
      }
   }

   public abstract void method_25306(class06611 var1);

   public void method_76613(Supplier<Boolean> var1) {
      this.field_64534 = var1;
   }

   protected abstract void method_75752(class01054 var1, int var2, int var3, float var4);

   public void method_75793(class00580 var1) {
      this.method_75799(var1, this.method_25369(), 2);
   }

   protected final void method_75794(class01054 var1) {
      var1.N(
         class08394.Na,
         field_45339.N(this.field_22763, this.field_64534 != null ? this.field_64534.get() : this.method_25367()),
         this.method_46426(),
         this.method_46427(),
         this.method_25368(),
         this.method_25364(),
         class02566.y(this.field_22765)
      );
   }

   @Override
   public void method_25348(class06613 var1, boolean var2) {
      this.method_25306(var1);
   }

   @Override
   protected final void method_48579(class01054 var1, int var2, int var3, float var4) {
      this.method_75752(var1, var2, var3, var4);
      this.method_76256(var1);
   }
}
