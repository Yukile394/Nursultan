package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04731 extends class05407 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("mco.terms.title");
   private static final class00392 L = class00392.L("mco.terms.sentence.1");
   private static final class00392 u = class05220.N().y(class00392.L("mco.terms.sentence.2").L(class00405.N.L(true)));
   private final class05096 i;
   private final class04981 R;
   private boolean M;

   public class04731(class05096 var1, class04981 var2) {
      super(y);
      this.i = var1;
      this.R = var2;
   }

   private void N() {
      class05111 class05111 = class05111.N();

      try {
         class05111.E();
         this.field_22787.N(new class04708(this.i, new class04693(this.i, this.R)));
      } catch (class05097 class05097) {
         N.error("Couldn't agree to TOS", class05097);
      }
   }

   @Override
   public void method_25426() {
      int ix = this.field_22789 / 4 - 2;
      this.method_37063(class05362.method_46430(class00392.L("mco.terms.buttons.agree"), var1x -> this.N()).N(this.field_22789 / 4, N(12), ix, 20).N());
      this.method_37063(
         class05362.method_46430(class00392.L("mco.terms.buttons.disagree"), var1x -> this.field_22787.N(this.i))
            .N(this.field_22789 / 2 + 4, N(12), ix, 20)
            .N()
      );
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.v() == 256) {
         this.field_22787.N(this.i);
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
      var1.y(this.field_22793, L, this.field_22789 / 2 - 120, N(5), -1);
      int ix = this.field_22793.N(L);
      int j = this.field_22789 / 2 - 121 + ix;
      int k = N(5);
      int l = j + this.field_22793.N(u) + 1;
      int i1 = k + 1 + 9;
      this.M = j <= var2 && var2 <= l && k <= var3 && var3 <= i1;
      var1.y(this.field_22793, u, this.field_22789 / 2 - 120 + ix, N(5), this.M ? -9670204 : -13408581);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.M) {
         ((class06197)this.field_22787.L_3).N(class03597.j.toString());
         class07536.m().N(class03597.j);
         return true;
      } else {
         return super.method_25402(var1, var2);
      }
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), L).y(class05220.l).y(u);
   }
}
