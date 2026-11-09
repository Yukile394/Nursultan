package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class05284 extends class06391<class05302> {
   private static final ImmutableList<class00891> NE = ImmutableList.of(
      class00869.V, class00869.q, class00869.EI, class00869.iw, class00869.ML, class00869.Mu, class00869.Mi, class00869.MR, class00869.LA, class00869.La
   );
   private static final int NW = 5;
   private static final int Nm = 50;
   private static final int NP = 8;
   private static final int Ns = 15;

   public class05284(Codec<class05302> var1) {
      super(var1);
   }

   private static boolean N(class07284 var0, int var1, class07218 var2) {
      if (!N(var0, var1, (class07209)var2)) {
         return false;
      } else {
         class00500 class00500 = var0.method_8320(var2.N(class07211.field_11033));
         var2.N(class07211.field_11036);
         return !class00500.P() && !NE.contains(class00500.i());
      }
   }

   private static boolean N(class07284 var0, int var1, class07209 var2) {
      class00500 class00500 = var0.method_8320(var2);
      return class00500.P() || class00500.N(class00869.V) && var2.method_10264() <= var1;
   }

   @Nullable
   private static class07209 N(class07284 var0, class07218 var1, int var2) {
      while (var1.method_10264() <= var0.method_31600() && var2 > 0) {
         var2--;
         class00500 class00500 = var0.method_8320(var1);
         if (NE.contains(class00500.i())) {
            return null;
         }

         if (class00500.P()) {
            return var1;
         }

         var1.N(class07211.field_11036);
      }

      return null;
   }

   @Override
   public boolean N(class06058<class05302> var1) {
      int i = var1.L().R();
      class07209 class07209x = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class05302 class05302 = (class05302)var1.R();
      if (!N(class05974, i, class07209x.method_25503())) {
         return false;
      } else {
         int j = class05302.y().N(class06069);
         boolean flag = class06069.z() < 0.9F;
         int k = Math.min(j, flag ? 5 : 8);
         int l = flag ? 50 : 15;
         boolean flag1 = false;

         for (class07209 class07209x : class07209.method_27156(
            class06069,
            l,
            class07209x.method_10263() - k,
            class07209x.method_10264(),
            class07209x.method_10260() - k,
            class07209x.method_10263() + k,
            class07209x.method_10264(),
            class07209x.method_10260() + k
         )) {
            int i1 = j - class07209x.method_19455(class07209x);
            if (i1 >= 0) {
               flag1 |= this.N(class05974, i, class07209x, i1, class05302.N().N(class06069));
            }
         }

         return flag1;
      }
   }

   @Nullable
   private static class07209 N(class07284 var0, int var1, class07218 var2, int var3) {
      while (var2.method_10264() > var0.method_31607() + 1 && var3 > 0) {
         var3--;
         if (N(var0, var1, var2)) {
            return var2;
         }

         var2.N(class07211.field_11033);
      }

      return null;
   }

   private boolean N(class07284 var1, int var2, class07209 var3, int var4, int var5) {
      boolean flag = false;

      for (class07209 class07209x : class07209.method_10094(
         var3.method_10263() - var5,
         var3.method_10264(),
         var3.method_10260() - var5,
         var3.method_10263() + var5,
         var3.method_10264(),
         var3.method_10260() + var5
      )) {
         int i = class07209x.method_19455(var3);
         class07209 class07209x = N(var1, var2, class07209x) ? N(var1, var2, class07209x.method_25503(), i) : N(var1, class07209x.method_25503(), i);
         if (class07209x != null) {
            int j = var4 - i / 2;

            for (class07218 class07218 = class07209x.method_25503(); j >= 0; j--) {
               if (N(var1, var2, (class07209)class07218)) {
                  this.N(var1, class07218, class00869.iY.W());
                  class07218.N(class07211.field_11036);
                  flag = true;
               } else {
                  if (!var1.method_8320(class07218).N(class00869.iY)) {
                     break;
                  }

                  class07218.N(class07211.field_11036);
               }
            }
         }
      }

      return flag;
   }
}
