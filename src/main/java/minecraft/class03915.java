package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class class03915 {
   private static final Logger y = LogUtils.getLogger();
   public static final int N = Integer.MAX_VALUE;
   private static final int L = 2;
   private final class01590 u;
   private final List<class03917> i = Lists.newArrayList();
   private String R;
   private int M;
   private int B;
   private boolean Z;
   private int z = Integer.MAX_VALUE;
   private int U = Integer.MAX_VALUE;
   private final int E;
   private Consumer<String> W = var0 -> {};
   private Runnable m = () -> {};

   public boolean L() {
      return this.U != Integer.MAX_VALUE;
   }

   private String L(String var1) {
      return this.y() ? class05018.N(var1, this.z, false) : var1;
   }

   public void L(int var1) {
      if (!this.U()) {
         this.B = class04995.N(this.M + var1, 0, this.R.length());
      }

      this.y("");
   }

   private int M(int var1) {
      int ix = var1;

      while (ix < this.R.length() && !Character.isWhitespace(this.R.charAt(ix))) {
         ix++;
      }

      return ix;
   }

   public int M() {
      return this.i.size();
   }

   private class03917 P() {
      return this.R(0);
   }

   private void T() {
      this.i.clear();
      if (this.R.isEmpty()) {
         this.i.add(class03917.L);
      } else {
         this.u.y().N(this.R, this.E, class00405.N, false, (var1, var2, var3) -> this.i.add(new class03917(var2, var3)));
         if (this.R.charAt(this.R.length() - 1) == '\n') {
            this.i.add(new class03917(this.R.length(), this.R.length()));
         }
      }
   }

   public class03915(class01590 var1, int var2) {
      super();
      this.u = var1;
      this.E = var2;
      this.N("");
   }

   public int B() {
      for (int ix = 0; ix < this.i.size(); ix++) {
         class03917 class03917 = this.i.get(ix);
         if (this.M >= class03917.N() && this.M <= class03917.y()) {
            return ix;
         }
      }

      return -1;
   }

   public void Z() {
      class03917 class03917 = this.W();
      this.N(class03964.field_39535, class03917.N());
      this.N(true);
      this.N(class03964.field_39535, class03917.y());
   }

   public void i(int var1) {
      if (var1 != 0) {
         int ix = this.u.y(this.R.substring(this.P().N(), this.M)) + 2;
         class03917 class03917 = this.R(var1);
         int j = this.u.N(this.R.substring(class03917.N(), class03917.y()), ix).length();
         this.N(class03964.field_39535, class03917.N() + j);
      }
   }

   public int i() {
      return this.M;
   }

   private boolean i(String var1) {
      return this.L() && this.u.y().i(var1, this.E, class00405.N).size() + (class05018.u(var1) ? 1 : 0) > this.U;
   }

   private void s() {
      this.T();
      this.W.accept(this.R);
      this.m.run();
   }

   public class03917 m() {
      if (this.R.isEmpty()) {
         return class03917.L;
      } else {
         int ix = class04995.N(this.M, 0, this.R.length() - 1);

         while (ix < this.R.length() && !Character.isWhitespace(this.R.charAt(ix))) {
            ix++;
         }

         while (ix < this.R.length() && Character.isWhitespace(this.R.charAt(ix))) {
            ix++;
         }

         return new class03917(ix, this.M(ix));
      }
   }

   public boolean U() {
      return this.B != this.M;
   }

   public Iterable<class03917> z() {
      return this.i;
   }

   public class03917 u(int var1) {
      return this.i.get(class04995.N(var1, 0, this.i.size() - 1));
   }

   private String u(String var1) {
      String s = var1;
      if (this.y()) {
         int ix = this.z - this.R.length();
         s = class05018.N(var1, ix, false);
      }

      return s;
   }

   public String u() {
      return this.R;
   }

   public boolean y() {
      return this.z != Integer.MAX_VALUE;
   }

   public void y(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Character limit cannot be negative");
      } else {
         this.U = var1;
      }
   }

   public void y(String var1) {
      if (!var1.isEmpty() || this.U()) {
         String s = this.u(class05018.N(var1, true));
         class03917 class03917 = this.R();
         String s1 = new StringBuilder(this.R).replace(class03917.N(), class03917.y(), s).toString();
         if (!this.i(s1)) {
            this.R = s1;
            this.M = class03917.N() + s.length();
            this.B = this.M;
            this.s();
         }
      }
   }

   public String E() {
      class03917 class03917 = this.R();
      return this.R.substring(class03917.N(), class03917.y());
   }

   public void N(boolean var1) {
      this.Z = var1;
   }

   public void N(String var1) {
      this.N(var1, false);
   }

   public int N() {
      return this.z;
   }

   public void N(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Character limit cannot be negative");
      } else {
         this.z = var1;
      }
   }

   public void N(Runnable var1) {
      this.m = var1;
   }

   public void N(double var1, double var3) {
      int ix = class04995.N(var1);
      int j = class04995.N(var3 / 9.0);
      class03917 class03917 = this.i.get(class04995.N(j, 0, this.i.size() - 1));
      int k = this.u.N(this.R.substring(class03917.N(), class03917.y()), ix).length();
      this.N(class03964.field_39535, class03917.N() + k);
   }

   public void N(Consumer<String> var1) {
      this.W = var1;
   }

   public void N(class03964 var1, int var2) {
      switch (var1) {
         case field_39535:
            this.M = var2;
            break;
         case field_39536:
            this.M += var2;
            break;
         case field_39537:
            this.M = this.R.length() + var2;
      }

      this.M = class04995.N(this.M, 0, this.R.length());
      this.m.run();
      if (!this.Z) {
         this.B = this.M;
      }
   }

   public void N(String var1, boolean var2) {
      String s = this.L(var1);
      if (var2 || !this.i(s)) {
         this.R = s;
         this.M = this.R.length();
         this.B = this.M;
         this.s();
      }
   }

   public boolean N(class06601 var1) {
      this.Z = var1.W();
      if (var1.s()) {
         this.M = this.R.length();
         this.B = 0;
         return true;
      } else if (var1.T()) {
         ((class06197)class06202.Nq().L_3).N(this.E());
         return true;
      } else if (var1.b()) {
         this.y(((class06197)class06202.Nq().L_3).N());
         return true;
      } else if (var1.j()) {
         ((class06197)class06202.Nq().L_3).N(this.E());
         this.y("");
         return true;
      } else {
         switch (var1.v()) {
            case 257:
            case 335:
               this.y("\n");
               return true;
            case 259:
               if (var1.P()) {
                  class03917 class03917 = this.W();
                  this.L(class03917.N() - this.M);
               } else {
                  this.L(-1);
               }

               return true;
            case 261:
               if (var1.P()) {
                  class03917 class03917x = this.m();
                  this.L(class03917x.N() - this.M);
               } else {
                  this.L(1);
               }

               return true;
            case 262:
               if (var1.P()) {
                  class03917 class03917xx = this.m();
                  this.N(class03964.field_39535, class03917xx.N());
               } else {
                  this.N(class03964.field_39536, 1);
               }

               return true;
            case 263:
               if (var1.P()) {
                  class03917 class03917xxx = this.W();
                  this.N(class03964.field_39535, class03917xxx.N());
               } else {
                  this.N(class03964.field_39536, -1);
               }

               return true;
            case 264:
               if (!var1.P()) {
                  this.i(1);
               }

               return true;
            case 265:
               if (!var1.P()) {
                  this.i(-1);
               }

               return true;
            case 266:
               this.N(class03964.field_39535, 0);
               return true;
            case 267:
               this.N(class03964.field_39537, 0);
               return true;
            case 268:
               if (var1.P()) {
                  this.N(class03964.field_39535, 0);
               } else {
                  this.N(class03964.field_39535, this.P().N());
               }

               return true;
            case 269:
               if (var1.P()) {
                  this.N(class03964.field_39537, 0);
               } else {
                  this.N(class03964.field_39535, this.P().y());
               }

               return true;
            default:
               return false;
         }
      }
   }

   public class03917 W() {
      if (this.R.isEmpty()) {
         return class03917.L;
      } else {
         int ix = class04995.N(this.M, 0, this.R.length() - 1);

         while (ix > 0 && Character.isWhitespace(this.R.charAt(ix - 1))) {
            ix--;
         }

         while (ix > 0 && !Character.isWhitespace(this.R.charAt(ix - 1))) {
            ix--;
         }

         return new class03917(ix, this.M(ix));
      }
   }

   private class03917 R(int var1) {
      int ix = this.B();
      if (ix < 0) {
         y.error("Cursor is not within text (cursor = {}, length = {})", this.M, this.R.length());
         return this.i.getLast();
      } else {
         return this.i.get(class04995.N(ix + var1, 0, this.i.size() - 1));
      }
   }

   public class03917 R() {
      return new class03917(Math.min(this.B, this.M), Math.max(this.B, this.M));
   }
}
