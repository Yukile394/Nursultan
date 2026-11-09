package minecraft;

public class class00505 extends class00475 {
   public static final class02362<class00667, class00505> z = class00381.N(class00505::y, class00505::N);

   public class00505(int var1, short var2, short var3, short var4, boolean var5) {
      super(var1, var2, var3, var4, (byte)0, (byte)0, var5, false, true);
   }

   private void y(class00667 var1) {
      var1.L(this.N);
      var1.writeShort(this.y);
      var1.writeShort(this.L);
      var1.writeShort(this.u);
      var1.writeBoolean(this.M);
   }

   private static class00505 N(class00667 var0) {
      int i = var0.E();
      short short1 = var0.readShort();
      short short2 = var0.readShort();
      short short3 = var0.readShort();
      boolean flag = var0.readBoolean();
      return new class00505(i, short1, short2, short3, flag);
   }

   @Override
   public class02897<class00505> method_65080() {
      return class04248.x;
   }
}
