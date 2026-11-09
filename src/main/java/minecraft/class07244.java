package minecraft;

import java.util.UUID;

class class07244 implements class07238 {
   private final class00392 N;
   private final float y;
   private final class06685 L;
   private final class06702 u;
   private final boolean i;
   private final boolean R;
   private final boolean M;

   class07244(class06687 var1) {
      super();
      this.N = var1.y();
      this.y = var1.L();
      this.L = var1.u();
      this.u = var1.i();
      this.i = var1.R();
      this.R = var1.M();
      this.M = var1.B();
   }

   public class07244(class04247 var1) {
      super();
      this.N = class03748.u.decode(var1);
      this.y = var1.readFloat();
      this.L = var1.y(class06685.class);
      this.u = var1.y(class06702.class);
      short short1 = var1.readUnsignedByte();
      this.i = (short1 & 1) > 0;
      this.R = (short1 & 2) > 0;
      this.M = (short1 & 4) > 0;
   }

   @Override
   public void N(UUID var1, class07262 var2) {
      var2.N(var1, this.N, this.y, this.L, this.u, this.i, this.R, this.M);
   }

   @Override
   public void N(class04247 var1) {
      class03748.u.encode(var1, this.N);
      var1.writeFloat(this.y);
      var1.N(this.L);
      var1.N(this.u);
      var1.writeByte(class07254.N(this.i, this.R, this.M));
   }

   @Override
   public class07239 N() {
      return class07239.field_29107;
   }
}
