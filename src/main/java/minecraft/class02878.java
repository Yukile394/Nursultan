package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class02878<T extends class00679> extends class04507<T, class08469> {
   public static final int N = 5;
   public static final int y = 30;
   private final class08943 L;
   private final class01083 u;
   private final class01999 i;

   public class02878(class04832 var1) {
      super(var1);
      this.L = var1.y();
      this.u = var1.L();
      this.i = var1.u();
   }

   private void N(
      class01237 var1, class01421 var2, class07311 var3, class08887 var4, float var5, float var6, float var7, int var8, int var9, int var10, class00500 var11
   ) {
      var1.submitBlockStateModel(var2, var1x -> var3, var4, var5, var6, var7, var8, var9, var10, class02730.field_52611, class07209.field_10980, var11);
   }

   private void N(
      class01237 var1, class01421 var2, class07311 var3, class08887 var4, float var5, float var6, float var7, int var8, int var9, int var10, LocalRef var11
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (class00500)var11.get());
   }

   public void method_62354(T var1, class08469 var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      var2.N = var1.method_5735();
      class06584 class06584 = var1.Z();
      this.L.N(var2.y, class06584, class03662.field_4319, var1);
      var2.L = var1.E();
      var2.u = var1.method_5864() == class07078.NU;
      var2.i = null;
      if (!class06584.R()) {
         class02265 class02265 = var1.N(class06584);
         if (class02265 != null) {
            class07769 class07769 = var1.method_73183().method_17891(class02265);
            if (class07769 != null) {
               this.u.N(class02265, class07769, var2.R);
               var2.i = class02265;
            }
         }
      }
   }

   public class08469 method_55269() {
      return new class08469();
   }

   public void N(class08469 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      if (!SodiumExtraClientMod.options().renderSettings.itemFrame) {
         var5.cancel();
      }
   }

   private void N(class00679 var1, double var2, CallbackInfoReturnable var4) {
      if (!SodiumExtraClientMod.options().renderSettings.itemFrameNameTag) {
         var4.setReturnValue(false);
      }
   }

   protected int method_24087(T var1, class07209 var2) {
      return var1.method_5864() == class07078.NU ? Math.max(5, super.method_24087((T)var1, var2)) : super.method_24087((T)var1, var2);
   }

   public void method_3936(class08469 var1, class01421 var2, class01237 var3, class06959 var4) {
      super.method_3936(var1, var2, var3, var4);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var2.N();
         class07211 class07211 = var1.N;
         class06889 class06889 = this.method_23169(var1);
         var2.N(-class06889.N(), -class06889.y(), -class06889.L());
         double d0 = 0.46875;
         var2.N(class07211.P() * 0.46875, class07211.s() * 0.46875, class07211.T() * 0.46875);
         float f;
         float f1;
         if (class07211.z().L()) {
            f = 0.0F;
            f1 = 180.0F - class07211.U();
         } else {
            f = -90 * class07211.i().N();
            f1 = 180.0F;
         }

         var2.N(class02058.y.N(f));
         var2.N(class02058.u.N(f1));
         if (!var1.v) {
            class00500 class00500 = class08541.N(var1.u, var1.i != null);
            class08887 class08887 = this.i.N(class00500);
            var2.N();
            var2.N(-0.5F, -0.5F, -0.5F);
            class07311 class07311x = class06851.i(class08626.N);
            int l = var1.l;
            int k = class01384.u;
            int j = var1.G;
            float f4 = 1.0F;
            float f3 = 1.0F;
            float f2 = 1.0F;
            class07311 class07311x = class07311x;
            LocalRefImpl localrefimpl = new LocalRefImpl();
            localrefimpl.init(class00500);
            this.N(var3, var2, class07311x, class08887, f2, f3, f4, j, k, l, localrefimpl);
            class00500 = (class00500)localrefimpl.dispose();
            var2.y();
         }

         if (var1.v) {
            var2.N(0.0F, 0.0F, 0.5F);
         } else {
            var2.N(0.0F, 0.0F, 0.4375F);
         }

         if (var1.i != null) {
            int i1 = var1.L % 4 * 2;
            var2.N(class02058.R.N(i1 * 360.0F / 8.0F));
            var2.N(class02058.R.N(180.0F));
            float f5 = 0.0078125F;
            var2.y(0.0078125F, 0.0078125F, 0.0078125F);
            var2.N(-64.0F, -64.0F, 0.0F);
            var2.N(0.0F, 0.0F, -1.0F);
            int ix = this.N(var1.u, 15728850, var1.G);
            this.u.N(var1.R, var2, var3, true, ix);
         } else if (!var1.y.i()) {
            var2.N(class02058.R.N(var1.L * 360.0F / 8.0F));
            int j1 = this.N(var1.u, 15728880, var1.G);
            var2.y(0.5F, 0.5F, 0.5F);
            var1.y.N(var2, var3, j1, class01384.u, var1.l);
         }

         var2.y();
      }
   }

   private int N(boolean var1, int var2, int var3) {
      return var1 ? var2 : var3;
   }

   public class06889 method_23169(class08469 var1) {
      return new class06889(var1.N.P() * 0.3F, -0.25, var1.N.T() * 0.3F);
   }

   protected class00392 method_62426(T var1) {
      return var1.Z().d();
   }

   protected boolean method_3921(T var1, double var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : class06202.NB() && this.field_4676.L == var1 && var1.Z().w() != null;
   }
}
