package minecraft;

import com.mojang.serialization.MapCodec;

public class class07770 extends class00891 implements class00873 {
   public static final MapCodec<class07770> N = y(class07770::new);
   private static final class00494 y = class00891.y(8.0, 0.0, 12.0);

   public class07770(class01362 var1) {
      super(var1);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var4.y(3) == 0 && var2.R(var3.method_10084()) && var2.method_22335(var3.method_10084(), 0) >= 9) {
         this.N(var2, var3);
      }
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10084()).P();
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.N(var1, var3);
   }

   protected void N(class07299 var1, class07209 var2) {
      var1.method_8652(var2.method_10084(), class00869.mx.W().y(class07784.L, class06662.field_12466), 3);
   }

   @Override
   public MapCodec<class07770> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y.method_64034(var1.N(var3));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         return var5 == class07211.field_11036 && var7.N(class00869.mx) ? class00869.mx.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class06570.iz);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).N(class01210.NV);
   }
}
