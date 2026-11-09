package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class07145 extends class07473 {
   protected int y;
   protected int L;

   @Override
   public void L() {
      this.y = this.N(this.m());
      this.u.y = this.M();
      this.L = this.u.field_6012 + this.Z();
      class04891 class04891 = this.E();
      if (class04891 != null) {
         this.u.method_5783(class04891, 1.0F, 1.0F);
      }

      this.u.N(this.W());
   }

   protected abstract int M();

   protected class07145(class07148 var1) {
      super();
      this.u = var1;
   }

   protected abstract int Z();

   @Override
   public void i() {
      this.y--;
      if (this.y == 0) {
         this.U();
         this.u.method_5783(this.u.m(), 1.0F, 1.0F);
      }
   }

   protected int m() {
      return 20;
   }

   protected abstract void U();

   @Override
   public boolean y() {
      class07438 class07438 = this.u.T();
      return class07438 != null && class07438.method_5805() && this.y > 0;
   }

   @Nullable
   protected abstract class04891 E();

   @Override
   public boolean N() {
      class07438 class07438 = this.u.T();
      if (class07438 == null || !class07438.method_5805()) {
         return false;
      } else {
         return this.u.n() ? false : this.u.field_6012 >= this.L;
      }
   }

   protected abstract class07156 W();
}
