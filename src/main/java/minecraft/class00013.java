package minecraft;

public class class00013 extends class00155 {
   private final class07049 m;

   @Override
   public void P() {
      if (this.m.method_31481()) {
         this.y();
      } else {
         this.R = (float)this.m.method_23317();
         this.M = (float)this.m.method_23318();
         this.B = (float)this.m.method_23321();
      }
   }

   public class00013(class04891 var1, class04911 var2, float var3, float var4, class07049 var5, long var6) {
      super(var1, var2, class06069.y(var6));
      this.u = var3;
      this.i = var4;
      this.m = var5;
      this.R = (float)this.m.method_23317();
      this.M = (float)this.m.method_23318();
      this.B = (float)this.m.method_23321();
   }

   @Override
   public boolean s() {
      return !this.m.method_5701();
   }
}
