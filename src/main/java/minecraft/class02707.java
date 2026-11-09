package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class02707 extends class02795<class07637, class08482, class06071> {
   private static final Map<class07645, class01894> N = Maps.newEnumMap(
      Map.of(
         class07645.field_6788,
         class01894.y("textures/entity/panda/panda.png"),
         class07645.field_6794,
         class01894.y("textures/entity/panda/lazy_panda.png"),
         class07645.field_6795,
         class01894.y("textures/entity/panda/worried_panda.png"),
         class07645.field_6791,
         class01894.y("textures/entity/panda/playful_panda.png"),
         class07645.field_6792,
         class01894.y("textures/entity/panda/brown_panda.png"),
         class07645.field_6793,
         class01894.y("textures/entity/panda/weak_panda.png"),
         class07645.field_6789,
         class01894.y("textures/entity/panda/aggressive_panda.png")
      )
   );

   public class02707(class04832 var1) {
      super(var1, new class06071(var1.N(class04802.LE)), new class06071(var1.N(class04802.LW)), 0.9F);
      this.N(new class02740(this));
   }

   public class08482 method_55269() {
      return new class08482();
   }

   public void method_62354(class07637 var1, class08482 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.Y();
      var2.y = var1.B() > 0;
      var2.L = var1.W();
      var2.u = var1.t();
      var2.i = var1.n();
      var2.R = var1.Ng();
      var2.M = var1.m();
      var2.B = var1.u(var3);
      var2.Z = var1.i(var3);
      var2.g = var1.method_6109() ? 0.0F : var1.R(var3);
      var2.I = var1.i > 0 ? var1.i + var3 : 0.0F;
   }

   protected void y(class08482 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      if (var1.I > 0.0F) {
         float f = class04995.M(var1.I);
         int i = class04995.y(var1.I);
         int j = i + 1;
         float f1 = 7.0F;
         float f2 = var1.NB ? 0.3F : 0.8F;
         if (i < 8.0F) {
            float f4 = 90.0F * i / 7.0F;
            float f5 = 90.0F * j / 7.0F;
            float f3 = this.N(f4, f5, j, f, 8.0F);
            var2.N(0.0F, (f2 + 0.2F) * (f3 / 90.0F), 0.0F);
            var2.N(class02058.y.N(-f3));
         } else if (i < 16.0F) {
            float f14 = (i - 8.0F) / 7.0F;
            float f17 = 90.0F + 90.0F * f14;
            float f6 = 90.0F + 90.0F * (j - 8.0F) / 7.0F;
            float f11 = this.N(f17, f6, j, f, 16.0F);
            var2.N(0.0F, f2 + 0.2F + (f2 - 0.2F) * (f11 - 90.0F) / 90.0F, 0.0F);
            var2.N(class02058.y.N(-f11));
         } else if (i < 24.0F) {
            float f15 = (i - 16.0F) / 7.0F;
            float f18 = 180.0F + 90.0F * f15;
            float f20 = 180.0F + 90.0F * (j - 16.0F) / 7.0F;
            float f12 = this.N(f18, f20, j, f, 24.0F);
            var2.N(0.0F, f2 + f2 * (270.0F - f12) / 90.0F, 0.0F);
            var2.N(class02058.y.N(-f12));
         } else if (i < 32) {
            float f16 = (i - 24.0F) / 7.0F;
            float f19 = 270.0F + 90.0F * f16;
            float f21 = 270.0F + 90.0F * (j - 24.0F) / 7.0F;
            float f13 = this.N(f19, f21, j, f, 32.0F);
            var2.N(0.0F, f2 * ((360.0F - f13) / 90.0F), 0.0F);
            var2.N(class02058.y.N(-f13));
         }
      }

      float f7 = var1.B;
      if (f7 > 0.0F) {
         var2.N(0.0F, 0.8F * f7, 0.0F);
         var2.N(class02058.y.N(class04995.B(f7, var1.h, var1.h + 90.0F)));
         var2.N(0.0F, -1.0F * f7, 0.0F);
         if (var1.R) {
            float f8 = (float)(Math.cos(var1.P * 1.25F) * Math.PI * 0.05F);
            var2.N(class02058.u.N(f8));
            if (var1.NB) {
               var2.N(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float f9 = var1.Z;
      if (f9 > 0.0F) {
         float f10 = var1.NB ? 0.5F : 1.3F;
         var2.N(0.0F, f10 * f9, 0.0F);
         var2.N(class02058.y.N(class04995.B(f9, var1.h, var1.h + 180.0F)));
      }
   }

   private float N(float var1, float var2, int var3, float var4, float var5) {
      return var3 < var5 ? class04995.B(var4, var1, var2) : var1;
   }

   public class01894 N(class08482 var1) {
      return N.getOrDefault(var1.N, N.get(class07645.field_6788));
   }
}
