package minecraft;

import java.util.function.Predicate;

public class class07466 extends class07449 {
   private static final int M = 240;
   private final Predicate<class07086> B;
   protected int N;
   protected int y = -1;
   protected int L = -1;

   @Override
   public void L() {
      super.L();
      this.N = 0;
   }

   public class07466(class07079 var1, Predicate<class07086> var2) {
      super(var1);
      this.B = var2;
   }

   public class07466(class07079 var1, int var2, Predicate<class07086> var3) {
      this(var1, var3);
      this.L = var2;
   }

   @Override
   public void i() {
      super.i();
      if (this.u.method_59922().y(20) == 0) {
         this.u.method_73183().N(1019, this.i, 0);
         if (!this.u.fields_0212a028292fd3c078969e3ee4c71d9e8_4) {
            this.u.method_6104(this.u.method_6058());
         }
      }

      this.N++;
      int i = (int)((float)this.N / this.R() * 10.0F);
      if (i != this.y) {
         this.u.method_73183().method_8517(this.u.method_5628(), this.i, i);
         this.y = i;
      }

      if (this.N == this.R() && this.N(this.u.method_73183().y())) {
         this.u.method_73183().method_8650(this.i, false);
         this.u.method_73183().N(1021, this.i, 0);
         this.u.method_73183().N(2001, this.i, class00891.W(this.u.method_73183().method_8320(this.i)));
      }
   }

   @Override
   public void u() {
      super.u();
      this.u.method_73183().method_8517(this.u.method_5628(), this.i, -1);
   }

   @Override
   public boolean y() {
      return this.N <= this.R() && !this.M() && this.i.method_19769(this.u.method_73189(), 2.0) && this.N(this.u.method_73183().y());
   }

   private boolean N(class07086 var1) {
      return this.B.test(var1);
   }

   @Override
   public boolean N() {
      if (!super.N()) {
         return false;
      } else {
         return !N(this.u).method_64395().N(class07305.I) ? false : this.N(this.u.method_73183().y()) && !this.M();
      }
   }

   protected int R() {
      return Math.max(240, this.L);
   }
}
