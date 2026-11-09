package minecraft;

import java.util.function.Function;

public class class02245<S extends class08476, M extends class06078<S> & class06230> extends class06249<S, M> {
   private static final float N = 0.625F;
   private static final float y = 1.1875F;
   private final class02221 L;
   private final Function<class07030, class01097> u;
   private final class07949 i;

   public class02245(class06252<S, M> var1, class01140 var2, class07949 var3) {
      this(var1, var2, var3, class02221.N);
   }

   public class02245(class06252<S, M> var1, class01140 var2, class07949 var3, class02221 var4) {
      super(var1);
      this.L = var4;
      this.u = class07536.y_4(var1x -> class03359.N(var2, var1x));
      this.i = var3;
   }

   public static void N(class01421 var0, class02221 var1) {
      var0.N(0.0F, -0.25F + var1.N(), 0.0F);
      var0.N(class02058.u.N(180.0F));
      var0.y(0.625F, -0.625F, -0.625F);
   }

   private class07311 N(class08476 var1, class07030 var2) {
      if (var2 == class07032.field_11510) {
         class02689 class02689 = var1.Nb;
         if (class02689 != null) {
            return this.i.N(class02689).L();
         }
      }

      return class03359.N(var2, null);
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      if (!var4.NP.i() || var4.NT != null) {
         var1.N();
         var1.y(this.L.L(), 1.0F, this.L.L());
         class06078 class06078 = this.u();
         class06078.method_63512().N(var1);
         ((class06230)class06078).N(var1);
         if (var4.NT != null) {
            var1.N(0.0F, this.L.y(), 0.0F);
            var1.y(1.1875F, -1.1875F, -1.1875F);
            var1.N(-0.5, 0.0, -0.5);
            class07030 class07030 = var4.NT;
            class01097 class01097 = this.u.apply(class07030);
            class07311 class07311 = this.N(var4, class07030);
            class03359.N(null, 180.0F, var4.Ns, var1, var2, var3, class01097, class07311, var4.l, null);
         } else {
            N(var1, this.L);
            var4.NP.N(var1, var2, var3, class01384.u, var4.l);
         }

         var1.y();
      }
   }
}
