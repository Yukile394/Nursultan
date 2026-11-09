package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public class class07746 extends class00891 implements class06084 {
   public static final MapCodec<class07746> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00500.N.fieldOf("base_state").forGetter(var0x -> var0x.R), t()).apply(var0, class07746::new)
   );
   public static final class08064<class07211> y = class07101.R;
   public static final class08064<class08052> L = class06665.NZ;
   public static final class08064<class08061> u = class06665.ym;
   public static final class06667 i = class06665.q;
   private static final class00494 M = class00389.N(class00891.y(16.0, 0.0, 8.0), class00891.N(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final class00494 B = class00389.N(M, class00389.N(M, class01372.field_64511));
   private static final class00494 Z = class00389.N(B, class00389.N(B, class01372.field_64511));
   private static final Map<class07211, class00494> O = class00389.L(M);
   private static final Map<class07211, class00494> F = class00389.L(B);
   private static final Map<class07211, class00494> A = class00389.L(Z);
   private static final Map<class07211, class00494> f = class00389.y(M, class01372.field_23266);
   private static final Map<class07211, class00494> C = class00389.y(B, class01372.field_23266);
   private static final Map<class07211, class00494> S = class00389.y(Z, class01372.field_23266);
   private final class00891 x;
   protected final class00500 R;

   private static boolean L(class00500 var0, class07290 var1, class07209 var2, class07211 var3) {
      class00500 class00500 = var1.method_8320(var2.method_10093(var3));
      return !U(class00500) || class00500.L(y) != var0.L(y) || class00500.L(L) != var0.L(L);
   }

   public class07746(class00500 var1, class01362 var2) {
      super(var2);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, class08052.field_12617).y(u, class08061.field_12710).y(i, false));
      this.x = var1.i();
      this.R = var1;
   }

   public static class08061 i(class00500 var0, class07290 var1, class07209 var2) {
      class07211 class07211xx = var0.L(y);
      class00500 class00500x = var1.method_8320(var2.method_10093(class07211xx));
      if (U(class00500x) && var0.L(L) == class00500x.L(L)) {
         class07211 class07211x = class00500x.L(y);
         if (class07211x.z() != var0.L(y).z() && L(var0, var1, var2, class07211x.b())) {
            if (class07211x == class07211xx.M()) {
               return class08061.field_12708;
            }

            return class08061.field_12709;
         }
      }

      class00500 class00500x = var1.method_8320(var2.method_10093(class07211xx.b()));
      if (U(class00500x) && var0.L(L) == class00500x.L(L)) {
         class07211 class07211x = class00500x.L(y);
         if (class07211x.z() != var0.L(y).z() && L(var0, var1, var2, class07211x)) {
            if (class07211x == class07211xx.M()) {
               return class08061.field_12712;
            }

            return class08061.field_12713;
         }
      }

      return class08061.field_12710;
   }

   public static boolean U(class00500 var0) {
      return var0.i() instanceof class07746;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      class07211 class07211 = var1.L(y);
      class08061 class08061 = var1.L(u);
      switch (var2) {
         case field_11300:
            if (class07211.z() == class07185.field_11051) {
               switch (class08061) {
                  case field_12708:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12709);
                  case field_12713:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12712);
                  case field_12712:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12713);
                  case field_12709:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12708);
                  default:
                     return var1.N(class06993.field_11464);
               }
            }
            break;
         case field_11301:
            if (class07211.z() == class07185.field_11048) {
               switch (class08061) {
                  case field_12710:
                     return var1.N(class06993.field_11464);
                  case field_12708:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12709);
                  case field_12713:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12713);
                  case field_12712:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12712);
                  case field_12709:
                     return var1.N(class06993.field_11464).y(u, class08061.field_12708);
               }
            }
      }

      return super.N(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i);
   }

   @Override
   public MapCodec<? extends class07746> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5.z().L() ? var1.y(u, i(var1, var2, var4)) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211 = var1.method_8038();
      class07209 class07209 = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(class07209);
      class00500 class00500 = this.W()
         .y(y, var1.method_8042())
         .y(
            L,
            class07211 != class07211.field_11033 && (class07211 == class07211.field_11036 || !(var1.method_17698().B - class07209.method_10264() > 0.5))
               ? class08052.field_12617
               : class08052.field_12619
         )
         .y(i, class04688.N() == class04684.L);
      return class00500.y(u, i(class00500, var1.method_8045(), class07209));
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      boolean flag = var1.L(L) == class08052.field_12617;
      class07211 class07211 = var1.L(y);

      Map map = switch ((class08061)var1.L(u)) {
         case field_12710 -> flag ? F : C;
         case field_12708, field_12709 -> flag ? O : f;
         case field_12713, field_12712 -> flag ? A : S;
      };

      return (class00494)map.get(switch ((class08061)var1.L(u)) {
         case field_12710, field_12708, field_12713 -> class07211;
         case field_12712 -> class07211.M();
         case field_12709 -> class07211.R();
      });
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public float R() {
      return this.x.R();
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
