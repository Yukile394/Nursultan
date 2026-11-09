package minecraft;

import Nursultan.class10500;

public class class05208 extends class03286 {
   private static final class00392 L = class00392.L("createWorld.tab.world.title");
   private static final class00392 u = class00392.L("generator.minecraft.amplified.info");
   private static final class00392 i = class00392.L("selectWorld.mapFeatures");
   private static final class00392 R = class00392.L("selectWorld.mapFeatures.info");
   private static final class00392 M = class00392.L("selectWorld.bonusItems");
   private static final class00392 B = class00392.L("selectWorld.enterSeed");
   public static final class00392 N = class00392.L("selectWorld.seedInfo");
   private static final int z = 310;
   private final class04927 U;
   private final class05362 E;

   class05208(class05213 var1) {
      super(L);
      this.y = var1;
      class02080 class02080 = this.Z.N(10).y(8).u(2);
      class06366 class06366 = class02080.N(
         class06366.<class03690>N(class03690::N, var1.R.W())
            .N(this.y())
            .N_57(class05208::N)
            .N(0, 0, 150, 20, class00392.L("selectWorld.mapType"), (var1x, var2x) -> this.y.R.N(var2x))
      );
      class06366.N(var1.R.W());
      var1.R.N(var2x -> {
         class03690 class03690 = var2x.W();
         class06366.N(class03690);
         if (class03690.y()) {
            class06366.method_47400(class04141.N(u));
         } else {
            class06366.method_47400(null);
         }

         class06366.field_22763 = this.y.R.W().L() != null;
      });
      this.E = class02080.N(class05362.method_46430(class00392.L("selectWorld.customizeType"), var1x -> this.N()).N());
      var1.R.N(var1x -> this.E.field_22763 = !var1x.E() && var1x.m() != null);
      this.U = new class10500(this, class05213.L(var1), 308, 20, class00392.L("selectWorld.enterSeed"), var1);
      this.U.method_47404(N);
      this.U.method_1852(var1.R.B());
      this.U.method_1863(var1x -> this.y.R.y(this.U.method_1882()));
      class02080.N(class03725.N(class05213.u(var1), this.U, B), 2);
      class03658 class03658 = class03668.N(310);
      class03658.N(i, var1.R::Z, var1.R::y).N(() -> !this.y.R.E()).N(R);
      class03658.N(M, var1.R::z, var1.R::L).N(() -> !this.y.R.R() && !this.y.R.E());
      class03668 class03668 = class03658.y();
      class02080.N(class03668.N(), 2);
      var1.R.N(var1x -> class03668.y());
   }

   private class06363<class03690> y() {
      return new class05200(this);
   }

   private static class05216 N(class06366<class03690> var0) {
      return var0.y().y() ? class05220.N(var0.L(), u) : var0.L();
   }

   private void N() {
      class05966 class05966 = this.y.R.m();
      if (class05966 != null) {
         class05213.i(this.y).N(class05966.createEditScreen(this.y, this.y.R.U()));
      }
   }
}
