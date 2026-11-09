package minecraft;

import Nursultan.class11656;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds.Reference;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.amd.AmdWorkarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class08844 implements AutoCloseable, NativeWindowHandle {
   private static final Logger L = LogUtils.getLogger();
   public static final int N = 320;
   public static final int y = 240;
   private final GLFWErrorCallback u = GLFWErrorCallback.create(this::N);
   private final class04678 i;
   private final class01594 R;
   private final long M;
   private int B;
   private int Z;
   private int z;
   private int U;
   private Optional<class04760> E;
   private boolean W;
   private boolean m;
   private int P;
   private int s;
   private int T;
   private int b;
   private int j;
   private int v;
   private int n;
   private int t;
   private int G;
   private String l = "";
   private boolean d;
   private boolean w;
   private boolean k;
   private boolean Y;
   private boolean Q;
   private class06619 O = class06619.N;
   private static String g = System.getProperty("os.name").toLowerCase();

   private void w() {
      GLFW.glfwDefaultWindowHints();
      if (g.contains("mac") && SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac) {
         GLFW.glfwWindowHint(143361, 0);
      }
   }

   public boolean L() {
      return GLX._shouldClose(this);
   }

   public void L(boolean var1) {
      this.Q = var1;
   }

   public void L(int var1) {
      this.v = var1;
   }

   private void L(long var1, boolean var3) {
      this.k = var3;
   }

   private void L(long var1, int var3, int var4) {
      this.T = var3;
      this.b = var4;
   }

   public void M() {
      this.W = !this.W;
   }

   public int P() {
      return this.n;
   }

   public int T() {
      return this.P;
   }

   public class08844(class04678 var1, class01594 var2, class01018 var3, @Nullable String var4, String var5) {
      super();
      this.R = var2;
      this.G();
      this.N("Pre startup");
      this.i = var1;
      Optional optional = class04760.N(var4);
      if (optional.isPresent()) {
         this.E = optional;
      } else if (var3.L().isPresent() && var3.u().isPresent()) {
         this.E = Optional.of(new class04760(var3.L().getAsInt(), var3.u().getAsInt(), 8, 8, 8, 60));
      } else {
         this.E = Optional.empty();
      }

      this.m = this.W = var3.i();
      class06221 class06221 = var2.N(GLFW.glfwGetPrimaryMonitor());
      this.z = this.T = Math.max(var3.N(), 1);
      this.U = this.b = Math.max(var3.y(), 1);
      this.w();
      GLFW.glfwWindowHint(139265, 196609);
      GLFW.glfwWindowHint(139275, 221185);
      GLFW.glfwWindowHint(139266, 3);
      GLFW.glfwWindowHint(139267, 3);
      GLFW.glfwWindowHint(139272, 204801);
      GLFW.glfwWindowHint(139270, 1);
      int i1 = this.T;
      int j1 = this.b;
      long k1 = this.W && class06221 != null ? class06221.R() : 0L;
      this.N(var1, var2, var3, var4, var5, null);
      long lx = 0L;
      long kx = k1;
      int jx = j1;
      int ix = i1;
      this.M = this.N(ix, jx, var5, kx, lx, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 5, "[int, int, java.lang.CharSequence, long, long]");
         return this.N((Integer)var1x[0], (Integer)var1x[1], (CharSequence)var1x[2], (Long)var1x[3], (Long)var1x[4]);
      });
      if (class06221 != null) {
         class04760 class04760 = class06221.N(this.W ? this.E : Optional.empty());
         this.B = this.P = class06221.L() + class04760.N() / 2 - this.T / 2;
         this.Z = this.s = class06221.u() + class04760.y() / 2 - this.b / 2;
      } else {
         int[] aint1 = new int[1];
         int[] aint = new int[1];
         GLFW.glfwGetWindowPos(this.M, aint1, aint);
         this.B = this.P = aint1[0];
         this.Z = this.s = aint[0];
      }

      this.d();
      this.l();
      GLFW.glfwSetFramebufferSizeCallback(this.M, this::y);
      GLFW.glfwSetWindowPosCallback(this.M, this::N);
      GLFW.glfwSetWindowSizeCallback(this.M, this::L);
      GLFW.glfwSetWindowFocusCallback(this.M, this::N);
      GLFW.glfwSetCursorEnterCallback(this.M, this::y);
      GLFW.glfwSetWindowIconifyCallback(this.M, this::L);
   }

   public long B() {
      return this.M;
   }

   public boolean Z() {
      return this.W;
   }

   public Optional<class04760> i() {
      return this.E;
   }

   public int b() {
      return this.s;
   }

   public int s() {
      return this.t;
   }

   public boolean n() {
      return this.Y;
   }

   private void l() {
      int[] aint = new int[1];
      int[] aint1 = new int[1];
      GLFW.glfwGetFramebufferSize(this.M, aint, aint1);
      this.j = aint[0] > 0 ? aint[0] : 1;
      this.v = aint1[0] > 0 ? aint1[0] : 1;
      this.N(null);
   }

   private void d() {
      boolean flag = GLFW.glfwGetWindowMonitor(this.M) != 0L;
      if (this.W) {
         class06221 class06221 = this.R.N(this);
         if (class06221 == null) {
            L.warn("Failed to find suitable monitor for fullscreen mode");
            this.W = false;
         } else {
            if (class04560.N) {
               class04560.N(this);
            }

            class04760 class04760 = class06221.N(this.E);
            if (!flag) {
               this.B = this.P;
               this.Z = this.s;
               this.z = this.T;
               this.U = this.b;
            }

            this.P = 0;
            this.s = 0;
            this.T = class04760.N();
            this.b = class04760.y();
            GLFW.glfwSetWindowMonitor(this.M, class06221.R(), this.P, this.s, this.T, this.b, class04760.R());
            if (class04560.N) {
               class04560.y(this);
            }
         }
      } else {
         this.P = this.B;
         this.s = this.Z;
         this.T = this.z;
         this.b = this.U;
         GLFW.glfwSetWindowMonitor(this.M, 0L, this.P, this.s, this.T, this.b, -1);
      }
   }

   public int m() {
      return this.b;
   }

   public float t() {
      return Math.max(2.5F, this.U() / 1920.0F * 2.5F);
   }

   @Nullable
   public class06221 v() {
      return this.R.N(this);
   }

   public int j() {
      return this.G;
   }

   public int U() {
      return this.j;
   }

   @Override
   public void close() {
      RenderSystem.assertOnRenderThread();
      Callbacks.glfwFreeCallbacks(this.M);
      this.u.close();
      GLFW.glfwDestroyWindow(this.M);
      GLFW.glfwTerminate();
   }

   public boolean z() {
      return this.k;
   }

   public void u() {
      GLFWErrorCallback glfwerrorcallback = GLFW.glfwSetErrorCallback(this.u);
      if (glfwerrorcallback != null) {
         glfwerrorcallback.free();
      }
   }

   private void u(int var1) {
      if (SodiumExtraClientMod.options().extraSettings.useAdaptiveSync) {
         if (!GLFW.glfwExtensionSupported("GLX_EXT_swap_control_tear") && !GLFW.glfwExtensionSupported("WGL_EXT_swap_control_tear")) {
            SodiumExtraClientMod.logger().warn("Adaptive vsync not supported, falling back to vanilla vsync state!");
            SodiumExtraClientMod.options().extraSettings.useAdaptiveSync = false;
            SodiumExtraClientMod.options().writeChanges();
            GLFW.glfwSwapInterval(var1);
         } else {
            GLFW.glfwSwapInterval(-1);
         }
      } else {
         GLFW.glfwSwapInterval(var1);
      }
   }

   private static void y(int var0, long var1) {
      String sx = "GLFW error " + var0 + ": " + MemoryUtil.memUTF8(var1);
      TinyFileDialogs.tinyfd_messageBox(
         "Minecraft", sx + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).", "ok", "error", false
      );
      throw new class11656(sx);
   }

   public void y(boolean var1) {
      class04655.N(this, var1);
   }

   public void y(String var1) {
      GLFW.glfwSetWindowTitle(this.M, var1);
   }

   private void y(long var1, boolean var3) {
      if (var3) {
         this.i.H();
      }
   }

   public void y(int var1) {
      this.j = var1;
   }

   private void y(long var1, int var3, int var4) {
      if (var1 == this.M) {
         int ix = this.U();
         int jx = this.E();
         if (var3 != 0 && var4 != 0) {
            this.Y = false;
            this.j = var3;
            this.v = var4;
            if (this.U() != ix || this.E() != jx) {
               try {
                  this.i.V();
               } catch (Exception exception) {
                  class07080 class07080 = class07080.N(exception, "Window resize");
                  class07074 class07074 = class07080.N("Window Dimensions");
                  class07074.N("Old", ix + "x" + jx);
                  class07074.N("New", var3 + "x" + var4);
                  throw new class07878(class07080);
               }
            }
         } else {
            this.Y = true;
         }
      }
   }

   public int y() {
      RenderSystem.assertOnRenderThread();
      return GLX._getRefreshRate(this);
   }

   public int E() {
      return this.v;
   }

   public void N(Runnable var1) {
      GLFWWindowCloseCallback glfwwindowclosecallback = GLFW.glfwSetWindowCloseCallback(this.M, var1x -> var1.run());
      if (glfwwindowclosecallback != null) {
         glfwwindowclosecallback.free();
      }
   }

   public void N(class06619 var1) {
      class06619 class06619 = this.Q ? var1 : class06619.N;
      if (this.O != class06619) {
         this.O = class06619;
         class06619.N(this);
      }
   }

   private void N(CallbackInfo var1) {
      if (g.contains("mac") && SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac) {
         this.j /= 2;
         this.v /= 2;
      }
   }

   private void N(class04678 var1, class01594 var2, class01018 var3, String var4, String var5, CallbackInfo var6) {
      if (Iris.getIrisConfig().areDebugOptionsEnabled()) {
         GLFW.glfwWindowHint(139271, 1);
         GLFW.glfwWindowHint(139274, 0);
         Iris.logger.info("OpenGL debug context activated.");
         if (SodiumClientMod.options().performance.useNoErrorGLContext) {
            TinyFileDialogs.tinyfd_messageBox(
               "Iris",
               "Due to a configuration issue, Iris may crash on this launch. This has been fixed automatically for the next launch.",
               "ok",
               "warning",
               false
            );
            SodiumClientMod.options().performance.useNoErrorGLContext = false;

            try {
               SodiumOptions.writeToDisk(SodiumClientMod.options());
            } catch (IOException ioexception) {
               throw new RuntimeException(ioexception);
            }
         }
      }
   }

   private long N(int var1, int var2, CharSequence var3, long var4, long var6) {
      NvidiaWorkarounds.applyEnvironmentChanges();
      AmdWorkarounds.applyEnvironmentChanges();

      long ix;
      try {
         ix = GLFW.glfwCreateWindow(var1, var2, var3, var4, var6);
      } finally {
         NvidiaWorkarounds.undoEnvironmentChanges();
         AmdWorkarounds.undoEnvironmentChanges();
      }

      return ix;
   }

   private long N(IntSupplier var1, IntSupplier var2, Supplier var3, LongSupplier var4, Operation var5) {
      boolean flag = !PlatformRuntimeInformation.getInstance().platformHasEarlyLoadingScreen();
      if (flag) {
         NvidiaWorkarounds.applyEnvironmentChanges();
         AmdWorkarounds.applyEnvironmentChanges();
      }

      long ix;
      try {
         ix = (Long)var5.call(new Object[]{var1, var2, var3, var4});
      } finally {
         if (flag) {
            NvidiaWorkarounds.undoEnvironmentChanges();
            AmdWorkarounds.undoEnvironmentChanges();
         }
      }

      return ix;
   }

   public long N(int var1, int var2, CharSequence var3, long var4, long var6, Operation var8) {
      if (!PlatformRuntimeInformation.getInstance().platformHasEarlyLoadingScreen()
         && SodiumClientMod.options().performance.useNoErrorGLContext
         && !Workarounds.isWorkaroundEnabled(Reference.NO_ERROR_CONTEXT_UNSUPPORTED)) {
         GLFW.glfwWindowHint(139274, 1);
      }

      return (Long)var8.call(new Object[]{var1, var2, var3, var4, var6});
   }

   public static void N(BiConsumer<Integer, String> var0) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
         int ix = GLFW.glfwGetError(pointerbuffer);
         if (ix != 0) {
            long jx = pointerbuffer.get();
            String sx = jx == 0L ? "" : MemoryUtil.memUTF8(jx);
            var0.accept(ix, sx);
         }
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
   }

   public static String N() {
      int ix = GLFW.glfwGetPlatform();

      return switch (ix) {
         case 0 -> "<error>";
         case 393217 -> "win32";
         case 393218 -> "cocoa";
         case 393219 -> "wayland";
         case 393220 -> "x11";
         case 393221 -> "null";
         default -> String.format(Locale.ROOT, "unknown (%08X)", ix);
      };
   }

   public void N(@Nullable class08712 var1) {
      RenderSystem.flipFrame(this, var1);
      if (this.W != this.m) {
         this.m = this.W;
         this.N(this.w, var1);
      }
   }

   public void N(Optional<class04760> var1) {
      boolean flag = !var1.equals(this.E);
      this.E = var1;
      if (flag) {
         this.d = true;
      }
   }

   public void N(int var1, long var2) {
      RenderSystem.assertOnRenderThread();
      String sx = MemoryUtil.memUTF8(var2);
      L.error("########## GL ERROR ##########");
      L.error("@ {}", this.l);
      L.error("{}: {}", var1, sx);
   }

   public void N(int var1, int var2) {
      this.z = var1;
      this.U = var2;
      this.W = false;
      this.d();
   }

   private void N(long var1, boolean var3) {
      if (var1 == this.M) {
         this.i.L(var3);
      }
   }

   public void N(boolean var1) {
      RenderSystem.assertOnRenderThread();
      this.w = var1;
      int ix = var1 ? 1 : 0;
      this.u(ix);
   }

   private void N(long var1, int var3, int var4) {
      this.P = var3;
      this.s = var4;
   }

   public void N(int var1) {
      this.G = var1;
      double d0 = var1;
      int ix = (int)(this.j / d0);
      this.n = this.j / d0 > ix ? ix + 1 : ix;
      int jx = (int)(this.v / d0);
      this.t = this.v / d0 > jx ? jx + 1 : jx;
   }

   public void N(String var1) {
      this.l = var1;
   }

   public void N(class01622 var1, class03499 var2) throws IOException {
      int ix = GLFW.glfwGetPlatform();
      switch (ix) {
         case 393217:
         case 393220:
            List list = var2.N(var1);
            ArrayList arraylist = new ArrayList(list.size());

            try {
               MemoryStack memorystack = MemoryStack.stackPush();

               try {
                  Buffer buffer = GLFWImage.malloc(list.size(), memorystack);

                  for (int jx = 0; jx < list.size(); jx++) {
                     try (class08280 class08280 = class08280.N((InputStream)((class03652)list.get(jx)).get())) {
                        ByteBuffer bytebuffer = MemoryUtil.memAlloc(class08280.N() * class08280.y() * 4);
                        arraylist.add(bytebuffer);
                        bytebuffer.asIntBuffer().put(class08280.u());
                        buffer.position(jx);
                        buffer.width(class08280.N());
                        buffer.height(class08280.y());
                        buffer.pixels(bytebuffer);
                     }
                  }

                  GLFW.glfwSetWindowIcon(this.M, (Buffer)buffer.position(0));
               } catch (Throwable throwable2) {
                  if (memorystack != null) {
                     try {
                        memorystack.close();
                     } catch (Throwable throwable) {
                        throwable2.addSuppressed(throwable);
                     }
                  }

                  throw throwable2;
               }

               if (memorystack != null) {
                  memorystack.close();
               }
               break;
            } finally {
               arraylist.forEach(MemoryUtil::memFree);
            }
         case 393218:
            class04560.N(var2.y(var1));
         case 393219:
         case 393221:
            break;
         default:
            L.warn("Not setting icon for unrecognized platform: {}", ix);
      }
   }

   private void N(boolean var1, @Nullable class08712 var2) {
      RenderSystem.assertOnRenderThread();

      try {
         this.d();
         this.i.V();
         this.N(var1);
         this.N(var2);
      } catch (Exception exception) {
         L.error("Couldn't toggle fullscreen", exception);
      }
   }

   public int N(int var1, boolean var2) {
      int ix = 1;

      while (ix != var1 && ix < this.j && ix < this.v && this.j / (ix + 1) >= 320 && this.v / (ix + 1) >= 240) {
         ix++;
      }

      if (var2 && ix % 2 != 0) {
         ix++;
      }

      return ix;
   }

   public long getWin32Handle() {
      return GLFWNativeWin32.glfwGetWin32Window(this.B());
   }

   public int W() {
      return this.T;
   }

   public void R() {
      if (this.W && this.d) {
         this.d = false;
         this.d();
         this.i.V();
      }
   }

   private void G() {
      GLFW.glfwSetErrorCallback(class08844::y);
   }
}
