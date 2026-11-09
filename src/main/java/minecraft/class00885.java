package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class00885 extends class07101 {
   public static final MapCodec<class00885> N = y(class00885::new);
   public static final class08064<class07211> y = class07101.R;
   @Nullable
   private class06649 L;
   @Nullable
   private class06649 u;
   @Nullable
   private class06649 i;
   @Nullable
   private class06649 M;
   @Nullable
   private class06649 B;
   @Nullable
   private class06649 Z;
   private static final Predicate<class00500> O = var0 -> var0.N(class00869.iK) || var0.N(class00869.iV);

   public void L(class07299 var1, class06653 var2) {
      class06646 class06646 = var2.N(0, 1, 0);
      class07211 class07211 = var2.N(0, 0, 0).N().L(y);
      class00500 class00500 = class08950.N(class06646.N().i(), class07211, var1, class06646.u());
      var1.method_8652(class06646.u(), class00500, 2);
   }

   private class06649 L() {
      if (this.u == null) {
         this.u = class06684.N().N("^", "#", "#").N('^', class06646.N(O)).N('#', class06646.N(class06670.N(class00869.ib))).y();
      }

      return this.u;
   }

   private class06649 T() {
      if (this.B == null) {
         this.B = class06684.N().N(" ", "#").N('#', class06646.N(var0 -> var0.N(class01210.NU))).y();
      }

      return this.B;
   }

   public class00885(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043));
   }

   private class06649 i() {
      if (this.M == null) {
         this.M = class06684.N()
            .N("~^~", "###", "~#~")
            .N('^', class06646.N(O))
            .N('#', class06646.N(class06670.N(class00869.Lj)))
            .N('~', class06646.N(class01339::P))
            .y();
      }

      return this.M;
   }

   private class06649 b() {
      if (this.Z == null) {
         this.Z = class06684.N().N("^", "#").N('^', class06646.N(O)).N('#', class06646.N(var0 -> var0.N(class01210.NU))).y();
      }

      return this.Z;
   }

   private class06649 u() {
      if (this.i == null) {
         this.i = class06684.N().N("~ ~", "###", "~#~").N('#', class06646.N(class06670.N(class00869.Lj))).N('~', class06646.N(class01339::P)).y();
      }

      return this.i;
   }

   public static void y(class07299 var0, class06653 var1) {
      for (int ix = 0; ix < var1.u(); ix++) {
         for (int j = 0; j < var1.i(); j++) {
            class06646 class06646 = var1.N(ix, j, 0);
            var0.method_8408(class06646.u(), class00869.N);
         }
      }
   }

   private class06649 y() {
      if (this.L == null) {
         this.L = class06684.N().N(" ", "#", "#").N('#', class06646.N(class06670.N(class00869.ib))).y();
      }

      return this.L;
   }

   public boolean N(class05487 var1, class07209 var2) {
      return this.y().N(var1, var2) != null || this.u().N(var1, var2) != null || this.T().N(var1, var2) != null;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         this.N(var2, var3);
      }
   }

   @Override
   public MapCodec<? extends class00885> N() {
      return N;
   }

   private static void N(class07299 var0, class06653 var1, class07049 var2, class07209 var3) {
      N(var0, var1);
      var2.method_5808(var3.method_10263() + 0.5, var3.method_10264() + 0.05, var3.method_10260() + 0.5, 0.0F, 0.0F);
      var0.method_8649(var2);

      for (class04770 class04770 : var0.N(class04770.class, var2.method_5829().M(5.0))) {
         class06912.P.N(class04770, var2);
      }

      y(var0, var1);
   }

   public static void N(class07299 var0, class06653 var1) {
      for (int ix = 0; ix < var1.u(); ix++) {
         for (int j = 0; j < var1.i(); j++) {
            class06646 class06646 = var1.N(ix, j, 0);
            var0.method_8652(class06646.u(), class00869.N.W(), 2);
            var0.N(2001, class06646.u(), class00891.W(class06646.N()));
         }
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().b());
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   private class02774 N(class06653 var1) {
      class00500 class00500 = var1.N(0, 1, 0).N();
      class00891 class00891 = class00500.i();
      return class00891 instanceof class02674
         ? ((class02674)class00891).i()
         : Optional.ofNullable((class00891)class02859.y.get().get(class00500.i()))
            .filter(var0 -> var0 instanceof class02674)
            .map(var0 -> (class02674)var0)
            .orElse((class02674)class00869.bx)
            .i();
   }

   private void N(class07299 var1, class07209 var2) {
      class06653 class06653xx = this.L().N(var1, var2);
      if (class06653xx != null) {
         class07888 class07888 = class07078.yv.N(var1, class06113.field_16461);
         if (class07888 != null) {
            N(var1, class06653xx, class07888, class06653xx.N(0, 2, 0).u());
            return;
         }
      }

      class06653 class06653x = this.i().N(var1, var2);
      if (class06653x != null) {
         class07625 class07625 = class07078.Nn.N(var1, class06113.field_16461);
         if (class07625 != null) {
            class07625.M(true);
            N(var1, class06653x, class07625, class06653x.N(1, 2, 0).u());
            return;
         }
      }

      class06653 class06653xx = this.b().N(var1, var2);
      if (class06653xx != null) {
         class08982 class08982 = class07078.g.N(var1, class06113.field_16461);
         if (class08982 != null) {
            N(var1, class06653xx, class08982, class06653xx.N(0, 0, 0).u());
            this.L(var1, class06653xx);
            class08982.y(this.N(class06653xx));
         }
      }
   }
}
