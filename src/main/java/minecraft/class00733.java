package minecraft;

import com.mojang.serialization.MapCodec;

public class class00733 extends class00891 {
   public static final MapCodec<class00733> N = y(class00733::new);
   private static final class00494 y = class00891.y(16.0, 0.0, 15.0);

   public class00733(class01362 var1) {
      super(var1);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class07208.N(null, var1, var2, var3);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class00733> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      return !this.W().N((class05487)var1.method_8045(), var1.method_8037())
         ? class00891.N_19(this.W(), class00869.z.W(), var1.method_8045(), var1.method_8037())
         : super.N(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11036 && !var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10084());
      return !class00500.B() || class00500.i() instanceof class07188;
   }
}
