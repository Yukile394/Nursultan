package minecraft;

public class class02292 extends class02272 {
   private final class06954 L;
   private final class02303 u;

   public class02292(int var1, class06954 var2, class02303 var3) {
      this(var1, var2, var3, new long[var1]);
   }

   public class02292(int var1, class06954 var2, class02303 var3, long[] var4) {
      super(var1, var4);
      this.L = var2;
      this.u = var3;
   }

   @Override
   protected void N() {
      if (this.L.N(this.u.N())) {
         this.L.N(this.u.N(), new class02861((long[])this.y.clone(), this.u));
      }
   }
}
