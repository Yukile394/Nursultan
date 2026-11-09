package minecraft;

record class00994(class08800 itemRenderState, double xOffset, double yOffset, double zOffset) {

   public double L() {
      return this.yOffset;
   }

   private class00994(class08800 itemRenderState, double xOffset, double yOffset, double zOffset) {
      super();
      this.itemRenderState = itemRenderState;
      this.xOffset = xOffset;
      this.yOffset = yOffset;
      this.zOffset = zOffset;
   }

   public double u() {
      return this.zOffset;
   }

   public double y() {
      return this.xOffset;
   }

   public static class00994 N(class03869 var0, class05363 var1, float var2) {
      float f = (var0.y + var2) / 3.0F;
      f *= f;
      double d0 = class04995.u((double)var2, var0.M, var0.u);
      double d1 = class04995.u((double)var2, var0.B, var0.i);
      double d2 = class04995.u((double)var2, var0.Z, var0.R);
      double d3 = class04995.u((double)f, var0.L.E, d0);
      double d4 = class04995.u((double)f, var0.L.W, d1);
      double d5 = class04995.u((double)f, var0.L.m, d2);
      class06889 class06889 = var1.y();
      return new class00994(var0.L, d3 - class06889.N(), d4 - class06889.y(), d5 - class06889.L());
   }

   public class08800 N() {
      return this.itemRenderState;
   }
}
