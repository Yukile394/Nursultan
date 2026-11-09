package minecraft;

import Nursultan.class09343;
import Nursultan.class09454;
import Nursultan.class10559;
import Nursultan.class10952;
import Nursultan.class10974;
import Nursultan.class10980;
import Nursultan.class10983;
import Nursultan.class10989;
import Nursultan.class11345;
import Nursultan.class11380;
import Nursultan.class11397;
import Nursultan.class11399;
import Nursultan.class11923;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class11995;
import Nursultan.class12027;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.WorldEvent;
import baritone.api.event.events.TickEvent.Type;
import baritone.api.event.events.type.EventState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserFlag;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback.LoadingCycle;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.features.world.item_picking.ItemPick1_21_3;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import de.maxhenkel.voicechat.events.InputEvents;
import dev.isxander.yacl3.gui.image.ImageRendererManager;
import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.IntBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.mixin.gui.MinecraftClientAccessor;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.checks.ResourcePackScanner;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds.Reference;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStarted;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents.AfterClientWorldChange;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterTick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeTick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.Remove;
import net.fabricmc.fabric.api.event.client.player.ClientPreAttackCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker;
import net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.game.minecraft.Hooks;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData.PngData;
import net.irisshaders.iris.targets.backed.NativeImageBackedCustomTexture;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.HUDOverlayHandler;

@Environment(EnvType.CLIENT)
public class class06202 extends class01303<Runnable> implements class04678, class11995, MinecraftClientAccessor, MinecraftAccessor {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object i_7;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public Object M_4;
   public Object M_5;
   public Object M_6;
   public Object M_7;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object B_3;
   public Object B_4;
   public Object B_5;
   public Object B_6;
   public Object Z_0;
   public Object Z_1;
   public Object Z_2;
   public Object Z_3;
   public Object Z_4;
   public Object Z_5;
   public Object Z_6;
   public Object Z_7;
   public Object z_0;
   public Object z_1;
   public Object z_2;
   public Object z_3;
   public Object z_4;
   public Object z_5;
   public Object z_6;
   public Object z_7;
   public Object U_0;
   public Object U_1;
   public Object U_2;
   public Object U_3;
   public Object U_4;
   public Object U_5;
   public Object E_0;
   public Object E_1;
   public Object E_2;
   public Object E_3;
   public Object E_4;
   public Object E_5;
   public Object E_6;
   public Object E_7;
   public Object W_0;
   public Object W_1;
   public Object W_2;
   public Object W_3;
   public Object W_4;
   public Object W_5;
   public Object m_0;
   public Object m_1;
   public Object m_2;
   public Object m_3;
   public Object P_0;
   public Object P_1;
   public Object s_0;
   public Object s_1;
   public Object T_0;
   public Object T_1;
   public Object T_2;
   public Object T_3;
   public Object T_4;
   public Object T_5;
   public Object T_6;
   public Object b_0;
   public Object b_1;
   public Object b_2;
   public static Object j_0;
   public static Object j_1 = LogUtils.getLogger();
   public static Object j_2;
   public static Object j_3 = class01894.y("default");
   public static Object j_4 = class01894.y("uniform");
   public Object v_0;
   public Object v_1;
   public Object v_2;
   public Object v_3;
   public Object n_0;
   public Object n_1;
   public Object n_2;
   public Object n_3;
   public static Object t_0 = class01894.y("alt");
   public static Object t_1 = class01894.y("regional_compliancies.json");
   public Object G_0;
   public Object G_1;
   public Object G_2;
   public Object G_3;
   public Object G_4;
   public Object G_5;
   public Object l_0;
   public Object l_1;
   public Object l_2;
   public Object l_3;
   public Object l_4;
   public Object l_5;
   public Object l_6;
   public static Object d_0 = CompletableFuture.completedFuture(class06244.field_17274);
   public static Object d_1 = class00392.L("multiplayer.socialInteractions.not_available");
   public static Object d_2 = class00392.L("menu.savingLevel");
   public static Object d_3;
   public static Object d_4;
   public static Object d_5;
   public static Object d_6 = LoggerFactory.getLogger("fabric-screen-api-v1");
   public static Object d_7 = true;
   public boolean z_init;

   private void w(CallbackInfo var1) {
      ((EndTick)ClientTickEvents.END_CLIENT_TICK.invoker()).onEndTick(this);
   }

   public class02862 NY() {
      this.yF();
      return (class02862)this.B_5;
   }

   private void L(@Nullable class00392 var1) {
      class06132.y(this.m(), class06095.L, class00392.L("resourcePack.load_fail"), var1);
   }

   public void L(class05096 var1) {
      this.yF();
      this.N(var1, null);
      class01683 class01683 = this.NE();
      if (class01683 != null) {
         class01683.i();
      }

      if (((class04526)this.R_2).i()) {
         this.yx();
      }

      ((class03386)this.i_5).W();
      this.T_2 = null;
      ((class05153)this.N_3).y();
      this.G_1 = true;

      try {
         this.y(var1);
         ((class01056)this.i_6).z();
         this.T_3 = null;
         this.y(null);
         this.T_4 = null;
      } finally {
         this.G_1 = false;
      }
   }

   public void L(class07080 var1) {
      this.yF();
      this.G_4 = (Supplier<class07080>)() -> var1;
   }

   private void L(@Nullable class05096 var1, CallbackInfo var2) {
      this.yF();
      Thread thread = Thread.currentThread();
      if ((Boolean)d_7 && thread != (Thread)this.G_2) {
         ((Logger)d_6)
            .error(
               "Attempted to set screen to \"{}\" outside the render thread (\"{}\"). This will likely follow a crash! Make sure to call setScreen on the render thread.",
               var1,
               thread.getName()
            );
      }
   }

   @Override
   public void L(boolean var1) {
      this.yF();
      this.U_3 = var1;
   }

   private void L(CallbackInfoReturnable var1) {
      this.yF();
      if ((Boolean)this.n_0) {
         var1.setReturnValue(false);
      }
   }

   private void L(boolean var1, CallbackInfo var2) {
      this.yF();
      long i = GL32C.glFenceSync(37143, 0);
      if (i == 0L) {
         throw new RuntimeException("Failed to create fence object");
      } else {
         ((LongArrayFIFOQueue)this.n_2).enqueue(i);
      }
   }

   @Override
   public boolean L(Runnable var1) {
      return true;
   }

   public boolean L() {
      class08844 class08844 = this.Nt();
      return class04655.N(class08844, 340) || class04655.N(class08844, 344);
   }

   private void L(class03448 var1, CallbackInfo var2) {
      BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(var1, EventState.POST));
   }

   private void L(@Nullable class06216 var1) {
      this.yF();
      Runnable runnable = this.u(var1);
      class03467.N.y(class02117.Q);
      class03467.N.y(class02117.w);
      class03467.N.N(((class03323)this.m_0).N());
      runnable.run();
      ((class05630)this.i_7).NO = true;
      ((class05630)this.i_7).Np();
   }

   private void L(CallbackInfo var1) {
      class08700.N().N("iris_keybinds");
      Iris.handleKeybinds(this);
      class08700.N().L();
   }

   public class03400 Nd() {
      this.yF();
      return (class03400)this.m_2;
   }

   public class03325 Nl() {
      this.yF();
      return (class03325)this.m_3;
   }

   public void No() {
      this.yF();
      ((class05463)this.b_1).N();
      this.c().N();
   }

   private void M(boolean var1) {
      this.yF();
      this.N(var1, null);
      this.y(null);
      ((class08844)this.z_7).N("Pre render");
      if (((class08844)this.z_7).L()) {
         this.NP();
      }

      if ((CompletableFuture)this.U_4 != null && !((class01323)this.G_0 instanceof class06305)) {
         CompletableFuture completablefuture = (CompletableFuture)this.U_4;
         this.U_4 = null;
         this.yy().thenRun(() -> completablefuture.complete(null));
      }

      class02212 class02212 = (class02212)this.B_0;
      long k1 = class07536.L();
      this.u(var1, null);
      int k = class02212.N(k1, var1);
      class04643 class04643 = class08700.N();
      if (var1) {
         try (class06734 class06734xx = this.yj()) {
            class04643.N("scheduledPacketProcessing");
            ((class00458)this.Z_4).y();
            class04643.y("scheduledExecutables");
            this.g();
            class04643.L();
         }

         class04643.N("tick");
         if (k > 0 && this.yQ()) {
            class04643.N("textures");
            ((class08627)this.z_3).N();
            class04643.L();
         }

         for (int l = 0; l < Math.min(10, k); l++) {
            class04643.R("clientTick");

            try (class06734 class06734 = this.yj()) {
               this.NQ();
            }
         }

         if (k > 0 && ((class03448)this.T_3 == null || ((class03448)this.T_3).method_54719().Z())) {
            this.Z_6 = ((class06739)this.Z_5).N();
         }

         class04643.L();
      }

      ((class08844)this.z_7).N("Render");

      boolean flag;
      try (class06734 class06734x = ((class03063)this.B_2).l()) {
         class04643.N("gpuAsync");
         RenderSystem.executePendingTasks();
         class04643.y("sound");
         ((class09033)this.E_1).N(((class03386)this.i_5).s());
         class04643.y("toasts");
         ((class06086)this.u_7).N();
         class04643.y("mouse");
         ((class06220)this.L_2).N();
         class04643.y("render");
         long i = class07536.u();
         if (!((class05731)this.L_0).y(class06134.k) && !((class04526)this.R_2).i()) {
            flag = false;
            this.N_1 = 0.0;
         } else {
            flag = ((class04379)this.N_2 == null || ((class04379)this.N_2).y()) && !class04368.N().y();
            if (flag) {
               class04368.N().L();
            }
         }

         class08066 class08066 = this.e();
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class08066.L(), 0, class08066.i(), 1.0);
         class04643.N("gameRenderer");
         if (!(Boolean)this.v_2) {
            ((class03386)this.i_5).N((class02212)this.B_0, var1);
         }

         class04643.y("blit");
         class08844 class08844x = (class08844)this.z_7;
         this.y(var1, null);
         class08844 class08844x = class08844x;
         if (!this.N(class08844x)) {
            class08066.y();
         }

         this.G_5 = class07536.u() - i;
         if (flag) {
            this.N_2 = class04368.N().u();
         }

         class04643.y("updateDisplay");
         if ((class08712)this.E_0 != null) {
            ((class08712)this.E_0).N();
            ((class08712)this.E_0).N(class08066);
         }

         class08844 class08844xx = (class08844)this.z_7;
         class08712 class08712 = (class08712)this.E_0;
         this.i(var1, null);
         class08844xx.N(class08712);
         int j = ((class02742)this.U_0).N();
         if (j < 260) {
            RenderSystem.limitDisplayFPS(j);
         }

         class04643.L();
         class04643.y("yield");
         Thread.yield();
         class04643.L();
      }

      ((class08844)this.z_7).N("Post render");
      this.v_1 = (Integer)this.v_1 + 1;
      boolean flag1 = (Boolean)this.M_6;
      this.M_6 = this.v()
         && ((class05096)this.v_3 != null && ((class05096)this.v_3).method_25421() || (class01323)this.G_0 != null && ((class01323)this.G_0).N())
         && !((class08337)this.T_5).P();
      if (!flag1 && (Boolean)this.M_6) {
         ((class09033)this.E_1).N(class04911.field_15253, class04911.field_61058);
      }

      ((class02212)this.B_0).y((Boolean)this.M_6);
      ((class02212)this.B_0).L(!this.yQ());
      long i1 = class07536.u();
      long j1 = i1 - (Long)this.M_7;
      if (flag) {
         this.N_0 = j1;
      }

      this.ND().N(j1);
      this.M_7 = i1;
      class04643.N("fpsUpdate");
      if ((class04379)this.N_2 != null && ((class04379)this.N_2).y()) {
         this.N_1 = ((class04379)this.N_2).L() * 100.0 / ((Long)this.N_0).longValue();
      }

      while (class07536.L() >= (Long)this.v_0 + 1000L) {
         d_4 = (Integer)this.v_1;
         this.R(var1, null);
         this.v_0 = (Long)this.v_0 + 1000L;
         this.v_1 = 0;
      }

      class04643.L();
      this.L(var1, null);
   }

   public Path M() {
      this.yF();
      return (Path)this.z_1;
   }

   private void M(CallbackInfo var1) {
      this.yF();
      if ((BiFunction)this.Z_7 != null) {
         for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            Type type = ibaritone.getPlayerContext().player() != null && ibaritone.getPlayerContext().world() != null ? Type.IN : Type.OUT;
            ibaritone.getGameEventHandler().onPostTick((TickEvent)((BiFunction)this.Z_7).apply(EventState.POST, type));
         }

         this.Z_7 = null;
      }
   }

   private void M(boolean var1, CallbackInfo var2) {
      this.yF();
      if ((Boolean)this.n_0) {
         if ((class03443)this.T_2 != null) {
            ((class03443)this.T_2).L();
         }

         var2.cancel();
      }
   }

   private void P(CallbackInfo var1) {
      this.yF();
      if (DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
         Queue queue = ((class06220)this.L_2).viaFabricPlus$getPendingScreenEvents();

         while (!queue.isEmpty()) {
            ((Runnable)queue.poll()).run();
         }

         queue = ((class06197)this.L_3).viaFabricPlus$getPendingScreenEvents();

         while (!queue.isEmpty()) {
            ((Runnable)queue.poll()).run();
         }
      }
   }

   public boolean P() {
      this.yF();
      return (Boolean)this.M_6;
   }

   public void NP() {
      this.yF();
      this.G_3 = false;
   }

   public class08396 X() {
      this.yF();
      return (class08396)this.s_1;
   }

   public class03579 K() {
      this.yF();
      return (class03579)this.b_2;
   }

   private void T(CallbackInfo var1) {
      ((Logger)j_1).debug("Freezing registries");
      class04206.N();
      BlockInitTracker.postFreeze();
      class03771.N();
   }

   public boolean T() {
      this.yF();
      return (class04453)this.T_4 != null && (class03443)this.T_2 != null;
   }

   private void Q(CallbackInfo var1) {
      class11397 class11397 = class11397.L();
      class11938.L().L(class11397);
      if (class11397.y()) {
         var1.cancel();
      }
   }

   public class06202(class09454 var1) {
      super("Client");
      this.yF();
      this.n_2 = new LongArrayFIFOQueue();
      this.n_3 = Workarounds.isWorkaroundEnabled(Reference.INTEL_FRAMEBUFFER_BLIT_CRASH_WHEN_UNFOCUSED);
      this.z_0 = Double.doubleToLongBits(Math.PI);
      this.B_0 = new class02212(20.0F, 0L, this::N);
      this.l_0 = class02111.field_41777;
      this.E_6 = new class03520((class01894)t_1, class06202::N);
      this.M_7 = class07536.u();
      this.U_2 = true;
      this.R_2 = class04538.N;
      this.R_3 = new class03465();
      this.Z_5 = new class06739();
      this.Z_6 = new ArrayList();
      j_0 = this;
      this.Z_2 = System.currentTimeMillis();
      this.l_1 = var1.L.N;
      File file1 = var1.L.L;
      this.z_1 = var1.L.y.toPath();
      this.l_2 = var1.u.y;
      this.l_3 = var1.u.L;
      Path path = ((File)this.l_1).toPath();
      this.Z_0 = class04777.N(path.resolve("allowed_symlinks.txt"));
      class00190 class00190 = new class00190(var1.L.N(), (class04173)this.Z_0);
      this.W_5 = new class00232(this, path.resolve("downloads"), var1.N);
      class01626 class01626 = new class01626((Path)this.z_1, class01603.field_14188, class01283.y, (class04173)this.Z_0);
      this.s_0 = new class01623(class00190, ((class00232)this.W_5).N(), class01626);
      this.W_4 = class00190.L();
      this.l_4 = var1.N.y;
      this.l_5 = var1.u.B;
      YggdrasilAuthenticationService yggdrasilauthenticationservice = (Boolean)this.l_5
         ? YggdrasilAuthenticationService.createOffline((Proxy)this.l_4)
         : new YggdrasilAuthenticationService((Proxy)this.l_4);
      this.T_0 = class03930.N(yggdrasilauthenticationservice, (File)this.l_1);
      this.i_2 = var1.N.N;
      this.z_2 = (Boolean)this.l_5 ? CompletableFuture.completedFuture(null) : CompletableFuture.supplyAsync(() -> {
         this.yF();
         return ((class03930)this.T_0).L().fetchProfile(((class04771)this.i_2).y(), true);
      }, class07536.z());
      this.E_7 = this.N(yggdrasilauthenticationservice, var1);
      this.u_0 = CompletableFuture.supplyAsync(() -> UserApiService.OFFLINE_PROPERTIES, class07536.z());
      ((Logger)j_1).info("Setting user: {}", ((class04771)this.i_2).L());
      ((Logger)j_1).debug("(Session ID is {})", ((class04771)this.i_2).N());
      this.W_0 = var1.u.N;
      this.W_1 = !var1.u.u;
      this.W_2 = !var1.u.i;
      this.T_5 = null;
      class04441.N(class06428::N);
      this.z_5 = class04999.N();
      Hooks.startClient((File)this.l_1, this);
      this.T(null);
      this.G_2 = Thread.currentThread();
      File file2 = (File)this.l_1;
      this.R(null);
      this.i_7 = new class05630(this, file2);
      this.L_0 = new class05731((File)this.l_1);
      this.u_7 = new class06086(this, (class05630)this.i_7);
      boolean flag = ((class05630)this.i_7).NO;
      ((class05630)this.i_7).NO = false;
      ((class05630)this.i_7).Np();
      this.G_3 = true;
      this.b_0 = new class08764(this, (class05630)this.i_7);
      this.L_1 = new class06418(path, (DataFixer)this.z_5);
      Logger logger = (Logger)j_1;
      this.W(null);
      logger.info("Backend library: {}", RenderSystem.getBackendDescription());
      class01018 class01018 = var1.y;
      if (((class05630)this.i_7).s > 0 && ((class05630)this.i_7).P > 0) {
         class01018 = var1.y.N(((class05630)this.i_7).P, ((class05630)this.i_7).s);
      }

      if (!flag) {
         class01018 = class01018.N(false);
         ((class05630)this.i_7).U = null;
         ((Logger)j_1).warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      class07536.u = RenderSystem.initBackendSystem();
      this.z_6 = new class04669(this);
      this.z_7 = ((class04669)this.z_6).N(class01018, ((class05630)this.i_7).U, this.LN());
      this.L(true);
      ((class08844)this.z_7).N(new class10559(this, var1));
      class03467.N.y(class02117.k);

      try {
         ((class08844)this.z_7).N((class01611)this.W_4, class07529.y().comp_4031() ? class03499.field_44650 : class03499.field_44651);
      } catch (IOException ioexception) {
         ((Logger)j_1).error("Couldn't set icon", ioexception);
      }

      this.L_2 = new class06220(this);
      ((class06220)this.L_2).N((class08844)this.z_7);
      this.L_3 = new class06197(this);
      ((class06197)this.L_3).N((class08844)this.z_7);
      RenderSystem.initRenderer(((class08844)this.z_7).B(), ((class05630)this.i_7).j, class07529.e, (var1x, var2x) -> this.ym().N(var1x, var2x), var1.u.M);
      ((class05630)this.i_7).N(((class05630)this.i_7).Z().method_41753());
      ((Logger)j_1).info("Using optional rendering extensions: {}", String.join(", ", RenderSystem.getDevice().getEnabledExtensions()));
      this.P_1 = new class03453(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
      this.W_3 = new class01068(class01603.field_14188);
      ((class01623)this.s_0).N();
      ((class05630)this.i_7).y((class01623)this.s_0);
      this.s_1 = new class08396(((class05630)this.i_7).Nk, var1x -> {
         this.yF();
         if ((class04453)this.T_4 != null) {
            ((class01683)((class04453)this.T_4).y_0).k();
         }
      });
      ((class01068)this.W_3).N((class08396)this.s_1);
      this.z_3 = new class08627((class01068)this.W_3);
      ((class01068)this.W_3).N((class08627)this.z_3);
      this.z_4 = new class08212((class08627)this.z_3, this::N);
      ((class01068)this.W_3).N((class08212)this.z_4);
      class08377 class08377 = new class08377((Proxy)this.l_4, (class08627)this.z_3, this);
      this.u_1 = new class08555(file1.toPath().resolve("skins"), (class03930)this.T_0, class08377, this);
      this.l_6 = new class04777(path.resolve("saves"), path.resolve("backups"), (class04173)this.Z_0, (DataFixer)this.z_5);
      this.N_6 = new class01879(path);
      this.E_2 = new class09000(this);
      this.E_1 = new class09033((class05630)this.i_7);
      ((class01068)this.W_3).N((class09033)this.E_1);
      this.E_4 = new class06176((class04771)this.i_2);
      ((class01068)this.W_3).N((class06176)this.E_4);
      this.u_2 = new class08117((class08627)this.z_3, ((class05630)this.i_7).V().method_41753());
      ((class01068)this.W_3).N((class08117)this.u_2);
      class07904 class07904 = new class07904(this, ((class03930)this.T_0).M());
      this.T_1 = new class07949((class08627)this.z_3, (class08555)this.u_1, class07904);
      class06603.N((class07949)this.T_1);
      this.E_3 = new class04866((class08627)this.z_3, (class08117)this.u_2, (class07949)this.T_1);
      this.i_3 = ((class04866)this.E_3).N();
      this.i_4 = ((class04866)this.E_3).y();
      ((class01068)this.W_3).N((class04866)this.E_3);
      this.NU();
      ((class01068)this.W_3).N(new class08543());
      ((class01068)this.W_3).N(new class08575());
      ((class01068)this.W_3).N(new class08521());
      ((class08844)this.z_7).N("Startup");
      RenderSystem.setupDefaultState();
      ((class08844)this.z_7).N("Post startup");
      this.P_0 = class01587.N();
      this.u_3 = new class00183((class01587)this.P_0, (class08117)this.u_2, (class07949)this.T_1);
      ((class01068)this.W_3).N((class00183)this.u_3);
      class08718 class08718 = new class08718();
      ((class01068)this.W_3).N(class08718);
      this.B_4 = new class08943((class00183)this.u_3);
      this.B_5 = new class02862();
      this.u_5 = new class08265((class08627)this.z_3);
      this.B_6 = new class01083((class08117)this.u_2, (class08265)this.u_5);

      try {
         int i = Runtime.getRuntime().availableProcessors();
         class07849.N();
         this.B_1 = new class01386(i);
      } catch (OutOfMemoryError outofmemoryerror) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + class03597.U,
            "ok",
            "error",
            true
         );
         throw new class05909("Unable to allocate render buffers", outofmemoryerror);
      }

      this.b_1 = new class05463(this, (UserApiService)this.E_7);
      this.u_4 = new class01999(((class00183)this.u_3).y(), (class08117)this.u_2, (class01587)this.P_0);
      ((class01068)this.W_3).N((class01999)this.u_4);
      this.B_3 = new class01781(
         this,
         (class08627)this.z_3,
         (class08943)this.B_4,
         (class01083)this.B_6,
         (class01999)this.u_4,
         (class08117)this.u_2,
         (class01590)this.i_3,
         (class05630)this.i_7,
         ((class00183)this.u_3).u(),
         class08718,
         (class07949)this.T_1
      );
      ((class01068)this.W_3).N((class01781)this.B_3);
      this.b_2 = new class03579(
         (class01590)this.i_3,
         ((class00183)this.u_3).u(),
         (class01999)this.u_4,
         (class08943)this.B_4,
         (class02862)this.B_5,
         (class01781)this.B_3,
         (class08117)this.u_2,
         (class07949)this.T_1
      );
      ((class01068)this.W_3).N((class03579)this.b_2);
      this.i_1 = new class00951();
      ((class01068)this.W_3).N((class00951)this.i_1);
      this.i_0 = new class04410((class03448)this.T_3, (class00951)this.i_1);
      ((class00951)this.i_1).N(((class04410)this.i_0)::L);
      this.u_6 = new class08290();
      ((class01068)this.W_3).N((class08290)this.u_6);
      this.i_5 = new class03386(this, ((class01781)this.B_3).y(), (class01386)this.B_1, (class01999)this.u_4);
      this.B_2 = new class03063(this, (class01781)this.B_3, (class03579)this.b_2, (class01386)this.B_1, ((class03386)this.i_5).u(), ((class03386)this.i_5).L());
      ((class01068)this.W_3).N((class03063)this.B_2);
      ((class01068)this.W_3).N(((class03063)this.B_2).G());
      this.E_5 = new class01246();
      ((class01068)this.W_3).N((class01246)this.E_5);
      ((class01068)this.W_3).N((class03520)this.E_6);
      this.i_6 = new class01056(this);
      class05111 class05111 = class05111.N(this);
      this.m_2 = new class03400(class05111);
      RenderSystem.setErrorCallback(this::N);
      if (((class08066)this.P_1).N != ((class08844)this.z_7).U() || ((class08066)this.P_1).y != ((class08844)this.z_7).E()) {
         StringBuilder stringbuilder = new StringBuilder(
            "Recovering from unsupported resolution ("
               + ((class08844)this.z_7).U()
               + "x"
               + ((class08844)this.z_7).E()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );

         try {
            GpuDevice gpudevice = RenderSystem.getDevice();
            List list = gpudevice.getLastDebugMessages();
            if (!list.isEmpty()) {
               stringbuilder.append("\n\nReported GL debug messages:\n").append(String.join("\n", list));
            }
         } catch (Throwable throwable) {
         }

         ((class08844)this.z_7).N(((class08066)this.P_1).N, ((class08066)this.P_1).y);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", stringbuilder.toString(), "ok", "error", false);
      } else if (((class05630)this.i_7).NP().method_41753() && !((class08844)this.z_7).Z()) {
         if (flag) {
            ((class08844)this.z_7).M();
            ((class05630)this.i_7).NP().method_41748(((class08844)this.z_7).Z());
         } else {
            ((class05630)this.i_7).NP().method_41748(false);
         }
      }

      ((class08844)this.z_7).N(((class05630)this.i_7).NN().method_41753());
      ((class08844)this.z_7).y(((class05630)this.i_7).F().method_41753());
      ((class08844)this.z_7).L(((class05630)this.i_7).A().method_41753());
      ((class08844)this.z_7).u();
      this.V();
      ((class03386)this.i_5).N(((class01611)this.W_4).y());
      this.m_0 = new class03323(this, (UserApiService)this.E_7, (class04771)this.i_2);
      this.m_1 = (Boolean)this.l_5 ? class02051.N : class02051.N((UserApiService)this.E_7, (class04771)this.i_2, path);
      this.N_3 = new class05153(this);
      ((class05153)this.N_3).N(((class05630)this.i_7).NV().method_41753() != class01299.field_18176);
      this.N_4 = new class03040(this);
      ((class03040)this.N_4).N(((class05630)this.i_7).q().method_41753());
      this.N_5 = class03409.N(class03415.N(), (UserApiService)this.E_7);
      class04705.N((class08627)this.z_3);
      class08627 class08627 = (class08627)this.z_3;
      this.N(class08627, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_1060]");
         class06305.N((class08627)var0[0]);
         return (Void)null;
      });
      ((class03386)this.i_5).n().N((class08627)this.z_3);
      this.N((class05096)(new class06307(class00392.L("gui.loadingMinecraft"))));
      List list1 = ((class01623)this.s_0).B();
      ((class03465)this.R_3).N(class03424.field_33702, list1);
      class06164 class06164 = ((class01068)this.W_3).N(class07536.B().N("resourceLoad"), this, (CompletableFuture<class06244>)d_0, list1);
      class03467.N.N(class02117.Q);
      class06216 class06216 = new class06216(class05111, var1.i);
      this.N((class01323)(new class06305(this, class06164, var2x -> class07536.N(var2x, var2xx -> this.N(var2xx, class06216), () -> {
         this.yF();
         if (class07529.ND) {
            this.yh();
         }

         ((class03465)this.R_3).N();
         this.y(class06216);
      }), false)));
      this.m_3 = class03325.N(var1.i.y());
      this.U_0 = new class02742((class05630)this.i_7, this);
      this.R_1 = new class06007(class07536.u, () -> {
         this.yF();
         return (Integer)this.R_0;
      }, ((class02742)this.U_0)::L);
      if (TracyClient.isAvailable() && var1.u.R) {
         this.E_0 = new class08712();
      } else {
         this.E_0 = null;
      }

      this.Z_4 = new class00458((Thread)this.G_2);
      this.i(null);
      this.y(var1, null);
      this.l(null);
      this.N(var1, null);
   }

   static {
      LM();
      FabricLoader.getInstance();
   }

   private boolean B(boolean var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && var1;
   }

   private void B(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
         PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_9_3.CLIENT_COMMAND, ProtocolTranslator.getPlayNetworkUserConnection());
         packetwrapper.write(Types.VAR_INT, 2);
         packetwrapper.scheduleSendToServer(Protocol1_11_1To1_12.class);
      }
   }

   public class00458 B() {
      this.yF();
      return (class00458)this.Z_4;
   }

   public static boolean C() {
      return !((class03386)((class06202)j_0).i_5).R() && ((class05630)((class06202)j_0).i_7).s().method_41753();
   }

   public class00183 D() {
      this.yF();
      return (class00183)this.u_3;
   }

   @Nullable
   public class07049 F() {
      this.yF();
      return (class07049)this.M_1;
   }

   public class01910 S() {
      this.yF();
      return new class01910(this, (class04777)this.l_6);
   }

   public static class04032 Z() {
      return class04032.N("vanilla", class02798::N, "Client", class06202.class);
   }

   private void Z(CallbackInfo var1) {
      ((StartTick)ClientTickEvents.START_CLIENT_TICK.invoker()).onStartTick(this);
   }

   @Override
   public void V() {
      this.yF();
      int i = ((class08844)this.z_7).N(((class05630)this.i_7).Nq().method_41753(), this.NR());
      ((class08844)this.z_7).N(i);
      if ((class05096)this.v_3 != null) {
         ((class05096)this.v_3).method_25410(((class08844)this.z_7).P(), ((class08844)this.z_7).s());
      }

      this.e().N(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
      ((class03386)this.i_5).N(((class08844)this.z_7).U(), ((class08844)this.z_7).E());
      ((class06220)this.L_2).M();
      this.d(null);
   }

   public class08066 e() {
      this.yF();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.u(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class08066)callbackinforeturnable.getReturnValue() : (class08066)this.P_1;
   }

   private void i(CallbackInfo var1) {
      BaritoneAPI.getProvider().getPrimaryBaritone();
   }

   private int i(int var1) {
      this.yF();
      class11399 class11399 = class11399.N(var1);
      class11938.L().L(class11399);
      return !class11399.y() ? class11399.L() : ((class04453)this.T_4).method_31548().N();
   }

   private void i(boolean var1) {
      this.yF();
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.M(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.Q(callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            if (!var1) {
               this.M_5 = 0;
            }

            if ((Integer)this.M_5 <= 0 && !this.u(((class04453)this.T_4).method_6115())) {
               if (!((class04453)this.T_4).method_5998(class07050.field_5808).L(class02484.c)) {
                  if (var1 && (class07089)this.M_3 != null && ((class07089)this.M_3).N() == class07113.field_1332) {
                     class06183 class06183 = (class06183)((class07089)this.M_3);
                     class07209 class07209 = class06183.u();
                     if (!((class03448)this.T_3).method_8320(class07209).P()) {
                        class07211 class07211 = class06183.i();
                        if (((class03443)this.T_2).y(class07209, class07211)) {
                           ((class03448)this.T_3).N(class07209, class07211);
                           ((class04453)this.T_4).method_6104(class07050.field_5808);
                        }
                     }
                  } else {
                     ((class03443)this.T_2).L();
                  }
               }
            }
         }
      }
   }

   private void i(CallbackInfoReturnable var1) {
      this.yF();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         ((class04453)this.T_4).method_6104(class07050.field_5808);
      }
   }

   private class05096 i(class06202 var1) {
      this.yF();
      return BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing() && (class04453)this.T_4 != null ? null : (class05096)var1.v_3;
   }

   private void i(boolean var1, CallbackInfo var2) {
      class11925.N();
      class11938.L().L(class10974.N());
      class11925.i();
   }

   private void i(class03448 var1, CallbackInfo var2) {
      if (var1 != null) {
         ((AfterClientWorldChange)ClientWorldEvents.AFTER_CLIENT_WORLD_CHANGE.invoker()).afterWorldChange(this, var1);
      }
   }

   public class06219 b() {
      this.yF();
      if (((class05630)this.i_7).v().method_41753() == class08027.field_7536) {
         return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_1;
      } else if (!(Boolean)this.W_2) {
         return class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_2;
      } else {
         return !this.Ly().flag(UserFlag.CHAT_ALLOWED)
            ? class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_3
            : class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_0;
      }
   }

   private void b(CallbackInfo var1) {
      this.yF();
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this.T_4);
      if (ibaritone != null) {
         ibaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.POST));
      }
   }

   public class01611 x() {
      this.yF();
      return (class01611)this.W_4;
   }

   public boolean s() {
      class08844 class08844 = this.Nt();
      return class04655.N(class08844, 341) || class04655.N(class08844, 345);
   }

   private void s(CallbackInfo var1) {
      this.yF();
      int i = ((class05630)this.i_7).I.fabric_getTimesPressed();
      if (!((class05630)this.i_7).I.R() && i == 0) {
         this.n_0 = false;
      } else {
         this.n_0 = ((ClientPreAttackCallback)ClientPreAttackCallback.EVENT.invoker()).onClientPlayerPreAttack(this, (class04453)this.T_4, i);
      }
   }

   public class02051 c() {
      this.yF();
      return (class02051)this.m_1;
   }

   private void n(CallbackInfo var1) {
      ((ClientStarted)ClientLifecycleEvents.CLIENT_STARTED.invoker()).onClientStarted(this);
   }

   public class03930 n() {
      this.yF();
      return (class03930)this.T_0;
   }

   public boolean h() {
      this.yF();
      return (class04453)this.T_4 != null && ((class04453)this.T_4).method_7302() || ((class05630)this.i_7).Nz().method_41753();
   }

   public String f() {
      this.yF();
      return (String)this.l_2;
   }

   public void l() {
      this.yF();
      ((class00232)this.W_5).Z();
      this.g();
   }

   private void l(CallbackInfo var1) {
      class11938.l();
   }

   public class01587 d() {
      this.yF();
      return (class01587)this.P_0;
   }

   private void d(CallbackInfo var1) {
      class06202 class06202 = Nq();
      class11938.L().L(class10983.N(class06202.Nt().U(), class06202.Nt().E()));
   }

   public class08290 a() {
      this.yF();
      return (class08290)this.u_6;
   }

   private void m(CallbackInfo var1) {
      this.yF();
      this.Z_7 = TickEvent.createNextProvider();

      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         Type type = ibaritone.getPlayerContext().player() != null && ibaritone.getPlayerContext().world() != null ? Type.IN : Type.OUT;
         ibaritone.getGameEventHandler().onTick((TickEvent)((BiFunction)this.Z_7).apply(EventState.PRE, type));
      }
   }

   public class06086 m() {
      this.yF();
      return (class06086)this.u_7;
   }

   @Nullable
   public static String p() {
      return System.getProperty("minecraft.launcher.brand");
   }

   @Override
   public Thread k() {
      this.yF();
      return (Thread)this.G_2;
   }

   private void k(CallbackInfo var1) {
      this.yF();
      ((Remove)ScreenEvents.remove((class05096)this.v_3).invoker()).onRemove((class05096)this.v_3);
   }

   private void t(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
         ItemPick1_21_3.doItemPick(this);
         var1.cancel();
      }
   }

   public class01623 t() {
      this.yF();
      return (class01623)this.s_0;
   }

   private void v(CallbackInfo var1) {
      this.yF();
      ((AfterTick)ScreenEvents.afterTick((class05096)this.n_1).invoker()).afterTick((class05096)this.n_1);
      this.n_1 = null;
   }

   public boolean v() {
      this.yF();
      return (Boolean)this.M_0 && (class08337)this.T_5 != null;
   }

   private void j(CallbackInfo var1) {
      this.yF();
      this.n_1 = (class05096)this.v_3;
      ((BeforeTick)ScreenEvents.beforeTick((class05096)this.n_1).invoker()).beforeTick((class05096)this.n_1);
   }

   public boolean j() {
      this.yF();
      ProfileResult profileresult = (ProfileResult)((CompletableFuture)this.z_2).getNow(null);
      return profileresult != null && profileresult.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean q() {
      this.yF();
      return (Boolean)this.M_0;
   }

   public boolean U() {
      class08844 class08844 = this.Nt();
      return class04655.N(class08844, 342) || class04655.N(class08844, 346);
   }

   private void U(CallbackInfo var1) {
      ((ClientStopping)ClientLifecycleEvents.CLIENT_STOPPING.invoker()).onClientStopping(this);
   }

   @Override
   public void close() {
      this.yF();
      if ((class04379)this.N_2 != null) {
         ((class04379)this.N_2).N();
      }

      try {
         ((class03323)this.m_0).close();
         ((class03520)this.E_6).close();
         ((class08117)this.u_2).close();
         ((class04866)this.E_3).close();
         ((class03386)this.i_5).close();
         ((class08212)this.z_4).close();
         ((class03063)this.B_2).close();
         ((class09033)this.E_1).i();
         ((class08265)this.u_5).close();
         ((class08627)this.z_3).close();
         ((class01068)this.W_3).close();
         if ((class08712)this.E_0 != null) {
            ((class08712)this.E_0).close();
         }

         class04284.y();
         class07536.U();
         RenderSystem.getSamplerCache().y();
         RenderSystem.getDevice().close();
      } catch (Throwable throwable) {
         ((Logger)j_1).error("Shutdown failure!", throwable);
         throw throwable;
      } finally {
         ((class04669)this.z_6).close();
         ((class08844)this.z_7).close();
      }
   }

   private void z(CallbackInfo var1) {
      this.yF();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && (Integer)this.M_5 > 0) {
         this.M_5 = (Integer)this.M_5 - 1;
      }
   }

   public Collection<class06748> z() {
      this.yF();
      return (List)this.Z_6;
   }

   private Runnable u(@Nullable class06216 var1) {
      ArrayList arraylist = new ArrayList();
      boolean flag = this.N(arraylist);
      Runnable runnable = () -> {
         if (var1 != null && var1.y().N()) {
            class03330.N(this, var1.y().L(), var1.N());
         } else {
            this.N((class05096)(new class04705(true, new class02088(flag))));
         }
      };
      Iterator iterator = Lists.reverse(arraylist).iterator();

      while (iterator.hasNext()) {
         class05096 class05096 = (class05096)((Function)iterator.next()).apply(runnable);
         runnable = () -> this.N(class05096);
      }

      this.N(null);
      return runnable;
   }

   private void u(boolean var1, CallbackInfo var2) {
      class11923.N();
   }

   private void u(class03448 var1, CallbackInfo var2) {
      this.yF();
      if ((class03448)this.T_3 != null || var1 != null) {
         BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onWorldEvent(new WorldEvent(var1, EventState.PRE));
      }
   }

   private boolean u(boolean var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && var1;
   }

   private void u(CallbackInfoReturnable var1) {
      this.yF();
      class10952 class10952 = class10952.N((class08066)this.P_1);
      class11938.L().L(class10952);
      var1.setReturnValue(class10952.N());
   }

   public void u(class07080 var1) {
      this.yF();
      this.G_4 = (Supplier<class07080>)() -> this.N(var1);
   }

   private void u(CallbackInfo var1) {
      this.yF();
      this.n_1 = (class05096)this.v_3;
      ((BeforeTick)ScreenEvents.beforeTick((class05096)this.n_1).invoker()).beforeTick((class05096)this.n_1);
   }

   public boolean r() {
      this.yF();
      return (Boolean)this.G_3;
   }

   public boolean y(class07049 var1) {
      this.yF();
      return var1.method_5851()
         || (class04453)this.T_4 != null && ((class04453)this.T_4).method_7325() && ((class05630)this.i_7).x.R() && var1.method_5864() == class07078.Ly;
   }

   public boolean y() {
      this.yF();
      return (Boolean)this.U_3;
   }

   public boolean y(Consumer<class00392> var1) {
      this.yF();
      if (((class04526)this.R_2).i()) {
         this.yA();
         return false;
      } else {
         Consumer consumer = var2x -> {
            if (var2x != class04645.N) {
               int i = var2x.R();
               double d0 = (double)var2x.M() / class01517.N;
               this.execute(
                  () -> var1.accept(
                     class00392.N("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", d0), i, String.format(Locale.ROOT, "%.2f", i / d0))
                  )
               );
            }
         };
         Consumer consumer1 = var2x -> {
            class05216 class05216 = class00392.y(var2x.toString()).N(class06541.field_1073).N(var1xx -> var1xx.N(new class00623(var2x.getParent())));
            this.execute(() -> var1.accept(class00392.N("debug.profiling.stop", class05216)));
         };
         class03463 class03463 = N(new class03463(), this, (class08396)this.s_1, (String)this.l_2, (class05630)this.i_7);
         Consumer consumer2 = var3x -> {
            Path path = this.N(class03463, var3x);
            consumer1.accept(path);
         };
         Consumer consumer3;
         if ((class08337)this.T_5 == null) {
            consumer3 = var1x -> consumer2.accept(ImmutableList.of(var1x));
         } else {
            ((class08337)this.T_5).y(class03463);
            CompletableFuture completablefuture = new CompletableFuture();
            CompletableFuture completablefuture1 = new CompletableFuture();
            CompletableFuture.allOf(completablefuture, completablefuture1)
               .thenRunAsync(() -> consumer2.accept(ImmutableList.of((Path)completablefuture.join(), (Path)completablefuture1.join())), class07536.Z());
            ((class08337)this.T_5).N(var0 -> {}, completablefuture1::complete);
            consumer3 = completablefuture::complete;
         }

         this.R_2 = class04541.N(new class04578(class07536.u, (class03063)this.B_2), class07536.u, class07536.Z(), new class04524("client"), var2x -> {
            this.yF();
            this.R_2 = class04538.N;
            consumer.accept(var2x);
         }, consumer3);
         return true;
      }
   }

   private void y(boolean var1, @Nullable class06014 var2) {
      this.yF();
      if (var2 != null) {
         var2.y();
      }

      class02427 class02427 = this.ND().E();
      if (var1) {
         class02427.N(((class06007)this.R_1).i());
      } else {
         class02427.N(null);
      }
   }

   private void y(CallbackInfo var1) {
      SodiumExtraClientMod.onTick(this);
   }

   public void y(class05096 var1) {
      try (class08694 class08694 = class08700.N().i("forcedTick")) {
         this.N(var1);
         this.M(false);
      }
   }

   private void y(CallbackInfoReturnable var1) {
      this.yF();
      ResourcePackScanner.checkIfCoreShaderLoaded((class01068)this.W_3);
   }

   private boolean y(class04453 var1, class07050 var2) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_15);
   }

   private void y(class05096 var1, boolean var2, boolean var3, CallbackInfo var4) {
      this.yF();
      if ((class03448)this.T_3 != null) {
         ((Runnable)de.maxhenkel.voicechat.events.ClientWorldEvents.DISCONNECT.invoker()).run();
      }
   }

   public boolean y(UUID var1) {
      return var1.equals(this.Ny().y());
   }

   @Override
   public Runnable y(Runnable var1) {
      return var1;
   }

   private class07064 y(class07041 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) ? class07064.field_52426 : var1.i();
   }

   private void y(boolean var1, CallbackInfo var2) {
      this.yF();
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.e().i(), 1.0);
      class11925.N();

      try (class12027 class12027 = class12027.y()) {
         class11938.L().L(class10989.N(new class01054(Nq(), ((class03386)this.i_5).B, 0, 0), this.NK()));
      }

      GlStateManager._glBindFramebuffer(36160, 0);
      class11925.i();
   }

   private void y(@Nullable class05096 var1, CallbackInfo var2) {
      this.yF();
      ((Remove)ScreenEvents.remove((class05096)this.v_3).invoker()).onRemove((class05096)this.v_3);
   }

   public void y(class07080 var1) {
      this.yF();
      class04583.y();
      class07080 class07080 = this.N(var1);
      this.yp();
      N(this, (File)this.l_1, class07080);
   }

   private void y(@Nullable class06216 var1) {
      this.yF();
      if (!(Boolean)this.Z_1) {
         this.Z_1 = true;
         this.L(var1);
      }
   }

   private void y(class03448 var1, CallbackInfo var2) {
      if (Iris.getCurrentDimension() != Iris.lastDimension) {
         Iris.logger.info("Reloading pipeline on dimension change: " + Iris.lastDimension + " => " + Iris.getCurrentDimension());
         Iris.getPipelineManager().destroyPipeline();
         if (var1 != null) {
            Iris.getPipelineManager().preparePipeline(Iris.getCurrentDimension());
         }
      }
   }

   private void y(@Nullable class03448 var1) {
      this.y(var1, null);
      this.N(var1, true);
      this.i(var1, null);
   }

   private void y(class09454 var1, CallbackInfo var2) {
      if (!IrisPlatformHelpers.getInstance().isModLoaded("fabric-resource-loader-v0")) {
         try {
            Nq()
               .NO()
               .N(
                  class01894.N("iris", "textures/gui/widgets.png"),
                  new NativeImageBackedCustomTexture(
                     new PngData(
                        new TextureFilteringData(false, false), IOUtils.toByteArray(Iris.class.getResourceAsStream("/assets/iris/textures/gui/widgets.png"))
                     )
                  )
               );
         } catch (IOException ioexception) {
            throw new RuntimeException(ioexception);
         }
      }
   }

   public void y(boolean var1) {
      this.N(new class05125(true), false, var1);
   }

   public boolean E() {
      this.yF();
      return (Boolean)this.W_0;
   }

   private void E(CallbackInfo var1) {
      this.yF();
      ((AfterTick)ScreenEvents.afterTick((class05096)this.n_1).invoker()).afterTick((class05096)this.n_1);
      this.n_1 = null;
   }

   public class09000 A() {
      this.yF();
      return (class09000)this.E_2;
   }

   public void N(Throwable var1, @Nullable class00392 var2, @Nullable class06216 var3) {
      this.yF();
      ((Logger)j_1).info("Caught error loading resourcepacks, removing all selected resourcepacks", var1);
      ((class03465)this.R_3).N(var1);
      ((class00232)this.W_5).y();
      ((class01623)this.s_0).y(Collections.emptyList());
      ((class05630)this.i_7).Z.clear();
      ((class05630)this.i_7).z.clear();
      ((class05630)this.i_7).Np();
      this.N(true, var3).thenRunAsync(() -> this.L(var2), this);
   }

   private void N(CallbackInfoReturnable var1) {
      this.yF();
      ResourcePackScanner.checkIfCoreShaderLoaded((class01068)this.W_3);
      ConfigManager.registerConfigsLate();
   }

   public void N(class05096 var1, boolean var2) {
      this.N(var1, var2, true);
   }

   private void N(@Nullable class03448 var1, boolean var2) {
      this.yF();
      if (var2) {
         ((class09033)this.E_1).u();
      }

      this.N(null);
      this.T_6 = null;
      ((class03063)this.B_2).N(var1);
      ((class04410)this.i_0).N(var1);
      ((class03386)this.i_5).N(var1);
      this.yZ();
   }

   private CompletableFuture<Void> N(boolean var1, @Nullable class06216 var2) {
      this.yF();
      if ((CompletableFuture)this.U_4 != null) {
         return (CompletableFuture<Void>)this.U_4;
      } else {
         CompletableFuture completablefuture = new CompletableFuture();
         if (!var1 && (class01323)this.G_0 instanceof class06305) {
            this.U_4 = completablefuture;
            return completablefuture;
         } else {
            ((class01623)this.s_0).N();
            List list = ((class01623)this.s_0).B();
            if (!var1) {
               ((class03465)this.R_3).N(class03424.field_33703, list);
            }

            this.N(
               (class01323)(new class06305(
                  this,
                  ((class01068)this.W_3).N(class07536.B().N("resourceLoad"), this, (CompletableFuture<class06244>)d_0, list),
                  var4x -> class07536.N(var4x, var3xx -> {
                     this.yF();
                     if (var1) {
                        ((class00232)this.W_5).L();
                        this.yY();
                     } else {
                        this.N(var3xx, var2);
                     }
                  }, () -> {
                     this.yF();
                     ((class03063)this.B_2).u();
                     ((class03465)this.R_3).N();
                     ((class00232)this.W_5).u();
                     completablefuture.complete(null);
                     this.y(var2);
                  }),
                  !var1
               ))
            );
            return completablefuture;
         }
      }
   }

   private UserApiService N(YggdrasilAuthenticationService var1, class09454 var2) {
      return var2.u.B ? UserApiService.OFFLINE : var1.createUserApiService(var2.N.N.u());
   }

   private void N(CallbackInfo var1, class07050 var2, class06145 var3, class07049 var4) {
      this.yF();
      class07082 class07082 = ((UseEntityCallback)UseEntityCallback.EVENT.invoker())
         .interact((class04453)this.T_4, ((class04453)this.T_4).method_73183(), var2, var4, var3);
      if (class07082 != class07082.i) {
         if (class07082.N()) {
            class06889 class06889 = var3.y().N(var4.method_23317(), var4.method_23318(), var4.method_23321());
            this.NE().N(class00556.N(var4, ((class04453)this.T_4).method_5715(), var2, class06889));
         }

         if (class07082 instanceof class07041 class07041 && class07041.i() == class07064.field_52427) {
            ((class04453)this.T_4).method_6104(var2);
         }

         var1.cancel();
      }
   }

   public void N(@Nullable class05096 var1) {
      this.yF();
      this.L((class05096)var1, null);
      if (class07529.ND && Thread.currentThread() != (Thread)this.G_2) {
         ((Logger)j_1).error("setScreen called from non-game thread");
      }

      if ((class05096)this.v_3 != null) {
         ((class05096)this.v_3).method_25432();
         this.y((class05096)var1, null);
      } else {
         this.N(class02111.field_41777);
      }

      if (var1 == null) {
         if ((Boolean)this.G_1) {
            throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
         }

         if ((class03448)this.T_3 == null) {
            var1 = new class04705();
         } else if (((class04453)this.T_4).method_29504()) {
            if (((class04453)this.T_4).Q()) {
               var1 = new class05345(null, ((class03448)this.T_3).method_8401().U(), (class04453)this.T_4);
            } else {
               ((class04453)this.T_4).K();
            }
         } else {
            var1 = ((class01056)this.i_6).i().z();
         }
      }

      this.v_3 = var1;
      if ((class05096)this.v_3 != null) {
         ((class05096)this.v_3).method_49589();
      }

      if (var1 != null) {
         ((class06220)this.L_2).z();
         class06428.y();
         ((class05096)var1).method_25423(((class08844)this.z_7).P(), ((class08844)this.z_7).s());
         this.v_2 = false;
      } else {
         if ((class03448)this.T_3 != null) {
            class06428.L();
         }

         ((class09033)this.E_1).M();
         ((class06220)this.L_2).Z();
      }

      this.yZ();
   }

   public static void N(@Nullable class06202 var0, File var1, class07080 var2) {
      int i = N(var1, var2);
      if (var0 != null) {
         ((class09033)var0.E_1).R();
      }

      System.exit(i);
   }

   public void N(class03448 var1) {
      this.yF();
      this.u(var1, null);
      this.R(var1, null);
      this.N(var1, null);
      this.T_3 = var1;
      this.y(var1);
      this.L(var1, null);
   }

   public class00392 N(File var1) {
      this.yF();
      byte b0 = 4;
      short short1 = 4096;
      short short2 = 4096;
      int i = ((class08844)this.z_7).U();
      int j = ((class08844)this.z_7).E();
      class08066 class08066 = this.e();
      float f = ((class04453)this.T_4).method_36455();
      float f1 = ((class04453)this.T_4).method_36454();
      float f2 = ((class04453)this.T_4).field_6004;
      float f3 = ((class04453)this.T_4).field_5982;
      ((class03386)this.i_5).N(false);

      class05216 class05216x;
      try {
         ((class03386)this.i_5).N(new class07604(new Vector3f(((class03386)this.i_5).s().m())));
         ((class08844)this.z_7).y(4096);
         ((class08844)this.z_7).L(4096);
         class08066.N(4096, 4096);

         for (int k = 0; k < 6; k++) {
            switch (k) {
               case 0:
                  ((class04453)this.T_4).method_36456(f1);
                  ((class04453)this.T_4).method_36457(0.0F);
                  break;
               case 1:
                  ((class04453)this.T_4).method_36456((f1 + 90.0F) % 360.0F);
                  ((class04453)this.T_4).method_36457(0.0F);
                  break;
               case 2:
                  ((class04453)this.T_4).method_36456((f1 + 180.0F) % 360.0F);
                  ((class04453)this.T_4).method_36457(0.0F);
                  break;
               case 3:
                  ((class04453)this.T_4).method_36456((f1 - 90.0F) % 360.0F);
                  ((class04453)this.T_4).method_36457(0.0F);
                  break;
               case 4:
                  ((class04453)this.T_4).method_36456(f1);
                  ((class04453)this.T_4).method_36457(-90.0F);
                  break;
               case 5:
               default:
                  ((class04453)this.T_4).method_36456(f1);
                  ((class04453)this.T_4).method_36457(90.0F);
            }

            ((class04453)this.T_4).field_5982 = ((class04453)this.T_4).method_36454();
            ((class04453)this.T_4).field_6004 = ((class04453)this.T_4).method_36455();
            ((class03386)this.i_5).N(class02233.y);
            ((class03386)this.i_5).y(class02233.y);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException interruptedexception) {
            }

            class05628.N(var1, "panorama_" + k + ".png", class08066, 4, var0 -> {});
         }

         class05216 class05216x = class00392.y(var1.getName()).N(class06541.field_1073).N(var1x -> var1x.N(new class00623(var1.getAbsoluteFile())));
         return class00392.N("screenshot.success", class05216x);
      } catch (Exception exception) {
         ((Logger)j_1).error("Couldn't save image", exception);
         class05216x = class00392.N("screenshot.failure", exception.getMessage());
      } finally {
         ((class04453)this.T_4).method_36457(f);
         ((class04453)this.T_4).method_36456(f1);
         ((class04453)this.T_4).field_6004 = f2;
         ((class04453)this.T_4).field_5982 = f3;
         ((class03386)this.i_5).N(true);
         ((class08844)this.z_7).y(i);
         ((class08844)this.z_7).L(j);
         class08066.N(i, j);
         ((class03386)this.i_5).N(null);
      }

      return class05216x;
   }

   private void N(class08627 var1, Operation var2) {
      SodiumConfigBuilder.registerIcon(var1);
      var2.call(new Object[]{var1});
   }

   public void N(class00392 var1) {
      this.yF();
      boolean flag = this.q();
      class04568 class04568 = this.yN();
      if ((class03448)this.T_3 != null) {
         ((class03448)this.T_3).N(var1);
      }

      if (flag) {
         this.Nj();
      } else {
         this.Nf();
      }

      class04705 class04705 = new class04705();
      if (flag) {
         this.N((class05096)class04705);
      } else if (class04568 != null && class04568.i()) {
         this.N((class05096)(new class05685(class04705)));
      } else {
         this.N((class05096)(new class05304(class04705)));
      }
   }

   public void N(class03415 var1) {
      this.yF();
      if (!((class03409)this.N_5).N(var1)) {
         this.N_5 = class03409.N(var1, (UserApiService)this.E_7);
      }
   }

   public void N(@Nullable class07049 var1) {
      this.yF();
      this.M_1 = var1;
      ((class03386)this.i_5).N(var1);
   }

   public class03040 N() {
      this.yF();
      return (class03040)this.N_4;
   }

   private void N(CallbackInfo var1, class07050 var2) {
      class10980 class10980 = class10980.N(var2);
      class11938.L().L(class10980);
      if (class10980.y()) {
         var1.cancel();
      }
   }

   public void N(boolean var1) {
      this.yF();
      if ((class05096)this.v_3 == null) {
         if (this.v() && !((class08337)this.T_5).P()) {
            this.N((class05096)(new class05123(!var1)));
         } else {
            this.N((class05096)(new class05123(true)));
         }
      }
   }

   private boolean N(class04453 var1, class07050 var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_8);
   }

   private int N(class06202 var1) {
      this.yF();
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? 0 : (Integer)this.M_5;
   }

   private boolean N(List<Function<Runnable, class05096>> var1) {
      this.yF();
      boolean flag = false;
      if (((class05630)this.i_7).NY || class07529.Nz) {
         var1.add(var1x -> {
            this.yF();
            return new class03263((class05630)this.i_7, var1x);
         });
         flag = true;
      }

      BanDetails bandetails = this.Nv();
      if (bandetails != null) {
         var1.add(var1x -> class03051.N(var1xx -> {
            if (var1xx) {
               class07536.m().N(class03597.m);
            }

            var1x.run();
         }, bandetails));
      }

      ProfileResult profileresult = (ProfileResult)((CompletableFuture)this.z_2).join();
      if (profileresult != null) {
         GameProfile gameprofile = profileresult.profile();
         Set set = profileresult.actions();
         if (set.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            var1.add(var1x -> class03051.N(gameprofile.name(), var1x));
         }

         if (set.contains(ProfileActionType.USING_BANNED_SKIN)) {
            var1.add(class03051::N);
         }
      }

      return flag;
   }

   private boolean N(class03443 var1, Operation var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) && (Boolean)var2.call(new Object[]{var1});
   }

   public void N(class05096 var1, CallbackInfo var2) {
      Iris.lastDimension = Iris.getCurrentDimension();
   }

   private void N(class04785 var1, class01623 var2, class03531 var3, boolean var4, CallbackInfo var5, class00642 var6) {
      ProtocolTranslator.setTargetVersion(ProtocolTranslator.NATIVE_VERSION, true);
      if (var6.method_10758()) {
         ProtocolTranslator.injectPreviousVersionReset(var6.field_11651);
      } else {
         var6.field_45668.add(var0 -> ProtocolTranslator.injectPreviousVersionReset(var0.field_11651));
      }
   }

   private static boolean N(Object var0) {
      try {
         return Locale.getDefault().getISO3Country().equals(var0);
      } catch (MissingResourceException missingresourceexception) {
         return false;
      }
   }

   private void N(boolean var1, CallbackInfo var2) {
      this.yF();
      class04643 class04643 = class08700.N();
      class04643.N("wait_for_gpu");

      while (((LongArrayFIFOQueue)this.n_2).size() > SodiumClientMod.options().advanced.cpuRenderAheadLimit) {
         long i = ((LongArrayFIFOQueue)this.n_2).dequeueLong();
         GL32C.glClientWaitSync(i, 1, Long.MAX_VALUE);
         GL32C.glDeleteSync(i);
      }

      class04643.L();
   }

   private void N(Throwable var1, @Nullable class06216 var2) {
      this.yF();
      if (((class01623)this.s_0).i().size() > 1) {
         this.N(var1, null, var2);
      } else {
         class07536.N(var1);
      }
   }

   public class07080 N(class07080 var1) {
      this.yF();
      class03463 class03463 = var1.R();

      try {
         N(class03463, this, (class08396)this.s_1, (String)this.l_2, (class05630)this.i_7);
         this.N(var1.N("Uptime"));
         if ((class03448)this.T_3 != null) {
            ((class03448)this.T_3).method_8538(var1);
         }

         if ((class08337)this.T_5 != null) {
            ((class08337)this.T_5).y(class03463);
         }

         ((class03465)this.R_3).N(var1);
      } catch (Throwable throwable) {
         ((Logger)j_1).error("Failed to collect details", throwable);
      }

      return var1;
   }

   public void N(int var1) {
      this.yF();
      ((class08117)this.u_2).N(var1);
   }

   private void N(int var1, long var2) {
      this.yF();
      ((class05630)this.i_7).NN().method_41748(false);
      ((class05630)this.i_7).Np();
   }

   private class07064 N(class07041 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) ? class07064.field_52426 : var1.i();
   }

   public void N(@Nullable class01323 var1) {
      this.yF();
      this.G_0 = var1;
   }

   private boolean N(class08844 var1) {
      this.yF();
      if (!(Boolean)this.n_3) {
         return var1.n();
      } else {
         MemoryStack memorystack = MemoryStack.stackPush();

         boolean flag;
         try {
            IntBuffer intbuffer = memorystack.callocInt(1);
            IntBuffer intbuffer1 = memorystack.callocInt(1);
            GLFW.glfwGetFramebufferSize(var1.B(), intbuffer, intbuffer1);
            flag = intbuffer.get(0) == 0 || intbuffer1.get(0) == 0;
         } catch (Throwable throwable1) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return flag;
      }
   }

   private static String N(double var0) {
      return String.format(Locale.ROOT, "%.3fs", var0);
   }

   public static int N(File var0, class07080 var1) {
      Path path = var0.toPath().resolve("crash-reports").resolve("crash-" + class07536.R() + "-client.txt");
      class03914.N(var1.N(class02587.N));
      if (var1.i() != null) {
         class03914.N("#@!@# Game crashed! Crash report saved to: #@!@# " + var1.i().toAbsolutePath());
         return -1;
      } else if (var1.N(path, class02587.N)) {
         class03914.N("#@!@# Game crashed! Crash report saved to: #@!@# " + path.toAbsolutePath());
         return -1;
      } else {
         class03914.N("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void N(@Nullable class06202 var0, @Nullable class08396 var1, String var2, @Nullable class05630 var3, class07080 var4) {
      N(var4.R(), var0, var1, var2, var3);
   }

   public void N(class06468 var1) {
      this.yF();
      class06219 class06219 = this.b();
      if (!class06219.N(this.q())) {
         if (((class01056)this.i_6).L()) {
            ((class01056)this.i_6).y(false);
            this.N((class05096)(new class01321(var1x -> {
               if (var1x) {
                  class07536.m().N(class03597.M);
               }

               this.N(null);
            }, (class00392)class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_4, class03597.M, true)));
         } else {
            class00392 class00392 = class06219.N();
            ((class01056)this.i_6).N(class00392, false);
            ((class05153)this.N_3).u(class00392);
            ((class01056)this.i_6).y(class06219 == class06219.staticFields_01e6bc0aa454033828fc8487f86a51a5a_3);
         }
      } else {
         ((class01056)this.i_6).i().y(var1, class01311::new);
      }
   }

   public void N(class04785 var1, class01623 var2, class03531 var3, boolean var4) {
      this.yF();
      this.Nf();
      Instant instant = Instant.now();
      class05384 class05384 = new class05384(var4 ? 500L : 0L);
      class05850 class05850 = new class05850(class05384, class05858.field_51489);
      this.N((class05096)class05850);
      int i = Math.max(5, 3) + class03469.N + 1;

      try {
         var1.N(var3.L().N(), var3.u());
         class08773 class08773 = class08773.N(class05384, class08759.y());
         this.T_5 = class02796.N((Function<Thread, class08337>)(var5x -> {
            this.yF();
            return new class08337(var5x, this, var1, var2, var3, (class03930)this.T_0, class08773);
         }));
         class05384.N(((class08337)this.T_5).z(i));
         this.M_0 = true;
         this.N(class03415.N());
         ((class03325)this.m_3).N(class03371.field_44568, var1.R(), var3.u().u());
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Starting integrated server");
         class07074 class07074 = class07080.N("Starting integrated server");
         class07074.N("Level ID", var1.R());
         class07074.N("Level Name", () -> var3.u().u());
         throw new class07878(class07080);
      }

      class04643 class04643 = class08700.N();
      class04643.N("waitForServer");
      long k = TimeUnit.SECONDS.toNanos(1L) / 60L;

      while (!((class08337)this.T_5).Np() || (class01323)this.G_0 != null) {
         long j = class07536.u() + k;
         this.j(null);
         class05850.method_25393();
         if ((class01323)this.G_0 != null) {
            ((class01323)this.G_0).y();
         }

         this.E(null);
         this.M(false);
         this.g();
         this.y(() -> class07536.u() > j);
         this.yH();
      }

      class04643.L();
      Duration duration = Duration.between(instant, Instant.now());
      SocketAddress socketaddress = ((class08337)this.T_5).Na().N();
      class00642 class00642 = class00642.method_10769(socketaddress);
      String s = socketaddress.toString();
      class03464 class03464 = new class03464(class00642, this, null, null, var4, duration, var0 -> {}, class05384, null);
      this.N(var1, var2, var3, var4, null, class00642);
      class00642.method_52902(s, 0, class03464);
      class00642.method_10743(new class07816(this.Ny().L(), this.Ny().y()));
      this.T_6 = class00642;
   }

   private void N(class07074 var1) {
      var1.N("JVM uptime", () -> N(ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      var1.N("Wall uptime", () -> {
         this.yF();
         return N((System.currentTimeMillis() - (Long)this.Z_2) / 1000.0);
      });
      var1.N("High-res time", () -> N(class07536.L() / 1000.0));
      var1.N("Client ticks", () -> {
         this.yF();
         return String.format(Locale.ROOT, "%d ticks / %.3fs", (Long)this.Z_3, ((Long)this.Z_3).longValue() / 20.0);
      });
   }

   public void N(Exception var1) {
      this.yF();
      if (!((class01623)this.s_0).y()) {
         if (((class01623)this.s_0).i().size() <= 1) {
            ((Logger)j_1).error(LogUtils.FATAL_MARKER, var1.getMessage(), var1);
            this.y(new class07080(var1.getMessage(), var1));
         } else {
            this.N(this::yY);
         }
      } else {
         this.N(var1, class00392.L("resourcePack.runtime_failure"), null);
      }
   }

   private float N(float var1) {
      this.yF();
      if ((class03448)this.T_3 != null) {
         class03106 class03106 = ((class03448)this.T_3).method_54719();
         if (class03106.Z()) {
            return Math.max(var1, class03106.M());
         }
      }

      return var1;
   }

   private void N(class03448 var1, CallbackInfo var2) {
      class09343 class09343 = class09343.N();
      class11938.L().L(class09343);
   }

   public void N(class05096 var1, boolean var2, boolean var3, CallbackInfo var4) {
      try {
         yq();
      } catch (RemapException remapexception) {
         ((Logger)j_1).warn("Failed to unmap Fabric registries!", remapexception);
      }
   }

   public void N(class02111 var1) {
      this.yF();
      this.l_0 = var1;
   }

   private void N(class09454 var1, CallbackInfo var2) {
      ((LoadingCycleCallback)Events.LOADING_CYCLE.invoker()).onLoadCycle(LoadingCycle.POST_GAME_LOAD);
   }

   private class04643 N(boolean var1, @Nullable class06014 var2) {
      this.yF();
      if (!var1) {
         ((class06007)this.R_1).y();
         if (!((class04526)this.R_2).i() && var2 == null) {
            return class04687.N;
         }
      }

      Object object;
      if (var1) {
         if (!((class06007)this.R_1).N()) {
            this.R_0 = 0;
            ((class06007)this.R_1).L();
         }

         this.R_0 = (Integer)this.R_0 + 1;
         object = ((class06007)this.R_1).u();
      } else {
         object = class04687.N;
      }

      if (((class04526)this.R_2).i()) {
         object = class04643.N((class04643)object, ((class04526)this.R_2).R());
      }

      return class06014.N((class04643)object, var2);
   }

   private static class03463 N(class03463 var0, @Nullable class06202 var1, @Nullable class08396 var2, String var3, @Nullable class05630 var4) {
      var0.N("Launched Version", () -> var3);
      String s = p();
      if (s != null) {
         var0.N("Launcher name", s);
      }

      var0.N("Backend library", RenderSystem::getBackendDescription);
      var0.N("Backend API", RenderSystem::getApiDescription);
      var0.N("Window size", () -> var1 != null ? ((class08844)var1.z_7).U() + "x" + ((class08844)var1.z_7).E() : "<not initialized>");
      var0.N("GFLW Platform", class08844::N);
      var0.N("Render Extensions", () -> String.join(", ", RenderSystem.getDevice().getEnabledExtensions()));
      var0.N("GL debug messages", () -> {
         GpuDevice gpudevice = RenderSystem.tryGetDevice();
         if (gpudevice == null) {
            return "<no renderer available>";
         } else {
            return gpudevice.isDebuggingEnabled() ? String.join("\n", gpudevice.getLastDebugMessages()) : "<debugging unavailable>";
         }
      });
      var0.N("Is Modded", () -> Z().y());
      var0.N("Universe", () -> var1 != null ? Long.toHexString((Long)var1.z_0) : "404");
      var0.N("Type", "Client (map_client.txt)");
      if (var4 != null) {
         if (var1 != null) {
            String s1 = var1.Ns().z();
            if (s1 != null) {
               var0.N("GPU Warnings", s1);
            }
         }

         var0.N("Transparency", var4.s().method_41753() ? "shader" : "regular");
         var0.N("Render Distance", var4.Nh() + "/" + var4.i().method_41753() + " chunks");
      }

      if (var1 != null) {
         var0.N("Resource Packs", () -> class01623.N(var1.t().M()));
      }

      if (var2 != null) {
         var0.N("Current Language", () -> var2.N());
      }

      var0.N("Locale", String.valueOf(Locale.getDefault()));
      var0.N("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      var0.N("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      var0.N("CPU", GLX::_getCpuInfo);
      return var0;
   }

   public void N(CallbackInfo var1) {
      if (HUDOverlayHandler.INSTANCE != null) {
         HUDOverlayHandler.INSTANCE.onClientTick();
      }
   }

   public void N(class05096 var1, boolean var2, boolean var3) {
      this.yF();
      this.y(var1, var2, var3, null);
      class01683 class01683 = this.NE();
      if (class01683 != null) {
         this.O();
         class01683.u();
         if (!var2) {
            this.l();
         }
      }

      ((class05463)this.b_1).y();
      if (((class04526)this.R_2).i()) {
         this.yx();
      }

      class08337 class08337 = (class08337)this.T_5;
      this.T_5 = null;
      ((class03386)this.i_5).W();
      this.T_2 = null;
      ((class05153)this.N_3).y();
      this.G_1 = true;

      try {
         if ((class03448)this.T_3 != null) {
            ((class01056)this.i_6).z();
         }

         if (class08337 != null) {
            this.N((class05096)(new class06307((class00392)d_2)));
            class04643 class04643 = class08700.N();
            class04643.N("waitForServer");

            while (!class08337.Nk()) {
               this.M(false);
            }

            class04643.L();
         }

         this.y(var1);
         this.M_0 = false;
         this.T_3 = null;
         this.N(null, var3);
         this.T_4 = null;
      } finally {
         this.G_1 = false;
      }

      this.N(var1, var2, var3, null);
   }

   public boolean N(UUID var1) {
      this.yF();
      return this.b().N(false)
         ? ((class05463)this.b_1).L(var1)
         : ((class04453)this.T_4 == null || !var1.equals(((class04453)this.T_4).method_5667())) && !var1.equals(class07536.R);
   }

   private Path N(class03463 var1, List<Path> var2) {
      this.yF();
      String s;
      if (this.q()) {
         s = this.Na().yn().u();
      } else {
         class04568 class04568 = this.yN();
         s = class04568 != null ? class04568.N : "unknown";
      }

      Path path;
      try {
         String s2 = String.format(Locale.ROOT, "%s-%s-%s", class07536.R(), s, class07529.y().comp_4024());
         String s1 = class06290.N(class04524.N, s2, ".zip");
         path = class04524.N.resolve(s1);
      } catch (IOException ioexception1) {
         throw new UncheckedIOException(ioexception1);
      }

      try (class03423 class03423 = new class03423(path)) {
         class03423.N(Paths.get("system.txt"), var1.N());
         class03423.N(Paths.get("client").resolve(((class05630)this.i_7).Nx().getName()), ((class05630)this.i_7).ND());
         var2.forEach(class03423::N);
      } finally {
         for (Path path1 : var2) {
            try {
               FileUtils.forceDelete(path1.toFile());
            } catch (IOException ioexception) {
               ((Logger)j_1).warn("Failed to delete temporary profiling result {}", path1, ioexception);
            }
         }
      }

      return path;
   }

   private void LL() {
      this.yF();
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.t(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if ((class07089)this.M_3 != null && ((class07089)this.M_3).N() != class07113.field_1333) {
            boolean flag = this.s();
            switch ((class07089)this.M_3) {
               case class06183 class06183:
                  ((class03443)this.T_2).N(class06183.u(), flag);
                  break;
               case class06145 class06145:
                  ((class03443)this.T_2).N(class06145.L(), flag);
                  break;
               default:
            }
         }
      }
   }

   public boolean yi() {
      return this.Ly().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   private void yh() {
      boolean flag = false;
      class03770 class03770 = this.yU().N();
      class08887 class08887x = class03770.N().N();

      for (class00891 class00891x : class04206.i) {
         UnmodifiableIterator unmodifiableiterator = class00891x.E().N().iterator();

         while (unmodifiableiterator.hasNext()) {
            class00500 class00500x = (class00500)unmodifiableiterator.next();
            if (class00500x.b() == class06898.field_11458) {
               class08887 class08887x = class03770.y(class00500x);
               if (class08887x == class08887x) {
                  ((Logger)j_1).debug("Missing model for: {}", class00500x);
                  flag = true;
               }
            }
         }
      }

      class08388 class08388 = class08887x.method_68511();

      for (class00891 class00891 : class04206.i) {
         UnmodifiableIterator unmodifiableiterator1 = class00891.E().N().iterator();

         while (unmodifiableiterator1.hasNext()) {
            class00500 class00500 = (class00500)unmodifiableiterator1.next();
            class08388 class08388x = class03770.N(class00500);
            if (!class00500.P() && class08388x == class08388) {
               ((Logger)j_1).debug("Missing particle icon for: {}", class00500);
            }
         }
      }

      class04206.B.z().forEach(var0 -> {
         class06581 class06581 = var0.N();
         String s = class06581.z();
         if (class00392.L(s).getString().toLowerCase(Locale.ROOT).equals(class06581.z())) {
            ((Logger)j_1).debug("Missing translation for: {} {} {}", new Object[]{var0.B().N(), s, class06581});
         }
      });
      flag |= class05866.N();
      flag |= class04808.N();
      if (flag) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public class01879 NA() {
      this.yF();
      return (class01879)this.N_6;
   }

   public long W() {
      this.yF();
      return (Long)this.G_5;
   }

   private void W(CallbackInfo var1) {
      if (FabricDataGenHelper.ENABLED) {
         FabricDataGenHelper.run();
         System.exit(0);
      }
   }

   public void yG() {
      this.yF();
      this.G_2 = Thread.currentThread();
      this.n(null);
      if (Runtime.getRuntime().availableProcessors() > 4) {
         ((Thread)this.G_2).setPriority(10);
      }

      DiscontinuousFrame discontinuousframe = TracyClient.createDiscontinuousFrame("Client Tick");

      try {
         boolean flag = false;

         while ((Boolean)this.G_3) {
            this.yH();

            try {
               class06014 class06014 = class06014.N("Renderer");
               boolean flag1 = this.ND().L();

               try (class11345 class11345 = class08700.N(this.N(flag1, class06014))) {
                  ((class04526)this.R_2).L();
                  discontinuousframe.start();
                  this.M(!flag);
                  discontinuousframe.end();
                  ((class04526)this.R_2).u();
               }

               this.y(flag1, class06014);
            } catch (OutOfMemoryError outofmemoryerror) {
               if (flag) {
                  throw outofmemoryerror;
               }

               this.yp();
               this.N((class05096)(new class05695()));
               System.gc();
               ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Out of memory", outofmemoryerror);
               flag = true;
            }
         }
      } catch (class07878 class07878) {
         ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Reported exception thrown!", class07878);
         this.y(class07878.N());
      } catch (Throwable throwable1) {
         ((Logger)j_1).error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", throwable1);
         this.y(new class07080("Unexpected error", throwable1));
      }
   }

   private void R(boolean var1, CallbackInfo var2) {
      FrameTimeStatistics.INSTANCE.invalidate();
   }

   private void R(class03448 var1, CallbackInfo var2) {
      Iris.lastDimension = Iris.getCurrentDimension();
   }

   private void R(CallbackInfo var1) {
      if (!(Boolean)d_5) {
         d_5 = true;
         new Iris().onEarlyInitialize();
      }
   }

   public class03409 R() {
      this.yF();
      return (class03409)this.N_5;
   }

   public boolean yu() {
      this.yF();
      return (Boolean)this.Z_1;
   }

   private void yY() {
      this.yF();
      this.N(null);
      if ((class03448)this.T_3 != null) {
         ((class03448)this.T_3).N(class03448.N);
         this.Nf();
      }

      this.N((class05096)(new class04705()));
      this.L(null);
   }

   public class05153 NT() {
      this.yF();
      return (class05153)this.N_3;
   }

   public class04173 Ni() {
      this.yF();
      return (class04173)this.Z_0;
   }

   private void O(CallbackInfo var1) {
      ImageRendererManager.closeAll();
   }

   public String Nu() {
      this.yF();
      return (String)this.l_3;
   }

   public void yZ() {
      this.yF();
      ((class08844)this.z_7).y(this.LN());
   }

   public double yE() {
      this.yF();
      return (Double)this.N_1;
   }

   public class08117 yW() {
      this.yF();
      return (class08117)this.u_2;
   }

   private boolean yw() {
      this.yF();
      return !(Boolean)this.M_0 || (class08337)this.T_5 != null && ((class08337)this.T_5).P();
   }

   public class01999 yU() {
      this.yF();
      return (class01999)this.u_4;
   }

   @Override
   public void H() {
      this.yF();
      ((class06220)this.L_2).U();
   }

   public class01140 yt() {
      this.yF();
      return ((class00183)this.u_3).u().get();
   }

   public class06463 ND() {
      this.yF();
      return ((class01056)this.i_6).E();
   }

   public class08555 yP() {
      this.yF();
      return (class08555)this.u_1;
   }

   public boolean yM() {
      this.yF();
      return (Boolean)this.W_1 && this.Ly().flag(UserFlag.SERVERS_ALLOWED) && this.Nv() == null && !this.j();
   }

   public class06418 yB() {
      this.yF();
      return (class06418)this.L_1;
   }

   public class06734 yj() {
      this.yF();
      return class06724.N((class06739)this.Z_5);
   }

   private static void yq() throws RemapException {
      for (class01894 class01894 : class04206.NF.M()) {
         class00751 class00751 = class04206.NF.N(class01894);
         if (class00751 instanceof RemappableRegistry) {
            ((RemappableRegistry)class00751).unmap();
         }
      }
   }

   public boolean Nz() {
      this.yF();
      return (Boolean)this.l_5;
   }

   public boolean G() {
      this.yF();
      return ((class05096)this.v_3 == null || ((class05096)this.v_3).method_73339()) && !(Boolean)this.G_1;
   }

   private void G(CallbackInfo var1) {
      class11938.L().L(class11380.N());
   }

   public class05463 yv() {
      this.yF();
      return (class05463)this.b_1;
   }

   public class01089 Nm() {
      this.yF();
      return (class01068)this.W_3;
   }

   @Nullable
   public class01323 NZ() {
      this.yF();
      return (class01323)this.G_0;
   }

   public void yn() {
      this.yF();
      if (!this.B(((class03443)this.T_2).E())) {
         this.M_4 = 4;
         if (!((class04453)this.T_4).n()) {
            if ((class07089)this.M_3 == null) {
               ((Logger)j_1).warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (class07050 class07050 : class07050.values()) {
               class06584 class06584 = ((class04453)this.T_4).method_5998(class07050);
               if (!class06584.N(((class03448)this.T_3).method_45162())) {
                  return;
               }

               CallbackInfo callbackinfo1 = new CallbackInfo("", true);
               this.N(callbackinfo1, class07050);
               if (callbackinfo1.isCancelled()) {
                  return;
               }

               if ((class07089)this.M_3 != null) {
                  switch (((int[])class06204.N_0)[((class07089)this.M_3).N().ordinal()]) {
                     case 1:
                        class06145 class06145 = (class06145)((class07089)this.M_3);
                        class07049 class07049 = class06145.L();
                        if (!((class03448)this.T_3).method_8621().N(class07049.method_24515())) {
                           return;
                        }

                        if (((class04453)this.T_4).method_56094(class07049, 0.0)) {
                           class03443 class03443 = (class03443)this.T_2;
                           class04453 class04453 = (class04453)this.T_4;
                           CallbackInfo callbackinfo = new CallbackInfo("", true);
                           this.N(callbackinfo, class07050, class06145, class07049);
                           if (callbackinfo.isCancelled()) {
                              return;
                           }

                           class07082 class07082x = class03443.N(class04453, class07049, class06145, class07050);
                           if (!class07082x.N()) {
                              class07082x = ((class03443)this.T_2).N((class04453)this.T_4, class07049, class07050);
                           }

                           if (class07082x instanceof class07041 class07041) {
                              if (this.N(class07041) == class07064.field_52427) {
                                 ((class04453)this.T_4).method_6104(class07050);
                              }

                              return;
                           }
                        }
                        break;
                     case 2:
                        class06183 class06183 = (class06183)((class07089)this.M_3);
                        int i = class06584.c();
                        class07082 class07082x = ((class03443)this.T_2).N((class04453)this.T_4, class07050, class06183);
                        if (class07082x instanceof class07041) {
                           if (((class07041)class07082x).i() == class07064.field_52427) {
                              ((class04453)this.T_4).method_6104(class07050);
                              if (!class06584.R() && (class06584.c() != i || ((class04453)this.T_4).method_56992())) {
                                 ((class03386)this.i_5).u.N(class07050);
                              }
                           }

                           return;
                        }

                        if (class07082x instanceof class07071) {
                           return;
                        }
                  }
               }

               if (!class06584.R() && ((class03443)this.T_2).N((class04453)this.T_4, class07050) instanceof class07041 class07041x) {
                  if (this.y(class07041x) == class07064.field_52427) {
                     ((class04453)this.T_4).method_6104(class07050);
                  }

                  ((class03386)this.i_5).u.N(class07050);
                  return;
               }
            }
         }
      }
   }

   public boolean NR() {
      this.yF();
      return ((class05630)this.i_7).NL().method_41753();
   }

   public class01083 yR() {
      this.yF();
      return (class01083)this.B_6;
   }

   public void ys() {
      this.yF();

      try {
         ((Logger)j_1).info("Stopping!");
         this.U(null);

         try {
            ((class05153)this.N_3).L();
         } catch (Throwable throwable1) {
         }

         try {
            if ((class03448)this.T_3 != null) {
               ((class03448)this.T_3).N(class03448.N);
            }

            this.Nf();
         } catch (Throwable throwable) {
         }

         if ((class05096)this.v_3 != null) {
            ((class05096)this.v_3).method_25432();
            this.k(null);
         }

         this.O(null);
         this.close();
      } finally {
         class07536.u = System::nanoTime;
         if ((Supplier)this.G_4 == null) {
            System.exit(0);
         }
      }
   }

   private void Y(CallbackInfo var1) {
      ((Runnable)InputEvents.HANDLE_KEYBINDS.invoker()).run();
   }

   public static boolean NB() {
      return !((class05630)((class06202)j_0).i_7).NG;
   }

   public class08627 NO() {
      this.yF();
      return (class08627)this.z_3;
   }

   public class04777 NL() {
      this.yF();
      return (class04777)this.l_6;
   }

   private UserProperties Ly() {
      this.yF();
      return (UserProperties)((CompletableFuture)this.u_0).join();
   }

   public class06176 NN() {
      this.yF();
      return (class06176)this.E_4;
   }

   public class08943 NM() {
      this.yF();
      return (class08943)this.B_4;
   }

   public int Nx() {
      return (Integer)d_4;
   }

   public void NQ() {
      this.yF();
      this.N(null);
      this.Z(null);
      this.G(null);
      this.Z_3 = (Long)this.Z_3 + 1L;
      if ((class03448)this.T_3 != null && !(Boolean)this.M_6) {
         ((class03448)this.T_3).method_54719().W();
      }

      if ((Integer)this.M_4 > 0) {
         this.M_4 = (Integer)this.M_4 - 1;
      }

      class04643 class04643 = class08700.N();
      class04643.N("gui");
      ((class03040)this.N_4).N();
      ((class01056)this.i_6).N((Boolean)this.M_6);
      class04643.L();
      ((class03386)this.i_5).N(1.0F);
      ((class08764)this.b_0).N((class03448)this.T_3, (class07089)this.M_3);
      class04643.N("gameMode");
      if (!(Boolean)this.M_6 && (class03448)this.T_3 != null) {
         ((class03443)this.T_2).u();
      }

      class04643.y("screen");
      if ((class05096)this.v_3 != null || (class04453)this.T_4 == null) {
         class05096 class05096x = (class05096)this.v_3;
         if (class05096x instanceof class06320 class06320 && !((class04453)this.T_4).method_6113()) {
            class06320.y();
         }
      } else if (((class04453)this.T_4).method_29504() && !((class05096)this.v_3 instanceof class05345)) {
         this.N(null);
      } else if (((class04453)this.T_4).method_6113() && (class03448)this.T_3 != null) {
         ((class01056)this.i_6).i().y(class06468.field_62004, class06320::new);
      }

      if ((class05096)this.v_3 != null) {
         this.M_5 = 10000;
      }

      this.m(null);
      this.P(null);
      if ((class05096)this.v_3 != null) {
         try {
            class05096 class05096 = (class05096)this.v_3;
            this.u(null);
            class05096.method_25393();
            this.v(null);
         } catch (Throwable throwable) {
            class07080 class07080x = class07080.N(throwable, "Ticking screen");
            ((class05096)this.v_3).method_65027(class07080x);
            throw new class07878(class07080x);
         }
      }

      if ((class01323)this.G_0 != null) {
         ((class01323)this.G_0).y();
      }

      if (!this.ND().y()) {
         ((class01056)this.i_6).W();
      }

      if ((class01323)this.G_0 == null && this.i(this) == null) {
         class04643.y("Keybindings");
         this.z(null);
         this.yS();
         if (this.N(this) > 0) {
            this.M_5 = (Integer)this.M_5 - 1;
         }
      }

      if ((class03448)this.T_3 != null) {
         if (!(Boolean)this.M_6) {
            class04643.y("gameRenderer");
            ((class03386)this.i_5).z();
            class04643.y("entities");
            ((class03448)this.T_3).B();
            this.b(null);
            class04643.y("blockEntities");
            ((class03448)this.T_3).method_18471();
         }
      } else if (((class03386)this.i_5).U() != null) {
         ((class03386)this.i_5).M();
      }

      ((class09000)this.E_2).N();
      ((class09033)this.E_1).N((Boolean)this.M_6);
      if ((class03448)this.T_3 != null) {
         if (!(Boolean)this.M_6) {
            class04643.y("level");
            if (!((class05630)this.i_7).b && this.yw()) {
               class05216 class05216x = class00392.L("tutorial.socialInteractions.title");
               class05216 class05216x = class00392.N("tutorial.socialInteractions.description", class08764.N("socialInteractions"));
               this.U_5 = new class06128((class01590)this.i_3, class06090.field_26848, class05216x, class05216x, true, 8000);
               ((class06086)this.u_7).N((class06128)this.U_5);
               ((class05630)this.i_7).b = true;
               ((class05630)this.i_7).Np();
            }

            ((class08764)this.b_0).u();

            try {
               ((class03448)this.T_3).N((BooleanSupplier)(() -> true));
            } catch (Throwable throwable1) {
               class07080 class07080 = class07080.N(throwable1, "Exception in world tick");
               if ((class03448)this.T_3 == null) {
                  class07080.N("Affected level").N("Problem", "Level is null!");
               } else {
                  ((class03448)this.T_3).method_8538(class07080);
               }

               throw new class07878(class07080);
            }
         }

         class04643.y("animateTick");
         if (!(Boolean)this.M_6 && this.yQ()) {
            ((class03448)this.T_3).N(((class04453)this.T_4).method_31477(), ((class04453)this.T_4).method_31478(), ((class04453)this.T_4).method_31479());
         }

         class04643.y("particles");
         if (!(Boolean)this.M_6 && this.yQ()) {
            ((class04410)this.i_0).N();
         }

         class01683 class01683 = this.NE();
         if (class01683 != null && !(Boolean)this.M_6) {
            class01683.N(class02574.N);
         }
      } else if ((class00642)this.T_6 != null) {
         class04643.y("pendingConnection");
         ((class00642)this.T_6).method_10754();
      }

      class04643.y("keyboard");
      ((class06197)this.L_3).y();
      class04643.L();
      this.M(null);
      this.w(null);
      this.L(null);
   }

   public class09033 Nr() {
      this.yF();
      return (class09033)this.E_1;
   }

   public DataFixer Nh() {
      this.yF();
      return (DataFixer)this.z_5;
   }

   public class02233 NK() {
      this.yF();
      return (class02212)this.B_0;
   }

   public class02742 NG() {
      this.yF();
      return (class02742)this.U_0;
   }

   public class08844 Nt() {
      this.yF();
      return (class08844)this.z_7;
   }

   @Nullable
   public class01683 NE() {
      this.yF();
      return (class04453)this.T_4 == null ? null : (class01683)((class04453)this.T_4).y_0;
   }

   @Nullable
   public BanDetails Nv() {
      return (BanDetails)this.Ly().bannedScopes().get("MULTIPLAYER");
   }

   public boolean Nk() {
      return this.NC() && this.Ly().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public class01246 Ns() {
      this.yF();
      return (class01246)this.E_5;
   }

   public void NU() {
      this.yF();
      ((class04866)this.E_3).N((class05630)this.i_7);
   }

   public boolean yz() {
      this.yF();
      return this.Nk() && ((class05630)this.i_7).Nk().method_41753();
   }

   public boolean NW() {
      class08337 class08337 = this.Na();
      return class08337 != null && !class08337.P();
   }

   public class07949 Nn() {
      this.yF();
      return (class07949)this.T_1;
   }

   public void Nf() {
      this.y(true);
   }

   public CompletableFuture<Void> Nw() {
      return this.N(this::yy).thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   public boolean NS() {
      return this.Ly().flag(UserFlag.REALMS_ALLOWED) && this.Nv() == null;
   }

   public GameProfile NH() {
      this.yF();
      ProfileResult profileresult = (ProfileResult)((CompletableFuture)this.z_2).join();
      return profileresult != null ? profileresult.profile() : new GameProfile(((class04771)this.i_2).y(), ((class04771)this.i_2).L());
   }

   private boolean yQ() {
      this.yF();
      return (class03448)this.T_3 == null || ((class03448)this.T_3).method_54719().Z();
   }

   public class00232 yL() {
      this.yF();
      return (class00232)this.W_5;
   }

   public CompletableFuture<Void> yy() {
      CompletableFuture completablefuture = this.N(false, null);
      this.y(null);
      return completablefuture;
   }

   public class02111 Nc() {
      this.yF();
      return (class02111)this.l_0;
   }

   public class08212 ym() {
      this.yF();
      return (class08212)this.z_4;
   }

   public class04771 Ny() {
      this.yF();
      return (class04771)this.i_2;
   }

   public float Np() {
      this.yF();
      if ((class05096)this.v_3 != null && ((class05096)this.v_3).method_50024() != null) {
         return 1.0F;
      } else {
         class05363 class05363 = ((class03386)this.i_5).s();
         return class05363 != null ? class05363.U().N(class00608.G, 1.0F) : 1.0F;
      }
   }

   private String LN() {
      this.yF();
      StringBuilder stringbuilder = new StringBuilder("Minecraft");
      if (Z().N()) {
         stringbuilder.append("*");
      }

      stringbuilder.append(" ");
      stringbuilder.append(class07529.y().comp_4025());
      class01683 class01683 = this.NE();
      if (class01683 != null && class01683.M().method_10758()) {
         stringbuilder.append(" - ");
         class04568 class04568 = this.yN();
         if ((class08337)this.T_5 != null && !((class08337)this.T_5).P()) {
            stringbuilder.append(class08392.N("title.singleplayer"));
         } else if (class04568 != null && class04568.i()) {
            stringbuilder.append(class08392.N("title.multiplayer.realms"));
         } else if ((class08337)this.T_5 == null && (class04568 == null || !class04568.u())) {
            stringbuilder.append(class08392.N("title.multiplayer.other"));
         } else {
            stringbuilder.append(class08392.N("title.multiplayer.lan"));
         }
      }

      return stringbuilder.toString();
   }

   private void yp() {
      this.yF();
      class04583.y();

      try {
         if ((Boolean)this.M_0 && (class08337)this.T_5 != null) {
            ((class08337)this.T_5).y(true);
         }

         this.Nj();
      } catch (Throwable throwable) {
      }

      System.gc();
   }

   @Nullable
   public class04568 yN() {
      return class01962.N(this.NE(), class01683::t);
   }

   public static boolean yb() {
      return ((class05630)((class06202)j_0).i_7).T().method_41753();
   }

   public class01386 Ne() {
      this.yF();
      return (class01386)this.B_1;
   }

   public void Nj() {
      this.N(new class06307((class00392)d_2), false);
   }

   private static void LM() {
      j_0 = null;
      j_1 = null;
      j_2 = 10;
      j_3 = null;
      j_4 = null;
      t_0 = null;
      t_1 = null;
      d_0 = null;
      d_1 = null;
      d_2 = null;
      d_3 = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
      d_4 = 29;
      d_5 = false;
      d_6 = null;
      d_7 = false;
   }

   private void yF() {
      if (!this.z_init) {
         this.z_init = true;
         this.z_0 = 0L;
         this.l_5 = false;
         this.W_0 = false;
         this.W_1 = false;
         this.M_0 = false;
         this.v_0 = 0L;
         this.W_2 = false;
         this.G_1 = false;
         this.U_1 = false;
         this.R_0 = 0;
         this.M_4 = 0;
         this.N_0 = 0L;
         this.v_1 = 0;
         this.Z_1 = false;
         this.G_3 = false;
         this.n_0 = false;
         this.U_2 = false;
         this.N_1 = 0.0;
         this.v_2 = false;
         this.Z_2 = 0L;
         this.G_5 = 0L;
         this.U_3 = false;
         this.M_5 = 0;
         this.Z_3 = 0L;
         this.n_3 = false;
         this.M_6 = false;
         this.M_7 = 0L;
      }
   }

   @Nullable
   public class05075 NX() {
      this.yF();
      class05075 class05075 = class01962.N((class05096)this.v_3, class05096::method_50024);
      if (class05075 != null) {
         return class05075;
      } else {
         class05363 class05363 = ((class03386)this.i_5).s();
         if ((class04453)this.T_4 != null && class05363 != null) {
            if (((class04453)this.T_4).method_73183().method_27983() == class07299.field_25181 && ((class01056)this.i_6).U().y()) {
               return class09002.u;
            } else {
               class00621 class00621 = class05363.U().N(class00608.t, 1.0F);
               boolean flag = ((class04453)this.T_4).method_31549().u && ((class04453)this.T_4).method_31549().L;
               boolean flag1 = ((class04453)this.T_4).method_5869();
               return class00621.N(flag, flag1).orElse(null);
            }
         } else {
            return class09002.N;
         }
      }
   }

   private void yx() {
      this.yF();
      ((class04526)this.R_2).y();
      if ((class08337)this.T_5 != null) {
         ((class08337)this.T_5).yj();
      }
   }

   public boolean NF() {
      this.yF();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.L(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else if ((Integer)this.M_5 > 0) {
         return false;
      } else {
         this.i(null);
         if ((class07089)this.M_3 == null) {
            ((Logger)j_1).error("Null returned as 'hitResult', this shouldn't happen!");
            if (((class03443)this.T_2).M()) {
               this.M_5 = 10;
            }

            return false;
         } else if (((class04453)this.T_4).n()) {
            return false;
         } else {
            class06584 class06584 = ((class04453)this.T_4).method_5998(class07050.field_5808);
            if (!class06584.N(((class03448)this.T_3).method_45162())) {
               return false;
            } else if (((class04453)this.T_4).method_75202(class06584, 0)) {
               return false;
            } else {
               boolean flag = false;
               class08172 class08172 = class06584.method_58694(class02484.c);
               if (class08172 != null && !((class03443)this.T_2).Z()) {
                  ((class03443)this.T_2).N(class08172);
                  class04453 class04453 = (class04453)this.T_4;
                  class07050 class07050 = class07050.field_5808;
                  class04453 class04453x = class04453;
                  if (this.N(class04453x, class07050)) {
                     class04453x.method_6104(class07050);
                  }

                  return true;
               } else {
                  switch (((int[])class06204.N_0)[((class07089)this.M_3).N().ordinal()]) {
                     case 1:
                        class06543 class06543 = class06584.method_58694(class02484.I);
                        if (class06543 == null || class06543.N((class04453)this.T_4, ((class07089)this.M_3).y())) {
                           ((class03443)this.T_2).N((class04453)this.T_4, ((class06145)((class07089)this.M_3)).L());
                        }
                        break;
                     case 2:
                        class06183 class06183 = (class06183)((class07089)this.M_3);
                        class07209 class07209 = class06183.u();
                        if (!((class03448)this.T_3).method_8320(class07209).P()) {
                           ((class03443)this.T_2).N(class07209, class06183.i());
                           if (((class03448)this.T_3).method_8320(class07209).P()) {
                              flag = true;
                           }
                           break;
                        }
                     case 3:
                        class03443 class03443 = (class03443)this.T_2;
                        if (this.N(class03443, var0 -> {
                           WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_636]");
                           return ((class03443)var0[0]).M();
                        })) {
                           this.M_5 = 10;
                        }

                        ((class04453)this.T_4).method_7350();
                  }

                  if (!((class04453)this.T_4).method_7325()) {
                     class04453 class04453x = (class04453)this.T_4;
                     class07050 class07050x = class07050.field_5808;
                     class04453 class04453x = class04453x;
                     if (this.N(class04453x, class07050x)) {
                        class04453x.method_6104(class07050x);
                     }
                  }

                  return flag;
               }
            }
         }
      }
   }

   private void yA() {
      this.yF();
      ((class04526)this.R_2).N();
      if ((class08337)this.T_5 != null) {
         ((class08337)this.T_5).yb();
      }
   }

   private void yH() {
      this.yF();
      if ((Supplier)this.G_4 != null) {
         N(this, (File)this.l_1, (class07080)((Supplier)this.G_4).get());
      }
   }

   public class01781 Ng() {
      this.yF();
      return (class01781)this.B_3;
   }

   public Proxy NJ() {
      this.yF();
      return (Proxy)this.l_4;
   }

   private Optional<class03556<class09037>> ye() {
      this.yF();
      class00751 class00751 = ((class01683)((class04453)this.T_4).y_0).j().L(class04227.yL);
      return class00751.N(class00101.y).flatMap(var1x -> {
         if (var1x.y() == 0) {
            return Optional.empty();
         } else {
            return var1x.y() == 1 ? Optional.of(var1x.N(0)) : class00751.N(class09016.L);
         }
      });
   }

   public class03323 NI() {
      this.yF();
      return (class03323)this.m_0;
   }

   public class08265 NV() {
      this.yF();
      return (class08265)this.u_5;
   }

   public static class06202 Nq() {
      return (class06202)j_0;
   }

   public class08764 yT() {
      this.yF();
      return (class08764)this.b_0;
   }

   public boolean NC() {
      return class07529.ND && !class07529.Np ? false : this.Ly().flag(UserFlag.TELEMETRY_ENABLED);
   }

   private void yS() {
      this.yF();
      this.Y(null);

      for (; ((class05630)this.i_7).H.B(); ((class03063)this.B_2).W()) {
         class05455 class05455 = ((class05630)this.i_7).NS();
         ((class05630)this.i_7).N(((class05630)this.i_7).NS().L());
         if (class05455.N() != ((class05630)this.i_7).NS().N()) {
            ((class03386)this.i_5).N(((class05630)this.i_7).NS().N() ? this.F() : null);
         }
      }

      while (((class05630)this.i_7).c.B()) {
         ((class05630)this.i_7).Nd = !((class05630)this.i_7).Nd;
      }

      for (int i = 0; i < 9; i++) {
         boolean flag = ((class05630)this.i_7).C.R();
         boolean flag1 = ((class05630)this.i_7).S.R();
         if (((class05630)this.i_7).f[i].B()) {
            if (((class04453)this.T_4).method_7325()) {
               ((class01056)this.i_6).B().N(i);
            } else if (!((class04453)this.T_4).method_56992() || (class05096)this.v_3 != null || !flag1 && !flag) {
               ((class04453)this.T_4).method_31548().N(this.i(i));
            } else {
               class01488.N(this, i, flag1, flag);
            }
         }
      }

      while (((class05630)this.i_7).V.B()) {
         if (!this.yw() && !class07529.Nu) {
            ((class04453)this.T_4).method_7353((class00392)d_1, true);
            ((class05153)this.N_3).u((class00392)d_1);
         } else {
            if ((class06128)this.U_5 != null) {
               ((class06128)this.U_5).B();
               this.U_5 = null;
            }

            this.N((class05096)(new class05470()));
         }
      }

      while (((class05630)this.i_7).Y.B()) {
         if (((class03443)this.T_2).B()) {
            ((class04453)this.T_4).T();
         } else {
            ((class08764)this.b_0).N();
            this.B(null);
            this.N((class05096)(new class05410((class04453)this.T_4)));
         }
      }

      while (((class05630)this.i_7).a.B()) {
         this.N((class05096)(new class01417(((class01683)((class04453)this.T_4).y_0).W())));
      }

      while (((class05630)this.i_7).p.B()) {
         this.ye().ifPresent(var1x -> {
            this.yF();
            ((class01683)((class04453)this.T_4).y_0).N((class03556<class09037>)var1x, (class05096)this.v_3);
         });
      }

      while (((class05630)this.i_7).Q.B()) {
         if (!((class04453)this.T_4).method_7325()) {
            this.NE().N(new class07364(class07356.field_12969, class07209.field_10980, class07211.field_11033));
         }
      }

      while (((class05630)this.i_7).O.B()) {
         if (!((class04453)this.T_4).method_7325() && ((class04453)this.T_4).i(this.s())) {
            class04453 class04453 = (class04453)this.T_4;
            class07050 class07050 = class07050.field_5808;
            class04453 class04453x = class04453;
            if (this.y(class04453x, class07050)) {
               class04453x.method_6104(class07050);
            }
         }
      }

      while (((class05630)this.i_7).o.B()) {
         this.N(class06468.field_62004);
      }

      if ((class05096)this.v_3 == null && (class01323)this.G_0 == null && ((class05630)this.i_7).K.B()) {
         this.N(class06468.field_62005);
      }

      boolean flag2 = false;
      class04453 class04453x = (class04453)this.T_4;
      this.s(null);
      if (class04453x.method_6115()) {
         if (!((class05630)this.i_7).g.R()) {
            ((class03443)this.T_2).y((class04453)this.T_4);
         }

         while (((class05630)this.i_7).I.B()) {
         }

         while (((class05630)this.i_7).g.B()) {
         }

         while (((class05630)this.i_7).J.B()) {
         }
      } else {
         while (((class05630)this.i_7).I.B()) {
            flag2 |= this.NF();
         }

         while (((class05630)this.i_7).g.B()) {
            this.yn();
         }

         while (((class05630)this.i_7).J.B()) {
            this.LL();
         }

         if (((class04453)this.T_4).method_7325()) {
            while (((class05630)this.i_7).D.B()) {
               ((class01056)this.i_6).B().y();
            }
         }
      }

      if (((class05630)this.i_7).g.R() && (Integer)this.M_4 == 0 && !((class04453)this.T_4).method_6115()) {
         this.yn();
      }

      this.i((class05096)this.v_3 == null && !flag2 && ((class05630)this.i_7).I.R() && ((class06220)this.L_2).B());
   }

   @Nullable
   public class08337 Na() {
      this.yF();
      return (class08337)this.T_5;
   }
}
