package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

class class00086 extends class00090 {
   class00086() {
      super();
   }

   @Override
   public class08494 N(class08882 var1, class08523 var2, long var3, long var5, int var7) {
      GlStateManager.clearGlErrors();
      ByteBuffer bytebuffer = var1.N(var2.u, var3, var5, var7, var2.usage());
      if (bytebuffer == null) {
         throw new IllegalStateException("Can't map buffer, opengl error " + GlStateManager._getError());
      } else {
         return new class08494(() -> var1.N(var2.u, var2.usage()), var2, bytebuffer);
      }
   }

   @Override
   public class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, ByteBuffer var4) {
      int i = var1.N();
      int j = var4.remaining();
      var1.N(i, var4, var3);
      return new class08523(var2, var1, var3, j, i, null);
   }

   @Override
   public class08523 N(class08882 var1, @Nullable Supplier<String> var2, int var3, long var4) {
      int i = var1.N();
      var1.N(i, var4, var3);
      return new class08523(var2, var1, var3, var4, i, null);
   }
}
