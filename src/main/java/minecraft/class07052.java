package minecraft;

public class class07052 {
   private static final float N = -72000.0F;
   private static final float y = 1440000.0F;
   private static final float L = 3600000.0F;
   private final class07086 u;
   private final float i;

   public boolean L() {
      return this.i >= class07086.field_5807.ordinal();
   }

   public class07052(class07086 var1, long var2, long var4, float var6) {
      super();
      this.u = var1;
      this.i = this.N(var1, var2, var4, var6);
   }

   public float u() {
      if (this.i < 2.0F) {
         return 0.0F;
      } else {
         return this.i > 4.0F ? 1.0F : (this.i - 2.0F) / 2.0F;
      }
   }

   public float y() {
      return this.i;
   }

   private float N(class07086 var1, long var2, long var4, float var6) {
      if (var1 == class07086.field_5801) {
         return 0.0F;
      } else {
         boolean flag = var1 == class07086.field_5807;
         float f = 0.75F;
         float f1 = class04995.N(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         f += f1;
         float f2 = 0.0F;
         f2 += class04995.N((float)var4 / 3600000.0F, 0.0F, 1.0F) * (flag ? 1.0F : 0.75F);
         f2 += class04995.N(var6 * 0.25F, 0.0F, f1);
         if (var1 == class07086.field_5805) {
            f2 *= 0.5F;
         }

         f += f2;
         return var1.N() * f;
      }
   }

   public boolean N(float var1) {
      return this.i > var1;
   }

   public class07086 N() {
      return this.u;
   }
}
