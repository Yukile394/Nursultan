package minecraft;

public class class00530 extends class00547 {
   public static final class02362<class00667, class00530> z = class00381.N(class00530::y, class00530::N);

   public class00530(float var1, float var2, boolean var3, boolean var4) {
      super(0.0, 0.0, 0.0, var1, var2, var3, var4, false, true);
   }

   private void y(class00667 var1) {
      var1.writeFloat(this.u);
      var1.writeFloat(this.i);
      var1.writeByte(class00547.N(this.R, this.M));
   }

   private static class00530 N(class00667 var0) {
      float f = var0.readFloat();
      float f1 = var0.readFloat();
      short short1 = var0.readUnsignedByte();
      boolean flag = class00547.N((int)short1);
      boolean flag1 = class00547.y((int)short1);
      return new class00530(f, f1, flag, flag1);
   }

   @Override
   public class02897<class00530> method_65080() {
      return class04248.yF;
   }
}
