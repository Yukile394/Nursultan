package minecraft;

public class class02812 {
   public static final class02812 N = new class02812(0.75F, 0.5F, 0.25F);
   public static final class02812 y = new class02812(0.95F, 0.69F, 0.32F);
   private final float L;
   private final float u;
   private final float i;

   private class02812(float var1, float var2, float var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public class02842 N(float var1) {
      if (var1 < this.i) {
         return class02842.field_21084;
      } else if (var1 < this.u) {
         return class02842.field_21083;
      } else {
         return var1 < this.L ? class02842.field_21082 : class02842.field_21081;
      }
   }

   public class02842 N(int var1, int var2) {
      return this.N((float)(var2 - var1) / var2);
   }

   public class02842 N(class06584 var1) {
      return !var1.W() ? class02842.field_21081 : this.N(var1.P(), var1.s());
   }
}
