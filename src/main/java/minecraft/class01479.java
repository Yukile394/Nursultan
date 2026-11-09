package minecraft;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class class01479 {
   public static final Codec<class01479> L = class04206.C.T().dispatch(class01479::N, class01448::N);
   protected final class02142 u;
   protected final class02142 i;

   public class01479(class02142 var1, class02142 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   public boolean y(class06069 var1, int var2, int var3, int var4, int var5, boolean var6) {
      int ix;
      int j;
      if (var6) {
         ix = Math.min(Math.abs(var2), Math.abs(var2 - 1));
         j = Math.min(Math.abs(var4), Math.abs(var4 - 1));
      } else {
         ix = Math.abs(var2);
         j = Math.abs(var4);
      }

      return this.N(var1, ix, var3, j, var5, var6);
   }

   protected static <P extends class01479> P2<Mu<P>, class02142, class02142> y(Instance<P> var0) {
      return var0.group(class02142.N(0, 16).fieldOf("radius").forGetter(var0x -> var0x.u), class02142.N(0, 16).fieldOf("offset").forGetter(var0x -> var0x.i));
   }

   protected static boolean N(class04887 var0, class01455 var1, class06069 var2, class01476 var3, class07209 var4) {
      if (!var0.method_16358(var4, var0x -> var0x.N(class06665.w, false)) && class03194.L(var0, var4)) {
         class00500 class00500 = var3.i.N(var2, var4);
         if (class00500.y(class06665.q)) {
            class00500 = class00500.y(class06665.q, var0.method_35237(var4, var0x -> var0x.N(class04684.L)));
         }

         var1.N(var4, class00500);
         return true;
      } else {
         return false;
      }
   }

   private static boolean N(class04887 var0, class01455 var1, class06069 var2, class01476 var3, float var4, class07209 var5, class07218 var6) {
      if (var6.method_19455(var5) >= 7) {
         return false;
      } else {
         return var2.z() > var4 ? false : N(var0, var1, var2, var3, var6);
      }
   }

   public void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, this.N(var3));
   }

   protected abstract class01448<?> N();

   protected abstract boolean N(class06069 var1, int var2, int var3, int var4, int var5, boolean var6);

   private int N(class06069 var1) {
      return this.i.N(var1);
   }

   public int N(class06069 var1, int var2) {
      return this.u.N(var1);
   }

   public abstract int N(class06069 var1, int var2, class01476 var3);

   protected abstract void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, int var5, class01467 var6, int var7, int var8, int var9);

   protected void N(class04887 var1, class01455 var2, class06069 var3, class01476 var4, class07209 var5, int var6, int var7, boolean var8) {
      int ix = var8 ? 1 : 0;
      class07218 class07218 = new class07218();

      for (int j = -var6; j <= var6 + ix; j++) {
         for (int k = -var6; k <= var6 + ix; k++) {
            if (!this.y(var3, j, var7, k, var6, var8)) {
               class07218.N(var5, j, var7, k);
               N(var1, var2, var3, var4, class07218);
            }
         }
      }
   }

   protected final void N(
      class04887 var1, class01455 var2, class06069 var3, class01476 var4, class07209 var5, int var6, int var7, boolean var8, float var9, float var10
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8);
      int ix = var8 ? 1 : 0;
      class07209 class07209 = var5.method_10074();
      class07218 class07218 = new class07218();

      for (class07211 class07211x : class07221.field_11062) {
         class07211 class07211x = class07211x.R();
         int j = class07211x.i() == class07212.field_11056 ? var6 + ix : var6;
         class07218.N(var5, 0, var7 - 1, 0).N(class07211x, j).N(class07211x, -var6);
         int k = -var6;

         while (k < var6 + ix) {
            boolean flag = var2.N(class07218.N(class07211.field_11036));
            class07218.N(class07211.field_11033);
            if (flag && N(var1, var2, var3, var4, var9, class07209, class07218)) {
               class07218.N(class07211.field_11033);
               N(var1, var2, var3, var4, var10, class07209, class07218);
               class07218.N(class07211.field_11036);
            }

            k++;
            class07218.N(class07211x);
         }
      }
   }
}
