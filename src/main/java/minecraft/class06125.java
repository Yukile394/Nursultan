package minecraft;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class class06125 {
   private final Supplier<String> N;
   private final Consumer<String> y;
   private final Supplier<String> L;
   private final Consumer<String> u;
   private final Predicate<String> i;
   private int R;
   private int M;

   private String L(String var1) {
      if (this.M == this.R) {
         return var1;
      } else {
         int ix = Math.min(this.R, this.M);
         int j = Math.max(this.R, this.M);
         String s = var1.substring(0, ix) + var1.substring(j);
         this.M = this.R = ix;
         return s;
      }
   }

   public void L(int var1, boolean var2) {
      this.R = this.M(var1);
      this.L(var2);
   }

   public static Consumer<String> L(class06202 var0) {
      return var1 -> N(var0, var1);
   }

   public void L(int var1) {
      int ix = class05228.N(this.N.get(), var1, this.R, true);
      this.u(ix - this.R);
   }

   public void L() {
      this.u.accept(this.y(this.N.get()));
   }

   private void L(boolean var1) {
      if (!var1) {
         this.M = this.R;
      }
   }

   private int M(int var1) {
      return class04995.N(var1, 0, this.N.get().length());
   }

   public int M() {
      return this.R;
   }

   public class06125(Supplier<String> var1, Consumer<String> var2, Supplier<String> var3, Consumer<String> var4, Predicate<String> var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R();
   }

   public int B() {
      return this.M;
   }

   public boolean Z() {
      return this.R != this.M;
   }

   public void i(int var1) {
      this.L(var1, true);
   }

   public void i() {
      this.N(false);
   }

   public void u(int var1) {
      String s = this.N.get();
      if (!s.isEmpty()) {
         String s1;
         if (this.M != this.R) {
            s1 = this.L(s);
         } else {
            int ix = class07536.N(s, this.R, var1);
            int j = Math.min(ix, this.R);
            int k = Math.max(ix, this.R);
            s1 = new StringBuilder(s).delete(j, k).toString();
            if (var1 < 0) {
               this.M = this.R = j;
            }
         }

         this.y.accept(s1);
      }
   }

   public void u() {
      this.M = 0;
      this.R = this.N.get().length();
   }

   public void y() {
      this.N(this.N.get(), this.L.get());
      this.M = this.R;
   }

   public static String y(class06202 var0) {
      return class06541.N(((class06197)var0.L_3).N().replaceAll("\\r", ""));
   }

   private String y(String var1) {
      int ix = Math.min(this.R, this.M);
      int j = Math.max(this.R, this.M);
      return var1.substring(ix, j);
   }

   public void y(boolean var1) {
      this.R = this.N.get().length();
      this.L(var1);
   }

   public void y(int var1, boolean var2) {
      this.R = class05228.N(this.N.get(), var1, this.R, true);
      this.L(var2);
   }

   public void y(int var1) {
      this.y(var1, false);
   }

   public boolean N(class06626 var1) {
      if (var1.y()) {
         this.N(this.N.get(), var1.N());
      }

      return true;
   }

   public boolean N(class06601 var1) {
      if (var1.s()) {
         this.u();
         return true;
      } else if (var1.T()) {
         this.L();
         return true;
      } else if (var1.b()) {
         this.y();
         return true;
      } else if (var1.j()) {
         this.N();
         return true;
      } else {
         class06094 class06094 = var1.P() ? class06094.field_38309 : class06094.field_38308;
         if (var1.v() == 259) {
            this.N(-1, class06094);
            return true;
         } else {
            if (var1.v() == 261) {
               this.N(1, class06094);
            } else {
               if (var1.R()) {
                  this.N(-1, var1.W(), class06094);
                  return true;
               }

               if (var1.M()) {
                  this.N(1, var1.W(), class06094);
                  return true;
               }

               if (var1.v() == 268) {
                  this.N(var1.W());
                  return true;
               }

               if (var1.v() == 269) {
                  this.y(var1.W());
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static Supplier<String> N(class06202 var0) {
      return () -> y(var0);
   }

   public static void N(class06202 var0, String var1) {
      ((class06197)var0.L_3).N(var1);
   }

   public void N(int var1, int var2) {
      int ix = this.N.get().length();
      this.R = class04995.N(var1, 0, ix);
      this.M = class04995.N(var2, 0, ix);
   }

   public void N(int var1, boolean var2, class06094 var3) {
      switch (var3) {
         case field_38308:
            this.N(var1, var2);
            break;
         case field_38309:
            this.y(var1, var2);
      }
   }

   public void N(int var1) {
      this.N(var1, false);
   }

   public void N(int var1, boolean var2) {
      this.R = class07536.N(this.N.get(), this.R, var1);
      this.L(var2);
   }

   public void N(int var1, class06094 var2) {
      switch (var2) {
         case field_38308:
            this.u(var1);
            break;
         case field_38309:
            this.L(var1);
      }
   }

   public void N() {
      String s = this.N.get();
      this.u.accept(this.y(s));
      this.y.accept(this.L(s));
   }

   public void N(boolean var1) {
      this.R = 0;
      this.L(var1);
   }

   private void N(String var1, String var2) {
      if (this.M != this.R) {
         var1 = this.L(var1);
      }

      this.R = class04995.N(this.R, 0, var1.length());
      String s = new StringBuilder(var1).insert(this.R, var2).toString();
      if (this.i.test(s)) {
         this.y.accept(s);
         this.M = this.R = Math.min(s.length(), this.R + var2.length());
      }
   }

   public void N(String var1) {
      this.N(this.N.get(), var1);
   }

   public void R() {
      this.y(false);
   }

   public void R(int var1) {
      this.M = this.M(var1);
   }
}
