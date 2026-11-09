package minecraft;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public class class08263 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 10;
   private final Queue<class08277> L = EvictingQueue.create(10);
   @Nullable
   private volatile class08277 u;
   private static final List<Integer> i = ImmutableList.of(37190, 37191, 37192, 33387);
   private static final List<Integer> R = ImmutableList.of(37190, 37191, 37192);

   public static String L(int var0) {
      switch (var0) {
         case 33387:
            return "NOTIFICATION";
         case 37190:
            return "HIGH";
         case 37191:
            return "MEDIUM";
         case 37192:
            return "LOW";
         default:
            return u(var0);
      }
   }

   public class08263() {
      super();
   }

   private static String u(int var0) {
      return "Unknown (0x" + HexFormat.of().withUpperCase().toHexDigits(var0) + ")";
   }

   public static String y(int var0) {
      switch (var0) {
         case 33356:
            return "ERROR";
         case 33357:
            return "DEPRECATED BEHAVIOR";
         case 33358:
            return "UNDEFINED BEHAVIOR";
         case 33359:
            return "PORTABILITY";
         case 33360:
            return "PERFORMANCE";
         case 33361:
            return "OTHER";
         case 33384:
            return "MARKER";
         default:
            return u(var0);
      }
   }

   public static String N(int var0) {
      switch (var0) {
         case 33350:
            return "API";
         case 33351:
            return "WINDOW SYSTEM";
         case 33352:
            return "SHADER COMPILER";
         case 33353:
            return "THIRD PARTY";
         case 33354:
            return "APPLICATION";
         case 33355:
            return "OTHER";
         default:
            return u(var0);
      }
   }

   @Nullable
   public static class08263 N(int var0, boolean var1, Set<String> var2) {
      if (var0 <= 0) {
         return null;
      } else {
         GLCapabilities glcapabilities = GL.getCapabilities();
         if (glcapabilities.GL_KHR_debug && class08879.y) {
            class08263 class08263 = new class08263();
            var2.add("GL_KHR_debug");
            GL11.glEnable(37600);
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int j = 0; j < i.size(); j++) {
               boolean flag1 = j < var0;
               KHRDebug.glDebugMessageControl(4352, 4352, i.get(j), (int[])null, flag1);
            }

            KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)GLX.make(GLDebugMessageCallback.create(class08263::N), class06417::N), 0L);
            return class08263;
         } else if (glcapabilities.GL_ARB_debug_output && class08879.u) {
            class08263 class08263x = new class08263();
            var2.add("GL_ARB_debug_output");
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int ix = 0; ix < R.size(); ix++) {
               boolean flag = ix < var0;
               ARBDebugOutput.glDebugMessageControlARB(4352, 4352, R.get(ix), (int[])null, flag);
            }

            ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)GLX.make(GLDebugMessageARBCallback.create(class08263x::N), class06417::N), 0L);
            return class08263x;
         } else {
            return null;
         }
      }
   }

   public List<String> N() {
      synchronized (this.L) {
         ArrayList arraylist = Lists.newArrayListWithCapacity(this.L.size());

         for (class08277 class08277 : this.L) {
            arraylist.add(class08277 + " x " + class08277.N);
         }

         return arraylist;
      }
   }

   private void N(int var1, int var2, int var3, int var4, int var5, long var6, long var8) {
      String s = GLDebugMessageCallback.getMessage(var5, var6);
      class08277 class08277;
      synchronized (this.L) {
         class08277 = this.u;
         if (class08277 != null && class08277.N(var1, var2, var3, var4, s)) {
            class08277.N++;
         } else {
            class08277 = new class08277(var1, var2, var3, var4, s);
            this.L.add(class08277);
            this.u = class08277;
         }
      }

      N.info("OpenGL debug message: {}", class08277);
   }
}
