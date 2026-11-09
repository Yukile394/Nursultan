package minecraft;

public abstract class class02056 {
   public final class02102 N;
   public final class02078 y;

   protected class02056(class02102 var1, class02072 var2) {
      super();
      this.N = var1;
      this.y = var2.B();
   }

   public void y(int var1, int var2) {
      float f = this.y.y;
      float f1 = var2 - this.N.method_25364() - this.y.u;
      int i = Math.round(class04995.B(this.y.R, f, f1));
      this.N.method_46419(i + var1);
   }

   public int y() {
      return this.N.method_25368() + this.y.N + this.y.L;
   }

   public void N(int var1, int var2) {
      float f = this.y.N;
      float f1 = var2 - this.N.method_25368() - this.y.L;
      int i = (int)class04995.B(this.y.i, f, f1);
      this.N.method_46421(i + var1);
   }

   public int N() {
      return this.N.method_25364() + this.y.y + this.y.u;
   }
}
