package minecraft;

import Nursultan.class10686;
import Nursultan.class10687;
import Nursultan.class10688;
import Nursultan.class10689;
import Nursultan.class10690;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class class06951 extends class07482 {
   private static final int R = -1;
   private static final int j = 4;
   private static final int v = 31;
   private static final int n = 31;
   private static final int t = 40;
   private final class05880 G;
   final class05865 N = class05865.N();
   private List<class03556<class00412>> l = List.of();
   public Runnable y = () -> {};
   private final class02055<class00412> d;
   final class06937 L;
   final class06937 u;
   private final class06937 w;
   private final class06937 k;
   long i;
   private final class06695 Y = new class10686(this, 3);
   private final class06695 Q = new class10690(this, 1);

   public class06937 P() {
      return this.u;
   }

   public class06937 T() {
      return this.k;
   }

   public class06951(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class06951(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17339, var1);
      this.G = var3;
      this.L = this.N(new class10689(this, this.Y, 0, 13, 26));
      this.u = this.N(new class10688(this, this.Y, 1, 33, 26));
      this.w = this.N(new class10687(this, this.Y, 2, 23, 45));
      this.k = this.N(new class06907(this, this.Q, 0, 143, 57, var3));
      this.L(var2, 8, 84);
      this.N(this.N);
      this.d = var2.z.method_56673().L(class04227.NF);
   }

   public class06937 s() {
      return this.w;
   }

   public class06937 m() {
      return this.L;
   }

   @Override
   public boolean y(class08036 var1, int var2) {
      if (var2 >= 0 && var2 < this.l.size()) {
         this.N.N(var2);
         this.N(this.l.get(var2));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.G.N_53((var2, var3) -> this.N(var1, this.Y));
   }

   private List<class03556<class00412>> y(class06584 var1) {
      if (var1.R()) {
         return this.d.N(class04463.N).<List<class03556<class00412>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         class03530 class03530 = var1.method_58694(class02484.NW);
         return class03530 != null ? this.d.N(class03530).<List<class03556<class00412>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   @Override
   public void y(class06695 var1) {
      class06584 class06584xx = this.L.i();
      class06584 class06584x = this.u.i();
      class06584 class06584xx = this.w.i();
      if (!class06584xx.R() && !class06584x.R()) {
         int ix = this.N.y();
         boolean flag = this.N(ix);
         List<class03556<class00412>> list = this.l;
         this.l = this.y(class06584xx);
         class03556<class00412> class03556;
         if (this.l.size() == 1) {
            this.N.N(0);
            class03556 = this.l.get(0);
         } else if (!flag) {
            this.N.N(-1);
            class03556 = null;
         } else {
            class03556<class00412> class03556x = list.get(ix);
            int jx = this.l.indexOf(class03556x);
            if (jx != -1) {
               class03556 = class03556x;
               this.N.N(jx);
            } else {
               class03556 = null;
               this.N.N(-1);
            }
         }

         if (class03556 != null) {
            class02708 class02708 = class06584xx.a_(class02484.Nv, class02708.L);
            boolean flag1 = class02708.y().size() >= 6;
            if (flag1) {
               this.N.N(-1);
               this.k.i(class06584.E);
            } else {
               this.N(class03556);
            }
         } else {
            this.k.i(class06584.E);
         }

         this.u();
      } else {
         this.k.i(class06584.E);
         this.l = List.of();
         this.N.N(-1);
      }
   }

   public List<class03556<class00412>> E() {
      return this.l;
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == this.k.u) {
            if (!this.N(class06584x, 4, 40, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 != this.u.u && var2 != this.L.u && var2 != this.w.u) {
            if (class06584x.B() instanceof class06920) {
               if (!this.N(class06584x, this.L.u, this.L.u + 1, false)) {
                  return class06584.E;
               }
            } else if (class06584x.B() instanceof class06559) {
               if (!this.N(class06584x, this.u.u, this.u.u + 1, false)) {
                  return class06584.E;
               }
            } else if (class06584x.L(class02484.NW)) {
               if (!this.N(class06584x, this.w.u, this.w.u + 1, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 4 && var2 < 31) {
               if (!this.N(class06584x, 31, 40, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 31 && var2 < 40 && !this.N(class06584x, 4, 31, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 4, 40, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.G, var1, class00869.Pp);
   }

   private boolean N(int var1) {
      return var1 >= 0 && var1 < this.l.size();
   }

   public void N(Runnable var1) {
      this.y = var1;
   }

   private void N(class03556<class00412> var1) {
      class06584 class06584xx = this.L.i();
      class06584 class06584x = this.u.i();
      class06584 class06584xx = class06584.E;
      if (!class06584xx.R() && !class06584x.R()) {
         class06584xx = class06584xx.L(1);
         class06563 class06563 = ((class06559)class06584x.B()).N();
         class06584xx.N(class02484.Nv, class02708.L, var2x -> new class02701().N(var2x).N(var1, class06563).N());
      }

      if (!class06584.N(class06584xx, this.k.i())) {
         this.k.i(class06584xx);
      }
   }

   public int W() {
      return this.N.y();
   }
}
