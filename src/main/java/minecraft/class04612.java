package minecraft;

import java.util.EnumSet;

public class class04612 extends class04596 {
   private static final int u = 2400;
   int y;

   @Override
   public void L() {
      this.y = 0;
      super.L();
   }

   @Override
   public boolean M() {
      return this.L.f != null && !this.L.Nj() && this.U() && !this.L.y(this.L.f, 2);
   }

   class04612(class04626 var1) {
      super(var1);
      this.L = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean Z() {
      return this.M();
   }

   @Override
   public void i() {
      if (this.L.f != null) {
         this.y++;
         if (this.y > this.N(2400)) {
            this.L.l();
         } else if (!class04626.b(this.L).E()) {
            if (this.L.i(this.L.f)) {
               this.L.l();
            } else {
               this.L.N(this.L.f);
            }
         }
      }
   }

   private boolean U() {
      return this.L.p > 600;
   }

   @Override
   public void u() {
      this.y = 0;
      class04626.s(this.L).W();
      class04626.T(this.L).R();
   }
}
