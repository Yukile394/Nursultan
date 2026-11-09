package minecraft;

import com.mojang.serialization.MapCodec;

public class class05476 extends class00865 {
   public static final MapCodec<class05476> u = y(class05476::new);
   private static final float i = 0.05F;
   private static final float R = 0.1F;

   public class05476(class01362 var1) {
      super(var1, class04823.L);
   }

   @Override
   public boolean E(class00500 var1) {
      return false;
   }

   @Override
   protected boolean N(class04651 var1) {
      return true;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class04651 var4) {
      if (var4 == class04684.L) {
         class00500 class00500x = class00869.Mz.W();
         var2.method_8501(var3, class00500x);
         var2.N(class01194.L, var3, class01164.N(class00500x));
         var2.N(1047, var3, 0);
      } else if (var4 == class04684.i) {
         class00500 class00500 = class00869.MU.W();
         var2.method_8501(var3, class00500);
         var2.N(class01194.L, var3, class01164.N(class00500));
         var2.N(1046, var3, 0);
      }
   }

   @Override
   public MapCodec<class05476> N() {
      return u;
   }

   @Override
   public void N_4(class00500 var1, class07299 var2, class07209 var3, class00801 var4) {
      if (N(var2, var4)) {
         if (var4 == class00801.field_9382) {
            var2.method_8501(var3, class00869.Mz.W());
            var2.N(null, class01194.L, var3);
         } else if (var4 == class00801.field_9383) {
            var2.method_8501(var3, class00869.ME.W());
            var2.N(null, class01194.L, var3);
         }
      }
   }

   public static boolean N(class07299 var0, class00801 var1) {
      if (var1 == class00801.field_9382) {
         return var0.method_8409().z() < 0.05F;
      } else {
         return var1 == class00801.field_9383 ? var0.method_8409().z() < 0.1F : false;
      }
   }
}
