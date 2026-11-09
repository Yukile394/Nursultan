package minecraft;

public record class01325(float width, float height, float eyeHeight, class03810 attachments, boolean fixed) {
   public float L() {
      return this.eyeHeight;
   }

   private static float L(float var0) {
      return var0 * 0.85F;
   }

   public static class01325 L(float var0, float var1) {
      return new class01325(var0, var1, true);
   }

   private class01325(float var1, float var2, boolean var3) {
      this(var1, var2, L(var2), class03810.N(var1, var2), var3);
   }

   public class01325(float width, float height, float eyeHeight, class03810 attachments, boolean fixed) {
      super();
      this.width = width;
      this.height = height;
      this.eyeHeight = eyeHeight;
      this.attachments = attachments;
      this.fixed = fixed;
   }

   public boolean i() {
      return this.fixed;
   }

   public class03810 u() {
      return this.attachments;
   }

   public float y() {
      return this.height;
   }

   public class01325 y(float var1) {
      return new class01325(this.width, this.height, var1, this.attachments, this.fixed);
   }

   public static class01325 y(float var0, float var1) {
      return new class01325(var0, var1, false);
   }

   public class01325 N(class03839 var1) {
      return new class01325(this.width, this.height, this.eyeHeight, var1.N(this.width, this.height), this.fixed);
   }

   public class00734 N(class06889 var1) {
      return this.N(var1.M, var1.B, var1.Z);
   }

   public float N() {
      return this.width;
   }

   public class01325 N(float var1, float var2) {
      return !this.fixed && (var1 != 1.0F || var2 != 1.0F)
         ? new class01325(this.width * var1, this.height * var2, this.eyeHeight * var2, this.attachments.N(var1, var2, var1), false)
         : this;
   }

   public class00734 N(double var1, double var3, double var5) {
      float f = this.width / 2.0F;
      float f1 = this.height;
      return new class00734(var1 - f, var3, var5 - f, var1 + f, var3 + f1, var5 + f);
   }

   public class01325 N(float var1) {
      return this.N(var1, var1);
   }
}
