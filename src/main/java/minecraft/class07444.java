package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07444 extends class07473 {
   private final class07453 N;
   @Nullable
   private class07438 y;
   private final double L;
   private final class07623 u;
   private int i;
   private final float R;
   private final float M;
   private float B;

   @Override
   public void L() {
      this.i = 0;
      this.B = this.N.N(class04425.field_18);
      this.N.N(class04425.field_18, 0.0F);
   }

   public class07444(class07453 var1, double var2, float var4, float var5) {
      super();
      this.N = var1;
      this.L = var2;
      this.u = var1.f();
      this.M = var4;
      this.R = var5;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      if (!(var1.f() instanceof class07655) && !(var1.f() instanceof class07991)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public void i() {
      boolean flag = this.N.Nq();
      if (!flag) {
         this.N.p().N(this.y, 10.0F, this.N.Ni());
      }

      if (--this.i <= 0) {
         this.i = this.N(10);
         if (flag) {
            this.N.No();
         } else {
            this.u.N(this.y, this.L);
         }
      }
   }

   @Override
   public void u() {
      this.y = null;
      this.u.W();
      this.N.N(class04425.field_18, this.B);
   }

   @Override
   public boolean y() {
      if (this.u.U()) {
         return false;
      } else {
         return this.N.NK() ? false : !(this.N.method_5858(this.y) <= this.R * this.R);
      }
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.L_();
      if (class07438 == null) {
         return false;
      } else if (this.N.NK()) {
         return false;
      } else if (this.N.method_5858(class07438) < this.M * this.M) {
         return false;
      } else {
         this.y = class07438;
         return true;
      }
   }
}
