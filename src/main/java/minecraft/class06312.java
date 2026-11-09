package minecraft;

import com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06312 {
   @Nullable
   private ByteBuffer N;
   private final AudioFormat y;
   private boolean L;
   private int u;

   private void L(ByteBuffer var1) {
      short short1 = 0;
      short short2 = 0;
      int i = 0;

      while (var1.hasRemaining()) {
         if (i == 0) {
            var1.mark();
            short1 = (short)(var1.getShort() & -4);
            short2 = (short)(var1.getShort() & -4);
            var1.reset();
            i = 15;
         } else {
            i--;
         }

         var1.putShort(short1);
         var1.putShort(short2);
      }

      var1.flip();
   }

   public OptionalInt L() {
      OptionalInt optionalint = this.N();
      this.L = false;
      return optionalint;
   }

   public class06312(ByteBuffer var1, AudioFormat var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N(var1, var2, null);
   }

   public void y() {
      if (this.L) {
         AL10.alDeleteBuffers(new int[]{this.u});
         if (class06283.N("Deleting stream buffers")) {
            return;
         }
      }

      this.L = false;
   }

   private void y(ByteBuffer var1) {
      short short1 = 0;
      int i = 0;

      while (var1.hasRemaining()) {
         if (i == 0) {
            var1.mark();
            short1 = (short)(var1.getShort() & -4);
            var1.reset();
            i = 15;
         } else {
            i--;
         }

         var1.putShort(short1);
      }

      var1.flip();
   }

   private void N(ByteBuffer var1, AudioFormat var2, CallbackInfo var3) {
      if (ProtocolTranslator.getTargetVersion().equals(AprilFoolsProtocolVersion.s3d_shareware)) {
         this.N(var1);
      }
   }

   private void N(ByteBuffer var1) {
      if (var1 != null) {
         if (this.y.getChannels() == 1) {
            this.y(var1);
         } else {
            this.L(var1);
         }
      }
   }

   OptionalInt N() {
      if (!this.L) {
         if (this.N == null) {
            return OptionalInt.empty();
         }

         int i = class06283.N(this.y);
         int[] aint = new int[1];
         AL10.alGenBuffers(aint);
         if (class06283.N("Creating buffer")) {
            return OptionalInt.empty();
         }

         AL10.alBufferData(aint[0], i, this.N, (int)this.y.getSampleRate());
         if (class06283.N("Assigning buffer data")) {
            return OptionalInt.empty();
         }

         this.u = aint[0];
         this.L = true;
         this.N = null;
      }

      return OptionalInt.of(this.u);
   }
}
