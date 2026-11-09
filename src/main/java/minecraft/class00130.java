package minecraft;

import org.jspecify.annotations.Nullable;

public class class00130 implements class08762 {
   private static final int N = 40;
   private static final int y = 40;
   private static final int L = 100;
   private static final int u = 20;
   private static final int i = -1;
   private static final class00392 R = class00392.N(
      "tutorial.move.title", class08764.N("forward"), class08764.N("left"), class08764.N("back"), class08764.N("right")
   );
   private static final class00392 M = class00392.N("tutorial.move.description", class08764.N("jump"));
   private static final class00392 B = class00392.L("tutorial.look.title");
   private static final class00392 Z = class00392.L("tutorial.look.description");
   private final class08764 z;
   @Nullable
   private class06128 U;
   @Nullable
   private class06128 E;
   private int W;
   private int m;
   private int P;
   private boolean s;
   private boolean T;
   private int b = -1;
   private int j = -1;

   public class00130(class08764 var1) {
      super();
      this.z = var1;
   }

   @Override
   public void y() {
      if (this.U != null) {
         this.U.B();
         this.U = null;
      }

      if (this.E != null) {
         this.E.B();
         this.E = null;
      }
   }

   @Override
   public void N(class04474 var1) {
      if (var1.field_54155.N() || var1.field_54155.y() || var1.field_54155.L() || var1.field_54155.u() || var1.field_54155.i()) {
         this.s = true;
      }
   }

   @Override
   public void N(double var1, double var3) {
      if (Math.abs(var1) > 0.01 || Math.abs(var3) > 0.01) {
         this.T = true;
      }
   }

   @Override
   public void N() {
      this.W++;
      if (this.s) {
         this.m++;
         this.s = false;
      }

      if (this.T) {
         this.P++;
         this.T = false;
      }

      if (this.b == -1 && this.m > 40) {
         if (this.U != null) {
            this.U.B();
            this.U = null;
         }

         this.b = this.W;
      }

      if (this.j == -1 && this.P > 40) {
         if (this.E != null) {
            this.E.B();
            this.E = null;
         }

         this.j = this.W;
      }

      if (this.b != -1 && this.j != -1) {
         if (this.z.R()) {
            this.z.N(class08966.field_5648);
         } else {
            this.z.N(class08966.field_5653);
         }
      }

      if (this.U != null) {
         this.U.N(this.m / 40.0F);
      }

      if (this.E != null) {
         this.E.N(this.P / 40.0F);
      }

      if (this.W >= 100) {
         class06202 class06202 = this.z.i();
         if (this.b == -1 && this.U == null) {
            this.U = new class06128((class01590)class06202.i_3, class06090.field_2230, R, M, true);
            class06202.m().N(this.U);
         } else if (this.b != -1 && this.W - this.b >= 20 && this.j == -1 && this.E == null) {
            this.E = new class06128((class01590)class06202.i_3, class06090.field_2237, B, Z, true);
            class06202.m().N(this.E);
         }
      }
   }
}
