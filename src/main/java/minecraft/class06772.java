package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06772 extends class00864 implements class00873 {
   public static final MapCodec<class06772> u = y(class06772::new);
   public static final int i = 7;
   public static final class08071 R = class06665.Nw;
   private static final class00494[] N = class00891.N(7, var0 -> class00891.y(16.0, 0.0, 2 + var0 * 2));
   private static final class00494 y;

   protected class08071 L() {
      return R;
   }

   public class06772(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(this.L(), 0));
   }

   protected class07310 i() {
      return class06570.by;
   }

   public int U(class00500 var1) {
      return var1.L(this.L());
   }

   public int u() {
      return 7;
   }

   @Override
   public void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_22335(var3, 0) >= 9) {
         int ix = this.U(var1);
         if (ix < this.u()) {
            float f = N(this, var2, var3);
            if (var4.y((int)(25.0F / f) + 1) == 0) {
               var2.method_8652(var3, this.y(ix + 1), 2);
            }
         }
      }
   }

   public void y(class07299 var1, class07209 var2, class00500 var3) {
      int ix = Math.min(this.u(), this.U(var3) + this.N(var1));
      var1.method_8652(var2, this.y(ix), 2);
   }

   public class00500 y(int var1) {
      return this.W().y(this.L(), var1);
   }

   public final boolean E(class00500 var1) {
      return this.U(var1) >= this.u();
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return !this.E(var3);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(this.i());
   }

   private void N(CallbackInfoReturnable var1) {
      if (DebugSettings.INSTANCE.legacyCropOutlines.isEnabled()) {
         var1.setReturnValue(y);
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.y(var1, var3, var4);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R);
   }

   public int N(class07299 var1) {
      return class04995.N(var1.field_9229, 2, 5);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.Lr);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : N[this.U(var1)];
   }

   @Override
   public MapCodec<? extends class06772> N() {
      return u;
   }

   protected static boolean N(class05487 var0, class07209 var1) {
      return var0.method_22335(var1, 0) >= 8;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var2 instanceof class04782 class04782 && var4 instanceof class07153 && class04782.method_64395().N(class07305.I)) {
         class04782.N(var3, true, var4);
      }

      super.N(var1, var2, var3, var4, var5, var6);
   }

   public static float N(class00891 var0, class07290 var1, class07209 var2) {
      float f = 1.0F;
      class07209 class07209xxxx = var2.method_10074();

      for (int ix = -1; ix <= 1; ix++) {
         for (int j = -1; j <= 1; j++) {
            float f1 = 0.0F;
            class00500 class00500 = var1.method_8320(class07209xxxx.method_10069(ix, 0, j));
            if (class00500.N(class00869.Lr)) {
               f1 = 1.0F;
               if (class00500.L(class07208.y) > 0) {
                  f1 = 3.0F;
               }
            }

            if (ix != 0 || j != 0) {
               f1 /= 4.0F;
            }

            f += f1;
         }
      }

      class07209 class07209x = var2.method_10095();
      class07209 class07209xx = var2.method_10072();
      class07209 class07209xxx = var2.method_10067();
      class07209 class07209xxxx = var2.method_10078();
      boolean flag = var1.method_8320(class07209xxx).N(var0) || var1.method_8320(class07209xxxx).N(var0);
      boolean flag1 = var1.method_8320(class07209x).N(var0) || var1.method_8320(class07209xx).N(var0);
      if (flag && flag1) {
         f /= 2.0F;
      } else if (var1.method_8320(class07209xxx.method_10095()).N(var0)
         || var1.method_8320(class07209xxxx.method_10095()).N(var0)
         || var1.method_8320(class07209xxxx.method_10072()).N(var0)
         || var1.method_8320(class07209xxx.method_10072()).N(var0)) {
         f /= 2.0F;
      }

      return f;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return N(var2, var3) && super.a_(var1, var2, var3);
   }

   @Override
   protected boolean e_(class00500 var1) {
      return !this.E(var1);
   }
}
