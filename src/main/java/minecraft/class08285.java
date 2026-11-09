package minecraft;

import org.jspecify.annotations.Nullable;

public class class08285 extends class08476 {
   private static final class01894 g = class01894.y("textures/entity/wolf/wolf.png");
   public boolean N;
   public boolean y;
   public float L = (float) (Math.PI / 5);
   public float u;
   public float i;
   public float R = 1.0F;
   public class01894 M = g;
   @Nullable
   public class06563 B;
   public class06584 Z = class06584.E;

   public class08285() {
      super();
   }

   public float N(float var1) {
      float f = (this.i + var1) / 1.8F;
      if (f < 0.0F) {
         f = 0.0F;
      } else if (f > 1.0F) {
         f = 1.0F;
      }

      return class04995.m(f * (float) Math.PI) * class04995.m(f * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }
}
