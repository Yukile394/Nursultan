package minecraft;

import com.mojang.logging.LogUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public class class04284 {
   private static final Logger y = LogUtils.getLogger();
   public static final Object N = new Object();
   private static long L = 0L;

   public class04284() {
      super();
   }

   public static void y() {
      synchronized (N) {
         if (L != 0L) {
            FreeType.FT_Done_Library(L);
            L = 0L;
         }
      }
   }

   public static boolean y(int var0, String var1) {
      if (var0 != 0) {
         y.error("FreeType error: {} ({})", N(var0), var1);
         return true;
      } else {
         return false;
      }
   }

   public static float N(FT_Vector var0) {
      return (float)var0.x() / 64.0F;
   }

   private static String N(int var0) {
      String s = FreeType.FT_Error_String(var0);
      return s != null ? s : "Unrecognized error: 0x" + Integer.toHexString(var0);
   }

   public static FT_Vector N(FT_Vector var0, float var1, float var2) {
      long i = Math.round(var1 * 64.0F);
      long j = Math.round(var2 * 64.0F);
      return var0.set(i, j);
   }

   public static long N() {
      synchronized (N) {
         if (L == 0L) {
            MemoryStack memorystack = MemoryStack.stackPush();

            try {
               PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
               N(FreeType.FT_Init_FreeType(pointerbuffer), "Initializing FreeType library");
               L = pointerbuffer.get();
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

         return L;
      }
   }

   public static void N(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("FreeType error: " + N(var0) + " (" + var1 + ")");
      }
   }
}
