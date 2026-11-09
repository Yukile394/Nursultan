package minecraft;

import java.util.UUID;

public class class01206 extends class06687 {
   private static final long z = 100L;
   protected float B;
   protected long Z;

   @Override
   public float L() {
      return class04995.B(class04995.N((float)(class07536.L() - this.Z) / 100.0F, 0.0F, 1.0F), this.y, this.B);
   }

   public class01206(UUID var1, class00392 var2, float var3, class06685 var4, class06702 var5, boolean var6, boolean var7, boolean var8) {
      super(var1, var2, var4, var5);
      this.B = var3;
      this.y = var3;
      this.Z = class07536.L();
      this.N(var6);
      this.y(var7);
      this.L(var8);
   }

   @Override
   public void N(float var1) {
      this.y = this.L();
      this.B = var1;
      this.Z = class07536.L();
   }
}
