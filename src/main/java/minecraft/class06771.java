package minecraft;

import com.mojang.serialization.MapCodec;

public class class06771 extends class06901 {
   public static final MapCodec<class06771> N = y(class06771::new);

   public class06771(class01362 var1) {
      super(10.0F, var1);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false).y(M, false));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i, R, M);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class06771> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      return N(var1.method_8045(), var1.method_8037(), this.W());
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         var3.N(var4, this, 1);
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         boolean flag = var7.N(this) || var7.N(class00869.Eb) || var5 == class07211.field_11033 && var7.N(class00869.MP);
         return var1.y(B.get(var5), flag);
      }
   }

   public static class00500 N(class07290 var0, class07209 var1, class00500 var2) {
      class00500 class00500xxxxx = var0.method_8320(var1.method_10074());
      class00500 class00500x = var0.method_8320(var1.method_10084());
      class00500 class00500xx = var0.method_8320(var1.method_10095());
      class00500 class00500xxx = var0.method_8320(var1.method_10078());
      class00500 class00500xxxx = var0.method_8320(var1.method_10072());
      class00500 class00500xxxxx = var0.method_8320(var1.method_10067());
      class00891 class00891 = var2.i();
      return var2.L(M, class00500xxxxx.N(class00891) || class00500xxxxx.N(class00869.Eb) || class00500xxxxx.N(class00869.MP))
         .L(R, class00500x.N(class00891) || class00500x.N(class00869.Eb))
         .L(y, class00500xx.N(class00891) || class00500xx.N(class00869.Eb))
         .L(L, class00500xxx.N(class00891) || class00500xxx.N(class00869.Eb))
         .L(u, class00500xxxx.N(class00891) || class00500xxxx.N(class00869.Eb))
         .L(i, class00500xxxxx.N(class00891) || class00500xxxxx.N(class00869.Eb));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500x = var2.method_8320(var3.method_10074());
      boolean flag = !var2.method_8320(var3.method_10084()).P() && !class00500x.P();

      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209 = var3.method_10093(class07211);
         if (var2.method_8320(class07209).N(this)) {
            if (flag) {
               return false;
            }

            class00500 class00500x = var2.method_8320(class07209.method_10074());
            if (class00500x.N(this) || class00500x.N(class00869.MP)) {
               return true;
            }
         }
      }

      return class00500x.N(this) || class00500x.N(class00869.MP);
   }
}
