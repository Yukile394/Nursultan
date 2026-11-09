package minecraft;

public class class03869 extends class04406 {
   protected static final int N = 3;
   private final class07049 z;
   protected int y;
   protected final class08800 L;
   protected double u;
   protected double i;
   protected double R;
   protected double M;
   protected double B;
   protected double Z;

   public class03869(class03448 var1, class08800 var2, class07049 var3, class06889 var4) {
      super(var1, var2.E, var2.W, var2.m, var4.M, var4.B, var4.Z);
      this.z = var3;
      this.L = var2;
      this.L.l = 0;
      this.N();
      this.y();
   }

   private void y() {
      this.M = this.u;
      this.B = this.i;
      this.Z = this.R;
   }

   private void N() {
      this.u = this.z.method_23317();
      this.i = (this.z.method_23318() + this.z.method_23320()) / 2.0;
      this.R = this.z.method_23321();
   }

   @Override
   public void method_3070() {
      this.y++;
      if (this.y == 3) {
         this.method_3085();
      }

      this.y();
      this.N();
   }

   @Override
   public class06166 method_74274() {
      return class06166.y;
   }
}
