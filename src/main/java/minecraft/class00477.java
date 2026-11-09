package minecraft;

public class class00477 extends class00475 {
   public static final class02362<class00667, class00477> z = class00381.N(class00477::y, class00477::N);

   public class00477(int var1, short var2, short var3, short var4, byte var5, byte var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7, true, true);
   }

   private void y(class00667 var1) {
      var1.L(this.N);
      var1.writeShort(this.y);
      var1.writeShort(this.L);
      var1.writeShort(this.u);
      var1.writeByte(this.i);
      var1.writeByte(this.R);
      var1.writeBoolean(this.M);
   }

   private static class00477 N(class00667 var0) {
      int i = var0.E();
      short short1 = var0.readShort();
      short short2 = var0.readShort();
      short short3 = var0.readShort();
      byte b0 = var0.readByte();
      byte b1 = var0.readByte();
      boolean flag = var0.readBoolean();
      return new class00477(i, short1, short2, short3, b0, b1, flag);
   }

   @Override
   public class02897<class00477> method_65080() {
      return class04248.D;
   }
}
