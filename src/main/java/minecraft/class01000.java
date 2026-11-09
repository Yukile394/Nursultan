package minecraft;

public class class01000 extends class01188<class02777> {
   public class01000(class01686 var1) {
      super(var1);
   }

   public void method_2819(class02777 var1) {
      super.method_2819(var1);
      this.M.i = (float) (Math.PI / 180.0) * var1.f.N();
      this.M.R = (float) (Math.PI / 180.0) * var1.f.y();
      this.M.M = (float) (Math.PI / 180.0) * var1.f.L();
      this.Z.i = (float) (Math.PI / 180.0) * var1.C.N();
      this.Z.R = (float) (Math.PI / 180.0) * var1.C.y();
      this.Z.M = (float) (Math.PI / 180.0) * var1.C.L();
      this.U.i = (float) (Math.PI / 180.0) * var1.S.N();
      this.U.R = (float) (Math.PI / 180.0) * var1.S.y();
      this.U.M = (float) (Math.PI / 180.0) * var1.S.L();
      this.z.i = (float) (Math.PI / 180.0) * var1.Nj.N();
      this.z.R = (float) (Math.PI / 180.0) * var1.Nj.y();
      this.z.M = (float) (Math.PI / 180.0) * var1.Nj.L();
      this.W.i = (float) (Math.PI / 180.0) * var1.Nv.N();
      this.W.R = (float) (Math.PI / 180.0) * var1.Nv.y();
      this.W.M = (float) (Math.PI / 180.0) * var1.Nv.L();
      this.E.i = (float) (Math.PI / 180.0) * var1.Nn.N();
      this.E.R = (float) (Math.PI / 180.0) * var1.Nn.y();
      this.E.M = (float) (Math.PI / 180.0) * var1.Nn.L();
   }

   private static class04792 N(class04834 var0) {
      class04792 class04792 = class01188.N(var0, 0.0F);
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0), class04838.N(0.0F, 1.0F, 0.0F))
         .N("hat", class04822.L().N(32, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0.N(0.5F)), class04838.N);
      class04839.N("right_leg", class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(-0.1F)), class04838.N(-1.9F, 11.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(0, 16).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(-0.1F)), class04838.N(1.9F, 11.0F, 0.0F));
      return class04792;
   }

   public static class08118<class04806> N(class04834 var0, class04834 var1) {
      return N(class01000::N, var0, var1).N(var0x -> class04806.N(var0x, 64, 32));
   }
}
