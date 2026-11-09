package minecraft;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;

public abstract class class00090 {
   public class00090() {
      super();
   }

   public abstract class08494 N(class08882 var1, class08523 var2, long var3, long var5, int var7);

   public abstract class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, ByteBuffer var4);

   public abstract class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, long var4);

   public static class00090 N(GLCapabilities var0, Set<String> var1) {
      if (var0.GL_ARB_buffer_storage && class08879.R) {
         var1.add("GL_ARB_buffer_storage");
         return new class00055();
      } else {
         return new class00086();
      }
   }
}
