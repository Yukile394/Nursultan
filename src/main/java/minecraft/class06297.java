package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;
import org.slf4j.Logger;

public class class06297 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 4;
   public static final int N = 1;
   private final int u;
   private final AtomicBoolean i = new AtomicBoolean(true);
   private int R = 16384;
   @Nullable
   private class06304 M;

   public void L() {
      AL10.alSourcePlay(this.u);
   }

   public void L(float var1) {
      AL10.alSourcei(this.u, 53248, 53251);
      AL10.alSourcef(this.u, 4131, var1);
      AL10.alSourcef(this.u, 4129, 1.0F);
      AL10.alSourcef(this.u, 4128, 0.0F);
   }

   public boolean M() {
      return this.U() == 4114;
   }

   private class06297(int var1) {
      super();
      this.u = var1;
   }

   public boolean B() {
      return this.U() == 4116;
   }

   public void Z() {
      AL10.alSourcei(this.u, 53248, 0);
   }

   public void i() {
      if (this.U() == 4115) {
         AL10.alSourcePlay(this.u);
      }
   }

   private int U() {
      return !this.i.get() ? 4116 : AL10.alGetSourcei(this.u, 4112);
   }

   public void z() {
      if (this.M != null) {
         int ix = this.E();
         this.N(ix);
      }
   }

   public void u() {
      if (this.U() == 4114) {
         AL10.alSourcePause(this.u);
      }
   }

   public void y(boolean var1) {
      AL10.alSourcei(this.u, 514, var1 ? 1 : 0);
   }

   public void y(float var1) {
      AL10.alSourcef(this.u, 4106, var1);
   }

   public void y() {
      if (this.i.compareAndSet(true, false)) {
         AL10.alSourceStop(this.u);
         class06283.N("Stop");
         if (this.M != null) {
            try {
               this.M.close();
            } catch (IOException ioexception) {
               y.error("Failed to close audio stream", ioexception);
            }

            this.E();
            this.M = null;
         }

         AL10.alDeleteSources(new int[]{this.u});
         class06283.N("Cleanup");
      }
   }

   private int E() {
      int ix = AL10.alGetSourcei(this.u, 4118);
      if (ix > 0) {
         int[] aint = new int[ix];
         AL10.alSourceUnqueueBuffers(this.u, aint);
         class06283.N("Unqueue buffers");
         AL10.alDeleteBuffers(aint);
         class06283.N("Remove processed buffers");
      }

      return ix;
   }

   @Nullable
   static class06297 N() {
      int[] aint = new int[1];
      AL10.alGenSources(aint);
      return class06283.N("Allocate new source") ? null : new class06297(aint[0]);
   }

   public void N(class06889 var1) {
      AL10.alSourcefv(this.u, 4100, new float[]{(float)var1.M, (float)var1.B, (float)var1.Z});
   }

   private void N(int var1) {
      if (this.M != null) {
         try {
            for (int ix = 0; ix < var1; ix++) {
               ByteBuffer bytebuffer = this.M.N(this.R);
               if (bytebuffer != null) {
                  new class06312(bytebuffer, this.M.N()).L().ifPresent(var1x -> AL10.alSourceQueueBuffers(this.u, new int[]{var1x}));
               }
            }
         } catch (IOException ioexception) {
            y.error("Failed to read from audio stream", ioexception);
         }
      }
   }

   public void N(float var1) {
      AL10.alSourcef(this.u, 4099, var1);
   }

   public void N(boolean var1) {
      AL10.alSourcei(this.u, 4103, var1 ? 1 : 0);
   }

   public void N(class06312 var1) {
      var1.N().ifPresent(var1x -> AL10.alSourcei(this.u, 4105, var1x));
   }

   public void N(class06304 var1) {
      this.M = var1;
      AudioFormat audioformat = var1.N();
      this.R = N(audioformat, 1);
      this.N(4);
   }

   private static int N(AudioFormat var0, int var1) {
      return (int)(var1 * var0.getSampleSizeInBits() / 8.0F * var0.getChannels() * var0.getSampleRate());
   }

   public void R() {
      if (this.i.get()) {
         AL10.alSourceStop(this.u);
         class06283.N("Stop");
      }
   }
}
