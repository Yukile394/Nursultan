package minecraft;

import com.mojang.serialization.MapCodec;

public class class07095 extends class00891 {
   public static final MapCodec<class07095> N = y(class07095::new);
   private static final int y = 20;

   public class07095(class01362 var1) {
      super(var1);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, 20);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11036 && var7.N(class00869.K)) {
         var3.N(var4, this, 20);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public MapCodec<class07095> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00884.y(var2, var3.method_10084(), var1);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (!var4.method_21749() && var4 instanceof class07438) {
         var4.method_64419(var1.method_48963().R(), 1.0F);
      }

      super.N(var1, var2, var3, var4);
   }
}
