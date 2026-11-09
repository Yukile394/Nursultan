package minecraft;

import com.mojang.logging.LogUtils;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.OptionalLong;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class class06313 {
   static final Logger N = LogUtils.getLogger();
   private static final int y = 0;
   private static final int L = 30;
   private long u;
   private long i;
   private boolean R;
   @Nullable
   private String M;
   private static final class06302 B = new class06291();
   private class06302 Z = B;
   private class06302 z = B;
   private final class06310 U = new class06310();

   public synchronized boolean L() {
      String s = N();
      if (Objects.equals(this.M, s)) {
         return false;
      } else {
         this.M = s;
         return true;
      }
   }

   public List<String> M() {
      List<String> list = ALUtil.getStringList(0L, 4115);
      return list == null ? Collections.emptyList() : list;
   }

   public class06313() {
      super();
      this.M = N();
   }

   public boolean B() {
      return this.R && ALC11.alcGetInteger(this.u, 787) == 0;
   }

   private int Z() {
      MemoryStack memorystack = MemoryStack.stackPush();

      int i1;
      label58: {
         try {
            int ix = ALC10.alcGetInteger(this.u, 4098);
            if (class06283.N(this.u, "Get attributes size")) {
               throw new IllegalStateException("Failed to get OpenAL attributes");
            }

            IntBuffer intbuffer = memorystack.mallocInt(ix);
            ALC10.alcGetIntegerv(this.u, 4099, intbuffer);
            if (class06283.N(this.u, "Get attributes")) {
               throw new IllegalStateException("Failed to get OpenAL attributes");
            }

            int j = 0;

            while (j < ix) {
               int k = intbuffer.get(j++);
               if (k == 0) {
                  break;
               }

               int l = intbuffer.get(j++);
               if (k == 4112) {
                  i1 = l;
                  break label58;
               }
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

         return 30;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      return i1;
   }

   public class06310 i() {
      return this.U;
   }

   public void u() {
      this.Z.y();
      this.z.y();
      ALC10.alcDestroyContext(this.i);
      if (this.u != 0L) {
         ALC10.alcCloseDevice(this.u);
      }
   }

   private static OptionalLong y(@Nullable String var0) {
      long ix = ALC10.alcOpenDevice(var0);
      return ix != 0L && !class06283.N(ix, "Open device") ? OptionalLong.of(ix) : OptionalLong.empty();
   }

   public String y() {
      String s = ALC10.alcGetString(this.u, 4115);
      if (s == null) {
         s = ALC10.alcGetString(this.u, 4101);
      }

      if (s == null) {
         s = "Unknown";
      }

      return s;
   }

   public void N(class06297 var1) {
      if (!this.Z.N(var1) && !this.z.N(var1)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   @Nullable
   public static String N() {
      if (!ALC10.alcIsExtensionPresent(0L, "ALC_ENUMERATE_ALL_EXT")) {
         return null;
      } else {
         ALUtil.getStringList(0L, 4115);
         return ALC10.alcGetString(0L, 4114);
      }
   }

   public void N(@Nullable String var1, boolean var2) {
      this.u = N(var1);
      this.R = false;
      ALCCapabilities alccapabilities = ALC.createCapabilities(this.u);
      if (class06283.N(this.u, "Get capabilities")) {
         throw new IllegalStateException("Failed to get OpenAL capabilities");
      } else if (!alccapabilities.OpenALC11) {
         throw new IllegalStateException("OpenAL 1.1 not supported");
      } else {
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            IntBuffer intbuffer = this.N(memorystack, alccapabilities.ALC_SOFT_HRTF && var2);
            this.i = ALC10.alcCreateContext(this.u, intbuffer);
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

         if (class06283.N(this.u, "Create context")) {
            throw new IllegalStateException("Unable to create OpenAL context");
         } else {
            ALC10.alcMakeContextCurrent(this.i);
            int j = this.Z();
            int k = class04995.N((int)class04995.N((float)j), 2, 8);
            int ix = class04995.N(j - k, 8, 255);
            this.Z = new class06294(ix);
            this.z = new class06294(k);
            ALCapabilities alcapabilities = AL.createCapabilities(alccapabilities);
            class06283.N("Initialization");
            if (!alcapabilities.AL_EXT_source_distance_model) {
               throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
            } else {
               AL10.alEnable(512);
               if (!alcapabilities.AL_EXT_LINEAR_DISTANCE) {
                  throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
               } else {
                  class06283.N("Enable per-source distance models");
                  N.info("OpenAL initialized on device {}", this.y());
                  this.R = ALC10.alcIsExtensionPresent(this.u, "ALC_EXT_disconnect");
               }
            }
         }
      }
   }

   private IntBuffer N(MemoryStack var1, boolean var2) {
      byte b0 = 5;
      IntBuffer intbuffer = var1.callocInt(11);
      if (ALC10.alcGetInteger(this.u, 6548) > 0) {
         intbuffer.put(6546).put(var2 ? 1 : 0);
         intbuffer.put(6550).put(0);
      }

      intbuffer.put(6554).put(1);
      return intbuffer.put(0).flip();
   }

   private static long N(@Nullable String var0) {
      OptionalLong optionallong = OptionalLong.empty();
      if (var0 != null) {
         optionallong = y(var0);
      }

      if (optionallong.isEmpty()) {
         optionallong = y(N());
      }

      if (optionallong.isEmpty()) {
         optionallong = y(null);
      }

      if (optionallong.isEmpty()) {
         throw new IllegalStateException("Failed to open OpenAL device");
      } else {
         return optionallong.getAsLong();
      }
   }

   @Nullable
   public class06297 N(class06319 var1) {
      return (var1 == class06319.field_18353 ? this.z : this.Z).N();
   }

   public String R() {
      return String.format(Locale.ROOT, "Sounds: %d/%d + %d/%d", this.Z.u(), this.Z.L(), this.z.u(), this.z.L());
   }
}
