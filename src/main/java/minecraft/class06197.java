package minecraft;

import Nursultan.class11286;
import Nursultan.class11381;
import Nursultan.class11389;
import Nursultan.class11391;
import Nursultan.class11938;
import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.platform.TextureUtil;
import com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6;
import com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.InputEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager.KeyboardEvent;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.mixin.LanguageManagerAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.AfterKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.AfterKeyRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.AllowKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.AllowKeyRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.BeforeKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents.BeforeKeyRelease;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class06197 implements IMouseKeyboardHandlers {
   private static Logger y = LoggerFactory.getLogger("minecraft.class06197");
   public static final int N = 10000;
   private final class06202 L;
   private final class04663 u;
   private long i;
   private long R;
   private long M;
   private boolean B;
   private final Queue Z = new ConcurrentLinkedQueue();

   private void L(class06601 var1) {
      if (var1.W()) {
         Config config = Config.getInstance();
         class08396 class08396 = this.L.X();
         class08430 class08430 = class08396.y(config.previousLanguage);
         if (class08430 == null && config.previousLanguage.equals("en_us")) {
            class08430 = LanguageManagerAccessor.languagereload_getEnglishUs();
         }

         boolean flag = config.previousLanguage.equals("*");
         if (class08430 == null && !flag) {
            this.y(class00392.L("debug.reload_languages.switch.failure"));
         } else {
            LanguageReload.setLanguage(config.previousLanguage, config.previousFallbacks);
            ArrayList arraylist = new ArrayList();
            if (flag) {
               arraylist.add(class00392.N("∅"));
            }

            if (class08430 != null) {
               arraylist.add(class08430.N());
            }

            arraylist.addAll(config.fallbacks.stream().map(class08396::y).filter(Objects::nonNull).map(class08430::N).toList());
            this.L(class00392.N("debug.reload_languages.switch.success", class00390.N(arraylist, class00392.N(", "))));
         }
      } else {
         LanguageReload.reloadLanguages();
         this.L(class00392.L("debug.reload_languages.message"));
      }
   }

   private void L(long var1, int var3, class06601 var4, CallbackInfo var5) {
      ((KeyboardEvent)InputEvents.KEYBOARD_KEY.invoker()).onKeyboardEvent(var4);
   }

   private void L(class00392 var1) {
      this.N(N(class06541.field_1054, var1));
   }

   public class06197(class06202 var1) {
      super();
      this.u = new class04663();
      this.i = -1L;
      this.R = -1L;
      this.M = -1L;
      this.L = var1;
   }

   public void y() {
      if (this.i > 0L) {
         long ix = class07536.L();
         long j = 10000L - (ix - this.i);
         long k = ix - this.R;
         if (j < 0L) {
            if (this.L.s()) {
               class04674.N();
            }

            String s = "Manually triggered debug crash";
            class07080 class07080 = new class07080("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
            class04544.N(class07080.N("Manual crash details"));
            throw new class07878(class07080);
         }

         if (k >= 1000L) {
            if (this.M == 0L) {
               this.N("debug.crash.message", ((class05630)this.L.i_7).r.m().getString(), ((class05630)this.L.i_7).NN.m().getString());
            } else {
               this.y(class00392.N("debug.crash.warning", class04995.u((float)j / 1000.0F)));
            }

            this.R = ix;
            this.M++;
         }
      }
   }

   private void y(long var1, int var3, class06601 var4, CallbackInfo var5) {
      if (var1 == this.L.Nt().B()) {
         if (var4.v() != -1) {
            class11389 class11389 = class11389.N(var4.v(), var4.y(), var4.n(), class11286.N(var3), class11381.KEYBOARD);
            class11938.L().L(class11389);
            if (class11389.y()) {
               var5.cancel();
            }
         }
      }
   }

   private void y(long var1, class06626 var3, CallbackInfo var4) {
      if (var1 == this.L.Nt().B()) {
         class11391 class11391 = class11391.N(var3.L(), var3.u());
         class11938.L().L(class11391);
         if (class11391.y()) {
            var4.cancel();
         }
      }
   }

   private boolean y(class05096 var1, class06601 var2, Operation var3) {
      if (var1 != null) {
         if (!((AllowKeyRelease)ScreenKeyboardEvents.allowKeyRelease(var1).invoker()).allowKeyRelease(var1, var2)) {
            return true;
         }

         ((BeforeKeyRelease)ScreenKeyboardEvents.beforeKeyRelease(var1).invoker()).beforeKeyRelease(var1, var2);
      }

      boolean flag = (Boolean)var3.call(new Object[]{var1, var2});
      if (var1 != null) {
         ((AfterKeyRelease)ScreenKeyboardEvents.afterKeyRelease(var1).invoker()).afterKeyRelease(var1, var2);
      }

      return flag;
   }

   private boolean y(class06601 var1) {
      if (this.i > 0L && this.i < class07536.L() - 100L) {
         boolean flag2 = true;
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, flag2);
         this.N(var1, callbackinforeturnable1);
         return callbackinforeturnable1.isCancelled() ? callbackinforeturnable1.getReturnValueZ() : true;
      } else if (class07529.t && this.N(var1)) {
         boolean flag3 = true;
         CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, flag3);
         this.N(var1, callbackinforeturnable2);
         return callbackinforeturnable2.isCancelled() ? callbackinforeturnable2.getReturnValueZ() : true;
      } else {
         if (class07529.Na) {
            switch (var1.v()) {
               case 76:
                  class04320.y();
                  boolean flag5 = true;
                  CallbackInfoReturnable callbackinforeturnable4 = new CallbackInfoReturnable("", true, flag5);
                  this.N(var1, callbackinforeturnable4);
                  if (callbackinforeturnable4.isCancelled()) {
                     return callbackinforeturnable4.getReturnValueZ();
                  }

                  return true;
               case 82:
                  class04320.N();
                  boolean flag4 = true;
                  CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, flag4);
                  this.N(var1, callbackinforeturnable3);
                  if (callbackinforeturnable3.isCancelled()) {
                     return callbackinforeturnable3.getReturnValueZ();
                  }

                  return true;
            }
         }

         class05630 class05630 = (class05630)this.L.i_7;
         boolean flag = false;
         if (class05630.Ny.N(var1)) {
            ((class03063)this.L.B_2).u();
            this.N("debug.reload_chunks.message");
            flag = true;
         }

         if (class05630.NL.N(var1) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            boolean flag1 = ((class05731)this.L.L_0).L(class06134.G);
            this.N(flag1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
            flag = true;
         }

         if (class05630.Nu.N(var1)) {
            ((class01056)this.L.i_6).i().N(false);
            flag = true;
         }

         if (class05630.Ni.N(var1) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            boolean flag6 = ((class05731)this.L.L_0).L(class06134.l);
            this.N(flag6 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
            flag = true;
         }

         if (class05630.NR.N(var1)) {
            class05630.W = !class05630.W;
            this.N(class05630.W ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
            class05630.Np();
            flag = true;
         }

         if (class05630.NM.N(var1)) {
            if ((class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
               this.N(((class04453)this.L.T_4).method_75004().hasPermission(class08162.y), !var1.W());
            }

            flag = true;
         }

         if (class05630.NB.N(var1)) {
            if ((class04453)this.L.T_4 == null || !class01557.N.N(((class04453)this.L.T_4).method_75004())) {
               this.N("debug.creative_spectator.error");
            } else if (!((class04453)this.L.T_4).method_7325()) {
               class01683 class01683xxx = (class01683)((class04453)this.L.T_4).y_0;
               class09008 class09008 = new class09008(class07282.field_9219);
               class01683 class01683x = class01683xxx;
               this.N(class01683x, class09008);
            } else {
               class07282 class07282 = (class07282)MoreObjects.firstNonNull(((class03443)this.L.T_2).z(), class07282.field_9220);
               class01683 class01683 = (class01683)((class04453)this.L.T_4).y_0;
               class09008 class09008x = new class09008(class07282);
               class01683 class01683x = class01683;
               this.N(class01683x, class09008x);
            }

            flag = true;
         }

         if (class05630.NZ.N(var1) && (class03448)this.L.T_3 != null && (class05096)this.L.v_3 == null) {
            if (this.L.T() && class01557.N.N(((class04453)this.L.T_4).method_75004())) {
               this.L.N(new class05954());
            } else {
               this.N("debug.gamemodes.error");
            }

            flag = true;
         }

         if (class05630.Nz.N(var1)) {
            if ((class05096)this.L.v_3 instanceof class04589) {
               ((class05096)this.L.v_3).method_25419();
            } else if (this.L.G()) {
               if ((class05096)this.L.v_3 != null) {
                  ((class05096)this.L.v_3).method_25419();
               }

               this.L.N(new class04589());
            }

            flag = true;
         }

         if (class05630.NU.N(var1)) {
            class05630.m = !class05630.m;
            class05630.Np();
            this.N(class05630.m ? "debug.pause_focus.on" : "debug.pause_focus.off");
            flag = true;
         }

         if (class05630.NE.N(var1)) {
            Path path1 = ((File)this.L.l_1).toPath().toAbsolutePath();
            Path path = TextureUtil.getDebugTexturePath(path1);
            this.L.NO().N(path);
            class05216 class05216 = class00392.y(path1.relativize(path).toString()).N(class06541.field_1073).N(var1x -> var1x.N(new class00623(path)));
            this.L(class00392.N("debug.dump_dynamic_textures", class05216));
            flag = true;
         }

         if (class05630.NW.N(var1)) {
            this.N("debug.reload_resourcepacks.message");
            this.L.yy();
            flag = true;
         }

         if (class05630.Nm.N(var1)) {
            if (this.L.y(this::L)) {
               this.L(class00392.N("debug.profiling.start", 10, class05630.r.m(), class05630.Nm.m()));
            }

            flag = true;
         }

         if (class05630.NP.N(var1) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            this.N("debug.copy_location.message");
            this.N(
               String.format(
                  Locale.ROOT,
                  "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                  ((class04453)this.L.T_4).method_73183().method_27983().N(),
                  ((class04453)this.L.T_4).method_23317(),
                  ((class04453)this.L.T_4).method_23318(),
                  ((class04453)this.L.T_4).method_23321(),
                  ((class04453)this.L.T_4).method_36454(),
                  ((class04453)this.L.T_4).method_36455()
               )
            );
            flag = true;
         }

         if (class05630.Ns.N(var1)) {
            this.N("debug.version.header");
            class00017.N(this::N);
            flag = true;
         }

         if (class05630.NT.N(var1)) {
            this.L.ND().B();
            flag = true;
         }

         if (class05630.Nb.N(var1)) {
            this.L.ND().M();
            flag = true;
         }

         if (class05630.Nj.N(var1)) {
            this.L.ND().R();
            flag = true;
         }

         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
         this.N(var1, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag;
      }
   }

   private void y(class00392 var1) {
      this.N(N(class06541.field_1061, var1));
   }

   private void y(String var1) {
      this.L(class00392.y(var1));
   }

   public Queue viaFabricPlus$getPendingScreenEvents() {
      return this.Z;
   }

   private void N(long var1, class06626 var3, CallbackInfo var4) {
      if (((class05630)this.L.i_7).r.R()) {
         int ix = LanguageReload.reloadLanguagesKey.languagereload_getBoundKey().y();
         if (class04655.N(this.L.Nt(), ix)) {
            var4.cancel();
         }
      }
   }

   private void N(long var1, int var3, class06601 var4, CallbackInfo var5) {
      if ((class05096)this.L.v_3 != null && ((class05630)this.L.i_7).r.R() && LanguageReload.reloadLanguagesKey.N(var4)) {
         this.B = true;
         if (var3 != 1) {
            this.L(var4);
         }

         var5.cancel();
      }
   }

   private void N(class06601 var1, CallbackInfoReturnable var2) {
      if (LanguageReload.reloadLanguagesKey.N(var1)) {
         this.L(var1);
         var2.setReturnValue(true);
      }
   }

   private boolean N(class05096 var1, class06601 var2, Operation var3) {
      if (var1 != null) {
         if (!((AllowKeyPress)ScreenKeyboardEvents.allowKeyPress(var1).invoker()).allowKeyPress(var1, var2)) {
            return true;
         }

         ((BeforeKeyPress)ScreenKeyboardEvents.beforeKeyPress(var1).invoker()).beforeKeyPress(var1, var2);
      }

      boolean flag = (Boolean)var3.call(new Object[]{var1, var2});
      if (var1 != null) {
         ((AfterKeyPress)ScreenKeyboardEvents.afterKeyPress(var1).invoker()).afterKeyPress(var1, var2);
      }

      return flag;
   }

   private static class00392 N(class06541 var0, class00392 var1) {
      return class00392.i().y(class00392.L("debug.prefix").N(var0, class06541.field_1067)).y(class05220.l).y(var1);
   }

   private void N(class01683 var1, class00381 var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && var2 instanceof class09008 class09008x) {
         class09008 class09008x = class09008x;

         try {
            class07282 = class09008x.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         SignedCommands1_21_6.sendGameMode(class07282);
      } else {
         var1.N(var2);
      }
   }

   private boolean N(class06601 var1) {
      switch (var1.v()) {
         case 69:
            if ((class04453)this.L.T_4 == null) {
               return false;
            }

            boolean flag = ((class05731)this.L.L_0).L(class06134.w);
            this.y("SectionPath: " + (flag ? "shown" : "hidden"));
            return true;
         case 70:
            boolean flag2 = class03394.y();
            this.N("Fog: ", flag2);
            return true;
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 77:
         case 78:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         default:
            return false;
         case 76:
            this.L.U_2 = !(Boolean)this.L.U_2;
            this.N("SmartCull: ", ((Boolean)this.L.U_2).booleanValue());
            return true;
         case 79:
            if ((class04453)this.L.T_4 == null) {
               return false;
            }

            boolean flag1 = ((class05731)this.L.L_0).L(class06134.Q);
            this.N("Frustum culling Octree: ", flag1);
            return true;
         case 85:
            if (var1.W()) {
               ((class03063)this.L.B_2).E();
               this.y("Killed frustum");
            } else {
               ((class03063)this.L.B_2).U();
               this.y("Captured frustum");
            }

            return true;
         case 86:
            if ((class04453)this.L.T_4 == null) {
               return false;
            }

            boolean flag3 = ((class05731)this.L.L_0).L(class06134.H);
            this.N("SectionVisibility: ", flag3);
            return true;
         case 87:
            this.L.U_1 = !(Boolean)this.L.U_1;
            this.N("WireFrame: ", ((Boolean)this.L.U_1).booleanValue());
            return true;
      }
   }

   private void N(class06202 var1, Runnable var2) {
      if (this.L.NE() != null && (class05096)this.L.v_3 != null && DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
         this.Z.offer(var2);
      } else {
         var1.execute(var2);
      }
   }

   private void N(String var1, boolean var2) {
      this.y(var1 + (var2 ? "enabled" : "disabled"));
   }

   private void N(class00392 var1) {
      ((class01056)this.L.i_6).i().N(var1);
      this.L.NT().L(var1);
   }

   private void N(long var1, class06626 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, var3, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            if (var1 == this.L.Nt().B()) {
               class05096 class05096 = (class05096)this.L.v_3;
               if (class05096 != null && this.L.NZ() == null) {
                  try {
                     class05096.method_25400(var3);
                  } catch (Throwable throwable) {
                     class07080 class07080 = class07080.N(throwable, "charTyped event handler");
                     class05096.method_65027(class07080);
                     class07074 class07074 = class07080.N("Key");
                     class07074.N("Codepoint", var3.L());
                     class07074.N("Mods", var3.u());
                     throw new class07878(class07080);
                  }
               }
            }
         }
      }
   }

   private void N(long var1, int var3, class06601 var4) {
      CallbackInfo callbackinfo1 = new CallbackInfo("", true);
      this.y(var1, var3, var4, callbackinfo1);
      if (!callbackinfo1.isCancelled()) {
         class08844 class08844x = this.L.Nt();
         this.L(var1, var3, var4, null);
         class08844 class08844x = class08844x;
         if (var1 == class08844x.B()) {
            class05630 class05630;
            boolean flag;
            boolean flag1;
            label244: {
               this.L.NG().u();
               class05630 = (class05630)this.L.i_7;
               flag = class05630.r.N.y() == class05630.h.N.y();
               flag1 = class05630.r.R();
               if (!class05630.NN.W()) {
                  class08844x = this.L.Nt();
                  this.L(var1, var3, var4, null);
                  if (class04655.N(class08844x, class05630.NN.N.y())) {
                     flag9 = true;
                     break label244;
                  }
               }

               flag9 = false;
            }

            boolean flag2 = flag9;
            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(var1, var3, var4, callbackinfo);
            if (!callbackinfo.isCancelled()) {
               if (this.i > 0L) {
                  if (!flag2 || !flag1) {
                     this.i = -1L;
                  }
               } else if (flag2 && flag1) {
                  this.B = flag;
                  this.i = class07536.L();
                  this.R = class07536.L();
                  this.M = 0L;
               }

               class05096 class05096xx = (class05096)this.L.v_3;
               if (class05096xx != null) {
                  switch (var4.v()) {
                     case 258:
                        this.L.N(class02111.field_41780);
                     case 259:
                     case 260:
                     case 261:
                     default:
                        break;
                     case 262:
                     case 263:
                     case 264:
                     case 265:
                        this.L.N(class02111.field_43097);
                  }
               }

               if (var3 == 1 && (!((class05096)this.L.v_3 instanceof class01827) || ((class01827)class05096xx).y <= class07536.L() - 20L)) {
                  if (class05630.X.N(var4)) {
                     class08844x.M();
                     boolean flag5 = class08844x.Z();
                     class05630.NP().method_41748(flag5);
                     class05630.Np();
                     class05096 class05096x = (class05096)this.L.v_3;
                     if (class05096x instanceof class04631 class04631) {
                        class04631.N(flag5);
                     }

                     return;
                  }

                  if (class05630.e.N(var4)) {
                     if (var4.P() && class07529.NW) {
                        this.N(this.L.N((File)this.L.l_1));
                     } else {
                        class05628.N((File)this.L.l_1, this.L.e(), var1x -> this.L.execute(() -> this.N(var1x)));
                     }

                     return;
                  }
               }

               if (var3 != 0) {
                  boolean flag3 = class05096xx == null
                     || !(class05096xx.method_25399() instanceof class04927)
                     || !((class04927)class05096xx.method_25399()).method_20315();
                  if (flag3) {
                     if (var4.P() && var4.v() == 66 && this.L.NT().N() && class05630.Q().method_41753()) {
                        boolean flag4 = class05630.NV().method_41753() == class01299.field_18176;
                        class05630.NV().method_41748(class01299.N(class05630.NV().method_41753().N() + 1));
                        class05630.Np();
                        if (class05096xx != null) {
                           class05096xx.method_61040(flag4);
                        }
                     }

                     class04453 class04453 = (class04453)this.L.T_4;
                  }
               }

               if (class05096xx != null) {
                  try {
                     if (var3 != 1 && var3 != 2) {
                        if (var3 == 0 && this.y(class05096xx, var4, var0 -> {
                           WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_437, net.minecraft.class_11908]");
                           return ((class05096)var0[0]).method_16803((class06601)var0[1]);
                        })) {
                           if (class05630.r.N(var4)) {
                              this.B = false;
                           }

                           return;
                        }
                     } else {
                        class05096xx.method_37070();
                        if (this.N(class05096xx, var4, var0 -> {
                           WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_437, net.minecraft.class_11908]");
                           return ((class05096)var0[0]).method_25404((class06601)var0[1]);
                        })) {
                           if ((class05096)this.L.v_3 == null) {
                              class04671 class04671x = class04655.N(var4);
                              class06428.N(class04671x, false);
                           }

                           return;
                        }
                     }
                  } catch (Throwable throwable) {
                     class07080 class07080 = class07080.N(throwable, "keyPressed event handler");
                     class05096xx.method_65027(class07080);
                     class07074 class07074 = class07080.N("Key");
                     class07074.N("Key", var4.v());
                     class07074.N("Scancode", var4.n());
                     class07074.N("Mods", var4.y());
                     throw new class07878(class07080);
                  }
               }

               class04671 class04671;
               boolean flag6;
               label209: {
                  class04671 = class04655.N(var4);
                  flag6 = (class05096)this.L.v_3 == null;
                  if (!flag6) {
                     class05096 class05096x = (class05096)this.L.v_3;
                     if (!(class05096x instanceof class05123 class05123 && !class05123.N()) && !((class05096)this.L.v_3 instanceof class05954)) {
                        flag10 = false;
                        break label209;
                     }
                  }

                  flag10 = true;
               }

               boolean flag7 = flag10;
               if (flag && class05630.r.N(var4) && var3 == 0) {
                  if (this.B) {
                     this.B = false;
                  } else {
                     ((class05731)this.L.L_0).L();
                  }
               } else if (!flag && class05630.h.N(var4) && var3 == 1) {
                  ((class05731)this.L.L_0).L();
               }

               if (var3 == 0) {
                  class06428.N(class04671, false);
               } else {
                  boolean flag8 = false;
                  if (flag7 && var4.i()) {
                     this.L.N(flag1);
                     flag8 = flag1;
                  } else if (flag1) {
                     flag8 = this.y(var4);
                     if (flag8 && class05096xx instanceof class04589 class04589) {
                        class05980 class05980 = class04589.N();
                        if (class05980 != null) {
                           class05980.method_25396().forEach(class05484::N);
                        }
                     }
                  } else if (flag7 && class05630.F.N(var4)) {
                     class05630.NG = !class05630.NG;
                  } else if (flag7 && class05630.A.N(var4)) {
                     ((class03386)this.L.i_5).B();
                  }

                  if (flag) {
                     this.B |= flag8;
                  }

                  if (this.L.ND().L() && !flag1) {
                     int ix = var4.U();
                     if (ix != -1) {
                        this.L.ND().E().y(ix);
                     }
                  }

                  if (flag6 || class04671 == class05630.r.N) {
                     if (flag8) {
                        class06428.N(class04671, false);
                     } else {
                        class06428.N(class04671, true);
                        class06428.N(class04671);
                     }
                  }
               }
            }
         }
      }
   }

   public void N(String var1) {
      if (!var1.isEmpty()) {
         this.u.N(this.L.Nt(), var1);
      }
   }

   public String N() {
      return this.u.N(this.L.Nt(), (var1, var2) -> {
         if (var1 != 65545) {
            this.L.Nt().N(var1, var2);
         }
      });
   }

   public void N(class08844 var1) {
      class04655.N(var1, (var1x, var3, var4, var5, var6) -> {
         class06601 class06601 = new class06601(var3, var4, var6);
         class06202 class06202 = this.L;
         Runnable runnable = () -> this.N(var1x, var5, class06601);
         class06202 class06202x = class06202;
         this.N(class06202x, runnable);
      }, (var1x, var3, var4) -> {
         class06626 class06626 = new class06626(var3, var4);
         class06202 class06202 = this.L;
         Runnable runnable = () -> this.N(var1x, class06626);
         class06202 class06202x = class06202;
         this.N(class06202x, runnable);
      });
   }

   private void N(String var1, Object... var2) {
      this.L(class00392.N(var1, var2));
   }

   private void N(boolean var1, boolean var2) {
      class07089 class07089 = (class07089)this.L.M_3;
      if (class07089 != null) {
         switch (class07089.N()) {
            case field_1332:
               class07209 class07209 = ((class06183)class07089).u();
               class07299 class07299 = ((class04453)this.L.T_4).method_73183();
               class00500 class00500 = class07299.method_8320(class07209);
               if (var1) {
                  if (var2) {
                     ((class01683)((class04453)this.L.T_4).y_0).s().N(class07209, var3x -> {
                        this.N(class00500, class07209, var3x);
                        this.N("debug.inspect.server.block");
                     });
                  } else {
                     class00394 class00394 = class07299.method_8321(class07209);
                     class07001 class07001 = class00394 != null ? class00394.L(class07299.method_30349()) : null;
                     this.N(class00500, class07209, class07001);
                     this.N("debug.inspect.client.block");
                  }
               } else {
                  this.N(class00500, class07209, null);
                  this.N("debug.inspect.client.block");
               }
               break;
            case field_1331:
               class07049 class07049 = ((class06145)class07089).L();
               class01894 class01894 = class04206.M.y(class07049.method_5864());
               if (var1) {
                  if (var2) {
                     ((class01683)((class04453)this.L.T_4).y_0).s().N(class07049.method_5628(), var3x -> {
                        this.N(class01894, class07049.method_73189(), var3x);
                        this.N("debug.inspect.server.entity");
                     });
                  } else {
                     try (class04495 class04495 = new class04495(class07049.method_71370(), y)) {
                        class08303 class08303 = class08303.N(class04495, class07049.method_56673());
                        class07049.method_5647(class08303);
                        this.N(class01894, class07049.method_73189(), class08303.y());
                     }

                     this.N("debug.inspect.client.entity");
                  }
               } else {
                  this.N(class01894, class07049.method_73189(), null);
                  this.N("debug.inspect.client.entity");
               }
         }
      }
   }

   private void N(class00500 var1, class07209 var2, @Nullable class07001 var3) {
      StringBuilder stringbuilder = new StringBuilder(class00892.N(var1));
      if (var3 != null) {
         stringbuilder.append(var3);
      }

      String s = String.format(Locale.ROOT, "/setblock %d %d %d %s", var2.method_10263(), var2.method_10264(), var2.method_10260(), stringbuilder);
      this.N(s);
   }

   private void N(class01894 var1, class06889 var2, @Nullable class07001 var3) {
      String s;
      if (var3 != null) {
         var3.b("UUID");
         var3.b("Pos");
         String s1 = class07717.y((class07709)var3).getString();
         s = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1, var2.M, var2.B, var2.Z, s1);
      } else {
         s = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1, var2.M, var2.B, var2.Z);
      }

      this.N(s);
   }
}
