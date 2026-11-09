package minecraft;

public class class00040 extends class00185 {
   private class00040(
      class04891 var1,
      class04911 var2,
      float var3,
      float var4,
      class06069 var5,
      boolean var6,
      int var7,
      class00018 var8,
      double var9,
      double var11,
      double var13
   ) {
      this(var1.N(), var2, var3, var4, var5, var6, var7, var8, var9, var11, var13, false);
   }

   public class00040(class04891 var1, class04911 var2, float var3, float var4, class06069 var5, double var6, double var8, double var10) {
      this(var1, var2, var3, var4, var5, false, 0, class00018.field_5476, var6, var8, var10);
   }

   public class00040(
      class01894 var1,
      class04911 var2,
      float var3,
      float var4,
      class06069 var5,
      boolean var6,
      int var7,
      class00018 var8,
      double var9,
      double var11,
      double var13,
      boolean var15
   ) {
      super(var1, var2, var5);
      this.u = var3;
      this.i = var4;
      this.R = var9;
      this.M = var11;
      this.B = var13;
      this.Z = var6;
      this.z = var7;
      this.U = var8;
      this.E = var15;
   }

   public class00040(class04891 var1, class04911 var2, float var3, float var4, class06069 var5, class07209 var6) {
      this(var1, var2, var3, var4, var5, var6.method_10263() + 0.5, var6.method_10264() + 0.5, var6.method_10260() + 0.5);
   }

   public static class00040 y(class04891 var0, float var1, float var2) {
      return new class00040(var0.N(), class04911.field_15256, var2, var1, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
   }

   public static class00040 y(class04891 var0) {
      return y(var0, 1.0F, 1.0F);
   }

   public static class00040 N(class04891 var0, class06069 var1, double var2, double var4, double var6) {
      return new class00040(var0, class04911.field_15256, 1.0F, 1.0F, var1, false, 0, class00018.field_5476, var2, var4, var6);
   }

   public static class00040 N(class04891 var0, float var1) {
      return N(var0, var1, 0.25F);
   }

   public static class00040 N(class04891 var0, float var1, float var2) {
      return new class00040(var0.N(), class04911.field_61058, var2, var1, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
   }

   public static class00040 N(class04891 var0) {
      return new class00040(var0.N(), class04911.field_15253, 1.0F, 1.0F, class00044.v(), false, 0, class00018.field_5478, 0.0, 0.0, 0.0, true);
   }

   public static class00040 N(class03556<class04891> var0, float var1) {
      return N((class04891)var0.N(), var1);
   }

   public static class00040 N(class04891 var0, class06889 var1) {
      return new class00040(var0, class04911.field_15247, 4.0F, 1.0F, class00044.v(), false, 0, class00018.field_5476, var1.M, var1.B, var1.Z);
   }
}
