package minecraft;

public class class08033 {
   private static final boolean R = false;
   private static final boolean M = false;
   private static final boolean B = false;
   private static final boolean Z = false;
   private static final boolean z = true;
   private static final float U = 0.05F;
   private static final float E = 0.1F;
   public boolean N;
   public boolean y;
   public boolean L;
   public boolean u;
   public boolean i = true;
   private float W = 0.05F;
   private float m = 0.1F;

   public class08043 L() {
      return new class08043(this.N, this.y, this.L, this.u, this.i, this.W, this.m);
   }

   public class08033() {
      super();
   }

   public float y() {
      return this.m;
   }

   public void y(float var1) {
      this.m = var1;
   }

   public void N(float var1) {
      this.W = var1;
   }

   public float N() {
      return this.W;
   }

   public void N(class08043 var1) {
      this.N = var1.N();
      this.y = var1.y();
      this.L = var1.L();
      this.u = var1.u();
      this.i = var1.i();
      this.W = var1.R();
      this.m = var1.M();
   }
}
