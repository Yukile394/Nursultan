package minecraft;

import org.joml.Vector2i;
import org.joml.Vector2ic;

public class class02128 implements class02112 {
   public static final class02112 N = new class02128();

   private class02128() {
      super();
   }

   private void N(int var1, int var2, Vector2i var3, int var4, int var5) {
      if (var3.x + var4 > var1) {
         var3.x = Math.max(var3.x - 24 - var4, 4);
      }

      int i = var5 + 3;
      if (var3.y + i > var2) {
         var3.y = var2 - i;
      }
   }

   @Override
   public Vector2ic method_47944(int var1, int var2, int var3, int var4, int var5, int var6) {
      Vector2i vector2i = new Vector2i(var3, var4).add(12, -12);
      this.N(var1, var2, vector2i, var5, var6);
      return vector2i;
   }
}
