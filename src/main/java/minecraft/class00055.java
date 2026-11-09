package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

class class00055 extends class00090 {
   class00055() {
      super();
   }

   @Nullable
   private ByteBuffer N(class08882 var1, int var2, int var3, long var4) {
      byte b0 = 0;
      if ((var2 & 1) != 0) {
         b0 |= 1;
      }

      if ((var2 & 2) != 0) {
         b0 |= 18;
      }

      ByteBuffer bytebuffer;
      if (b0 != 0) {
         GlStateManager.clearGlErrors();
         bytebuffer = var1.N(var3, 0L, var4, b0 | 64, var2);
         if (bytebuffer == null) {
            throw new IllegalStateException("Can't persistently map buffer, opengl error " + GlStateManager._getError());
         }
      } else {
         bytebuffer = null;
      }

      return bytebuffer;
   }

   @Override
   public class08494 N(class08882 var1, class08523 var2, long var3, long var5, int var7) {
      if (var2.i == null) {
         throw new IllegalStateException("Somehow trying to map an unmappable buffer");
      } else if (var3 > 2147483647L || var5 > 2147483647L) {
         throw new IllegalArgumentException("Mapping buffers larger than 2GB is not supported");
      } else if (var3 >= 0L && var5 >= 0L) {
         return new class08494(() -> {
            if ((var7 & 2) != 0) {
               var1.N(var2.u, var3, var5, var2.usage());
            }
         }, var2, MemoryUtil.memSlice(var2.i, (int)var3, (int)var5));
      } else {
         throw new IllegalArgumentException("Offset or length must be positive integer values");
      }
   }

   @Override
   public class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, ByteBuffer var4) {
      int i = var1.N();
      int j = var4.remaining();
      var1.y(i, var4, var3);
      ByteBuffer bytebuffer = this.N(var1, var3, i, j);
      return new class08523(var2, var1, var3, j, i, bytebuffer);
   }

   @Override
   public class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, long var4) {
      int i = var1.N();
      var1.y(i, var4, var3);
      ByteBuffer bytebuffer = this.N(var1, var3, i, var4);
      return new class08523(var2, var1, var3, var4, i, bytebuffer);
   }
}
