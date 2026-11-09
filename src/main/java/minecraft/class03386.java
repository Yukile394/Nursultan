package minecraft;

import Nursultan.Hands;
import Nursultan.class09081;
import Nursultan.class09222;
import Nursultan.class09315;
import Nursultan.class09321;
import Nursultan.class10956;
import Nursultan.class10967;
import Nursultan.class10975;
import Nursultan.class10982;
import Nursultan.class11068;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12027;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.FrameCounter;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.caffeinemc.mods.sodium.client.gui.console.ConsoleHooks;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterRender;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeRender;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.mixin.GameRendererAccessor;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN4;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

@Environment(EnvType.CLIENT)
public class class03386 implements class00007, AutoCloseable, FogStorage, GameRendererAccessor {
   private static final class01894 Z = class01894.y("blur");
   public static final int N = 10;
   private static final Logger z = LogUtils.getLogger();
   public static final float y = 0.05F;
   public static final float L = 100.0F;
   private static final float U = 20.0F;
   private static final float E = 7.0F;
   private final class06202 W;
   private final class06069 m = class06069.u();
   private float P;
   public final class03049 u;
   private final class01412 s;
   private final class01386 T;
   private float b;
   private float j;
   private float v;
   private float n;
   private float t;
   private float G;
   private boolean l = true;
   private long d;
   private boolean w;
   private long k = class07536.L();
   private final class03042 Y;
   private final class01384 Q = new class01384();
   @Nullable
   private class07604 O;
   protected final class03931 i = new class03931(class01894.y("textures/gui/title/background/panorama"));
   protected final class02966 R = new class02966(this.i);
   private final class02728 g = new class02728(3);
   private final class03394 I = new class03394();
   public final class08659 M;
   public final class08651 B;
   private final class05932 J = new class05932();
   private final class04790 o;
   private final class08133 q;
   @Nullable
   private class01894 K;
   private boolean V;
   private final class05363 e = new class05363();
   private final class01559 H = new class01559();
   private final class00059 c = new class00059();
   private final class00062 X = new class00062("level");
   private final class00046 a = new class00046("3d hud", 0.05F, 100.0F);
   private Matrix4fc p;
   private boolean F;
   private static boolean A;
   private static boolean f;

   public class08133 L() {
      return this.q;
   }

   public float L(float var1) {
      return class04995.B(var1, this.G, this.t);
   }

   private void L(CallbackInfo var1) {
      if (SodiumExtraClientMod.options().extraSettings.preventShaders) {
         var1.cancel();
      }
   }

   private void L(class02233 var1, boolean var2, CallbackInfo var3) {
      FrameCounter.getInstance().onFrame();
   }

   private float M(float var1) {
      class10956 class10956 = class10956.L();
      class11938.L().L(class10956);
      return class10956.y() ? 0.0F : var1;
   }

   public void M() {
      this.K = null;
      this.V = false;
   }

   public float P() {
      return this.P;
   }

   public class03042 T() {
      return this.Y;
   }

   public class03386(class06202 var1, class03049 var2, class01386 var3, class01999 var4) {
      super();
      this.W = var1;
      this.u = var2;
      this.Y = new class03042(this, var1);
      this.T = var3;
      this.B = new class08651();
      class01422 class01422 = var3.L();
      class08117 class08117 = var1.yW();
      this.o = new class04790();
      this.q = new class08133(this.o, var4, class01422, class08117, var3.i(), var3.u(), (class01590)var1.i_3);
      this.M = new class08659(
         this.B,
         class01422,
         this.o,
         this.q,
         List.of(
            new class08682(class01422, var1.Ng()),
            new class08648(class01422),
            new class08671(class01422),
            new class08664(class01422, class08117),
            new class08680(class01422, class08117),
            new class08674(class01422)
         )
      );
      this.s = new class01412(var1, class08117, class01422);
      this.N(var1, var2, var3, var4, null);
      this.y(var1, var2, var3, var4, null);
   }

   public void B() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.L(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.V = !this.V;
      }
   }

   public void Z() {
      class08086 class08086 = this.W.ym().N(Z, class02437.B);
      if (class08086 != null) {
         class08086.N(this.W.e(), this.g);
      }
   }

   private Matrix4f i(float var1) {
      float fx = Math.max(var1, (float)this.N(((class05630)this.W.i_7).Nw().method_41753().intValue()));
      return this.y(fx);
   }

   @Nullable
   public class07604 i() {
      return this.O;
   }

   public class01384 b() {
      return this.Q;
   }

   public class05363 s() {
      return this.e;
   }

   public class02966 n() {
      return this.R;
   }

   private void l() {
      if (!this.w && this.W.q()) {
         long ix = class07536.L();
         if (ix - this.d >= 1000L) {
            this.d = ix;
            class08337 class08337 = this.W.Na();
            if (class08337 != null && !class08337.NX()) {
               class08337.NG().ifPresent(var1x -> {
                  if (Files.isRegularFile(var1x)) {
                     this.w = true;
                  } else {
                     this.N(var1x);
                  }
               });
            }
         }
      }
   }

   private boolean d() {
      if (!this.l) {
         return false;
      } else {
         class07049 class07049 = this.W.F();
         boolean flag = class07049 instanceof class08036 && !((class05630)this.W.i_7).NG;
         if (flag && !((class08036)class07049).method_31549().i) {
            class06584 class06584 = ((class07438)class07049).method_6047();
            class07089 class07089 = (class07089)this.W.M_3;
            if (class07089 != null && class07089.N() == class07113.field_1332) {
               class07209 class07209 = ((class06183)class07089).u();
               class00500 class00500 = ((class03448)this.W.T_3).method_8320(class07209);
               if (((class03443)this.W.T_2).U() == class07282.field_9219) {
                  flag = class00500.N((class03448)this.W.T_3, class07209) != null;
               } else {
                  class06646 class06646 = new class06646((class03448)this.W.T_3, class07209, false);
                  class00751 class00751 = ((class03448)this.W.T_3).method_30349().L(class04227.Z);
                  flag = !class06584.R() && (class06584.y(class06646) || class06584.N(class06646));
               }
            }
         }

         return flag;
      }
   }

   public class06202 m() {
      return this.W;
   }

   private void t() {
      float fx;
      if (this.W.F() instanceof class04477 class04477) {
         class05630 class05630 = (class05630)this.W.i_7;
         boolean flag = class05630.NS().N();
         float f1 = class05630.NQ().method_41753().floatValue();
         fx = class04477.N(flag, f1);
      } else {
         fx = 1.0F;
      }

      this.n = this.v;
      this.v = this.v + (fx - this.v) * 0.5F;
      this.v = class04995.N(this.v, 0.1F, 1.5F);
   }

   public class01559 v() {
      return this.H;
   }

   public class00059 j() {
      return this.c;
   }

   @Nullable
   public class01894 U() {
      return this.K;
   }

   @Override
   public void close() {
      this.c.close();
      this.Y.close();
      this.Q.close();
      this.g.close();
      this.M.close();
      this.X.close();
      this.a.close();
      this.H.close();
      this.i.close();
      this.I.close();
      this.q.close();
   }

   public void z() {
      this.y(null);
      this.t();
      this.Y.y();
      class04453 class04453 = (class04453)this.W.T_4;
      if (this.W.F() == null) {
         this.W.N(class04453);
      }

      this.e.L();
      this.u.N();
      float fx = (Float)class04453.B_3;
      float f1 = class04453.method_66279(class07047.Z, 1.0F);
      if (!(fx > 0.0F) && !(f1 > 0.0F)) {
         this.j = 0.0F;
      } else {
         this.j = (fx * 20.0F + f1 * 7.0F) / (fx + f1);
         this.b = this.b + this.j;
      }

      if (((class03448)this.W.T_3).method_54719().Z()) {
         this.G = this.t;
         if (((class01056)this.W.i_6).U().L()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         this.s.N();
         class04643 class04643 = class08700.N();
         class04643.N("levelRenderer");
         ((class03063)this.W.B_2).N(this.e);
         class04643.L();
      }
   }

   private void u(float var1) {
      class06959 class06959 = this.J.N;
      class06959.L = this.e.Z();
      class06959.y = this.e.y();
      class06959.N = this.e.u();
      class06959.u = this.e.B().method_30950(var1);
      class06959.i = new Quaternionf(this.e.M());
   }

   public class05932 u() {
      return this.J;
   }

   private void y(class02233 var1, CallbackInfo var2) {
      this.F = Iris.isPackInUseQuick();
   }

   private void y(class05096 var1, class01054 var2, int var3, int var4, float var5, Operation var6) {
      if (class09222.i()) {
         var6.call(new Object[]{var1, var2, -1, -1, var5});
      } else {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      }
   }

   private void y(CallbackInfo var1) {
      boolean flag = Zoom.isZooming();
      if (flag || Zoom.isTransitionActive() || Zoom.isModifierActive() || Zoom.isOverlayActive()) {
         double d0 = flag ? Zoom.getZoomDivisor() : 1.0;
         Zoom.getTransitionMode().tick(flag, d0);
         if (Zoom.getMouseModifier() != null) {
            Zoom.getMouseModifier().tick(flag);
         }

         if (Zoom.getZoomOverlay() != null) {
            Zoom.getZoomOverlay().tick(flag, d0, Zoom.getTransitionMode());
         }
      }
   }

   private void y(class02233 var1, boolean var2, CallbackInfo var3) {
      if (class06202.Nq().NZ() == null || f) {
         class08700.N().N("sodium_console_overlay");
         int ix = (int)((class06220)this.W.L_2).y(this.W.Nt());
         int jx = (int)((class06220)this.W.L_2).L(this.W.Nt());
         ConsoleHooks.render(new class01054(this.W, this.B, ix, jx), GLFW.glfwGetTime());
         class08700.N().L();
         f = true;
      }
   }

   private boolean y(class07049 var1) {
      return var1.method_24828() && var1.method_5854() == null && var1.method_36455() >= 45.0F;
   }

   private void y(class01421 var1, float var2) {
      if (this.W.F() instanceof class04477 class04477) {
         class06602 class06602 = class04477.B();
         float fx = class06602.M(var2);
         float f1 = this.N(class06602.R(var2), var2);
         var1.N(class04995.m(fx * (float) Math.PI) * f1 * 0.5F, -Math.abs(class04995.P(fx * (float) Math.PI) * f1), 0.0F);
         var1.N(class02058.R.N(class04995.m(fx * (float) Math.PI) * f1 * 3.0F));
         var1.N(class02058.y.N(Math.abs(class04995.P(fx * (float) Math.PI - 0.2F) * f1) * 5.0F));
      }
   }

   private void y(class03386 var1, class01421 var2, float var3) {
      if (!this.F) {
         this.N(var2, var3);
      }
   }

   public Matrix4f y(float var1) {
      Matrix4f matrix4f = new Matrix4f();
      float f3 = var1 * (float) (Math.PI / 180.0);
      float f4 = (float)this.W.Nt().U() / this.W.Nt().E();
      float f2 = this.E();
      float f1 = 0.05F;
      float fx = f4;
      return matrix4f.perspective(f3, this.R(fx), f1, f2);
   }

   public void y(class02233 var1) {
      this.y(var1, null);
      float fx = var1.N(true);
      class04453 class04453 = (class04453)this.W.T_4;
      this.Y.N(1.0F);
      this.N(fx);
      class04643 class04643 = class08700.N();
      boolean flag = this.d();
      this.u(fx);
      this.P = ((class05630)this.W.i_7).Nh() * 16;
      class04643.N("matrices");
      float f1 = this.N(this.e, fx, true);
      Matrix4f matrix4f = this.y(f1);
      class01421 class01421 = new class01421();
      float f8 = this.e.b();
      class01421 class01421x = this.N(class01421);
      this.y(this, class01421x, f8);
      if (((class05630)this.W.i_7).Ns().method_41753()) {
         float f9 = this.e.b();
         this.N(this, class01421, f9);
      }

      matrix4f.mul(class01421.L().N());
      Double d0 = ((class05630)this.W.i_7).NY().method_41753();
      float f2 = this.N(d0);
      float f3 = class04995.B(fx, (Float)class04453.i_0, (Float)class04453.B_3);
      float f4 = class04453.method_66279(class07047.Z, fx);
      f4 = this.M(f4);
      float f5 = Math.max(f3, f4) * (f2 * f2);
      if (f5 > 0.0F) {
         float f6 = 5.0F / (f5 * f5 + 5.0F) - f5 * 0.04F;
         f6 *= f6;
         Vector3f vector3f = new Vector3f(0.0F, class04995.M / 2.0F, class04995.M / 2.0F);
         float f7 = (this.b + fx * this.j) * (float) (Math.PI / 180.0);
         matrix4f.rotate(f7, vector3f);
         matrix4f.scale(1.0F / f6, 1.0F, 1.0F);
         matrix4f.rotate(-f7, vector3f);
      }

      RenderSystem.setProjectionMatrix(this.X.N(matrix4f), class00312.field_54953);
      Quaternionf quaternionf = this.e.M().conjugate(new Quaternionf());
      Matrix4f matrix4f2 = new Matrix4f();
      Matrix4f matrix4f1 = this.N(matrix4f2, quaternionf, var1);
      class04643.y("fog");
      Vector4f vector4f = this.I.N(this.e, ((class05630)this.W.i_7).Nh(), var1, this.L(fx), (class03448)this.W.T_3);
      GpuBufferSlice gpubufferslice = this.I.N(class03396.field_60102);
      class04643.y("level");
      boolean flag1 = ((class01056)this.W.i_6).U().u();
      ((class03063)this.W.B_2).N(this.g, var1, flag, this.e, matrix4f1, matrix4f, this.i(f1), gpubufferslice, vector4f, !flag1);
      this.N(var1, null, matrix4f, matrix4f1, class01421);
      class04643.y("hand");
      boolean flag2 = this.W.F() instanceof class07438 && ((class07438)this.W.F()).method_6113();
      RenderSystem.setProjectionMatrix(this.a.y(this.W.Nt().U(), this.W.Nt().E(), this.N(this.e, fx, false)), class00312.field_54953);
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.W.e().i(), 1.0);
      this.N(fx, flag2, matrix4f1);
      class04643.y("screenEffects");
      class01422 class01422 = this.T.L();
      this.s.N(flag2, fx, this.o);
      this.q.N();
      class01422.u();
      class04643.L();
      RenderSystem.setShaderFog(this.I.N(class03396.field_60101));
      if (((class05731)this.W.L_0).y(class06134.d) && ((class05630)this.W.i_7).NS().N() && !((class05630)this.W.i_7).NG) {
         class06463 class06463x = this.W.ND();
         class05363 class05363 = this.e;
         class06463 class06463x = class06463x;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_340, net.minecraft.class_4184]");
            ((class06463)var0[0]).N((class05363)var0[1]);
            return (Void)null;
         };
         LocalFloatRefImpl localfloatrefimpl = new LocalFloatRefImpl();
         localfloatrefimpl.init(fx);
         this.N(class06463x, class05363, operation, localfloatrefimpl);
         fx = localfloatrefimpl.dispose();
      }

      this.N(var1, null);
   }

   public class04790 y() {
      return this.o;
   }

   private void y(class06202 var1, class03049 var2, class01386 var3, class01999 var4, CallbackInfo var5) {
      Iris.logger.info("Hardware information:");
      Iris.logger.info("CPU: " + GLX._getCpuInfo());
      Iris.logger.info("GPU: " + RenderSystem.getDevice().getRenderer() + " (Supports OpenGL " + RenderSystem.getDevice().getVersion() + ")");
      Iris.logger.info("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.version") + ")");
   }

   public float E() {
      return Math.max(this.P * 4.0F, (float)(((class05630)this.W.i_7).E().method_41753() * 16));
   }

   private void N(class03386 var1, class01421 var2, float var3) {
      if (!this.F) {
         this.y(var2, var3);
      }
   }

   private Matrix4f N(Matrix4f var1, Quaternionfc var2, class02233 var3) {
      if (!this.F) {
         var1.rotation(var2);
         return var1;
      } else {
         class01421 class01421 = new class01421();
         class01421.L().N().set(var1);
         float fx = this.e.b();
         this.N(class01421, fx);
         if (((class05630)this.W.i_7).Ns().method_41753()) {
            this.y(class01421, fx);
         }

         var1.set(class01421.L().N());
         class04453 class04453 = (class04453)this.W.T_4;
         float f1 = var3.N(false);
         float f2 = ((class05630)this.W.i_7).NY().method_41753().floatValue();
         float f3 = class04995.B(f1, (Float)class04453.i_0, (Float)class04453.B_3);
         float f4 = class04453.method_66279(class07047.Z, f1);
         float f5 = Math.max(f3, f4) * f2 * f2;
         if (f5 > 0.0F) {
            float f6 = 5.0F / (f5 * f5 + 5.0F) - f5 * 0.04F;
            f6 *= f6;
            Vector3f vector3f = new Vector3f(0.0F, class04995.M / 2.0F, class04995.M / 2.0F);
            float f7 = (this.b + f1 * this.j) * (float) (Math.PI / 180.0);
            var1.rotate(f7, vector3f);
            var1.scale(1.0F / f6, 1.0F, 1.0F);
            var1.rotate(-f7, vector3f);
         }

         var1.rotate(var2);
         return var1;
      }
   }

   private void N(class01421 var1, float var2, CallbackInfo var3) {
      class09315 class09315 = class09315.L();
      class11938.L().L(class09315);
      if (class09315.y()) {
         var3.cancel();
      }
   }

   public void N(CallbackInfo var1) {
      class11938.L().L(class10975.N());
   }

   private float N(Double var1) {
      return this.F ? 0.0F : var1.floatValue();
   }

   private void N(class02233 var1, CallbackInfo var2) {
      Iris.getPipelineManager().getPipeline().ifPresent(WorldRenderingPipeline::finalizeGameRendering);
   }

   private class01421 N(class01421 var1) {
      if (!this.F) {
         return var1;
      } else {
         var1.N();
         var1.L().N().identity();
         return var1;
      }
   }

   private static void N(class07438 var0, float var1, CallbackInfoReturnable var2) {
      if (var0.method_6112(class07047.s) == null) {
         var2.setReturnValue(0.0F);
      }
   }

   private class07089 N(class07089 var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         class07049 class07049 = this.W.F();
         if (var1.N() != class07113.field_1333) {
            return var1;
         } else if (!this.y(class07049)) {
            return var1;
         } else {
            int ix = class04995.N(class07049.method_23317());
            int jx = class04995.N(class07049.method_23318() - 0.2F);
            int kx = class04995.N(class07049.method_23321());
            class07209 class07209 = new class07209(ix, jx, kx);
            return new class06183(class07209.method_46558(), class07049.method_5735(), class07209, false);
         }
      } else {
         return var1;
      }
   }

   private void N(class01894 var1, CallbackInfo var2) {
      if (SodiumExtraClientMod.options().extraSettings.preventShaders) {
         var2.cancel();
      }
   }

   private void N(class06463 var1, class05363 var2, Operation var3, float var4) {
      if (!Zoom.isTransitionActive()) {
         var3.call(new Object[]{var1, var2});
      } else {
         A = true;
         GpuBufferSlice gpubufferslice = RenderSystem.getProjectionMatrixBuffer();
         class00312 class00312 = RenderSystem.getProjectionType();
         RenderSystem.setProjectionMatrix(this.a.y(this.W.Nt().U(), this.W.Nt().E(), this.N(var2, var4, false)), class00312.field_54953);
         var3.call(new Object[]{var1, var2});
         A = false;
         RenderSystem.setProjectionMatrix(gpubufferslice, class00312);
      }
   }

   private void N(class06463 var1, class05363 var2, Operation var3, LocalFloatRef var4) {
      this.N(var1, var2, var3, var4.get());
   }

   private int N(int var1) {
      return Zoom.isZooming() && ZoomUtils.hasSmartOcclusion() ? class04995.R(var1, Math.max(1, class04995.N(Zoom.getZoomDivisor()))) : var1;
   }

   private void N(class03049 var1, float var2, class01421 var3, class01237 var4, class04453 var5, int var6, Operation var7) {
      Hands hands = class11938.u().S();
      if (!hands.m()) {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      } else {
         class11068 class11068 = this.a;
         hands.N(var1, var2, var3, var5, var6, class11068.N(class11068.N(), class11068.L(), class11068.y()));
      }
   }

   private void N(class02233 var1, CallbackInfo var2, Matrix4f var3, Matrix4f var4, class01421 var5) {
      class05363 class05363 = ((class03386)this.W.i_5).s();
      class09321 class09321 = class09321.N(var3, var4, var1, class05363, var5);
      class11925.N(((class03063)this.W.B_2).N(var4, var3, class05363.y()));

      try (class12027 class12027 = class12027.y()) {
         class11938.L().L(class09321);
      }
   }

   private void N(class02233 var1, boolean var2, CallbackInfo var3, class01054 var4) {
      var4.L();
      this.M.N(this.I.N(class03396.field_60101));
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.W.e().i(), 1.0);
      class11925.N();
      class09081.N(RenderSystem.getProjectionMatrixBuffer());

      try (class12027 class12027x = class12027.y()) {
         class11938.L().L(class10967.N(var4, var1));
      }

      ((class03386)this.W.i_5).M.N(this.I.N(class03396.field_60101));
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.W.e().i(), 1.0);

      try (class12027 class12027 = class12027.y()) {
         class11938.L().L(class10982.N(var4, var1));
      }

      class09081.N();
      class11925.i();
   }

   private float N(float var1, float var2, boolean var3) {
      return Zoom.isTransitionActive() && !A && (var3 || OkZoomerConfigManager.CONFIG.appearance.zoomHands.value())
         ? Zoom.getTransitionMode().applyZoom(var1, var2)
         : var1;
   }

   private float N(float var1, float var2) {
      return Zoom.isZooming() && OkZoomerConfigManager.CONFIG.appearance.reduceViewBobbing.value() ? Zoom.getTransitionMode().applyZoom(var1, var2) : var1;
   }

   private void N(Path var1) {
      if (((class03063)this.W.B_2).d() > 10 && ((class03063)this.W.B_2).w()) {
         class05628.N(this.W.e(), var1x -> class07536.Z().execute(() -> {
            int ix = var1x.N();
            int jx = var1x.y();
            int kx = 0;
            int lx = 0;
            if (ix > jx) {
               kx = (ix - jx) / 2;
               ix = jx;
            } else {
               lx = (jx - ix) / 2;
               jx = ix;
            }

            try (class08280 class08280 = new class08280(64, 64, false)) {
               var1x.N(kx, lx, ix, jx, class08280);
               class08280.N(var1);
            } catch (IOException ioexception) {
               z.warn("Couldn't save auto screenshot", ioexception);
            } finally {
               var1x.close();
            }
         }));
      }
   }

   public void N(class02233 var1, boolean var2) {
      this.N(var1, var2, null);
      this.N(null);
      this.L(var1, var2, null);
      if (!this.W.y() && ((class05630)this.W.i_7).m && (!((class05630)this.W.i_7).Nm().method_41753() || !((class06220)this.W.L_2).u())) {
         if (class07536.L() - this.k > 500L) {
            this.W.N(false);
         }
      } else {
         this.k = class07536.L();
      }

      if (!(Boolean)this.W.v_2) {
         class04643 class04643 = class08700.N();
         class04643.N("camera");
         this.N(var1);
         class04643.L();
         class00059 class00059 = this.c;
         ArgsN4 argsn4 = ArgsN4.of(
            this.W.Nt().U(),
            this.W.Nt().E(),
            ((class05630)this.W.i_7).NI().method_41753(),
            (class03448)this.W.T_3 == null ? 0L : ((class03448)this.W.T_3).N(),
            var1,
            ((class05630)this.W.i_7).l(),
            this.e,
            ((class05630)this.W.i_7).c().method_41753() == class06532.field_64664
         );
         this.N(argsn4);
         class00059.N(argsn4.$0(), argsn4.$1(), argsn4.$2(), argsn4.$3(), argsn4.$4(), argsn4.$5(), argsn4.$6(), argsn4.$7());
         boolean flag = this.W.yu();
         int ix = (int)((class06220)this.W.L_2).y(this.W.Nt());
         int jx = (int)((class06220)this.W.L_2).L(this.W.Nt());
         if (flag && var2 && (class03448)this.W.T_3 != null) {
            class04643.N("world");
            this.y(var1);
            this.l();
            ((class03063)this.W.B_2).y();
            if (this.K != null && this.V) {
               class08086 class08086 = this.W.ym().N(this.K, class02437.B);
               if (class08086 != null) {
                  class08086.N(this.W.e(), this.g);
               }
            }

            class04643.L();
         }

         this.I.N();
         class08066 class08066 = this.W.e();
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(class08066.i(), 1.0);
         ((class03386)this.W.i_5).v().N(class01540.field_60027);
         this.B.i();
         class04643.N("guiExtraction");
         class01054 class01054 = new class01054(this.W, this.B, ix, jx);
         if (flag && var2 && (class03448)this.W.T_3 != null) {
            ((class01056)this.W.i_6).N(class01054, var1);
            this.N(var1, var2, null, class01054);
         }

         if (this.W.NZ() != null) {
            try {
               this.W.NZ().method_25394(class01054, ix, jx, var1.N());
            } catch (Throwable throwable2) {
               class07080 class07080xx = class07080.N(throwable2, "Rendering overlay");
               class07074 class07074x = class07080xx.N("Overlay render details");
               class07074x.N("Overlay name", () -> this.W.NZ().getClass().getCanonicalName());
               throw new class07878(class07080xx);
            }
         } else if (flag && (class05096)this.W.v_3 != null) {
            try {
               class05096 class05096 = (class05096)this.W.v_3;
               float fx = var1.N();
               class05096 class05096x = class05096;
               Operation operation = var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 5, "[net.minecraft.class_437, net.minecraft.class_332, int, int, float]");
                  ((class05096)var0[0]).method_47413((class01054)var0[1], (Integer)var0[2], (Integer)var0[3], (Float)var0[4]);
                  return (Void)null;
               };
               this.y(class05096x, class01054, ix, jx, fx, var2x -> {
                  WrapOperationRuntime.checkArgumentCount(var2x, 5, "[net.minecraft.class_437, net.minecraft.class_332, int, int, float]");
                  this.N((class05096)var2x[0], (class01054)var2x[1], (Integer)var2x[2], (Integer)var2x[3], (Float)var2x[4], operation);
                  return (Void)null;
               });
            } catch (Throwable throwable1) {
               class07080 class07080x = class07080.N(throwable1, "Rendering screen");
               class07074 class07074xx = class07080x.N("Screen render details");
               class07074xx.N("Screen name", () -> ((class05096)this.W.v_3).getClass().getCanonicalName());
               ((class06220)this.W.L_2).N(class07074xx, this.W.Nt());
               throw new class07878(class07080x);
            }

            if (class07529.NU) {
               ((class06220)this.W.L_2).N((class01590)this.W.i_3, class01054);
            }

            try {
               if ((class05096)this.W.v_3 != null) {
                  ((class05096)this.W.v_3).method_37071();
               }
            } catch (Throwable throwable) {
               class07080 class07080 = class07080.N(throwable, "Narrating screen");
               class07074 class07074 = class07080.N("Screen details");
               class07074.N("Screen name", () -> ((class05096)this.W.v_3).getClass().getCanonicalName());
               throw new class07878(class07080);
            }
         }

         if (flag && var2 && (class03448)this.W.T_3 != null) {
            ((class01056)this.W.i_6).y(class01054, var1);
         }

         if (flag) {
            try (class08694 class08694 = class04643.i("toasts")) {
               this.W.m().N(class01054);
            }
         }

         if (!((class05096)this.W.v_3 instanceof class04589)) {
            ((class01056)this.W.i_6).N(class01054);
         }

         ((class01056)this.W.i_6).y();
         if (class07529.NT) {
            this.G();
         }

         class04643.y("guiRendering");
         class08659 class08659 = this.M;
         GpuBufferSlice gpubufferslice = this.I.N(class03396.field_60101);
         this.y(var1, var2, null);
         class08659.N(gpubufferslice);
         this.M.N();
         class04643.L();
         class01054.N(this.W.Nt());
         this.o.y();
         this.q.y();
         this.g.N();
      }
   }

   public static float N(class07438 var0, float var1) {
      class07055 class07055 = var0.method_6112(class07047.s);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueF();
      } else {
         return !class07055.N(200) ? 1.0F : 0.7F + class04995.m((class07055.u() - var1) * (float) Math.PI * 0.2F) * 0.3F;
      }
   }

   private void N(float var1, boolean var2, Matrix4f var3) {
      if (!this.R()) {
         this.q.N();
         this.T.L().u();
         class01421 class01421 = new class01421();
         class01421.N();
         class01421.N(var3.invert(new Matrix4f()));
         Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
         matrix4fstack.pushMatrix().mul(var3);
         this.N(class01421, var1);
         if (((class05630)this.W.i_7).Ns().method_41753()) {
            this.y(class01421, var1);
         }

         if (((class05630)this.W.i_7).NS().N() && !var2 && !((class05630)this.W.i_7).NG && ((class03443)this.W.T_2).U() != class07282.field_9219) {
            class03049 class03049 = this.u;
            class04790 class04790 = ((class03386)this.W.i_5).y();
            class04453 class04453 = (class04453)this.W.T_4;
            int ix = this.W.Ng().N((class04453)this.W.T_4, var1);
            class04453 class04453x = class04453;
            class04790 class04790x = class04790;
            class03049 class03049x = class03049;
            this.N(
               class03049x,
               var1,
               class01421,
               class04790x,
               class04453x,
               ix,
               var1x -> {
                  WrapOperationRuntime.checkArgumentCount(
                     var1x, 6, "[net.minecraft.class_759, float, net.minecraft.class_4587, net.minecraft.class_11659, net.minecraft.class_746, int]"
                  );
                  this.N((class03049)var1x[0], (Float)var1x[1], (class01421)var1x[2], (class01237)var1x[3], (class04453)var1x[4], (Integer)var1x[5]);
                  return (Void)null;
               }
            );
         }

         matrix4fstack.popMatrix();
         class01421.y();
      }
   }

   public void N(class02233 var1) {
      float fx = var1.N(true);
      class04453 class04453 = (class04453)this.W.T_4;
      if (class04453 != null && (class03448)this.W.T_3 != null) {
         if (this.W.F() == null) {
            this.W.N(class04453);
         }

         Object object = this.W.F() == null ? class04453 : this.W.F();
         float f1 = ((class03448)this.W.T_3).method_54719().N((class07049)object) ? 1.0F : fx;
         this.e.N((class03448)this.W.T_3, (class07049)object, !((class05630)this.W.i_7).NS().N(), ((class05630)this.W.i_7).NS().y(), f1);
      }
   }

   public void N(class06584 var1) {
      this.s.N(var1, this.m);
   }

   @Override
   public class06889 N(class06889 var1) {
      Matrix4f matrix4f = this.y(this.N(this.e, 0.0F, true));
      Quaternionf quaternionf = this.e.M().conjugate(new Quaternionf());
      Matrix4f matrix4f1 = new Matrix4f().rotation(quaternionf);
      Matrix4f matrix4f2 = matrix4f.mul(matrix4f1);
      class06889 class06889x = this.e.y();
      class06889 class06889x = var1.u(class06889x);
      Vector3f vector3f = matrix4f2.transformProject(class06889x.W());
      return new class06889(vector3f);
   }

   public void N(int var1, int var2) {
      this.g.y();
      ((class03063)this.W.B_2).N(var1, var2);
   }

   public void N(class02857 var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      class07607 class07607 = (var1x, var2x) -> {
         class01894 class01894 = var2x.idConverter().N(var1x);

         try {
            String sx;
            try (BufferedReader bufferedreader = var1.L(class01894).method_43039()) {
               sx = IOUtils.toString(bufferedreader);
            }

            return sx;
         } catch (IOException ioexception) {
            z.error("Coudln't preload {} shader {}: {}", new Object[]{var2x, var1x, ioexception});
            return null;
         }
      };
      gpudevice.precompilePipeline(class08394.NH, class07607);
      gpudevice.precompilePipeline(class08394.Na, class07607);
      if (TracyClient.isAvailable()) {
         gpudevice.precompilePipeline(class08394.Nr, class07607);
      }
   }

   private void N(class01894 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.K = var1;
         this.V = true;
      }
   }

   public void N(@Nullable class07049 var1) {
      switch (var1) {
         case class07550 class07550:
            this.N(class01894.y("creeper"));
            break;
         case class07141 class07141:
            this.N(class01894.y("spider"));
            break;
         case class07525 class07525:
            this.N(class01894.y("invert"));
            break;
         case null:
         default:
            this.M();
      }
   }

   public void N(float var1) {
      class07049 class07049 = this.W.F();
      if (class07049 != null) {
         if ((class03448)this.W.T_3 != null && (class04453)this.W.T_4 != null) {
            class08700.N().N("pick");
            this.W.M_3 = this.N(((class04453)this.W.T_4).N(var1, class07049));
            class07089 class07089 = (class07089)this.W.M_3;
            this.W.M_2 = class07089 instanceof class06145 ? ((class06145)class07089).L() : null;
            class08700.N().L();
         }
      }
   }

   private float N(class05363 var1, float var2, boolean var3) {
      if (this.R()) {
         return 90.0F;
      } else {
         float fx = 70.0F;
         if (var3) {
            fx = ((class05630)this.W.i_7).Nw().method_41753().intValue();
            fx *= class04995.B(var2, this.n, this.v);
         }

         if (var1.B() instanceof class07438 class07438 && class07438.method_29504()) {
            float f1 = Math.min(class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue() + var2, 20.0F);
            fx /= (1.0F - 500.0F / (f1 + 500.0F)) * 2.0F + 1.0F;
         }

         class04798 class04798 = var1.W();
         if (class04798 == class04798.field_27885 || class04798 == class04798.field_27886) {
            float f2 = ((class05630)this.W.i_7).NQ().method_41753().floatValue();
            fx *= class04995.B(f2, 1.0F, 0.85714287F);
         }

         return this.N(fx, var2, var3);
      }
   }

   private void N(class01421 var1, float var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.W.F() instanceof class07438 class07438) {
            float f2 = class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_0.intValue() - var2;
            if (class07438.method_29504()) {
               float fx = Math.min(class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue() + var2, 20.0F);
               var1.N(class02058.R.N(40.0F - 8000.0F / (fx + 200.0F)));
            }

            if (f2 < 0.0F) {
               return;
            }

            f2 /= class07438.fields_2212a028292fd3c078969e3ee4c71d9e8_1.intValue();
            f2 = class04995.m(f2 * f2 * f2 * f2 * (float) Math.PI);
            float f3 = class07438.method_48157();
            var1.N(class02058.u.N(-f3));
            float f1 = (float)(-f2 * 14.0 * ((class05630)this.W.i_7).NJ().method_41753());
            var1.N(class02058.R.N(f1));
            var1.N(class02058.u.N(f3));
         }
      }
   }

   private void N(class03049 var1, float var2, class01421 var3, class01237 var4, class04453 var5, int var6) {
      if (!Iris.isPackInUseQuick()) {
         var1.N(var2, var3, var4, var5, var6);
      }
   }

   public void N(boolean var1) {
      this.l = var1;
   }

   private void N(Args var1) {
      class05096 class05096 = (class05096)this.W.v_3;
      if (class05096 instanceof ShaderPackScreen shaderpackscreen) {
         float fx = Math.min((float)((class05630)this.W.i_7).l(), shaderpackscreen.blurTransition.getAsFloat());
         var1.set(5, (int)fx);
      }
   }

   private void N(class02233 var1, boolean var2, CallbackInfo var3) {
      CapturedRenderingState.INSTANCE.setRealTickDelta(var1.N(true));
      SystemTimeUniforms.COUNTER.beginFrame();
      SystemTimeUniforms.TIMER.beginFrame(class07536.u());
   }

   private void N(class05096 var1, class01054 var2, int var3, int var4, float var5, Operation var6) {
      ((BeforeRender)ScreenEvents.beforeRender(var1).invoker()).beforeRender(var1, var2, var3, var4, var5);
      var6.call(new Object[]{var1, var2, var3, var4, var5});
      ((AfterRender)ScreenEvents.afterRender(var1).invoker()).afterRender(var1, var2, var3, var4, var5);
   }

   private void N(class06202 var1, class03049 var2, class01386 var3, class01999 var4, CallbackInfo var5) {
      this.M.fabric_onReady(this.o);
   }

   @Override
   public double N() {
      float fx = this.e.i();
      if (fx <= -90.0F) {
         return Double.NEGATIVE_INFINITY;
      } else if (fx >= 90.0F) {
         return Double.POSITIVE_INFINITY;
      } else {
         float f1 = this.N(this.e, 0.0F, true);
         return Math.tan(fx * (float) (Math.PI / 180.0)) / Math.tan(f1 / 2.0F * (float) (Math.PI / 180.0));
      }
   }

   public void N(@Nullable class03448 var1) {
      if (var1 != null) {
         this.H.N(var1.method_8597().P());
      }
   }

   public void N(@Nullable class07604 var1) {
      this.O = var1;
   }

   public FogParameters sodium$getFogParameters() {
      return this.I.sodium$getFogParameters();
   }

   public void W() {
      this.s.y();
      this.W.NV().N();
      this.e.T();
      this.w = false;
   }

   public boolean R() {
      return this.O != null;
   }

   private float R(float var1) {
      return class11938.u().g().N(var1);
   }

   private void G() {
      this.B.N();
      this.B.y(var1 -> var1.N().N(new class03402(this, var1)));
   }
}
