package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class06133 extends class07796 {
   public static final MapCodec<class06133> N = y(class06133::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class08064<class05648> L = class06665.h;
   public static final class06667 u = class06665.k;
   private static final class00494 R = class00389.N(class00891.y(6.0, 6.0, 13.0), class00891.y(8.0, 4.0, 6.0));
   private static final class00494 M = class00389.N(R, class00891.y(2.0, 13.0, 16.0));
   private static final Map<class07185, class00494> B = class00389.N(class00891.N(16.0, 16.0, 8.0));
   private static final Map<class07185, class00494> Z = class00389.N(class00389.N(R, class00891.N(2.0, 16.0, 13.0, 15.0)));
   private static final Map<class07211, class00494> O = class00389.L(class00389.N(R, class00891.N(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int i = 1;

   private static class07211 T(class00500 var0) {
      switch ((class05648)var0.L(L)) {
         case field_17098:
            return class07211.field_11036;
         case field_17099:
            return class07211.field_11033;
         default:
            return var0.L(y).b();
      }
   }

   public class06133(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, class05648.field_17098).y(u, false));
   }

   private class00494 U(class00500 var1) {
      class07211 class07211 = var1.L(y);

      return switch ((class05648)var1.L(L)) {
         case field_17098 -> (class00494)B.get(class07211.z());
         case field_17100 -> (class00494)O.get(class07211);
         case field_17101 -> (class00494)Z.get(class07211.z());
         case field_17099 -> M;
      };
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.U(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class05648 class05648 = var1.L(L);
      class07211 class07211 = T(var1).b();
      if (class07211 == var5 && !var1.N(var2, var4) && class05648 != class05648.field_17101) {
         return class00869.N.W();
      } else {
         if (var5.z() == var1.L(y).z()) {
            if (class05648 == class05648.field_17101 && !var7.L(var2, var6, var5)) {
               return var1.y(L, class05648.field_17100).y(y, var5.b());
            }

            if (class05648 == class05648.field_17100 && class07211.b() == var5 && var7.L(var2, var6, var1.L(y))) {
               return var1.y(L, class05648.field_17101);
            }
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M()) {
         this.N(var2, var3, null);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   public MapCodec<class06133> N() {
      return N;
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_16413, var1.method_8608() ? class06112::N : class06112::y);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class06112(var1, var2);
   }

   private boolean N(class00500 var1, class07211 var2, double var3) {
      if (var2.z() != class07185.field_11052 && !(var3 > 0.8124F)) {
         class07211 class07211 = var1.L(y);
         class05648 class05648 = var1.L(L);
         switch (class05648) {
            case field_17098:
               return class07211.z() == var2.z();
            case field_17100:
            case field_17101:
               return class07211.z() != var2.z();
            case field_17099:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean N(class07299 var1, class00500 var2, class06183 var3, @Nullable class08036 var4, boolean var5) {
      class07211 class07211 = var3.i();
      class07209 class07209 = var3.u();
      if (!var5 || this.N(var2, class07211, var3.y().B - class07209.method_10264())) {
         if (this.N(var4, var1, class07209, class07211) && var4 != null) {
            var4.method_7281(class01235.NY);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      return (class07082)(this.N(var2, var1, var5, var4, true) ? class07082.N : class07082.i);
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      class07049 class07049 = var4.z();
      class08036 class08036 = class07049 instanceof class08036 ? (class08036)class07049 : null;
      this.N(var1, var2, var3, class08036, true);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      boolean flag = var2.W(var3);
      if (flag != var1.L(u)) {
         if (flag) {
            this.N(var2, var3, null);
         }

         var2.method_8652(var3, var1.y(u, flag), 3);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211 = var1.method_8038();
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      class07185 class07185 = class07211.z();
      if (class07185 == class07185.field_11052) {
         class00500 class00500x = this.W()
            .y(L, class07211 == class07211.field_11033 ? class05648.field_17099 : class05648.field_17098)
            .y(y, var1.method_8042());
         if (class00500x.N((class05487)var1.method_8045(), class07209)) {
            return class00500x;
         }
      } else {
         boolean flag = class07185 == class07185.field_11048
               && class07299.method_8320(class07209.method_10067()).L(class07299, class07209.method_10067(), class07211.field_11034)
               && class07299.method_8320(class07209.method_10078()).L(class07299, class07209.method_10078(), class07211.field_11039)
            || class07185 == class07185.field_11051
               && class07299.method_8320(class07209.method_10095()).L(class07299, class07209.method_10095(), class07211.field_11035)
               && class07299.method_8320(class07209.method_10072()).L(class07299, class07209.method_10072(), class07211.field_11043);
         class00500 class00500 = this.W().y(y, class07211.b()).y(L, flag ? class05648.field_17101 : class05648.field_17100);
         if (class00500.N((class05487)var1.method_8045(), var1.method_8037())) {
            return class00500;
         }

         boolean flag1 = class07299.method_8320(class07209.method_10074()).L(class07299, class07209.method_10074(), class07211.field_11036);
         class00500 = class00500.y(L, flag1 ? class05648.field_17098 : class05648.field_17099);
         if (class00500.N((class05487)var1.method_8045(), var1.method_8037())) {
            return class00500;
         }
      }

      return null;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.U(var1);
   }

   public boolean N(@Nullable class07049 var1, class07299 var2, class07209 var3, @Nullable class07211 var4) {
      class00394 class00394 = var2.method_8321(var3);
      if (!var2.method_8608() && class00394 instanceof class06112) {
         if (var4 == null) {
            var4 = var2.method_8320(var3).L(y);
         }

         ((class06112)class00394).N(var4);
         var2.method_8396(null, var3, class04909.LE, class04911.field_15245, 2.0F, 1.0F);
         var2.N(var1, class01194.L, var3);
         return true;
      } else {
         return false;
      }
   }

   public boolean N(class07299 var1, class07209 var2, @Nullable class07211 var3) {
      return this.N(null, var1, var2, var3);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = T(var1).b();
      return class07211 == class07211.field_11036 ? class00891.N_6(var2, var3.method_10084(), class07211.field_11033) : class07193.y(var2, var3, class07211);
   }
}
