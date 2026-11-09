package minecraft;

public class class00525 extends class00547 {
   public static final class02362<class00667, class00525> z = class00381.N(class00525::y, class00525::N);

   public class00525(boolean var1, boolean var2) {
      super(0.0, 0.0, 0.0, 0.0F, 0.0F, var1, var2, false, false);
   }

   private void y(class00667 var1) {
      var1.writeByte(class00547.N(this.R, this.M));
   }

   private static class00525 N(class00667 var0) {
      short short1 = var0.readUnsignedByte();
      boolean flag = class00547.N((int)short1);
      boolean flag1 = class00547.y((int)short1);
      return new class00525(flag, flag1);
   }

   @Override
   public class02897<class00525> method_65080() {
      return class04248.yA;
   }
}
