package minecraft;

public abstract class class00547 implements class00381<class08051> {
   private static final int z = 1;
   private static final int U = 2;
   protected final double N;
   protected final double y;
   protected final double L;
   protected final float u;
   protected final float i;
   protected final boolean R;
   protected final boolean M;
   protected final boolean B;
   protected final boolean Z;

   public double L(double var1) {
      return this.B ? this.L : var1;
   }

   public boolean L() {
      return this.B;
   }

   protected class00547(double var1, double var3, double var5, float var7, float var8, boolean var9, boolean var10, boolean var11, boolean var12) {
      super();
      this.N = var1;
      this.y = var3;
      this.L = var5;
      this.u = var7;
      this.i = var8;
      this.R = var9;
      this.M = var10;
      this.B = var11;
      this.Z = var12;
   }

   public boolean u() {
      return this.Z;
   }

   public float y(float var1) {
      return this.Z ? this.i : var1;
   }

   public double y(double var1) {
      return this.B ? this.y : var1;
   }

   static boolean y(int var0) {
      return (var0 & 2) != 0;
   }

   public boolean y() {
      return this.M;
   }

   public float N(float var1) {
      return this.Z ? this.u : var1;
   }

   public boolean N() {
      return this.R;
   }

   static boolean N(int var0) {
      return (var0 & 1) != 0;
   }

   public void method_65081(class08051 var1) {
      var1.method_12063(this);
   }

   public double N(double var1) {
      return this.B ? this.N : var1;
   }

   static int N(boolean var0, boolean var1) {
      byte b0 = 0;
      if (var0) {
         b0 |= 1;
      }

      if (var1) {
         b0 |= 2;
      }

      return b0;
   }

   @Override
   public abstract class02897<? extends class00547> method_65080();
}
