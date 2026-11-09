package minecraft;

import Nursultan.class10582;
import Nursultan.class10583;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class class06511 {
   public static final int N = 20;
   public static final class06511 y = new class06511(List.of(), List.of(), List.of());
   private final List<class06510> L;
   private final List<class10583<class06525>> u;
   private final List<class10583<class06581>> i;

   public boolean L(class06584 var1) {
      Iterator<class10583<class06525>> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().y().method_8093(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean L(class06584 var1, class06584 var2) {
      Optional<class03556<class06525>> optional = var1.a_(class02484.h, class06517.N).i();
      if (optional.isEmpty()) {
         return false;
      } else {
         for (class10583<class06525> class10583 : this.u) {
            if (class10583.N().N(optional.get()) && class10583.y().method_8093(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   public class06511(List<class06510> var1, List<class10583<class06525>> var2, List<class10583<class06581>> var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public class06584 u(class06584 var1, class06584 var2) {
      if (var2.R()) {
         return var2;
      } else {
         Optional<class03556<class06525>> optional = var2.a_(class02484.h, class06517.N).i();
         if (optional.isEmpty()) {
            return var2;
         } else {
            for (class10583 class10583x : this.i) {
               if (var2.N(class10583x.N()) && class10583x.y().method_8093(var1)) {
                  return class06517.N((class06581)class10583x.L().N(), optional.get());
               }
            }

            for (class10583 class10583x : this.u) {
               if (class10583x.N().N(optional.get()) && class10583x.y().method_8093(var1)) {
                  return class06517.N(var2.B(), class10583x.L());
               }
            }

            return var2;
         }
      }
   }

   private boolean u(class06584 var1) {
      Iterator<class06510> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().method_8093(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean y(class06584 var1, class06584 var2) {
      for (class10583<class06581> class10583 : this.i) {
         if (var1.N(class10583.N()) && class10583.y().method_8093(var2)) {
            return true;
         }
      }

      return false;
   }

   public boolean y(class06584 var1) {
      Iterator<class10583<class06581>> iterator = this.i.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().y().method_8093(var1)) {
            return true;
         }
      }

      return false;
   }

   public static class06511 N(class03767 var0) {
      class10582 class10582 = new class10582(var0);
      N(class10582);
      return class10582.N();
   }

   public boolean N(class06584 var1, class06584 var2) {
      return !this.u(var1) ? false : this.y(var1, var2) || this.L(var1, var2);
   }

   public static void N(class10582 var0) {
      var0.N(class06570.ns);
      var0.N(class06570.lO);
      var0.N(class06570.lJ);
      var0.N(class06570.ns, class06570.bN, class06570.lO);
      var0.N(class06570.lO, class06570.lQ, class06570.lJ);
      var0.N(class06506.N, class06570.vL, class06506.L);
      var0.N(class06506.N, class06570.WY, class06506.y);
      var0.N(class06506.N, class06570.nm, class06506.u);
      var0.N(class06570.GW, class06506.p);
      var0.N(class06570.Wq, class06506.A);
      var0.N(class06570.y, class06506.f);
      var0.N(class06570.Lf, class06506.F);
      var0.N(class06506.u, class06570.GG, class06506.i);
      var0.N(class06506.i, class06570.WY, class06506.R);
      var0.N(class06506.i, class06570.nb, class06506.M);
      var0.N(class06506.R, class06570.nb, class06506.B);
      var0.N(class06506.M, class06570.WY, class06506.B);
      var0.N(class06570.nv, class06506.E);
      var0.N(class06506.E, class06570.WY, class06506.W);
      var0.N(class06570.Gp, class06506.Z);
      var0.N(class06506.Z, class06570.WY, class06506.z);
      var0.N(class06506.Z, class06570.vL, class06506.U);
      var0.N(class06506.Z, class06570.nb, class06506.T);
      var0.N(class06506.z, class06570.nb, class06506.b);
      var0.N(class06506.T, class06570.WY, class06506.b);
      var0.N(class06506.T, class06570.vL, class06506.j);
      var0.N(class06506.u, class06570.sa, class06506.v);
      var0.N(class06506.v, class06570.WY, class06506.n);
      var0.N(class06506.v, class06570.vL, class06506.t);
      var0.N(class06506.m, class06570.nb, class06506.T);
      var0.N(class06506.P, class06570.nb, class06506.b);
      var0.N(class06570.vg, class06506.m);
      var0.N(class06506.m, class06570.WY, class06506.P);
      var0.N(class06506.m, class06570.vL, class06506.s);
      var0.N(class06506.u, class06570.vM, class06506.G);
      var0.N(class06506.G, class06570.WY, class06506.l);
      var0.N(class06570.nl, class06506.d);
      var0.N(class06506.d, class06570.vL, class06506.w);
      var0.N(class06506.d, class06570.nb, class06506.k);
      var0.N(class06506.w, class06570.nb, class06506.Y);
      var0.N(class06506.k, class06570.vL, class06506.Y);
      var0.N(class06506.Q, class06570.nb, class06506.k);
      var0.N(class06506.O, class06570.nb, class06506.k);
      var0.N(class06506.g, class06570.nb, class06506.Y);
      var0.N(class06570.nT, class06506.Q);
      var0.N(class06506.Q, class06570.WY, class06506.O);
      var0.N(class06506.Q, class06570.vL, class06506.g);
      var0.N(class06570.nE, class06506.I);
      var0.N(class06506.I, class06570.WY, class06506.J);
      var0.N(class06506.I, class06570.vL, class06506.o);
      var0.N(class06570.nj, class06506.q);
      var0.N(class06506.q, class06570.WY, class06506.K);
      var0.N(class06506.q, class06570.vL, class06506.V);
      var0.N(class06506.N, class06570.nb, class06506.e);
      var0.N(class06506.e, class06570.WY, class06506.H);
      var0.N(class06506.u, class06570.ss, class06506.X);
      var0.N(class06506.X, class06570.WY, class06506.a);
   }

   public boolean N(class06584 var1) {
      return this.y(var1) || this.L(var1);
   }

   public boolean N(class03556<class06525> var1) {
      Iterator<class10583<class06525>> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().L().N(var1)) {
            return true;
         }
      }

      return false;
   }
}
