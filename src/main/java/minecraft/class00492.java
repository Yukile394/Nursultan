package minecraft;

public class class00492 extends class00475 {
   public static final class02362<class00667, class00492> z = class00381.N(class00492::y, class00492::N);

   public class00492(int var1, byte var2, byte var3, boolean var4) {
      super(var1, (short)0, (short)0, (short)0, var2, var3, var4, true, false);
   }

   private void y(class00667 var1) {
      var1.L(this.N);
      var1.writeByte(this.i);
      var1.writeByte(this.R);
      var1.writeBoolean(this.M);
   }

   private static class00492 N(class00667 var0) {
      int i = var0.E();
      byte b0 = var0.readByte();
      byte b1 = var0.readByte();
      boolean flag = var0.readBoolean();
      return new class00492(i, b0, b1, flag);
   }

   @Override
   public class02897<class00492> method_65080() {
      return class04248.r;
   }
}
