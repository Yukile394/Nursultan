package minecraft;

import Nursultan.class10557;
import java.util.Optional;

public class class06146 extends class07482 {
   public static final int N = 0;
   public static final int y = 1;
   private static final int t = 2;
   private static final int G = 29;
   private static final int l = 29;
   private static final int d = 38;
   private final class05880 w;
   final class05865 L = class05865.N();
   private final class07299 k;
   private class00279<class06156> Y = class00279.N();
   private class06584 Q = class06584.E;
   long u;
   final class06937 i;
   final class06937 R;
   public Runnable j = () -> {};
   public final class06695 v = new class10557(this, 1);
   final class06919 n = new class06919();

   public boolean P() {
      return this.i.R() && !this.Y.L();
   }

   public class06146(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class06146(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17625, var1);
      this.w = var3;
      this.k = var2.z.method_73183();
      this.i = this.N(new class06937(this.v, 0, 20, 33));
      this.R = this.N(new class06159(this, this.n, 1, 143, 33, var3));
      this.L(var2, 8, 84);
      this.N(this.L);
   }

   public int m() {
      return this.Y.u();
   }

   @Override
   public void y(class06695 var1) {
      class06584 class06584 = this.i.i();
      if (!class06584.N(this.Q.B())) {
         this.Q = class06584.t();
         this.y(class06584);
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.n.method_5441(1);
      this.w.N_53((var2, var3) -> this.N(var1, this.v));
   }

   private void y(class06584 var1) {
      this.L.N(-1);
      this.R.i(class06584.E);
      if (!var1.R()) {
         this.Y = this.k.method_8433().N().y(var1);
      } else {
         this.Y = class00279.N();
      }
   }

   @Override
   public boolean y(class08036 var1, int var2) {
      if (this.L.y() == var2) {
         return false;
      } else {
         if (this.R(var2)) {
            this.L.N(var2);
            this.N(var2);
         }

         return true;
      }
   }

   public int E() {
      return this.L.y();
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      return var2.L != this.n && super.N(var1, var2);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06581 class06581 = class06584x.B();
         class06584x = class06584x.t();
         if (var2 == 1) {
            class06581.L(class06584x, var1);
            if (!this.N(class06584x, 2, 38, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 == 0) {
            if (!this.N(class06584x, 2, 38, false)) {
               return class06584.E;
            }
         } else if (this.k.method_8433().N().N(class06584x)) {
            if (!this.N(class06584x, 0, 1, false)) {
               return class06584.E;
            }
         } else if (var2 >= 2 && var2 < 29) {
            if (!this.N(class06584x, 29, 38, false)) {
               return class06584.E;
            }
         } else if (var2 >= 29 && var2 < 38 && !this.N(class06584x, 2, 29, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         }

         class06937.M();
         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
         if (var2 == 1) {
            var1.method_7328(class06584x, false);
         }

         this.u();
      }

      return class06584x;
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.w, var1, class00869.Pr);
   }

   void N(int var1) {
      Optional<class03729<class06156>> optional;
      if (!this.Y.L() && this.R(var1)) {
         optional = this.Y.i().get(var1).L().L();
      } else {
         optional = Optional.empty();
      }

      optional.ifPresentOrElse(var1x -> {
         this.n.N((class03729<?>)var1x);
         this.R.i(var1x.y().method_8116(new class02904(this.v.method_5438(0)), this.k.method_30349()));
      }, () -> {
         this.R.i(class06584.E);
         this.n.N(null);
      });
      this.u();
   }

   @Override
   public class05851<?> N() {
      return class05851.field_17625;
   }

   public void N(Runnable var1) {
      this.j = var1;
   }

   public class00279<class06156> W() {
      return this.Y;
   }

   private boolean R(int var1) {
      return var1 >= 0 && var1 < this.Y.u();
   }
}
