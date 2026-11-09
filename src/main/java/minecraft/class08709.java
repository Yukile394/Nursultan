package minecraft;

class class08709 implements class02362<class00667, class08687> {
   class08709() {
      super();
   }

   public void encode(class00667 var1, class08687 var2) {
      byte b0 = 0;
      b0 = (byte)(b0 | (var2.N() ? 1 : 0));
      b0 = (byte)(b0 | (var2.y() ? 2 : 0));
      b0 = (byte)(b0 | (var2.L() ? 4 : 0));
      b0 = (byte)(b0 | (var2.u() ? 8 : 0));
      b0 = (byte)(b0 | (var2.i() ? 16 : 0));
      b0 = (byte)(b0 | (var2.R() ? 32 : 0));
      b0 = (byte)(b0 | (var2.M() ? 64 : 0));
      var1.writeByte(b0);
   }

   public class08687 decode(class00667 var1) {
      byte b0 = var1.readByte();
      boolean flag = (b0 & 1) != 0;
      boolean flag1 = (b0 & 2) != 0;
      boolean flag2 = (b0 & 4) != 0;
      boolean flag3 = (b0 & 8) != 0;
      boolean flag4 = (b0 & 16) != 0;
      boolean flag5 = (b0 & 32) != 0;
      boolean flag6 = (b0 & 64) != 0;
      return new class08687(flag, flag1, flag2, flag3, flag4, flag5, flag6);
   }
}
