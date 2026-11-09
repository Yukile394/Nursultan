package minecraft;

public class class01332 {
   private static final int N = 140;
   private static final int y = 700;
   private final class03289 L;
   private final class02131<Integer> u;
   private boolean i;
   private int R;

   public float L() {
      return this.i ? 1.0F + 1.15F * class04995.m((float)this.R / this.u() * (float) Math.PI) : 1.0F;
   }

   public class01332(class03289 var1, class02131<Integer> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   private int u() {
      return this.L.N(this.u);
   }

   public void y() {
      if (this.i && this.R++ > this.u()) {
         this.i = false;
      }
   }

   public void N() {
      this.i = true;
      this.R = 0;
   }

   public boolean N(class06069 var1) {
      if (this.i) {
         return false;
      } else {
         this.i = true;
         this.R = 0;
         this.L.N(this.u, var1.y(841) + 140);
         return true;
      }
   }
}
