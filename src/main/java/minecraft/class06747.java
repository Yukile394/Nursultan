package minecraft;

public record class06747(int stroke, float strokeWidth, int fill) {
   private static final float u = 2.5F;

   public int L() {
      return this.stroke;
   }

   public class06747(int stroke, float strokeWidth, int fill) {
      this.stroke = stroke;
      this.strokeWidth = strokeWidth;
      this.fill = fill;
   }

   public int i() {
      return this.fill;
   }

   public float u() {
      return this.strokeWidth;
   }

   public static class06747 y(int var0) {
      return new class06747(0, 0.0F, var0);
   }

   public int y(float var1) {
      return class02566.N(this.fill, var1);
   }

   public boolean y() {
      return this.stroke != 0 && this.strokeWidth > 0.0F;
   }

   public int N(float var1) {
      return class02566.N(this.stroke, var1);
   }

   public static class06747 N(int var0) {
      return new class06747(var0, 2.5F, 0);
   }

   public static class06747 N(int var0, float var1) {
      return new class06747(var0, var1, 0);
   }

   public boolean N() {
      return this.fill != 0;
   }

   public static class06747 N(int var0, float var1, int var2) {
      return new class06747(var0, var1, var2);
   }
}
