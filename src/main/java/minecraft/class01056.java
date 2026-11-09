package minecraft;

import Nursultan.class09338;
import Nursultan.class10956;
import Nursultan.class10979;
import Nursultan.class10994;
import Nursultan.class10995;
import Nursultan.class11938;
import com.armorhud.armorHud;
import com.armorhud.armor.ArmorAccessor;
import com.armorhud.config.config;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;
import net.fabricmc.fabric.mixin.client.rendering.GuiAccessor;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gui.screen.HudHideable;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN3;
import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import squeek.appleskin.client.HUDOverlayHandler;

@Environment(EnvType.CLIENT)
public class class01056 implements GuiAccessor {
   private static final class01894 R = class01894.y("hud/crosshair");
   private static final class01894 M = class01894.y("hud/crosshair_attack_indicator_full");
   private static final class01894 B = class01894.y("hud/crosshair_attack_indicator_background");
   private static final class01894 Z = class01894.y("hud/crosshair_attack_indicator_progress");
   private static final class01894 z = class01894.y("hud/effect_background_ambient");
   private static final class01894 U = class01894.y("hud/effect_background");
   private static final class01894 E = class01894.y("hud/hotbar");
   private static final class01894 W = class01894.y("hud/hotbar_selection");
   private static final class01894 m = class01894.y("hud/hotbar_offhand_left");
   private static final class01894 P = class01894.y("hud/hotbar_offhand_right");
   private static final class01894 s = class01894.y("hud/hotbar_attack_indicator_background");
   private static final class01894 T = class01894.y("hud/hotbar_attack_indicator_progress");
   private static final class01894 b = class01894.y("hud/armor_empty");
   private static final class01894 j = class01894.y("hud/armor_half");
   private static final class01894 v = class01894.y("hud/armor_full");
   private static final class01894 n = class01894.y("hud/food_empty_hunger");
   private static final class01894 t = class01894.y("hud/food_half_hunger");
   private static final class01894 G = class01894.y("hud/food_full_hunger");
   private static final class01894 l = class01894.y("hud/food_empty");
   private static final class01894 d = class01894.y("hud/food_half");
   private static final class01894 w = class01894.y("hud/food_full");
   private static final class01894 k = class01894.y("hud/air");
   private static final class01894 Y = class01894.y("hud/air_bursting");
   private static final class01894 Q = class01894.y("hud/air_empty");
   private static final class01894 O = class01894.y("hud/heart/vehicle_container");
   private static final class01894 g = class01894.y("hud/heart/vehicle_full");
   private static final class01894 I = class01894.y("hud/heart/vehicle_half");
   private static final class01894 J = class01894.y("textures/misc/vignette.png");
   public static final class01894 N = class01894.y("textures/misc/nausea.png");
   private static final class01894 o = class01894.y("textures/misc/spyglass_scope.png");
   private static final class01894 q = class01894.y("textures/misc/powder_snow_outline.png");
   private static final Comparator<class01772> K = Comparator.comparing(class01772::u).reversed().thenComparing(class01772::L, String.CASE_INSENSITIVE_ORDER);
   private static final class00392 V = class00392.L("demo.demoExpired");
   private static final class00392 e = class00392.L("menu.savingLevel");
   private static final float H = 5.0F;
   private static final int c = 100;
   private static final int X = 10;
   private static final int a = 10;
   private static final String p = ": ";
   private static final float F = 0.2F;
   private static final int A = 9;
   private static final int f = 8;
   private static final int C = 10;
   private static final int S = 9;
   private static final int x = 8;
   private static final int D = 2;
   private static final int h = 1;
   private static final float r = 0.5F;
   private static final float NN = 0.1F;
   private static final float Ny = 1.0F;
   private static final float NL = 0.1F;
   private static final int Nu = 3;
   private static final int Ni = 5;
   private static final float NR = 0.2F;
   private static final int NM = 5;
   private static final int NB = 5;
   private final class06069 NZ;
   private final class06202 Nz;
   private final class06451 NU;
   private int NE;
   @Nullable
   private class00392 NW;
   private int Nm;
   private boolean NP;
   private boolean Ns;
   public float y;
   private int NT;
   private class06584 Nb;
   private final class06463 Nj;
   private final class05808 Nv;
   private final class04682 Nn;
   private final class05006 Nt;
   private final class06455 NG;
   private int Nl;
   @Nullable
   private class00392 Nd;
   @Nullable
   private class00392 Nw;
   private int Nk;
   private int NY;
   private int NQ;
   private int NO;
   private int Ng;
   private long NI;
   private long NJ;
   private int No;
   @Nullable
   private Runnable Nq;
   private float NK;
   private float NV;
   private Pair<class01069, class08657> Ne;
   private final Map<class01069, Supplier<class08657>> NH;
   private float Nc;
   private float NX = 0.0F;
   private float Na = 0.0F;
   int L;
   boolean u;
   private static final int Np = 8;

   private void L(class01054 var1) {
      class08036 class08036 = this.m();
      if (class08036 != null) {
         int ix = class04995.u(class08036.method_6032());
         boolean flag = this.NJ > this.NE && (this.NJ - this.NE) / 3L % 2L == 1L;
         long jx = class07536.L();
         if (ix < this.NO && class08036.field_6008 > 0) {
            this.NI = jx;
            this.NJ = this.NE + 20;
         } else if (ix > this.NO && class08036.field_6008 > 0) {
            this.NI = jx;
            this.NJ = this.NE + 10;
         }

         if (jx - this.NI > 1000L) {
            this.Ng = ix;
            this.NI = jx;
         }

         this.NO = ix;
         int kx = this.Ng;
         this.NZ.N(this.NE * 312871);
         int lx = var1.N() / 2 - 91;
         int i1 = var1.N() / 2 + 91;
         int j1 = this.L(var1.y()) - 39;
         float fx = Math.max((float)class08036.method_45325(class05298.n), (float)Math.max(kx, ix));
         int k1 = class04995.u(class08036.method_6067());
         int l1 = class04995.u((fx + k1) / 2.0F / 10.0F);
         int i2 = Math.max(10 - (l1 - 2), 3);
         int j2 = j1 - 10;
         int k2 = -1;
         if (class08036.method_6059(class07047.z)) {
            k2 = this.NE % class04995.u(fx + 5.0F);
         }

         class08700.N().N("armor");
         this.N(var1, class08036, j1, l1, i2, lx, (Operation)(var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 6, "[net.minecraft.class_332, net.minecraft.class_1657, int, int, int, int]");
            N((class01054)var0[0], (class08036)var0[1], (Integer)var0[2], (Integer)var0[3], (Integer)var0[4], (Integer)var0[5]);
            return (Void)null;
         }));
         class08700.N().y("health");
         this.N(
            this,
            var1,
            class08036,
            lx,
            j1,
            i2,
            k2,
            fx,
            ix,
            kx,
            k1,
            flag,
            var0 -> {
               WrapOperationRuntime.checkArgumentCount(
                  var0, 12, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int, int, int, float, int, int, int, boolean]"
               );
               ((class01056)var0[0])
                  .N(
                     (class01054)var0[1],
                     (class08036)var0[2],
                     (Integer)var0[3],
                     (Integer)var0[4],
                     (Integer)var0[5],
                     (Integer)var0[6],
                     (Float)var0[7],
                     (Integer)var0[8],
                     (Integer)var0[9],
                     (Integer)var0[10],
                     (Boolean)var0[11]
                  );
               return (Void)null;
            }
         );
         class07438 class07438 = this.P();
         int l2 = this.N(class07438);
         if (l2 == 0) {
            class08700.N().y("food");
            this.N(this, var1, class08036, j1, i1, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 5, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int]");
               ((class01056)var0[0]).N((class01054)var0[1], (class08036)var0[2], (Integer)var0[3], (Integer)var0[4]);
               return (Void)null;
            });
            j2 -= 10;
         }

         class08700.N().y("air");
         this.N(this, var1, class08036, l2, j2, i1, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 6, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_1657, int, int, int]");
            ((class01056)var0[0]).N((class01054)var0[1], (class08036)var0[2], (Integer)var0[3], (Integer)var0[4], (Integer)var0[5]);
            return (Void)null;
         });
         class08700.N().L();
      }
   }

   private void L(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.HOTBAR).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean L(boolean var1) {
      switch ((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()) {
         case REPLACE_ZOOM:
         case BOTH:
            return false;
         default:
            return var1;
      }
   }

   private void L(class01054 var1, class02233 var2, Operation var3) {
      boolean flag = (Boolean)OkZoomerConfigManager.CONFIG.appearance.persistentInterface.value();
      boolean flag1 = (Boolean)OkZoomerConfigManager.CONFIG.appearance.hideCrosshair.value();
      if (!flag && !flag1 && Zoom.isTransitionActive()) {
         var1.i().popMatrix();
         var3.call(new Object[]{var1, var2});
         var1.i().pushMatrix();
         var1.i().translate(-(var1.N() / this.NX), -(var1.y() / this.NX));
         var1.i().scale(this.Na, this.Na);
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }

   private void L(class01054 var1, float var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int ix = var1.N();
         int jx = var1.y();
         var1.i().pushMatrix();
         float fx = class04995.B(var2, 2.0F, 1.0F);
         var1.i().translate(ix / 2.0F, jx / 2.0F);
         var1.i().scale(fx, fx);
         var1.i().translate(-ix / 2.0F, -jx / 2.0F);
         float f1 = 0.2F * var2;
         float f2 = 0.4F * var2;
         float f3 = 0.2F * var2;
         var1.N(class08394.NC, N, 0, 0, 0.0F, 0.0F, ix, jx, ix, jx, class02566.N(1.0F, f1, f2, f3));
         var1.i().popMatrix();
      }
   }

   public boolean L() {
      return this.Ns && this.Nm > 0;
   }

   public void L(class00392 var1) {
      this.Nd = var1;
      this.Nl = this.Nk + this.NY + this.NQ;
   }

   private int L(int var1) {
      return VisualSettings.INSTANCE.hideModernHUDElements.isEnabled() ? var1 + 7 : var1;
   }

   private void L(class01054 var1, class02233 var2) {
      this.NG.N(var1);
   }

   private void L(class01054 var1, class02233 var2, CallbackInfo var3) {
      class10995 class10995 = class10995.L();
      class11938.L().L(class10995);
      if (class10995.y()) {
         var3.cancel();
      }
   }

   private void M(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.DEMO_TIMER).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public class01590 M() {
      return (class01590)this.Nz.i_3;
   }

   private void M(class01054 var1, class02233 var2) {
      if (this.Nd != null && this.Nl > 0) {
         class01590 class01590 = this.M();
         class08700.N().N("titleAndSubtitle");
         float fx = this.Nl - var2.N(false);
         int ix = 255;
         if (this.Nl > this.NQ + this.NY) {
            float f1 = this.Nk + this.NY + this.NQ - fx;
            ix = (int)(f1 * 255.0F / this.Nk);
         }

         if (this.Nl <= this.NQ) {
            ix = (int)(fx * 255.0F / this.NQ);
         }

         ix = class04995.N(ix, 0, 255);
         if (ix > 0) {
            var1.L();
            var1.i().pushMatrix();
            var1.i().translate(var1.N() / 2, var1.y() / 2);
            var1.i().pushMatrix();
            var1.i().scale(4.0F, 4.0F);
            int lx = class01590.N(this.Nd);
            int jx = class02566.Z(ix);
            var1.N(class01590, this.Nd, -lx / 2, -10, lx, jx);
            var1.i().popMatrix();
            if (this.Nw != null) {
               var1.i().pushMatrix();
               var1.i().scale(2.0F, 2.0F);
               int kx = class01590.N(this.Nw);
               var1.N(class01590, this.Nw, -kx / 2, 5, kx, jx);
               var1.i().popMatrix();
            }

            var1.i().popMatrix();
         }

         class08700.N().L();
      }
   }

   private void M(class01054 var1) {
      int ix = var1.y();
      if (!i && (class04453)this.Nz.T_4 == null) {
         throw new AssertionError();
      } else {
         this.L = ix - (config.DOUBLE_HOTBAR ? 76 : 55);
         if (config.ABOVE_HEALTH_BAR && ((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541() < 180.0F) {
            int jx = (int)Math.ceil((((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541()) / 20.0F);
            int kx = 10 * jx - (jx > 2 ? (jx - 2) * (jx - 1) : 0);
            this.L -= kx;
            if (((class04453)this.Nz.T_4).method_68878()) {
               this.L += 16 + kx;
            } else if (config.DISABLE_ARMOR_BAR) {
               this.L += 10;
            }
         } else {
            if (((class04453)this.Nz.T_4).method_5669() < ((class04453)this.Nz.T_4).method_5748()
               || ((class04453)this.Nz.T_4).method_5869() && !((class04453)this.Nz.T_4).method_68878()) {
               this.L -= 10;
            }

            this.L = this.L + (((class04453)this.Nz.T_4).method_68878() ? 16 : 0);
            if (((class04453)this.Nz.T_4).method_5765() && this.P() != null) {
               this.t();
            }
         }
      }
   }

   @Nullable
   private class07438 P() {
      class08036 class08036 = this.m();
      if (class08036 != null) {
         class07049 class07049 = class08036.method_5854();
         if (class07049 == null) {
            return null;
         }

         if (class07049 instanceof class07438) {
            return (class07438)class07049;
         }
      }

      return null;
   }

   private void P(class01054 var1, class02233 var2) {
      if (this.Nz.E()) {
         class08700.N().N("demo");
         var1.L();
         Object object;
         if (((class03448)this.Nz.T_3).N() >= 120500L) {
            object = V;
         } else {
            object = class00392.N(
               "demo.remainingTime", class05018.N((int)(120500L - ((class03448)this.Nz.T_3).N()), ((class03448)this.Nz.T_3).method_54719().R())
            );
         }

         int ix = this.M().N((class05936)object);
         int jx = var1.N() - ix - 10;
         byte b0 = 5;
         var1.N(this.M(), (class00392)object, jx, 5, ix, -1);
         class08700.N().L();
      }
   }

   private void T() {
      class08337 class08337 = this.Nz.Na();
      boolean flag = class08337 != null && class08337.yk();
      this.NV = this.NK;
      this.NK = class04995.B(0.2F, this.NK, flag ? 1.0F : 0.0F);
   }

   private void T(class01054 var1, class02233 var2) {
      this.N(var1, var2, (Operation)(var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_332, net.minecraft.class_9779]");
         this.s((class01054)var1x[0], (class02233)var1x[1]);
         return (Void)null;
      }));
   }

   public class01056(class06202 var1) {
      super();
      this.NZ = class06069.u();
      this.y = 1.0F;
      this.Nb = class06584.E;
      this.Ne = Pair.of(class01069.field_59819, class08657.u);
      this.Nz = var1;
      this.Nj = new class06463(var1);
      this.Nn = new class04682(var1);
      this.NU = new class06451(var1);
      this.Nt = new class05006(var1, this);
      this.NG = new class06455(var1);
      this.Nv = new class05808(var1);
      this.NH = ImmutableMap.of(
         class01069.field_59819,
         (Supplier)() -> class08657.u,
         class01069.field_59820,
         (Supplier)() -> new class08643(var1),
         class01069.field_59821,
         (Supplier)() -> new class08685(var1),
         class01069.field_59822,
         (Supplier)() -> new class08662(var1)
      );
      this.N();
   }

   private void B(class01054 var1, class02233 var2) {
      if (!this.NU.i()) {
         class08844 class08844 = this.Nz.Nt();
         int ix = class04995.N(((class06220)this.Nz.L_2).y(class08844));
         int jx = class04995.N(((class06220)this.Nz.L_2).L(class08844));
         var1.L();
         this.NU.N(var1, this.M(), this.NE, ix, jx, false, false);
      }
   }

   public class04682 B() {
      return this.Nn;
   }

   private void B(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.SCOREBOARD).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public class05006 Z() {
      return this.Nt;
   }

   private void Z(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.OVERLAY_MESSAGE).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   private void Z(class01054 var1, class02233 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class06683 class06683 = ((class03448)this.Nz.T_3).method_8428();
         class00518 class00518x = null;
         class00502 class00502 = class06683.i(((class04453)this.Nz.T_4).method_5820());
         if (class00502 != null) {
            class01890 class01890 = class01890.N(class00502.P());
            if (class01890 != null) {
               class00518x = class06683.N(class01890);
            }
         }

         class00518 class00518x = class00518x != null ? class00518x : class06683.N(class01890.field_45157);
         if (class00518x != null) {
            var1.L();
            this.N(var1, class00518x);
         }
      }
   }

   private void i(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.BOSS_BAR).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public class06451 i() {
      return this.NU;
   }

   private void i(class01054 var1, class02233 var2) {
      if (((class04453)this.Nz.T_4).method_7297() > 0) {
         class08700.N().N("sleep");
         var1.L();
         float fx = ((class04453)this.Nz.T_4).method_7297();
         float f1 = fx / 100.0F;
         if (f1 > 1.0F) {
            f1 = 1.0F - (fx - 100.0F) / 10.0F;
         }

         int ix = (int)(220.0F * f1) << 24 | 1052704;
         var1.N(0, 0, var1.N(), var1.y(), ix);
         class08700.N().L();
      }
   }

   private void i(class01054 var1, class02233 var2, CallbackInfo var3) {
      SodiumExtraClientMod.onHudRender(var1, var2);
   }

   private boolean b() {
      return (Integer)((class04453)this.Nz.T_4).L_5 + 100 > ((class04453)this.Nz.T_4).field_6012;
   }

   private void b(class01054 var1, class02233 var2) {
      class05455 class05455 = ((class05630)this.Nz.i_7).NS();
      if (this.N(class05455, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_5498]");
         return ((class05455)var0[0]).N();
      })) {
         if (((class03443)this.Nz.T_2).U() != class07282.field_9219 || this.N((class07089)this.Nz.M_3)) {
            if (!((class05731)this.Nz.L_0).y(class06134.d)) {
               var1.L();
               byte b0 = 15;
               var1.N(class08394.Nx, R, (var1.N() - 15) / 2, (var1.y() - 15) / 2, 15, 15);
               if (((class05630)this.Nz.i_7).X().method_41753() == class01307.field_18152) {
                  float fx = ((class04453)this.Nz.T_4).method_7261(0.0F);
                  boolean flag = false;
                  if ((class07049)this.Nz.M_2 != null && (class07049)this.Nz.M_2 instanceof class07438 && fx >= 1.0F) {
                     flag = ((class04453)this.Nz.T_4).method_7279() > 5.0F;
                     flag &= ((class07049)this.Nz.M_2).method_5805();
                     class06543 class06543 = ((class04453)this.Nz.T_4).method_76694().method_58694(class02484.I);
                     flag &= class06543 == null || class06543.N((class04453)this.Nz.T_4, ((class07089)this.Nz.M_3).y());
                  }

                  int kx = var1.y() / 2 - 7 + 16;
                  int ix = var1.N() / 2 - 8;
                  if (flag) {
                     var1.N(class08394.Nx, M, ix, kx, 16, 16);
                  } else if (fx < 1.0F) {
                     int jx = (int)(fx * 17.0F);
                     var1.N(class08394.Nx, B, ix, kx, 16, 4);
                     var1.N(class08394.Nx, Z, 16, 4, 0, 0, ix, kx, jx, 4);
                  }
               }
            }
         }
      }
   }

   private void s(class01054 var1, class02233 var2) {
      if (!((class05096)this.Nz.v_3 instanceof class05850)) {
         if (!((class05630)this.Nz.i_7).NG) {
            this.N(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).u((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.y(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).U((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            var1.L();
            this.W(var1, var2);
            this.u(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).E((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.i(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).L((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
         }

         this.R(this, var1, var2, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
            ((class01056)var0[0]).i((class01054)var0[1], (class02233)var0[2]);
            return (Void)null;
         });
         if (!((class05630)this.Nz.i_7).NG) {
            this.M(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).P((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.B(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).Z((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.Z(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).R((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.z(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).M((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.U(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).B((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.E(this, var1, var2, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
               ((class01056)var0[0]).z((class01054)var0[1], (class02233)var0[2]);
               return (Void)null;
            });
            this.N(var1, (class05096)this.Nz.v_3 == null || ((class05096)this.Nz.v_3).method_73150());
         } else if ((class05096)this.Nz.v_3 != null && ((class05096)this.Nz.v_3).method_73150()) {
            this.N(var1, true);
         }

         this.N(var1, var2, null);
         this.i(var1, var2, null);
      }
   }

   private void s() {
      if (this.Nm > 0) {
         this.Nm--;
      }

      if (this.Nl > 0) {
         this.Nl--;
         if (this.Nl <= 0) {
            this.Nd = null;
            this.Nw = null;
         }
      }

      this.NE++;
      class07049 class07049 = this.Nz.F();
      if (class07049 != null) {
         this.N(class07049);
      }

      if ((class04453)this.Nz.T_4 != null) {
         class06584 class06584 = ((class04453)this.Nz.T_4).method_31548().y();
         if (class06584.R()) {
            this.NT = 0;
         } else if (this.Nb.R() || !class06584.N(this.Nb.B()) || !class06584.d().equals(this.Nb.d())) {
            this.NT = (int)(40.0 * ((class05630)this.Nz.i_7).K().method_41753());
         } else if (this.NT > 0) {
            this.NT--;
         }

         this.Nb = class06584;
      }

      this.NU.N();
   }

   private void m(class01054 var1, class02233 var2) {
      class08036 class08036 = this.m();
      if (class08036 != null) {
         class06584 class06584 = class08036.method_6079();
         class07070 class07070 = class08036.method_6068().N();
         int ix = var1.N() / 2;
         short short1 = 182;
         byte b0 = 91;
         var1.N(class08394.Na, E, ix - 91, var1.y() - 22, 182, 22);
         var1.N(class08394.Na, W, ix - 91 - 1 + class08036.method_31548().N() * 20, var1.y() - 22 - 1, 24, 23);
         if (!class06584.R()) {
            if (class07070 == class07070.field_6182) {
               var1.N(class08394.Na, m, ix - 91 - 29, var1.y() - 23, 29, 24);
            } else {
               var1.N(class08394.Na, P, ix + 91, var1.y() - 23, 29, 24);
            }
         }

         int jx = 1;

         for (int kx = 0; kx < 9; kx++) {
            int lx = ix - 90 + kx * 20 + 2;
            int i1 = var1.y() - 16 - 3;
            this.N(var1, lx, i1, var2, class08036, class08036.method_31548().method_5438(kx), jx++);
         }

         if (!class06584.R()) {
            int k1 = var1.y() - 16 - 3;
            if (class07070 == class07070.field_6182) {
               this.N(var1, ix - 91 - 26, k1, var2, class08036, class06584, jx++);
            } else {
               this.N(var1, ix + 91 + 10, k1, var2, class08036, class06584, jx++);
            }
         }

         if (((class05630)this.Nz.i_7).X().method_41753() == class01307.field_18153) {
            float fx = ((class04453)this.Nz.T_4).method_7261(0.0F);
            if (fx < 1.0F) {
               int l1 = var1.y() - 20;
               int i2 = ix + 91 + 6;
               if (class07070 == class07070.field_6183) {
                  i2 = ix - 91 - 22;
               }

               int j1 = (int)(fx * 19.0F);
               var1.N(class08394.Na, s, i2, l1, 18, 18);
               var1.N(class08394.Na, T, 18, 18, 0, 18 - j1, i2, l1 + 18 - j1, 18, j1);
            }
         }

         this.u(var1, var2, null);
      }
   }

   @Nullable
   private class08036 m() {
      class07049 class07049 = this.Nz.F();
      return class07049 instanceof class08036 ? (class08036)class07049 : null;
   }

   private void t() {
      if (!i && (class04453)this.Nz.T_4 == null) {
         throw new AssertionError();
      } else {
         if (this.P().method_5805()) {
            if (this.P().method_6063() > 21.0F) {
               if (config.BETTER_MOUNT_HUD && !((class04453)this.Nz.T_4).method_68878()) {
                  this.L -= 20;
               } else {
                  this.L = this.L - (((class04453)this.Nz.T_4).method_68878() ? 26 : 10);
               }
            } else if (config.BETTER_MOUNT_HUD && !((class04453)this.Nz.T_4).method_68878()) {
               this.L -= 10;
            } else if (((class04453)this.Nz.T_4).method_68878()) {
               this.L -= 16;
            }
         }
      }
   }

   private class01069 v() {
      boolean flag = ((class01683)((class04453)this.Nz.T_4).y_0).O().N();
      boolean flag1 = ((class04453)this.Nz.T_4).G() != null;
      boolean flag2 = ((class03443)this.Nz.T_2).R();
      if (flag) {
         if (flag1 && this.j()) {
            return class01069.field_59822;
         } else {
            return flag2 && this.b() ? class01069.field_59820 : class01069.field_59821;
         }
      } else if (flag1) {
         return class01069.field_59822;
      } else {
         return flag2 ? class01069.field_59820 : class01069.field_59819;
      }
   }

   private boolean j() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : ((class04453)this.Nz.T_4).P() > 0.0F || class01962.N(((class04453)this.Nz.T_4).G(), class07431::n, 0) > 0;
   }

   private void j(class01054 var1, class02233 var2) {
      this.L(var1, var2, (Operation)(var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_332, net.minecraft.class_9779]");
         this.b((class01054)var1x[0], (class02233)var1x[1]);
         return (Void)null;
      }));
   }

   private void U(class01054 var1, class02233 var2) {
      this.u(var1, var2, (Operation)(var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_332, net.minecraft.class_9779]");
         this.j((class01054)var1x[0], (class02233)var1x[1]);
         return (Void)null;
      }));
   }

   private void U(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.CHAT).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public class06455 U() {
      return this.NG;
   }

   private void z(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.TITLE_AND_SUBTITLE).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public void z() {
      this.Nt.N();
      this.NG.N();
      this.Nz.m().y();
      this.Nj.W();
      this.NU.N(true);
      this.u();
      this.N();
   }

   private void z(class01054 var1, class02233 var2) {
      class06683 class06683 = ((class03448)this.Nz.T_3).method_8428();
      class00518 class00518 = class06683.N(class01890.field_45156);
      if (!((class05630)this.Nz.i_7).q.R() || this.Nz.q() && ((class01683)((class04453)this.Nz.T_4).y_0).B().size() <= 1 && class00518 == null) {
         this.Nt.N(false);
      } else {
         this.Nt.N(true);
         var1.L();
         this.Nt.N(var1, var1.N(), class06683, class00518);
      }
   }

   private void u(class01054 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class07438 class07438 = this.P();
         if (class07438 != null) {
            int ix = this.N(class07438);
            if (ix != 0) {
               int jx = (int)Math.ceil(class07438.method_6032());
               class08700.N().y("mountHealth");
               int kx = var1.y() - 39;
               int lx = var1.N() / 2 + 91;
               int i1 = kx;

               for (byte b0 = 0; ix > 0; b0 += 20) {
                  int j1 = Math.min(ix, 10);
                  ix -= j1;

                  for (int k1 = 0; k1 < j1; k1++) {
                     int l1 = lx - k1 * 8 - 9;
                     var1.N(class08394.Na, O, l1, i1, 9, 9);
                     if (k1 * 2 + 1 + b0 < jx) {
                        var1.N(class08394.Na, g, l1, i1, 9, 9);
                     }

                     if (k1 * 2 + 1 + b0 == jx) {
                        var1.N(class08394.Na, I, l1, i1, 9, 9);
                     }
                  }

                  i1 -= 10;
               }
            }
         }
      }
   }

   private int u(int var1) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         class06202 class06202 = class06202.Nq();
         return class06202.Nt().P() - var1 - 9;
      } else {
         return var1;
      }
   }

   private void u(class01054 var1, class02233 var2, CallbackInfo var3) {
      if (config.ARMOR_HUD) {
         if (!i && (class04453)this.Nz.T_4 == null) {
            throw new AssertionError();
         } else {
            if (!this.u) {
               armorHud.getArmorAccessor().initialize((class04453)this.Nz.T_4);
               this.u = true;
            }

            this.R(var1);
            this.M(var1);
         }
      }
   }

   private void u(class01054 var1, class02233 var2, Operation var3) {
      if ((Boolean)OkZoomerConfigManager.CONFIG.appearance.hideCrosshair.value()) {
         ZoomUtils.setFadeModifier(1.0F - Zoom.getTransitionMode().getFade(class06202.Nq().NK().N(true)));
         var3.call(new Object[]{var1, var2});
         ZoomUtils.setFadeModifier(null);
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }

   private void u(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.STATUS_EFFECTS).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   private void u(class01054 var1, class02233 var2) {
      LocalBooleanRefImpl localbooleanrefimpl = new LocalBooleanRefImpl();
      localbooleanrefimpl.init(false);
      if (((class05630)this.Nz.i_7).P().method_41753()) {
         this.N(var1, this.Nz.F());
      }

      class04453 class04453 = (class04453)this.Nz.T_4;
      this.N(var1, var2, null, localbooleanrefimpl);
      float fx = var2.N();
      this.Nc = class04995.B(0.5F * fx, this.Nc, 1.125F);
      if (this.N(((class05630)this.Nz.i_7).NS().N(), localbooleanrefimpl)) {
         if (this.L(class04453.method_31550())) {
            this.N(var1, this.Nc);
         } else {
            this.Nc = 0.5F;

            for (class07085 class07085 : class07085.values()) {
               class06584 class06584 = class04453.method_6118(class07085);
               class08725 class08725 = class06584.method_58694(class02484.o);
               if (class08725 != null && class08725.y() == class07085 && class08725.i().isPresent()) {
                  this.N(var1, class08725.i().get().N((UnaryOperator<String>)(var0 -> "textures/" + var0 + ".png")), 1.0F);
               }
            }
         }
      }

      if (class04453.method_32312() > 0) {
         this.N(var1, q, class04453.method_32313());
      }

      float f1 = var2.N(false);
      float f2 = class04995.B(f1, (Float)class04453.i_0, (Float)class04453.B_3);
      float f3 = class04453.method_66279(class07047.Z, f1);
      if (f2 > 0.0F) {
         this.y(var1, f2);
      } else if (f3 > 0.0F) {
         float f4 = ((class05630)this.Nz.i_7).NY().method_41753().floatValue();
         if (f4 < 1.0F) {
            float f5 = f3 * (1.0F - f4);
            this.L(var1, f5);
         }
      }
   }

   public void u() {
      this.Nd = null;
      this.Nw = null;
      this.Nl = 0;
   }

   private void y(class04682 var1, class01054 var2, Operation var3, LocalRef var4) {
      this.y(var1, var2, var3, (class02233)var4.get());
   }

   private void y(class01056 var1, class01054 var2, Operation var3, LocalRef var4) {
      this.y(var1, var2, var3, (class02233)var4.get());
   }

   public void y(boolean var1) {
      this.Ns = var1;
   }

   private void y(class01054 var1) {
      class08700.N().N("selectedItemName");
      if (this.NT > 0 && !this.Nb.R()) {
         class05216 class05216 = class00392.i().y(this.Nb.d()).N(this.Nb.O().N());
         if (this.Nb.L(class02484.B)) {
            class05216.N(class06541.field_1056);
         }

         int ix = this.M().N(class05216);
         int jx = (var1.N() - ix) / 2;
         int kx = var1.y() - 59;
         kx = this.N(kx, var1);
         if (!((class03443)this.Nz.T_2).y()) {
            kx += 14;
         }

         int lx = (int)(this.NT * 256.0F / 10.0F);
         if (lx > 255) {
            lx = 255;
         }

         if (lx > 0) {
            var1.N(this.M(), (class00392)class05216, jx, kx, ix, class02566.Z(lx));
         }
      }

      class08700.N().L();
   }

   public void y(class01054 var1, class02233 var2) {
      if (((class05630)this.Nz.i_7).NG().method_41753() && (this.NK > 0.0F || this.NV > 0.0F)) {
         int ix = class04995.y(255.0F * class04995.N(class04995.B(var2.y(), this.NV, this.NK), 0.0F, 1.0F));
         if (ix > 0) {
            class01590 class01590 = this.M();
            int jx = class01590.N(e);
            int kx = class02566.R(ix, -1);
            int lx = var1.N() - jx - 5;
            int i1 = var1.y() - 9 - 5;
            var1.L();
            var1.N(class01590, e, lx, i1, jx, kx);
         }
      }
   }

   public void y(class01054 var1, float var2, CallbackInfo var3) {
      class10956 class10956 = class10956.L();
      class11938.L().L(class10956);
      if (class10956.y()) {
         var3.cancel();
      }
   }

   private void y(class01054 var1, float var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var2 < 1.0F) {
            var2 *= var2;
            var2 *= var2;
            var2 = var2 * 0.8F + 0.2F;
         }

         int ix = class02566.y(var2);
         class08388 class08388 = this.Nz.yU().N().N(class00869.iq.W());
         var1.N(class08394.Na, class08388, 0, 0, var1.N(), var1.y(), ix);
      }
   }

   private void y(class01054 var1, class02233 var2, Operation var3) {
      if (!(Boolean)OkZoomerConfigManager.CONFIG.appearance.persistentInterface.value() && Zoom.getTransitionMode().getActive()) {
         float fx = Zoom.getTransitionMode().applyZoom(1.0F, var2.N(true));
         this.NX = 2.0F / (1.0F / fx - 1.0F);
         this.Na = 1.0F / fx;
         var1.i().pushMatrix();
         var1.i().translate(-(var1.N() / this.NX), -(var1.y() / this.NX));
         var1.i().scale(this.Na, this.Na);
         var3.call(new Object[]{var1, var2});
         var1.i().popMatrix();
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }

   public void y(class01054 var1, class02233 var2, CallbackInfo var3) {
      class10979 class10979 = class10979.L();
      class11938.L().L(class10979);
      if (class10979.y()) {
         var3.cancel();
      }
   }

   private void y(class01054 var1, class07049 var2, CallbackInfo var3) {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      if (worldrenderingpipeline != null && !worldrenderingpipeline.shouldRenderVignette()) {
         var3.cancel();
      }
   }

   public void y() {
      if (this.Nq != null) {
         this.Nq.run();
         this.Nq = null;
      }
   }

   public void y(class00392 var1) {
      this.Nw = var1;
   }

   private void y(class04682 var1, class01054 var2, Operation var3, class02233 var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.SPECTATOR_TOOLTIP).render(var2, var4, (var2x, var3x) -> var3.call(new Object[]{var1, var2x}));
   }

   private void y(class01056 var1, class01054 var2, Operation var3, class02233 var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.HELD_ITEM_TOOLTIP).render(var2, var4, (var2x, var3x) -> var3.call(new Object[]{var1, var2x}));
   }

   private static int y(int var0, int var1, int var2) {
      return class04995.u((float)((var0 + var2) * 10) / var1);
   }

   private void y(class01054 var1, class08036 var2, int var3, int var4, CallbackInfo var5) {
      if (HUDOverlayHandler.INSTANCE != null) {
         HUDOverlayHandler.INSTANCE.onRenderFood(var1, var2, var3, var4);
      }
   }

   private void y(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.CROSSHAIR).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   private void E(class01054 var1, class02233 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.L(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         Collection<class07055> collection = ((class04453)this.Nz.T_4).method_6026();
         if (!collection.isEmpty() && ((class05096)this.Nz.v_3 == null || !((class05096)this.Nz.v_3).method_64507())) {
            int ix = 0;
            int jx = 0;

            for (class07055 class07055 : Ordering.natural().reverse().sortedCopy(collection)) {
               class03556<class07084> class03556 = class07055.L();
               if (class07055.B()) {
                  int kx = var1.N();
                  byte b0 = 1;
                  if (this.Nz.E()) {
                     b0 += 15;
                  }

                  if (class03556.N().z()) {
                     ix++;
                     kx -= 25 * ix;
                  } else {
                     jx++;
                     kx -= 25 * jx;
                     b0 += 26;
                  }

                  float fx = 1.0F;
                  if (class07055.R()) {
                     var1.N(class08394.Na, z, kx, b0, 24, 24);
                  } else {
                     var1.N(class08394.Na, U, kx, b0, 24, 24);
                     if (class07055.N(200)) {
                        int lx = class07055.u();
                        int i1 = 10 - lx / 20;
                        fx = class04995.N(lx / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                           + class04995.P(lx * (float) Math.PI / 5.0F) * class04995.N(i1 / 10.0F * 0.25F, 0.0F, 0.25F);
                        fx = class04995.N(fx, 0.0F, 1.0F);
                     }
                  }

                  var1.N(class08394.Na, N(class03556), kx + 3, b0 + 3, 18, 18, class02566.y(fx));
               }
            }
         }
      }
   }

   private void E(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.PLAYER_LIST).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public class06463 E() {
      return this.Nj;
   }

   private void N(int var1, class08036 var2, int var3, CallbackInfo var4) {
      if ((Boolean)VisualSettings.INSTANCE.removeBubblePopSound.getValue()) {
         var4.cancel();
      }
   }

   private void N(class07049 var1) {
      class07209 class07209 = class07209.method_49637(var1.method_23317(), var1.method_23320(), var1.method_23321());
      float fx = class03042.N(var1.method_73183().method_8597(), var1.method_73183().U(class07209));
      float f1 = class04995.N(1.0F - fx, 0.0F, 1.0F);
      this.y = this.y + (f1 - this.y) * 0.01F;
   }

   private static int N(int var0, boolean var1) {
      return var0 != 0 && var1 ? 1 : 0;
   }

   private void N(CallbackInfoReturnable var1) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         var1.setReturnValue(false);
      }
   }

   private boolean N(class05455 var1, Operation var2) {
      return VisualSettings.INSTANCE.alwaysRenderCrosshair.isEnabled() ? true : (Boolean)var2.call(new Object[]{var1});
   }

   private boolean N(class01054 var1, RenderPipeline var2, class01894 var3, int var4, int var5, int var6, int var7) {
      return !(Boolean)VisualSettings.INSTANCE.hideEmptyBubbleIcons.getValue();
   }

   private void N(class01054 var1, class08036 var2, int var3, int var4, int var5) {
      int ix = var2.method_5748();
      int jx = Math.clamp((long)var2.method_5669(), 0, ix);
      boolean flag = var2.method_5777(class01231.N);
      if (flag || jx < ix) {
         var4 = this.N(var3, var4);
         int kx = y(jx, ix, -2);
         int lx = y(jx, ix, 0);
         int i1 = 10 - y(jx, ix, N(jx, flag));
         boolean flag1 = kx != lx;
         if (!flag) {
            this.No = 0;
         }

         for (int j1 = 1; j1 <= 10; j1++) {
            int k1 = var5 - (j1 - 1) * 8 - 9;
            if (j1 <= kx) {
               byte b1 = 9;
               byte b0 = 9;
               var1.N(class08394.Na, k, this.u(k1), var4, b0, b1);
            } else if (flag1 && j1 == lx && flag) {
               byte b4 = 9;
               byte b3 = 9;
               var1.N(class08394.Na, Y, this.u(k1), var4, b3, b4);
               this.N(j1, var2, i1);
            } else if (j1 > 10 - i1) {
               int l1 = i1 == 10 && this.NE % 2 == 0 ? this.NZ.y(2) : 0;
               RenderPipeline renderpipeline1 = class08394.Na;
               class01894 class01894x = Q;
               int k2 = var4 + l1;
               int j2 = 9;
               byte b2 = 9;
               int i2 = k2;
               j2 = this.u(k1);
               class01894 class01894x = class01894x;
               RenderPipeline renderpipeline = renderpipeline1;
               if (this.N(var1, renderpipeline, class01894x, j2, i2, b2, j2)) {
                  var1.N(renderpipeline, class01894x, j2, i2, b2, j2);
               }
            }
         }
      }
   }

   private void N(class01054 var1, boolean var2) {
      if (var2) {
         this.Nq = () -> this.Nv.N(var1);
      } else {
         this.Nq = null;
         this.Nv.N(var1);
      }
   }

   public void N(class01054 var1) {
      this.Nj.N(var1);
   }

   private void N(class01054 var1, float var2, float var3, class08036 var4, class06584 var5) {
      if (!var5.R()) {
         var1.i().pushMatrix();
         var1.i().translate(var2, var3);
         var1.N(var4, var5, 0, 0, 1);
         var1.N((class01590)this.Nz.i_3, var5, 0, 0);
         var1.i().popMatrix();
      }
   }

   private void N(int var1, class08036 var2, int var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.No != var1) {
            float fx = 0.5F + 0.1F * Math.max(0, var3 - 3 + 1);
            float f1 = 1.0F + 0.1F * Math.max(0, var3 - 5 + 1);
            var2.method_5783(class04909.uP, fx, f1);
            this.No = var1;
         }
      }
   }

   private static void N(class01054 var0, class08036 var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      if (config.DISABLE_ARMOR_BAR) {
         var6.cancel();
      }
   }

   public int N(int var1, class01054 var2) {
      return var2.y() - 62;
   }

   private static void N(class01054 var0, class08036 var1, int var2, int var3, int var4, int var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int ix = var1.method_6096();
         if (ix > 0) {
            int jx = var2 - (var3 - 1) * var4 - 10;

            for (int kx = 0; kx < 10; kx++) {
               int lx = var5 + kx * 8;
               if (kx * 2 + 1 < ix) {
                  ArgsN3 argsn32 = ArgsN3.of(class08394.Na, v, lx, jx, 9, 9);
                  N(argsn32);
                  var0.N(argsn32.$0(), argsn32.$1(), argsn32.$2(), argsn32.$3(), argsn32.$4(), argsn32.$5());
               }

               if (kx * 2 + 1 == ix) {
                  ArgsN3 argsn3 = ArgsN3.of(class08394.Na, j, lx, jx, 9, 9);
                  N(argsn3);
                  var0.N(argsn3.$0(), argsn3.$1(), argsn3.$2(), argsn3.$3(), argsn3.$4(), argsn3.$5());
               }

               if (kx * 2 + 1 > ix) {
                  ArgsN3 argsn31 = ArgsN3.of(class08394.Na, b, lx, jx, 9, 9);
                  N(argsn31);
                  var0.N(argsn31.$0(), argsn31.$1(), argsn31.$2(), argsn31.$3(), argsn31.$4(), argsn31.$5());
               }
            }
         }
      }
   }

   private void N(class01054 var1, class01590 var2, int var3, Operation var4, LocalRef var5) {
      this.N(var1, var2, var3, var4, (class02233)var5.get());
   }

   private void N(class01056 var1, class01054 var2, Operation var3, LocalRef var4) {
      this.N(var1, var2, var3, (class02233)var4.get());
   }

   private void N(class01054 var1, class01064 var2, int var3, int var4, boolean var5, boolean var6, boolean var7) {
      var1.N(class08394.Na, var2.N(var5, var7, var6), var3, var4, 9, 9);
   }

   private void N(class01054 var1, class01894 var2, float var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int ix = class02566.y(var3);
         var1.N(class08394.Na, var2, 0, 0, 0.0F, 0.0F, var1.N(), var1.y(), var1.N(), var1.y(), ix);
      }
   }

   public void N(class01054 var1, class02233 var2) {
      this.y(var1, var2, (Operation)(var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_332, net.minecraft.class_9779]");
         this.T((class01054)var1x[0], (class02233)var1x[1]);
         return (Void)null;
      }));
   }

   private void N(class01054 var1, class08036 var2, int var3, int var4, int var5, int var6, float var7, int var8, int var9, int var10, boolean var11) {
      class01064 class01064 = class01064.N(var2);
      class05087 class05087 = var2.method_73183().method_8401();
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(class01064);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, null, localrefimpl);
      class01064 = (class01064)localrefimpl.dispose();
      boolean flag = class05087.U();
      int ix = class04995.L(var7 / 2.0);
      int jx = class04995.L(var10 / 2.0);
      int kx = ix * 2;

      for (int lx = ix + jx - 1; lx >= 0; lx--) {
         int i1 = lx / 10;
         int j1 = lx % 10;
         int k1 = var3 + j1 * 8;
         int l1 = var4 - i1 * var5;
         if (var8 + var10 <= 4) {
            l1 += this.NZ.y(2);
         }

         if (lx < ix && lx == var6) {
            l1 -= 2;
         }

         this.N(var1, class01064.field_33944, k1, l1, flag, var11, false);
         int i2 = lx * 2;
         if (lx >= ix) {
            int j2 = i2 - kx;
            if (j2 < var10) {
               boolean flag1 = j2 + 1 == var10;
               this.N(var1, class01064 == class01064.field_33947 ? class01064 : class01064.field_33948, k1, l1, flag, false, flag1);
            }
         }

         if (var11 && i2 < var9) {
            boolean flag2 = i2 + 1 == var9;
            this.N(var1, class01064, k1, l1, flag, true, flag2);
         }

         if (i2 < var8) {
            boolean flag3 = i2 + 1 == var8;
            this.N(var1, class01064, k1, l1, flag, false, flag3);
         }
      }

      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, null);
   }

   private static void N(Args var0) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         byte b0 = 80;
         var0.set(2, (Integer)var0.get(2) + 80 + 21);
         var0.set(3, (Integer)var0.get(3) + 10);
      }
   }

   private void N(class01054 var1, float var2) {
      float fx = Math.min(var1.N(), var1.y());
      float f1 = Math.min(var1.N() / fx, var1.y() / fx) * var2;
      int ix = class04995.y(fx * f1);
      int jx = class04995.y(fx * f1);
      int kx = (var1.N() - ix) / 2;
      int lx = (var1.y() - jx) / 2;
      int i1 = kx + ix;
      int j1 = lx + jx;
      var1.N(class08394.Na, o, kx, lx, 0.0F, 0.0F, ix, jx, ix, jx);
      var1.N(class08394.NH, 0, j1, var1.N(), var1.y(), -16777216);
      var1.N(class08394.NH, 0, 0, var1.N(), lx, -16777216);
      var1.N(class08394.NH, 0, lx, kx, j1, -16777216);
      var1.N(class08394.NH, i1, lx, var1.N(), j1, -16777216);
   }

   private void N(class07438 var1, CallbackInfoReturnable var2) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         var2.setReturnValue(1);
      }
   }

   private void N(CallbackInfo var1) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         var1.cancel();
      }
   }

   public void N() {
      this.Nk = 10;
      this.NY = 70;
      this.NQ = 20;
   }

   private void N(class04682 var1, class01054 var2, Operation var3, LocalRef var4) {
      this.N(var1, var2, var3, (class02233)var4.get());
   }

   private int N(int var1, int var2) {
      int ix = this.N(var1) - 1;
      return var2 - ix * 10;
   }

   private void N(class01054 var1, class08036 var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, null);
      int ix = var2.method_7344().N();

      for (int jx = 0; jx < 10; jx++) {
         int kx = var3;
         class01894 class01894xx;
         class01894 class01894x;
         class01894 class01894xx;
         if (var2.method_6059(class07047.T)) {
            class01894xx = n;
            class01894x = t;
            class01894xx = G;
         } else {
            class01894xx = l;
            class01894x = d;
            class01894xx = w;
         }

         if (var2.method_7344().u() <= 0.0F && this.NE % (ix * 3 + 1) == 0) {
            kx = var3 + (this.NZ.y(3) - 1);
         }

         int lx = var4 - jx * 8 - 9;
         var1.N(class08394.Na, class01894xx, lx, kx, 9, 9);
         if (jx * 2 + 1 < ix) {
            var1.N(class08394.Na, class01894xx, lx, kx, 9, 9);
         }

         if (jx * 2 + 1 == ix) {
            var1.N(class08394.Na, class01894x, lx, kx, 9, 9);
         }
      }

      this.y(var1, var2, var3, var4, null);
   }

   private void N(class08657 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.INFO_BAR).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   private void N(class01056 var1, class01054 var2, Operation var3, class02233 var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.MOUNT_HEALTH).render(var2, var4, (var2x, var3x) -> var3.call(new Object[]{var1, var2x}));
   }

   private void N(class01056 var1, class01054 var2, class08036 var3, int var4, int var5, int var6, Operation var7) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.AIR_BAR)
         .render(var2, this.Nz.NK(), (var6x, var7x) -> var7.call(new Object[]{var1, var6x, var3, var4, var5, var6}));
   }

   private void N(class01056 var1, class01054 var2, class08036 var3, int var4, int var5, Operation var6) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.FOOD_BAR)
         .render(var2, this.Nz.NK(), (var5x, var6x) -> var6.call(new Object[]{var1, var5x, var3, var4, var5}));
   }

   private void N(
      class01056 var1,
      class01054 var2,
      class08036 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      int var9,
      int var10,
      int var11,
      boolean var12,
      Operation var13
   ) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.HEALTH_BAR)
         .render(var2, this.Nz.NK(), (var12x, var13x) -> var13.call(new Object[]{var1, var12x, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12}));
   }

   private void N(class01054 var1, class08036 var2, int var3, int var4, int var5, int var6, Operation var7) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.ARMOR_BAR)
         .render(var1, this.Nz.NK(), (var6x, var7x) -> var7.call(new Object[]{var6x, var2, var3, var4, var5, var6}));
   }

   public void N(class00392 var1) {
      class05216 class05216 = class00392.N("record.nowPlaying", var1);
      this.N(class05216, true);
      this.Nz.NT().u(class05216);
   }

   private boolean N(@Nullable class07089 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.N() == class07113.field_1331) {
         return ((class06145)var1).L() instanceof class06237;
      } else if (var1.N() == class07113.field_1332) {
         class07209 class07209 = ((class06183)var1).u();
         class03448 class03448 = (class03448)this.Nz.T_3;
         return class03448.method_8320(class07209).N(class03448, class07209) != null;
      } else {
         return false;
      }
   }

   public void N(class00392 var1, boolean var2) {
      this.y(false);
      this.NW = var1;
      this.Nm = 60;
      this.NP = var2;
   }

   private void N(class01054 var1, class00518 var2) {
      class06683 class06683 = var2.y();
      class01762 class01762 = var2.N(class01759.L);
      class01048[] aclass01048 = class06683.N(var2).stream().filter(var0 -> !var0.N()).sorted(K).limit(15L).map(var3x -> {
         class00502 class00502 = class06683.i(var3x.L());
         class00392 class00392x = var3x.y();
         class05216 class05216x = class00502.N(class00502, class00392x);
         class05216 class05216x = var3x.N(class01762);
         int j3 = this.M().N(class05216x);
         return new class01048(class05216x, class05216x, j3);
      }).toArray(class01048[]::new);
      class00392 class00392 = var2.i();
      int ix = this.M().N(class00392);
      int jx = ix;
      int kx = this.M().y(": ");

      for (class01048 class01048x : aclass01048) {
         jx = Math.max(jx, this.M().N(class01048x.N()) + (class01048x.L() > 0 ? kx + class01048x.L() : 0));
      }

      int k2 = aclass01048.length;
      int l2 = k2 * 9;
      int i3 = var1.y() / 2 + l2 / 3;
      byte b0 = 3;
      int lx = var1.N() - jx - 3;
      int i1 = var1.N() - 3 + 2;
      int j1 = ((class05630)this.Nz.i_7).y(0.3F);
      int k1 = ((class05630)this.Nz.i_7).y(0.4F);
      int l1 = i3 - k2 * 9;
      var1.N(lx - 2, l1 - 9 - 1, i1, l1 - 1, k1);
      var1.N(lx - 2, l1 - 1, i1, i3, j1);
      var1.N(this.M(), class00392, lx + jx / 2 - ix / 2, l1 - 9, -1, false);

      for (int i2 = 0; i2 < k2; i2++) {
         class01048 class01048 = aclass01048[i2];
         int j2 = i3 - (k2 - i2) * 9;
         var1.N(this.M(), class01048.N(), lx, j2, -1, false);
         var1.N(this.M(), class01048.y(), i1 - class01048.L(), j2, -1, false);
      }
   }

   private void N(class01054 var1, class01590 var2, int var3, Operation var4, class02233 var5) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.EXPERIENCE_LEVEL).render(var1, var5, (var3x, var4x) -> var4.call(new Object[]{var3x, var2, var3}));
   }

   public void N(int var1, int var2, int var3) {
      if (var1 >= 0) {
         this.Nk = var1;
      }

      if (var2 >= 0) {
         this.NY = var2;
      }

      if (var3 >= 0) {
         this.NQ = var3;
      }

      if (this.Nl > 0) {
         this.Nl = this.Nk + this.NY + this.NQ;
      }
   }

   public static class01894 N(class03556<class07084> var0) {
      return var0.i().map(class05946::N).map(var0x -> var0x.R("mob_effect/")).orElseGet(class08923::L);
   }

   private void N(class04682 var1, class01054 var2, Operation var3, class02233 var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.SPECTATOR_MENU).render(var2, var4, (var2x, var3x) -> var3.call(new Object[]{var1, var2x}));
   }

   private void N(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.MISC_OVERLAYS).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public void N(class01054 var1, class02233 var2, CallbackInfo var3) {
      ((HudRenderCallback)HudRenderCallback.EVENT.invoker()).onHudRender(var1, var2);
   }

   private void N(
      class01054 var1, class08036 var2, int var3, int var4, int var5, int var6, float var7, int var8, int var9, int var10, boolean var11, CallbackInfo var12
   ) {
      if (HUDOverlayHandler.INSTANCE != null) {
         HUDOverlayHandler.INSTANCE.onRenderHealth(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   private void N(class01054 var1, class08036 var2, int var3, int var4, CallbackInfo var5) {
      if (HUDOverlayHandler.INSTANCE != null) {
         HUDOverlayHandler.INSTANCE.onPreRenderFood(var1, var2, var3, var4);
      }
   }

   public void N(class01054 var1, float var2, CallbackInfo var3) {
      class10956 class10956 = class10956.L();
      class11938.L().L(class10956);
      if (class10956.y()) {
         var3.cancel();
      }
   }

   private void N(
      class01054 var1,
      class08036 var2,
      int var3,
      int var4,
      int var5,
      int var6,
      float var7,
      int var8,
      int var9,
      int var10,
      boolean var11,
      CallbackInfo var12,
      LocalRef var13
   ) {
      class10994 class10994 = class10994.N((class01064)var13.get());
      class11938.L().L(class10994);
      var13.set(class10994.N());
   }

   public void N(class01054 var1, class01894 var2, float var3, CallbackInfo var4) {
      if (var2 == q) {
         class09338 class09338 = class09338.L();
         class11938.L().L(class09338);
         if (class09338.y()) {
            var4.cancel();
         }
      }
   }

   public void N(class01054 var1, class07049 var2, CallbackInfo var3) {
      class09338 class09338 = class09338.L();
      class11938.L().L(class09338);
      if (class09338.y()) {
         var3.cancel();
      }
   }

   private int N(int var1) {
      return (int)Math.ceil(var1 / 10.0);
   }

   public void N(class01054 var1, class02233 var2, Operation var3) {
      if (!((class05096)this.Nz.v_3 instanceof HudHideable)) {
         GLDebug.pushGroup(1000, "GUI");
         var3.call(new Object[]{var1, var2});
         GLDebug.popGroup();
      }
   }

   private int N(@Nullable class07438 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else if (var1 != null && var1.method_5709()) {
         int ix = (int)(var1.method_6063() + 0.5F) / 2;
         if (ix > 30) {
            ix = 30;
         }

         return ix;
      } else {
         return 0;
      }
   }

   public void N(boolean var1) {
      this.T();
      if (!var1) {
         this.s();
      }
   }

   private void N(class01054 var1, class02233 var2, CallbackInfo var3, LocalBooleanRef var4) {
      var4.set(false);
      if (Zoom.getZoomOverlay() != null) {
         ZoomOverlay zoomoverlay = Zoom.getZoomOverlay();
         zoomoverlay.tickBeforeRender(var2);
         if (zoomoverlay.getActive()) {
            var4.set(zoomoverlay.cancelOverlayRendering());
            zoomoverlay.renderOverlay(var1, var2, Zoom.getTransitionMode());
         }
      }
   }

   private boolean N(boolean var1, LocalBooleanRef var2) {
      return var1 && !var2.get();
   }

   private void N(class01054 var1, @Nullable class07049 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.N(var1, var2, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            class08057 class08057 = ((class03448)this.Nz.T_3).method_8621();
            float fx = 0.0F;
            if (var2 != null) {
               float f1 = (float)class08057.N(var2);
               double d0 = Math.min(class08057.s() * class08057.T(), Math.abs(class08057.U() - class08057.Z()));
               double d1 = Math.max((double)class08057.b(), d0);
               if (f1 < d1) {
                  fx = 1.0F - (float)(f1 / d1);
               }
            }

            int ix;
            if (fx > 0.0F) {
               fx = class04995.N(fx, 0.0F, 1.0F);
               ix = class02566.N(1.0F, 0.0F, fx, fx);
            } else {
               float f2 = this.y;
               f2 = class04995.N(f2, 0.0F, 1.0F);
               ix = class02566.N(1.0F, f2, f2, f2);
            }

            var1.N(class08394.NS, J, 0, 0, 0.0F, 0.0F, var1.N(), var1.y(), var1.N(), var1.y(), ix);
         }
      }
   }

   private void N(class01054 var1, int var2, int var3, class02233 var4, class08036 var5, class06584 var6, int var7) {
      if (!var6.R()) {
         float fx = var6.H() - var4.N(false);
         if (fx > 0.0F) {
            float f1 = 1.0F + fx / 5.0F;
            var1.i().pushMatrix();
            var1.i().translate(var2 + 8, var3 + 12);
            var1.i().scale(1.0F / f1, (f1 + 1.0F) / 2.0F);
            var1.i().translate(-(var2 + 8), -(var3 + 12));
         }

         var1.N(var5, var6, var2, var3, var7);
         if (fx > 0.0F) {
            var1.i().popMatrix();
         }

         var1.N((class01590)this.Nz.i_3, var6, var2, var3);
      }
   }

   private void W(class01054 var1, class02233 var2) {
      if (((class03443)this.Nz.T_2).U() == class07282.field_9219) {
         class04682 class04682x = this.Nn;
         Operation operation1 = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_365, net.minecraft.class_332]");
            ((class04682)var0[0]).N((class01054)var0[1]);
            return (Void)null;
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var2);
         this.N(class04682x, var1, operation1, localrefimpl);
         var2 = (class02233)localrefimpl.dispose();
      } else {
         this.L(this, var1, var2, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_329, net.minecraft.class_332, net.minecraft.class_9779]");
            ((class01056)var0[0]).m((class01054)var0[1], (class02233)var0[2]);
            return (Void)null;
         });
      }

      if (((class03443)this.Nz.T_2).y()) {
         this.L(var1);
      }

      Operation operation = var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_329, net.minecraft.class_332]");
         ((class01056)var0[0]).u((class01054)var0[1]);
         return (Void)null;
      };
      LocalRefImpl localrefimpl1 = new LocalRefImpl();
      localrefimpl1.init(var2);
      this.N(this, var1, operation, localrefimpl1);
      var2 = (class02233)localrefimpl1.dispose();
      class01069 class01069 = this.v();
      if (class01069 != this.Ne.getKey()) {
         this.Ne = Pair.of(class01069, this.NH.get(class01069).get());
      }

      class08657 class08657 = (class08657)this.Ne.getValue();
      this.N(class08657, var1, var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_11223, net.minecraft.class_332, net.minecraft.class_9779]");
         ((class08657)var0[0]).N((class01054)var0[1], (class02233)var0[2]);
         return (Void)null;
      });
      if (((class03443)this.Nz.T_2).R() && ((class04453)this.Nz.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
         class01590 class01590 = (class01590)this.Nz.i_3;
         int ix = ((class04453)this.Nz.T_4).fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
         class01590 class01590x = class01590;
         Operation operation2 = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_332, net.minecraft.class_327, int]");
            class08657.N((class01054)var0[0], (class01590)var0[1], (Integer)var0[2]);
            return (Void)null;
         };
         LocalRefImpl localrefimpl2 = new LocalRefImpl();
         localrefimpl2.init(var2);
         this.N(var1, class01590x, ix, operation2, localrefimpl2);
         var2 = (class02233)localrefimpl2.dispose();
      }

      ((class08657)this.Ne.getValue()).y(var1, var2);
      if (((class03443)this.Nz.T_2).U() != class07282.field_9219) {
         operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_329, net.minecraft.class_332]");
            ((class01056)var0[0]).y((class01054)var0[1]);
            return (Void)null;
         };
         LocalRefImpl localrefimpl3 = new LocalRefImpl();
         localrefimpl3.init(var2);
         this.y(this, var1, operation, localrefimpl3);
         var2 = (class02233)localrefimpl3.dispose();
      } else if (((class04453)this.Nz.T_4).method_7325()) {
         class04682 class04682 = this.Nn;
         operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_365, net.minecraft.class_332]");
            ((class04682)var0[0]).y((class01054)var0[1]);
            return (Void)null;
         };
         LocalRefImpl localrefimpl4 = new LocalRefImpl();
         localrefimpl4.init(var2);
         this.y(class04682, var1, operation, localrefimpl4);
         var2 = (class02233)localrefimpl4.dispose();
      }
   }

   public void W() {
      this.Nj.N();
   }

   private void R(class01054 var1, class02233 var2) {
      class01590 class01590 = this.M();
      if (this.NW != null && this.Nm > 0) {
         class08700.N().N("overlayMessage");
         float fx = this.Nm - var2.N(false);
         int ix = (int)(fx * 255.0F / 20.0F);
         if (ix > 255) {
            ix = 255;
         }

         if (ix > 0) {
            var1.L();
            var1.i().pushMatrix();
            var1.i().translate(var1.N() / 2, var1.y() - 68);
            int jx;
            if (this.NP) {
               jx = class04995.N(fx / 50.0F, 0.7F, 0.6F, ix);
            } else {
               jx = class02566.Z(ix);
            }

            int kx = class01590.N(this.NW);
            var1.N(class01590, this.NW, -kx / 2, -4, kx, jx);
            var1.i().popMatrix();
         }

         class08700.N().L();
      }
   }

   private void R(class01054 var1) {
      int ix = var1.N();
      if (!i && (class04453)this.Nz.T_4 == null) {
         throw new AssertionError();
      } else {
         boolean flag = config.RTL;
         ArmorAccessor armoraccessor = armorHud.getArmorAccessor();
         byte b0 = 14;
         byte b1 = 15;
         float fx = ix / 2.0F
            + (config.ABOVE_HEALTH_BAR && ((class04453)this.Nz.T_4).method_6063() + ((class04453)this.Nz.T_4).method_52541() < 180.0F ? -10 : 91);
         class07085[] aclass07085 = class07085.values();
         int jx = 0;
         if (config.TRIM_EMPTY_SLOTS) {
            for (int kx = 2; kx < 6; kx++) {
               if (((class04453)this.Nz.T_4).method_6118(aclass07085[kx]).R()) {
                  jx++;
               }
            }
         }

         float f1 = fx + 14.0F - 7 * jx + 2.0F;

         for (int lx = flag ? aclass07085.length - 1 : 0; flag ? lx >= 0 : lx < aclass07085.length; lx += flag ? -1 : 1) {
            class07085 class07085 = aclass07085[lx];
            if (!config.TRIM_EMPTY_SLOTS || class07085.N() != class07043.field_6178 || !((class04453)this.Nz.T_4).method_6118(class07085).R()) {
               f1 -= 15.0F;
               if (class07085.i()) {
                  this.N(var1, f1, this.L, (class04453)this.Nz.T_4, armoraccessor.getArmorPiece((class04453)this.Nz.T_4, class07085));
               }
            }
         }
      }
   }

   private void R(class01056 var1, class01054 var2, class02233 var3, Operation var4) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.SLEEP).render(var2, var3, (var2x, var3x) -> var4.call(new Object[]{var1, var2x, var3x}));
   }

   public int R() {
      return this.NE;
   }
}
