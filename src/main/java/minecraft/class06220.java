package minecraft;

import Nursultan.class09678;
import Nursultan.class09690;
import Nursultan.class11286;
import Nursultan.class11376;
import Nursultan.class11381;
import Nursultan.class11388;
import Nursultan.class11389;
import Nursultan.class11399;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalDoubleRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;
import com.viaversion.viafabricplus.features.mouse_sensitivity.MouseSensitivity1_13_2;
import com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.InputEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager.MouseEvent;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.BeforeMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.BeforeMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.BeforeMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.BeforeMouseScroll;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFWDropCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

@Environment(EnvType.CLIENT)
public class class06220 implements IMouseKeyboardHandlers {
   private static Logger L = LoggerFactory.getLogger("minecraft.class06220");
   public static final long N = 250L;
   private final class06202 u;
   private boolean i;
   private boolean R;
   private boolean M;
   private double B;
   private double Z;
   @Nullable
   private class06194 z;
   protected int y;
   private int U;
   @Nullable
   private class06595 E;
   private boolean W;
   private int m;
   private double P;
   private final class05016 s;
   private final class05016 T;
   private double b;
   private double j;
   private final class02419 v;
   private double n;
   private boolean t;
   private final Queue G = new ConcurrentLinkedQueue();

   private void L(long var1, class06595 var3, int var4, CallbackInfo var5) {
      ((MouseEvent)InputEvents.MOUSE_KEY.invoker()).onMouseEvent(var3, var4);
   }

   public boolean L() {
      return this.R;
   }

   public double L(class08844 var1) {
      return y(var1, this.Z);
   }

   public void M() {
      this.W = true;
   }

   public class06220(class06202 var1) {
      super();
      this.E = null;
      this.W = true;
      this.s = new class05016();
      this.T = new class05016();
      this.n = Double.MIN_VALUE;
      this.u = var1;
      this.v = new class02419();
   }

   public boolean B() {
      return this.t;
   }

   public void Z() {
      if (this.u.y()) {
         if (!this.t) {
            if (class06604.u) {
               class06428.N();
            }

            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(callbackinfo);
            if (!callbackinfo.isCancelled()) {
               this.t = true;
               this.B = this.u.Nt().W() / 2;
               this.Z = this.u.Nt().m() / 2;
               class04655.N(this.u.Nt(), 212995, this.B, this.Z);
               this.u.N(null);
               this.u.M_5 = 10000;
               this.W = true;
            }
         }
      }
   }

   public double i() {
      return this.B;
   }

   public void U() {
      this.W = true;
   }

   public void z() {
      if (this.t) {
         this.t = false;
         this.B = this.u.Nt().W() / 2;
         this.Z = this.u.Nt().m() / 2;
         class04655.N(this.u.Nt(), 212993, this.B, this.Z);
      }
   }

   public boolean u() {
      return this.M;
   }

   private void y(long var1, class06595 var3, int var4, CallbackInfo var5) {
      if ((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.zoomScrolling.value()) {
         if (OkZoomerConfigManager.CONFIG.controls.zoomMode.value() == ConfigEnums$ZoomModes.PERSISTENT && !ZoomKeyBinds.ZOOM_KEY.R()) {
            return;
         }

         if (var3.v() == 2 && var4 == 1 && Zoom.isZooming() && (Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.resetZoomWithMouse.value()) {
            ZoomUtils.resetZoomDivisor(true);
            var5.cancel();
         }
      }
   }

   private boolean y(class05096 var1, class06613 var2, double var3, double var5, Operation var7) {
      class09690 class09690 = class09690.N(var2.v());
      return class09690 != null && class09678.L(var1, var2.n(), var2.t(), class09690) ? true : (Boolean)var7.call(new Object[]{var1, var2, var3, var5});
   }

   public boolean y() {
      return this.i;
   }

   private void y(long var1, double var3, double var5) {
      if (var1 == this.u.Nt().B()) {
         if (this.W) {
            this.B = var3;
            this.Z = var5;
            this.W = false;
         } else {
            if (this.u.y()) {
               this.b = this.b + (var3 - this.B);
               this.j = this.j + (var5 - this.Z);
            }

            this.B = var3;
            this.Z = var5;
         }
      }
   }

   public double y(class08844 var1) {
      return N(var1, this.B);
   }

   public static double y(class08844 var0, double var1) {
      return var1 * var0.s() / var0.m();
   }

   public Queue viaFabricPlus$getPendingScreenEvents() {
      return this.G;
   }

   private void N(CallbackInfo var1, int var2) {
      if (var2 != 0 && (Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.zoomScrolling.value()) {
         if (((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals(ConfigEnums$ZoomModes.PERSISTENT)
            && !ZoomKeyBinds.ZOOM_KEY.R()) {
            return;
         }

         if (Zoom.isZooming()) {
            ZoomUtils.changeZoomDivisor(var2 > 0);
            var1.cancel();
         }
      }
   }

   private void N(double var1, CallbackInfo var3, LocalDoubleRef var4, LocalDoubleRef var5, LocalDoubleRef var6) {
      if (Zoom.isModifierActive()) {
         double d0 = var6.get();
         double d1 = Zoom.getTransitionMode().getInternalMultiplier();
         var4.set(Zoom.getMouseModifier().applyXModifier(var4.get(), d0, var1, d1));
         var5.set(Zoom.getMouseModifier().applyYModifier(var5.get(), d0, var1, d1));
      }
   }

   private void N(class06202 var1, Runnable var2) {
      if (this.u.NE() != null && (class05096)this.u.v_3 != null && DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
         this.G.offer(var2);
      } else {
         var1.execute(var2);
      }
   }

   private void N(class08044 var1, int var2, Operation var3) {
      class11399 class11399 = class11399.N(var2);
      class11938.L().L(class11399);
      if (class11399.y()) {
         var3.call(new Object[]{var1, var1.N()});
      } else {
         var3.call(new Object[]{var1, class11399.L()});
      }
   }

   private void N(double var1, CallbackInfo var3, double var4, LocalDoubleRef var6) {
      var6.set(var4);
   }

   public void N(class08844 var1) {
      class04655.N(var1, (var1x, var3, var5) -> this.u.execute(() -> this.y(var1x, var3, var5)), (var1x, var3, var4, var5) -> {
         class06595 class06595 = new class06595(var3, var5);
         class06202 class06202 = this.u;
         Runnable runnable = () -> this.N(var1x, class06595, var4);
         class06202 class06202x = class06202;
         this.N(class06202x, runnable);
      }, (var1x, var3, var5) -> {
         class06202 class06202 = this.u;
         Runnable runnable = () -> this.N(var1x, var3, var5);
         class06202 class06202x = class06202;
         this.N(class06202x, runnable);
      }, (var1x, var3, var4) -> {
         ArrayList arraylist = new ArrayList(var3);
         int ix = 0;

         for (int jx = 0; jx < var3; jx++) {
            String sx = GLFWDropCallback.getName(var4, jx);

            try {
               arraylist.add(Paths.get(sx));
            } catch (InvalidPathException invalidpathexception) {
               ix++;
               L.error("Failed to parse path '{}'", sx, invalidpathexception);
            }
         }

         if (!arraylist.isEmpty()) {
            int k = ix;
            this.u.execute(() -> this.N(var1x, arraylist, k));
         }
      });
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

   public void N(class07074 var1, class08844 var2) {
      var1.N("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%f, %f). Absolute: (%f, %f)", N(var2, this.B), y(var2, this.Z), this.B, this.Z));
      var1.N(
         "Screen size",
         () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", var2.P(), var2.s(), var2.U(), var2.E(), var2.j())
      );
   }

   private class06595 N(class06595 var1, boolean var2) {
      if (class06604.L && var1.v() == 0) {
         if (var2) {
            if ((var1.y() & 2) == 2) {
               this.U++;
               return new class06595(1, var1.y());
            }
         } else if (this.U > 0) {
            this.U--;
            return new class06595(1, var1.y());
         }
      }

      return var1;
   }

   private void N(long var1, class06595 var3, int var4) {
      this.L(var1, var3, var4, null);
      class08844 class08844 = this.u.Nt();
      if (var1 == class08844.B()) {
         this.u.NG().u();
         class06202 class06202 = this.u;
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var3, var4, callbackinfo);
         if (!callbackinfo.isCancelled()) {
            if ((class05096)class06202.v_3 != null) {
               this.u.N(class02111.field_41778);
            }

            boolean flag = var4 == 1;
            class06595 class06595 = this.N(var3, flag);
            if (flag) {
               if (((class05630)this.u.i_7).Nm().method_41753() && this.m++ > 0) {
                  return;
               }

               this.E = class06595;
               this.P = class04674.y();
            } else if (this.E != null) {
               if (((class05630)this.u.i_7).Nm().method_41753() && --this.m > 0) {
                  return;
               }

               this.E = null;
            }

            if (this.u.NZ() == null) {
               if ((class05096)this.u.v_3 == null) {
                  if (!this.t && flag) {
                     this.Z();
                  }
               } else {
                  double d0 = this.y(class08844);
                  double d1 = this.L(class08844);
                  class05096 class05096 = (class05096)this.u.v_3;
                  class06613 class06613 = new class06613(d0, d1, class06595);
                  if (flag) {
                     class05096.method_37069();

                     try {
                        long ix = class07536.L();
                        boolean flag1 = this.z != null && ix - this.z.N() < 250L && this.z.y() == class05096 && this.y == class06613.v();
                        if (this.N(class05096, class06613, flag1, var0 -> {
                           WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_437, net.minecraft.class_11909, boolean]");
                           return ((class05096)var0[0]).method_25402((class06613)var0[1], (Boolean)var0[2]);
                        })) {
                           this.z = new class06194(ix, class05096);
                           this.y = class06595.v();
                           return;
                        }
                     } catch (Throwable throwable1) {
                        class07080 class07080x = class07080.N(throwable1, "mouseClicked event handler");
                        class05096.method_65027(class07080x);
                        class07074 class07074x = class07080x.N("Mouse");
                        this.N(class07074x, class08844);
                        class07074x.N("Button", class06613.v());
                        throw new class07878(class07080x);
                     }
                  } else {
                     try {
                        if (this.N(class05096, class06613, var0 -> {
                           WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_437, net.minecraft.class_11909]");
                           return ((class05096)var0[0]).method_25406((class06613)var0[1]);
                        })) {
                           return;
                        }
                     } catch (Throwable throwable) {
                        class07080 class07080 = class07080.N(throwable, "mouseReleased event handler");
                        class05096.method_65027(class07080);
                        class07074 class07074 = class07080.N("Mouse");
                        this.N(class07074, class08844);
                        class07074.N("Button", class06613.v());
                        throw new class07878(class07080);
                     }
                  }
               }
            }

            if ((class05096)this.u.v_3 == null && this.u.NZ() == null) {
               if (class06595.v() == 0) {
                  this.i = flag;
               } else if (class06595.v() == 2) {
                  this.R = flag;
               } else if (class06595.v() == 1) {
                  this.M = flag;
               }

               class04671 class04671 = class04648.field_1672.N(class06595.v());
               CallbackInfo callbackinfo1 = new CallbackInfo("", true);
               this.y(var1, var3, var4, callbackinfo1);
               if (callbackinfo1.isCancelled()) {
                  return;
               }

               class06428.N(class04671, flag);
               if (flag) {
                  class06428.N(class04671);
               }
            }
         }
      }
   }

   private Object N(class04370 var1, Operation var2) {
      Double d0 = (Double)var2.call(new Object[]{var1});
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)
         ? (double)MouseSensitivity1_13_2.get1_13SliderValue(d0.floatValue()).keyFloat()
         : d0;
   }

   private void N(long var1, List<Path> var3, int var4) {
      this.u.NG().u();
      if ((class05096)this.u.v_3 != null) {
         ((class05096)this.u.v_3).method_29638(var3);
      }

      if (var4 > 0) {
         class06132.N(this.u, var4);
      }
   }

   private void N(long var1, double var3, double var5) {
      if (var1 == this.u.Nt().B()) {
         class02742 class02742 = this.u.NG();
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var3, var5, callbackinfo);
         if (callbackinfo.isCancelled()) {
            return;
         }

         class02742.u();
         boolean flag = ((class05630)this.u.i_7).NM().method_41753();
         double d0 = ((class05630)this.u.i_7).p().method_41753();
         double d1 = (flag ? Math.signum(var3) : var3) * d0;
         double d2 = (flag ? Math.signum(var5) : var5) * d0;
         if (this.u.NZ() == null) {
            if ((class05096)this.u.v_3 != null) {
               double d3 = this.y(this.u.Nt());
               double d4 = this.L(this.u.Nt());
               class05096 class05096 = (class05096)this.u.v_3;
               this.N(class05096, d3, d4, d1, d2, var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 5, "[net.minecraft.class_437, double, double, double, double]");
                  return ((class05096)var0[0]).method_25401((Double)var0[1], (Double)var0[2], (Double)var0[3], (Double)var0[4]);
               });
               ((class05096)this.u.v_3).method_37069();
            } else if ((class04453)this.u.T_4 != null) {
               Vector2i vector2i = this.v.N(d1, d2);
               if (vector2i.x == 0 && vector2i.y == 0) {
                  return;
               }

               int ix = vector2i.y == 0 ? -vector2i.x : vector2i.y;
               class04453 class04453 = (class04453)this.u.T_4;
               CallbackInfo callbackinfo1 = new CallbackInfo("", true);
               this.N(callbackinfo1, ix);
               if (callbackinfo1.isCancelled()) {
                  return;
               }

               if (class04453.method_7325()) {
                  if (((class01056)this.u.i_6).B().N()) {
                     ((class01056)this.u.i_6).B().y(-ix);
                  } else {
                     float f = class04995.N(((class04453)this.u.T_4).method_31549().N() + vector2i.y * 0.005F, 0.0F, 0.2F);
                     ((class04453)this.u.T_4).method_31549().N(f);
                  }
               } else {
                  class08044 class08044 = ((class04453)this.u.T_4).method_31548();
                  int jx = class02419.N(ix, class08044.N(), class08044.L());
                  this.N(class08044, jx, var0 -> {
                     WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1661, int]");
                     ((class08044)var0[0]).N((Integer)var0[1]);
                     return (Void)null;
                  });
               }
            }
         }
      }
   }

   private void N(double var1) {
      LocalDoubleRefImpl localdoublerefimpl = new LocalDoubleRefImpl();
      localdoublerefimpl.init(0.0);
      class04370 class04370 = ((class05630)this.u.i_7).u();
      double d2 = (Double)this.N(class04370, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_7172]");
         return ((class04370)var0[0]).method_41753();
      }) * 0.6F + 0.2F;
      double d3 = d2 * d2 * d2;
      double d4 = d3 * 8.0;
      class05630 class05630 = (class05630)this.u.i_7;
      this.N(var1, null, d4, localdoublerefimpl);
      double d0;
      double d1;
      if (class05630.Nd) {
         double d5 = this.s.N(this.b * d4, var1 * d4);
         double d6 = this.T.N(this.j * d4, var1 * d4);
         d0 = d5;
         d1 = d6;
      } else if (((class05630)this.u.i_7).NS().N() && this.N(((class04453)this.u.T_4).method_31550())) {
         this.s.N();
         this.T.N();
         d0 = this.b * d3;
         d1 = this.j * d3;
      } else {
         this.s.N();
         this.T.N();
         d0 = this.b * d4;
         d1 = this.j * d4;
      }

      class08764 class08764 = this.u.yT();
      LocalDoubleRefImpl localdoublerefimpl1 = new LocalDoubleRefImpl();
      LocalDoubleRefImpl localdoublerefimpl2 = new LocalDoubleRefImpl();
      localdoublerefimpl1.init(d0);
      localdoublerefimpl2.init(d1);
      this.N(var1, null, localdoublerefimpl1, localdoublerefimpl2, localdoublerefimpl);
      double d8 = localdoublerefimpl2.dispose();
      double d7 = localdoublerefimpl1.dispose();
      class08764.N(d0, d1);
      if ((class04453)this.u.T_4 != null) {
         ((class04453)this.u.T_4).method_5872(((class05630)this.u.i_7).Ni().method_41753() ? -d7 : d7, ((class05630)this.u.i_7).NR().method_41753() ? -d8 : d8);
      }
   }

   public static double N(class08844 var0, double var1) {
      return var1 * var0.P() / var0.W();
   }

   public void N() {
      double d0 = class04674.y();
      double d1 = d0 - this.n;
      this.n = d0;
      if (this.u.y()) {
         class05096 class05096 = (class05096)this.u.v_3;
         boolean flag = this.b != 0.0 || this.j != 0.0;
         if (flag) {
            this.u.NG().u();
         }

         if (class05096 != null && this.u.NZ() == null && flag) {
            class08844 class08844 = this.u.Nt();
            double d2 = this.y(class08844);
            double d3 = this.L(class08844);

            try {
               class05096.method_16014(d2, d3);
            } catch (Throwable throwable1) {
               class07080 class07080x = class07080.N(throwable1, "mouseMoved event handler");
               class05096.method_65027(class07080x);
               class07074 class07074x = class07080x.N("Mouse");
               this.N(class07074x, class08844);
               throw new class07878(class07080x);
            }

            if (this.E != null && this.P > 0.0) {
               double d4 = N(class08844, this.b);
               double d5 = y(class08844, this.j);

               try {
                  class06613 class06613 = new class06613(d2, d3, this.E);
                  Operation operation = var0 -> {
                     WrapOperationRuntime.checkArgumentCount(var0, 4, "[net.minecraft.class_437, net.minecraft.class_11909, double, double]");
                     return ((class05096)var0[0]).method_25403((class06613)var0[1], (Double)var0[2], (Double)var0[3]);
                  };
                  this.y(class05096, class06613, d4, d5, var2 -> {
                     WrapOperationRuntime.checkArgumentCount(var2, 4, "[net.minecraft.class_437, net.minecraft.class_11909, double, double]");
                     return this.N((class05096)var2[0], (class06613)var2[1], (Double)var2[2], (Double)var2[3], operation);
                  });
               } catch (Throwable throwable) {
                  class07080 class07080 = class07080.N(throwable, "mouseDragged event handler");
                  class05096.method_65027(class07080);
                  class07074 class07074 = class07080.N("Mouse");
                  this.N(class07074, class08844);
                  throw new class07878(class07080);
               }
            }

            class05096.method_37068();
         }

         if (this.B() && (class04453)this.u.T_4 != null) {
            this.N(d1);
         }
      }

      this.b = 0.0;
      this.j = 0.0;
   }

   private boolean N(class05096 var1, class06613 var2, boolean var3, Operation var4) {
      if (var1 != null) {
         if (!((AllowMouseClick)ScreenMouseEvents.allowMouseClick(var1).invoker()).allowMouseClick(var1, var2)) {
            return true;
         }

         ((BeforeMouseClick)ScreenMouseEvents.beforeMouseClick(var1).invoker()).beforeMouseClick(var1, var2);
      }

      boolean flag = (Boolean)var4.call(new Object[]{var1, var2, var3});
      if (var1 != null) {
         flag |= ((AfterMouseClick)ScreenMouseEvents.afterMouseClick(var1).invoker()).afterMouseClick(var1, var2, flag);
      }

      return flag;
   }

   public void N(class01590 var1, class01054 var2) {
      class08844 class08844 = this.u.Nt();
      double d0 = this.y(class08844);
      double d1 = this.L(class08844) - 8.0;
      String sx = String.format(Locale.ROOT, "%.0f,%.0f", d0, d1);
      var2.y(var1, sx, (int)d0, (int)d1, -1);
   }

   private boolean N(class05096 var1, double var2, double var4, double var6, double var8, Operation var10) {
      if (var1 != null) {
         if (!((AllowMouseScroll)ScreenMouseEvents.allowMouseScroll(var1).invoker()).allowMouseScroll(var1, var2, var4, var6, var8)) {
            return true;
         }

         ((BeforeMouseScroll)ScreenMouseEvents.beforeMouseScroll(var1).invoker()).beforeMouseScroll(var1, var2, var4, var6, var8);
      }

      boolean flag = (Boolean)var10.call(new Object[]{var1, var2, var4, var6, var8});
      if (var1 != null) {
         flag |= ((AfterMouseScroll)ScreenMouseEvents.afterMouseScroll(var1).invoker()).afterMouseScroll(var1, var2, var4, var6, var8, flag);
      }

      return flag;
   }

   private void N(long var1, class06595 var3, int var4, CallbackInfo var5) {
      class11389 class11389 = class11389.N(var3.v(), var3.y(), 0, class11286.N(var4), class11381.MOUSE);
      class11938.L().L(class11389);
      if (class11389.y()) {
         var5.cancel();
      }
   }

   private void N(long var1, double var3, double var5, CallbackInfo var7) {
      class11376 class11376 = class11376.N(var5, var3);
      class11938.L().L(class11376);
      if (class11376.y()) {
         var7.cancel();
      }
   }

   private void N(CallbackInfo var1) {
      class11388 class11388 = class11388.L();
      class11938.L().L(class11388);
      if (class11388.y()) {
         var1.cancel();
      }
   }

   private boolean N(class05096 var1, class06613 var2, double var3, double var5, Operation var7) {
      if (var1 != null) {
         if (!((AllowMouseDrag)ScreenMouseEvents.allowMouseDrag(var1).invoker()).allowMouseDrag(var1, var2, var3, var5)) {
            return true;
         }

         ((BeforeMouseDrag)ScreenMouseEvents.beforeMouseDrag(var1).invoker()).beforeMouseDrag(var1, var2, var3, var5);
      }

      boolean flag = (Boolean)var7.call(new Object[]{var1, var2, var3, var5});
      if (var1 != null) {
         flag |= ((AfterMouseDrag)ScreenMouseEvents.afterMouseDrag(var1).invoker()).afterMouseDrag(var1, var2, var3, var5, flag);
      }

      return flag;
   }

   private boolean N(class05096 var1, class06613 var2, Operation var3) {
      if (var1 != null) {
         if (!((AllowMouseRelease)ScreenMouseEvents.allowMouseRelease(var1).invoker()).allowMouseRelease(var1, var2)) {
            return true;
         }

         ((BeforeMouseRelease)ScreenMouseEvents.beforeMouseRelease(var1).invoker()).beforeMouseRelease(var1, var2);
      }

      boolean flag = (Boolean)var3.call(new Object[]{var1, var2});
      if (var1 != null) {
         flag |= ((AfterMouseRelease)ScreenMouseEvents.afterMouseRelease(var1).invoker()).afterMouseRelease(var1, var2, flag);
      }

      return flag;
   }

   public double R() {
      return this.Z;
   }
}
