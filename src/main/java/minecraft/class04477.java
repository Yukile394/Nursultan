package minecraft;

import com.mojang.authlib.GameProfile;
import org.jspecify.annotations.Nullable;
import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;

public abstract class class04477 extends class08036 implements class06618 {
   @Nullable
   private class03458 N;
   private final boolean y;
   private final class06602 L = new class06602();

   @Override
   public void method_5773() {
      this.L.N(this.method_73189(), this.method_18798());
      super.method_5773();
   }

   @Override
   public void method_5842() {
      super.method_5842();
      this.B().y();
   }

   public class04477(class03448 var1, GameProfile var2) {
      super(var1, var2);
      this.y = "deadmau5".equals(this.method_7334().name());
   }

   @Override
   public class06602 B() {
      return this.L;
   }

   @Override
   public class01631 Z() {
      class03458 class03458 = this.E();
      return class03458 == null ? class00189.N(this.method_5667()) : class03458.M();
   }

   @Override
   public boolean U() {
      return this.y;
   }

   @Nullable
   @Override
   public class00392 z() {
      class06683 class06683 = this.method_73183().method_8428();
      class00518 class00518 = class06683.N(class01890.field_45158);
      if (class00518 != null) {
         class05216 class05216 = class01788.N(class06683.y(this, class00518), class00518.N(class01759.y));
         return class00392.i().y(class05216).y(class05220.l).y(class00518.i());
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public class07648 y(boolean var1) {
      return (var1 ? this.method_74136() : this.method_74137()).orElse(null);
   }

   @Nullable
   protected class03458 E() {
      if (this.N == null) {
         this.N = class06202.Nq().NE().N(this.method_5667());
      }

      return this.N;
   }

   public float N(boolean var1, float var2) {
      float f = 1.0F;
      if (this.method_31549().y) {
         f *= 1.1F;
      }

      float f1 = this.method_31549().y();
      if (f1 != 0.0F) {
         float f2 = (float)this.method_45325(class05298.l) / f1;
         f *= (f2 + 1.0F) / 2.0F;
      }

      if (this.method_6115()) {
         if (this.method_6030().N(class06570.sx)) {
            float f3 = Math.min(this.method_6048() / 20.0F, 1.0F);
            f *= 1.0F - class04995.z(f3) * 0.15F;
         } else if (var1 && this.N(this.method_31550())) {
            return 0.1F;
         }
      }

      return class04995.B(var2, 1.0F, f);
   }

   private boolean N(boolean var1) {
      switch ((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()) {
         case REPLACE_ZOOM:
         case BOTH:
            return false;
         default:
            return var1;
      }
   }

   protected void N(float var1) {
      this.L.N(var1);
   }

   protected void W() {
      float f;
      if (this.method_24828() && !this.method_29504() && !this.method_5681()) {
         f = Math.min(0.1F, (float)this.method_18798().Z());
      } else {
         f = 0.0F;
      }

      this.B().i(f);
   }

   @Override
   public void method_6007() {
      this.W();
      super.method_6007();
   }

   @Nullable
   @Override
   public class07282 method_68876() {
      class03458 class03458 = this.E();
      return class03458 != null ? class03458.i() : null;
   }
}
