package minecraft;

import java.util.UUID;

class class07240 implements class07238 {
   private final boolean N;
   private final boolean y;
   private final boolean L;

   class07240(boolean var1, boolean var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class07240(class04247 var1) {
      super();
      short short1 = var1.readUnsignedByte();
      this.N = (short1 & 1) > 0;
      this.y = (short1 & 2) > 0;
      this.L = (short1 & 4) > 0;
   }

   @Override
   public void N(UUID var1, class07262 var2) {
      var2.N(var1, this.N, this.y, this.L);
   }

   @Override
   public void N(class04247 var1) {
      var1.writeByte(class07254.N(this.N, this.y, this.L));
   }

   @Override
   public class07239 N() {
      return class07239.field_29112;
   }
}
