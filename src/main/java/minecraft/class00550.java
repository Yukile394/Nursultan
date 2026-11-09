package minecraft;

public class class00550 extends class00547 {
   public static final class02362<class00667, class00550> z = class00381.N(class00550::y, class00550::N);

   public class00550(class06889 var1, boolean var2, boolean var3) {
      super(var1.M, var1.B, var1.Z, 0.0F, 0.0F, var2, var3, true, false);
   }

   public class00550(double var1, double var3, double var5, boolean var7, boolean var8) {
      super(var1, var3, var5, 0.0F, 0.0F, var7, var8, true, false);
   }

   private void y(class00667 var1) {
      var1.writeDouble(this.N);
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.writeByte(class00547.N(this.R, this.M));
   }

   private static class00550 N(class00667 var0) {
      double d0 = var0.readDouble();
      double d1 = var0.readDouble();
      double d2 = var0.readDouble();
      short short1 = var0.readUnsignedByte();
      boolean flag = class00547.N((int)short1);
      boolean flag1 = class00547.y((int)short1);
      return new class00550(d0, d1, d2, flag, flag1);
   }

   @Override
   public class02897<class00550> method_65080() {
      return class04248.ya;
   }
}
