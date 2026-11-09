package minecraft;

import java.util.function.Consumer;

public class class03943 extends class08813 {
   private static final int N = 1;
   private static final int y = -3092272;
   private static final String L = "_";
   private static final int u = class02566.R(204, -2039584);
   private static final int i = 300;
   private final class01590 R;
   private final class00392 M;
   private final class03915 B;
   private final int Z;
   private final boolean z;
   private final int U;
   private long E = class07536.L();

   public static class03938 L() {
      return new class03938();
   }

   class03943(
      class01590 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      class00392 var6,
      class00392 var7,
      int var8,
      boolean var9,
      int var10,
      boolean var11,
      boolean var12
   ) {
      super(var2, var3, var4, var5, var7, var11, var12);
      this.R = var1;
      this.z = var9;
      this.Z = var8;
      this.U = var10;
      this.M = var6;
      this.B = new class03915(var1, var4 - this.method_65512());
      this.B.N(this::u);
   }

   private void u() {
      double d0 = this.method_44387();
      class03917 class03917x = this.B.u((int)(d0 / 9.0));
      if (this.B.i() <= class03917x.N()) {
         d0 = this.B.B() * 9;
      } else {
         class03917 class03917x = this.B.u((int)((d0 + this.field_22759) / 9.0) - 1);
         if (this.B.i() > class03917x.y()) {
            d0 = this.B.B() * 9 - this.field_22759 + 9 + this.method_65512();
         }
      }

      this.method_44382(d0);
   }

   public String y() {
      return this.B.u();
   }

   public void y(int var1) {
      this.B.y(var1);
   }

   public void N(int var1) {
      this.B.N(var1);
   }

   private void N(double var1, double var3) {
      double d0 = var1 - this.method_46426() - this.method_65509();
      double d1 = var3 - this.method_46427() - this.method_65509() + this.method_44387();
      this.B.N(d0, d1);
   }

   public void N(Consumer<String> var1) {
      this.B.N(var1);
   }

   public void N(String var1) {
      this.N(var1, false);
   }

   public void N(String var1, boolean var2) {
      this.B.N(var1, var2);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return this.B.N(var1);
   }

   @Override
   public boolean method_25400(class06626 var1) {
      if (this.field_22764 && this.method_25370() && var1.y()) {
         this.B.y(var1.N());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_25365(boolean var1) {
      super.method_25365(var1);
      if (var1) {
         this.E = class07536.L();
      }
   }

   @Override
   protected void method_44389(class01054 var1, int var2, int var3, float var4) {
      String s = this.B.u();
      if (s.isEmpty() && !this.method_25370()) {
         var1.N(this.R, (class05936)this.M, this.method_65513(), this.method_65514(), this.field_22758 - this.method_65512(), u);
      } else {
         int ix = this.B.i();
         boolean flag = this.method_25370() && (class07536.L() - this.E) / 300L % 2L == 0L;
         boolean flag1 = ix < s.length();
         int j = 0;
         int k = 0;
         int l = this.method_65514();
         boolean flag2 = false;

         for (class03917 class03917xx : this.B.z()) {
            boolean var15 = this.method_65510(l, l + 9);
            int i1 = this.method_65513();
            if (flag && flag1 && ix >= class03917xx.N() && ix <= class03917xx.y()) {
               if (var15) {
                  String s2 = s.substring(class03917xx.N(), ix);
                  var1.N(this.R, s2, i1, l, this.Z, this.z);
                  j = i1 + this.R.y(s2);
                  if (!flag2) {
                     var1.N(j, l - 1, j + 1, l + 1 + 9, this.U);
                     flag2 = true;
                  }

                  var1.N(this.R, s.substring(ix, class03917xx.y()), j, l, this.Z, this.z);
               }
            } else {
               if (var15) {
                  String s1 = s.substring(class03917xx.N(), class03917xx.y());
                  var1.N(this.R, s1, i1, l, this.Z, this.z);
                  j = i1 + this.R.y(s1) - 1;
               }

               k = l;
            }

            l += 9;
         }

         if (flag && !flag1 && this.method_65510(k, k + 9)) {
            var1.N(this.R, "_", j + 1, k, this.U, this.z);
         }

         if (this.B.U()) {
            class03917 class03917x = this.B.R();
            int k1 = this.method_65513();
            l = this.method_65514();

            for (class03917 class03917x : this.B.z()) {
               if (class03917x.N() > class03917x.y()) {
                  l += 9;
               } else {
                  if (class03917x.N() > class03917x.y()) {
                     break;
                  }

                  if (this.method_65510(l, l + 9)) {
                     int l1 = this.R.y(s.substring(class03917x.N(), Math.max(class03917x.N(), class03917x.N())));
                     int j1;
                     if (class03917x.y() > class03917x.y()) {
                        j1 = this.field_22758 - this.method_65509();
                     } else {
                        j1 = this.R.y(s.substring(class03917x.N(), class03917x.y()));
                     }

                     var1.N(k1 + l1, l, k1 + j1, l + 9, true);
                  }

                  l += 9;
               }
            }
         }

         if (this.method_49606()) {
            var1.N(class06608.y);
         }
      }
   }

   @Override
   public int method_44391() {
      return 9 * this.B.M();
   }

   @Override
   protected void method_44384(class01054 var1) {
      super.method_44384(var1);
      if (this.B.y()) {
         int ix = this.B.N();
         class05216 class05216 = class00392.N("gui.multiLineEditBox.character_limit", this.B.u().length(), ix);
         var1.y(this.R, class05216, this.method_46426() + this.field_22758 - this.R.N(class05216), this.method_46427() + this.field_22759 + 4, -6250336);
      }
   }

   @Override
   public void method_25348(class06613 var1, boolean var2) {
      if (var2) {
         this.B.Z();
      } else {
         this.B.N(var1.W());
         this.N(var1.n(), var1.t());
      }
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, class00392.N("gui.narrate.editBox", this.method_25369(), this.y()));
   }

   @Override
   protected void method_25349(class06613 var1, double var2, double var4) {
      this.B.N(true);
      this.N(var1.n(), var1.t());
      this.B.N(var1.W());
   }

   @Override
   protected double method_44393() {
      return 9.0 / 2.0;
   }
}
