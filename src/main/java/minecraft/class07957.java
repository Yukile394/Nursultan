package minecraft;

import org.jspecify.annotations.Nullable;

public class class07957 extends class07978 {
   public static final float Z = 0.001F;
   protected final float z;

   @Nullable
   @Override
   protected class06889 M() {
      if (this.y.method_5799()) {
         class06889 class06889 = class05456.N(this.y, 15, 7);
         return class06889 == null ? super.M() : class06889;
      } else {
         return this.y.method_59922().z() >= this.z ? class05456.N(this.y, 10, 7) : super.M();
      }
   }

   public class07957(class07475 var1, double var2, float var4) {
      super(var1, var2);
      this.z = var4;
   }

   public class07957(class07475 var1, double var2) {
      this(var1, var2, 0.001F);
   }
}
