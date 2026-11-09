package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import org.jspecify.annotations.Nullable;

public class class07849 {
   private static final int N = 786432;
   private final class02579 y;
   @Nullable
   private static class07849 L;

   public void L() {
      this.y.y();
   }

   public class07849() {
      this(786432);
   }

   public class07849(int var1) {
      super();
      this.y = new class02579(var1);
   }

   public static class07849 y() {
      if (L == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return L;
      }
   }

   public class07331 N(DrawMode var1, VertexFormat var2) {
      return new class07331(this.y, var1, var2);
   }

   public static void N() {
      if (L != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         L = new class07849();
      }
   }
}
