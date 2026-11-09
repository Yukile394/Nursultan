package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class class08968 extends class07796 implements class06084, class08960, class08990 {
   public static final MapCodec<class08968> N = y(class08968::new);
   public static final class06667 y = class06665.k;
   public static final class08064<class07211> L = class06665.f;
   public static final class08064<class08972> u = class06665.Nz;
   public static final class06667 i = class06665.q;
   private static final Map<class07211, class00494> R = class00389.L(
      class00389.N(
         class00891.N(0.0, 12.0, 11.0, 16.0, 16.0, 13.0), class00891.N(0.0, 0.0, 13.0, 16.0, 16.0, 16.0), class00891.N(0.0, 0.0, 11.0, 16.0, 4.0, 13.0)
      )
   );

   @Override
   public int L() {
      return 3;
   }

   @Override
   public class07211 M(class00500 var1) {
      return var1.L(L);
   }

   public class08968(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, class07211.field_11043).y(y, false).y(u, class08972.field_61446).y(i, false));
   }

   @Override
   public boolean B(class00500 var1) {
      return var1.N(class01210.m) && var1.y(y) && var1.L(y);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public int u() {
      return 3;
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public class00500 N(class00500 var1, class08972 var2) {
      return var1.y(u, var2);
   }

   private boolean N(class07299 var1, class07209 var2, class08044 var3) {
      List<class07209> list = this.N(var1, var2);
      if (list.isEmpty()) {
         return false;
      } else {
         boolean flag = false;

         for (int ix = 0; ix < list.size(); ix++) {
            class08951 class08951 = (class08951)var1.method_8321(list.get(ix));
            if (class08951 != null) {
               for (int j = 0; j < class08951.method_5439(); j++) {
                  int k = 9 - (list.size() - ix) * class08951.method_5439() + j;
                  if (k >= 0 && k <= var3.method_5439()) {
                     class06584 class06584x = var3.method_5441(k);
                     class06584 class06584x = class08951.y(j, class06584x);
                     if (!class06584x.R() || !class06584x.R()) {
                        var3.method_5447(k, class06584x);
                        flag = true;
                     }
                  }
               }

               var3.method_5431();
               class08951.N(class01194.b);
            }
         }

         return flag;
      }
   }

   private boolean N(class06584 var1) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_11) && var1.R();
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      if (var2.method_8608()) {
         return 0;
      } else if (var4 != var1.L(L).b()) {
         return 0;
      } else if (var2.method_8321(var3) instanceof class08951 class08951) {
         int k = class08951.method_5438(0).R() ? 0 : 1;
         int ix = class08951.method_5438(1).R() ? 0 : 1;
         int j = class08951.method_5438(2).R() ? 0 : 1;
         return k | ix << 1 | j << 2;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private void N(class07284 var1, class07209 var2, class04891 var3) {
      var1.method_8396(null, var2, var3, class04911.field_15245, 1.0F, 1.0F);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (var1.L(y)) {
         this.N(var2, var3, var1, var4);
      } else {
         this.a_(var2, var3, var1);
      }
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class08951(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, y, u, i);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
      this.a_(var2, var3, var1);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         boolean flag = var2.W(var3);
         if (var1.L(y) != flag) {
            class00500 class00500 = var1.y(y, flag);
            if (!flag) {
               class00500 = class00500.y(u, class08972.field_61446);
            }

            var2.method_8652(var3, class00500, 3);
            this.N(var2, var3, flag ? class04909.ww : class04909.wY);
            var2.N(flag ? class01194.N : class01194.i, var3, class01164.N(class00500));
         }
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return var2 == class08791.field_48 && var1.Y().N(class01231.N);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R.get(var1.L(L));
   }

   @Override
   public MapCodec<class08968> N() {
      return N;
   }

   private static boolean N(class06584 var0, class08036 var1, class08951 var2, int var3, class08044 var4) {
      class06584 class06584x = var2.y(var3, var0);
      class06584 class06584x = var1.method_56992() && class06584x.R() ? var0.t() : class06584x;
      var4.method_5447(var4.N(), class06584x);
      var4.method_5431();
      var2.N(class06584x.L(class02484.M) && !class06584x.method_58694(class02484.M).y() ? null : class01194.Q);
      return !class06584x.R();
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var3.method_8321(var4) instanceof class08951 class08951 && !var6.equals(class07050.field_5810)) {
         OptionalInt optionalint = this.N(var7, var2.L(L));
         if (optionalint.isEmpty()) {
            return class07082.i;
         } else {
            class08044 class08044 = var5.method_31548();
            if (var3.method_8608()) {
               class06584 class06584 = class08044.y();
               return (class07082)(this.N(class06584) ? class07082.i : class07082.N);
            } else if (!var2.L(y)) {
               boolean flag = N(var1, var5, class08951, optionalint.getAsInt(), class08044);
               if (flag) {
                  this.N(var3, var4, var1.R() ? class04909.wK : class04909.wo);
               } else {
                  if (var1.R()) {
                     return class07082.i;
                  }

                  this.N(var3, var4, class04909.wJ);
               }

               return class07082.N.N(var1);
            } else {
               class06584 class06584x = class08044.y();
               if (!this.N(var3, var4, class08044)) {
                  return class07082.L;
               } else {
                  this.N(var3, var4, class04909.wg);
                  return class06584x == class08044.y() ? class07082.N : class07082.N.N(class08044.y());
               }
            }
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(L, var1.method_8042().b()).y(y, var1.method_8045().W(var1.method_8037())).y(i, class04688.N() == class04684.L);
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   public class08972 R(class00500 var1) {
      return var1.L(u);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
