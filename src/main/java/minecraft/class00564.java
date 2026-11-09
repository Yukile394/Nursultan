package minecraft;

public class class00564 extends class00547 {
   public static final class02362<class00667, class00564> z = class00381.N(class00564::y, class00564::N);

   public class00564(class06889 var1, float var2, float var3, boolean var4, boolean var5) {
      super(var1.M, var1.B, var1.Z, var2, var3, var4, var5, true, true);
   }

   public class00564(double var1, double var3, double var5, float var7, float var8, boolean var9, boolean var10) {
      super(var1, var3, var5, var7, var8, var9, var10, true, true);
   }

   private void y(class00667 var1) {
      var1.writeDouble(this.N);
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.writeFloat(this.u);
      var1.writeFloat(this.i);
      var1.writeByte(class00547.N(this.R, this.M));
   }

   private static class00564 N(class00667 var0) {
      double d0 = var0.readDouble();
      double d1 = var0.readDouble();
      double d2 = var0.readDouble();
      float f = var0.readFloat();
      float f1 = var0.readFloat();
      short short1 = var0.readUnsignedByte();
      boolean flag = class00547.N((int)short1);
      boolean flag1 = class00547.y((int)short1);
      return new class00564(d0, d1, d2, f, f1, flag, flag1);
   }

   @Override
   public class02897<class00564> method_65080() {
      return class04248.yp;
   }
}
