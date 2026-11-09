package minecraft;

public class class03646 extends class06148 {
   private final class07049 N;
   private int y;
   private final int L;
   private final class07126 u;

   private class03646(class03448 var1, class07049 var2, class07126 var3, int var4, class06889 var5) {
      super(var1, var2.method_23317(), var2.method_23323(0.5), var2.method_23321(), var5.M, var5.B, var5.Z);
      this.N = var2;
      this.L = var4;
      this.u = var3;
      this.method_3070();
   }

   public class03646(class03448 var1, class07049 var2, class07126 var3, int var4) {
      this(var1, var2, var3, var4, var2.method_18798());
   }

   public class03646(class03448 var1, class07049 var2, class07126 var3) {
      this(var1, var2, var3, 3);
   }

   @Override
   public void method_3070() {
      for (int i = 0; i < 16; i++) {
         double d0 = this.field_3840.z() * 2.0F - 1.0F;
         double d1 = this.field_3840.z() * 2.0F - 1.0F;
         double d2 = this.field_3840.z() * 2.0F - 1.0F;
         if (!(d0 * d0 + d1 * d1 + d2 * d2 > 1.0)) {
            double d3 = this.N.method_23316(d0 / 4.0);
            double d4 = this.N.method_23323(0.5 + d1 / 4.0);
            double d5 = this.N.method_23324(d2 / 4.0);
            this.field_3851.method_8406(this.u, d3, d4, d5, d0, d1 + 0.2, d2);
         }
      }

      this.y++;
      if (this.y >= this.L) {
         this.method_3085();
      }
   }
}
