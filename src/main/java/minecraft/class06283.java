package minecraft;

import com.mojang.logging.LogUtils;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.slf4j.Logger;

public class class06283 {
   private static final Logger N = LogUtils.getLogger();

   public class06283() {
      super();
   }

   private static String y(int var0) {
      switch (var0) {
         case 40961:
            return "Invalid device.";
         case 40962:
            return "Invalid context.";
         case 40963:
            return "Illegal enum.";
         case 40964:
            return "Invalid value.";
         case 40965:
            return "Unable to allocate memory.";
         default:
            return "An unrecognized error occurred.";
      }
   }

   static boolean N(String var0) {
      int i = AL10.alGetError();
      if (i != 0) {
         N.error("{}: {}", var0, N(i));
         return true;
      } else {
         return false;
      }
   }

   static int N(AudioFormat var0) {
      Encoding encoding = var0.getEncoding();
      int i = var0.getChannels();
      int j = var0.getSampleSizeInBits();
      if (encoding.equals(Encoding.PCM_UNSIGNED) || encoding.equals(Encoding.PCM_SIGNED)) {
         if (i == 1) {
            if (j == 8) {
               return 4352;
            }

            if (j == 16) {
               return 4353;
            }
         } else if (i == 2) {
            if (j == 8) {
               return 4354;
            }

            if (j == 16) {
               return 4355;
            }
         }
      }

      throw new IllegalArgumentException("Invalid audio format: " + var0);
   }

   static boolean N(long var0, String var2) {
      int i = ALC10.alcGetError(var0);
      if (i != 0) {
         N.error("{} ({}): {}", new Object[]{var2, var0, y(i)});
         return true;
      } else {
         return false;
      }
   }

   private static String N(int var0) {
      switch (var0) {
         case 40961:
            return "Invalid name parameter.";
         case 40962:
            return "Invalid enumerated parameter value.";
         case 40963:
            return "Invalid parameter parameter value.";
         case 40964:
            return "Invalid operation.";
         case 40965:
            return "Unable to allocate memory.";
         default:
            return "An unrecognized error occurred.";
      }
   }
}
