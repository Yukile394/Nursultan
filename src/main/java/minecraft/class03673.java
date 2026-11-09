package minecraft;

import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class03673 implements class02112 {
   private static final int L = 5;
   private static final int u = 12;
   public static final int N = 3;
   public static final int y = 5;
   private final class03255 i;

   public class03673(class03255 var1) {
      super();
      this.i = var1;
   }

   private static int N(int var0, int var1, int var2) {
      return Math.round(class04995.B((float)Math.min(Math.abs(var0 - var1), var2) / var2, var2 - 3, 5.0F));
   }

   @Override
   public Vector2ic method_47944(int var1, int var2, int var3, int var4, int var5, int var6) {
      Vector2i vector2i = new Vector2i(var3 + 12, var4);
      if (vector2i.x + var5 > var1 - 5) {
         vector2i.x = Math.max(var3 - 12 - var5, 9);
      }

      vector2i.y += 3;
      int ix = var6 + 3 + 3;
      int j = this.i.L() + 3 + N(0, 0, this.i.B());
      int k = var2 - 5;
      if (j + ix <= k) {
         vector2i.y = vector2i.y + N(vector2i.y, this.i.y(), this.i.B());
      } else {
         vector2i.y = vector2i.y - (ix + N(vector2i.y, this.i.L(), this.i.B()));
      }

      return vector2i;
   }
}
