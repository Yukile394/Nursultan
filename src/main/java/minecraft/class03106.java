package minecraft;

public class class03106 {
   public static final float N = 1.0F;
   protected float y = 20.0F;
   protected long L = class01517.N / 20L;
   protected int u = 0;
   protected boolean i = true;
   protected boolean R = false;

   public void L(int var1) {
      this.u = var1;
   }

   public float M() {
      return (float)this.L / (float)class01517.y;
   }

   public class03106() {
      super();
   }

   public long B() {
      return this.L;
   }

   public boolean Z() {
      return this.i;
   }

   public int U() {
      return this.u;
   }

   public boolean z() {
      return this.u > 0;
   }

   public boolean E() {
      return this.R;
   }

   public boolean N(class07049 var1) {
      return !this.Z() && !(var1 instanceof class08036) && var1.method_54757() <= 0;
   }

   public void N(boolean var1) {
      this.R = var1;
   }

   public void N(float var1) {
      this.y = Math.max(var1, 1.0F);
      this.L = (long)((double)class01517.N / this.y);
   }

   public void W() {
      this.i = !this.R || this.u > 0;
      if (this.u > 0) {
         this.u--;
      }
   }

   public float R() {
      return this.y;
   }
}
