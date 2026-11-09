package minecraft;

import Nursultan.class10981;
import Nursultan.class11938;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09042 extends class09005 {
   private static final int N = 8;
   private static final float y = -160.0F;
   private static final float L = -256.0F;
   private float u;

   public class09042() {
      super();
   }

   private void N(class05363 var1, class03448 var2, class02233 var3) {
      class07209 class07209 = var1.u();
      class00780 class00780 = var2.i(class07209).N();
      float f = var3.N();
      float f1 = var3.N(false);
      boolean flag = class00780.y();
      float f2 = class04995.N((var2.method_22336().N(class00772.field_9284).L(class07209) - 8.0F) / 7.0F, 0.0F, 1.0F);
      float f3 = var2.method_8430(f1) * f2 * (flag ? 1.0F : 0.5F);
      this.u = this.u + (f3 - this.u) * f * 0.2F;
   }

   @Override
   public boolean N(@Nullable class04798 var1, class07049 var2) {
      return var1 == class04798.field_60563;
   }

   private void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5, CallbackInfo var6) {
      class10981 class10981 = class10981.L();
      class11938.L().L(class10981);
      if (class10981.y()) {
         var1.N = 999999.0F;
         var1.L = 1000000.0F;
      }
   }

   public int N(int var1) {
      return !SodiumExtraClientMod.options().detailSettings.skyColors ? 7907327 : var1;
   }

   @Override
   public void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5) {
      this.N(var2, var3, var5);
      float f = var5.N(false);
      var1.N = var2.U().N(class00608.y, f);
      var1.L = var2.U().N(class00608.L, f);
      var1.N = var1.N + -160.0F * this.u;
      float f1 = Math.min(96.0F, var1.L);
      var1.L = Math.max(f1, var1.L + -256.0F * this.u);
      var1.i = Math.min(var4, var2.U().N(class00608.u, f));
      var1.R = Math.min((float)(((class05630)class06202.Nq().i_7).E().method_41753() * 16), var2.U().N(class00608.i, f));
      if (((class01056)class06202.Nq().i_6).U().u()) {
         var1.N = Math.min(var1.N, 10.0F);
         var1.L = Math.min(var1.L, 96.0F);
         var1.i = var1.L;
         var1.R = var1.L;
      }

      this.N(var1, var2, var3, var4, var5, null);
   }

   private static int N(int var0, float var1, float var2) {
      if (var1 > 0.0F) {
         float f = 1.0F - var1 * 0.5F;
         float f1 = 1.0F - var1 * 0.4F;
         var0 = class02566.N(var0, f, f, f1);
      }

      if (var2 > 0.0F) {
         var0 = class02566.y(var0, 1.0F - var2 * 0.5F);
      }

      return var0;
   }

   @Override
   public int N(class03448 var1, class05363 var2, int var3, float var4) {
      int i = var2.U().N(class00608.N, var4);
      if (var3 >= 4) {
         float f = var2.U().N(class00608.W, var4) * (float) (Math.PI / 180.0);
         float f1 = class04995.m(f) > 0.0F ? -1.0F : 1.0F;
         class07604 class07604 = ((class03386)class06202.Nq().i_5).i();
         float f2 = (class07604 != null ? class07604.N() : var2.m()).dot(f1, 0.0F, 0.0F);
         if (f2 > 0.0F) {
            int j = var2.U().N(class00608.z, var4);
            float f3 = class02566.W(j);
            if (f3 > 0.0F) {
               i = class02566.N(f2 * f3, i, class02566.M(j));
            }
         }
      }

      int k = var2.U().N(class00608.Z, var4);
      float f5 = var1.method_8478(var4);
      float f4 = var1.method_8430(var4);
      k = N(this.N(k), f4, f5);
      float f6 = Math.min(var2.U().N(class00608.u, var4) / 16.0F, (float)var3);
      float f7 = class04995.y(f6 / 32.0F, 0.25F, 1.0F);
      f7 = 1.0F - (float)Math.pow(f7, 0.25);
      return class02566.N(f7, i, k);
   }
}
