package minecraft;

import com.google.common.collect.ImmutableList;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import java.util.function.Supplier;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class class01409 extends class01388 {
   public static final class00392 N = class00392.L("controls.reset");
   private static final int L = 10;
   private final class06428 u;
   private final class00392 i;
   private final class05362 R;
   private final class05362 M;
   private boolean B;
   private static final class01883 Z = new class01883(ModUtils.id("key_binds/settings"), ModUtils.id("key_binds/settings_selected"));
   private class05362 z;

   class01409(class01402 var1, class06428 var2, class00392 var3) {
      super();
      this.y = var1;
      this.B = false;
      this.u = var2;
      this.i = var3;
      this.R = class05362.method_46430(var3, var2x -> {
         this.y.N.N = var2;
         this.y.y();
      }).N(0, 0, 75, 20).N(var2x -> var2.W() ? class00392.N("narrator.controls.unbound", var3) : class00392.N("narrator.controls.bound", var3, var2x.get())).N();
      this.M = class05362.method_46430(N, var2x -> {
         var2.y(var2.E());
         this.y.y();
      }).N(0, 0, 50, 20).N(var1x -> class00392.N("narrator.controls.reset", var3)).N();
      this.N();
      this.N(var1, var2, var3, null);
   }

   private void N(class01402 var1, class06428 var2, class00392 var3, CallbackInfo var4) {
      if (var2.U().equals("key.ok_zoomer.zoom") && (Boolean)OkZoomerConfigManager.CONFIG.tweaks.showSettingsOnKey.value()) {
         this.z = new class04897(
            0,
            0,
            20,
            20,
            Z,
            var1x -> this.y.getMinecraft().N(new OkZoomerConfigScreen(this.y.getKeyBindsScreen())),
            class00392.N("key.ok_zoomer.settings", this.i)
         );
      }
   }

   private void N(class01054 var1, int var2, int var3, boolean var4, float var5, CallbackInfo var6) {
      if (this.z != null) {
         this.z.y(this.R.method_46426() - 25, this.method_73382() - 2);
         this.z.method_25394(var1, var2, var3, var5);
      }
   }

   private ImmutableList N(Object var1, Object var2, Operation var3) {
      return this.z != null ? ImmutableList.of(this.z, var1, var2) : (ImmutableList)var3.call(new Object[]{var1, var2});
   }

   @Override
   protected void N() {
      this.R.method_25355(this.u.m());
      this.M.field_22763 = !this.u.P();
      this.B = false;
      class05216 class05216 = class00392.i();
      if (!this.u.W()) {
         for (class06428 class06428 : ((class05630)class01402.R(this.y).i_7).Nn) {
            if (class06428 != this.u && this.u.y(class06428) && (!class06428.P() || !this.u.P())) {
               if (this.B) {
                  class05216.i(", ");
               }

               this.B = true;
               class05216.y(class00392.L(class06428.U()));
            }
         }
      }

      if (this.B) {
         this.R.method_25355(class00392.y("[ ").y(this.R.method_25369().L().N(class06541.field_1068)).i(" ]").N(class06541.field_1054));
         this.R.method_47400(class04141.N(class00392.N("controls.keybinds.duplicateKeybinds", class05216)));
      } else {
         this.R.method_47400(null);
      }

      if (this.y.N.N == this.u) {
         this.R.method_25355(class00392.y("> ").y(this.R.method_25369().L().N(class06541.field_1068, class06541.field_1073)).i(" <").N(class06541.field_1054));
      }
   }

   @Override
   public List<? extends class04654> method_25396() {
      class05362 class05362 = this.M;
      class05362 class05362x = this.R;
      return this.N(class05362x, class05362, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.lang.Object, java.lang.Object]");
         return ImmutableList.of(var0[0], var0[1]);
      });
   }

   @Override
   public List<? extends class03434> method_37025() {
      class05362 class05362 = this.M;
      class05362 class05362x = this.R;
      return this.N(class05362x, class05362, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.lang.Object, java.lang.Object]");
         return ImmutableList.of(var0[0], var0[1]);
      });
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = class01402.L(this.y) - this.M.method_25368() - 10;
      int j = this.method_73382() - 2;
      this.M.y(ix, j);
      this.M.method_25394(var1, var2, var3, var5);
      int k = ix - 5 - this.R.method_25368();
      this.R.y(k, j);
      this.R.method_25394(var1, var2, var3, var5);
      class01590 class01590 = (class01590)class01402.u(this.y).i_3;
      class00392 class00392 = this.i;
      int i1 = this.method_73380();
      int j1 = this.method_73385() - 4;
      this.N(var1, var2, var3, var4, var5, null);
      var1.y(class01590, class00392, i1, j1, -1);
      if (this.B) {
         byte b0 = 3;
         int l = this.R.method_46426() - 6;
         var1.N(l, this.method_73382() - 1, l + 3, this.method_73386(), -256);
      }
   }
}
