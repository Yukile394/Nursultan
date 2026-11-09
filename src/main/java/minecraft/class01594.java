package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.slf4j.Logger;

public class class01594 {
   private static final Logger N = LogUtils.getLogger();
   private final Long2ObjectMap<class06221> y = new Long2ObjectOpenHashMap();
   private final class04649 L;

   public class01594(class04649 var1) {
      super();
      this.L = var1;
      GLFW.glfwSetMonitorCallback(this::N);
      PointerBuffer pointerbuffer = GLFW.glfwGetMonitors();
      if (pointerbuffer != null) {
         for (int i = 0; i < pointerbuffer.limit(); i++) {
            long j = pointerbuffer.get(i);
            this.y.put(j, var1.createMonitor(j));
         }
      }
   }

   @Nullable
   public class06221 N(class08844 var1) {
      long i = GLFW.glfwGetWindowMonitor(var1.B());
      if (i != 0L) {
         return this.N(i);
      } else {
         int j = var1.T();
         int k = j + var1.W();
         int l = var1.b();
         int i1 = l + var1.m();
         int j1 = -1;
         class06221 class06221x = null;
         long k1 = GLFW.glfwGetPrimaryMonitor();
         N.debug("Selecting monitor - primary: {}, current monitors: {}", k1, this.y);
         ObjectIterator<class06221> objectiterator = this.y.values().iterator();

         while (objectiterator.hasNext()) {
            class06221 class06221x = (class06221)objectiterator.next();
            int l1 = class06221x.L();
            int i2 = l1 + class06221x.y().N();
            int j2 = class06221x.u();
            int k2 = j2 + class06221x.y().y();
            int l2 = N(j, l1, i2);
            int i3 = N(k, l1, i2);
            int j3 = N(l, j2, k2);
            int k3 = N(i1, j2, k2);
            int l3 = Math.max(0, i3 - l2);
            int i4 = Math.max(0, k3 - j3);
            int j4 = l3 * i4;
            if (j4 > j1) {
               class06221x = class06221x;
               j1 = j4;
            } else if (j4 == j1 && k1 == class06221x.R()) {
               N.debug("Primary monitor {} is preferred to monitor {}", class06221x, class06221x);
               class06221x = class06221x;
            }
         }

         N.debug("Selected monitor: {}", class06221x);
         return class06221x;
      }
   }

   public void N() {
      RenderSystem.assertOnRenderThread();
      GLFWMonitorCallback glfwmonitorcallback = GLFW.glfwSetMonitorCallback(null);
      if (glfwmonitorcallback != null) {
         glfwmonitorcallback.free();
      }
   }

   public static int N(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   private void N(long var1, int var3) {
      RenderSystem.assertOnRenderThread();
      if (var3 == 262145) {
         this.y.put(var1, this.L.createMonitor(var1));
         N.debug("Monitor {} connected. Current monitors: {}", var1, this.y);
      } else if (var3 == 262146) {
         this.y.remove(var1);
         N.debug("Monitor {} disconnected. Current monitors: {}", var1, this.y);
      }
   }

   @Nullable
   public class06221 N(long var1) {
      return (class06221)this.y.get(var1);
   }
}
