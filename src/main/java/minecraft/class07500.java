package minecraft;

import Nursultan.class10754;
import Nursultan.class10755;
import java.util.List;
import java.util.Optional;

public class class07500 extends class07482 {
   static final class01894 N = class01894.y("container/slot/lapis_lazuli");
   private final class06695 i = new class10754(this, 2);
   private final class05880 R;
   private final class06069 j = class06069.u();
   private final class05865 v = class05865.N();
   public final int[] y = new int[3];
   public final int[] L = new int[]{-1, -1, -1};
   public final int[] u = new int[]{-1, -1, -1};

   public class07500(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class07500(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17334, var1);
      this.R = var3;
      this.N(new class10755(this, this.i, 0, 15, 47));
      this.N(new class07509(this, this.i, 1, 35, 47));
      this.L(var2, 8, 84);
      this.N(class05865.N(this.y, 0));
      this.N(class05865.N(this.y, 1));
      this.N(class05865.N(this.y, 2));
      this.N(this.v).N(var2.z.method_7278());
      this.N(class05865.N(this.L, 0));
      this.N(class05865.N(this.L, 1));
      this.N(class05865.N(this.L, 2));
      this.N(class05865.N(this.u, 0));
      this.N(class05865.N(this.u, 1));
      this.N(class05865.N(this.u, 2));
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.R.N_53((var2, var3) -> this.N(var1, this.i));
   }

   @Override
   public void y(class06695 var1) {
      if (var1 == this.i) {
         class06584 class06584 = var1.method_5438(0);
         if (!class06584.R() && class06584.g()) {
            this.R.N_53((var2x, var3x) -> {
               class00750 class00750 = var2x.method_30349().L(class04227.yR).v();
               int jx = 0;

               for (class07209 var7 : class07203.y) {
                  if (class07203.N(var2x, var3x, var7)) {
                     jx++;
                  }
               }

               this.j.N(this.v.y());

               for (int k = 0; k < 3; k++) {
                  this.y[k] = class07323.N(this.j, k, jx, class06584);
                  this.L[k] = -1;
                  this.u[k] = -1;
                  if (this.y[k] < k + 1) {
                     this.y[k] = 0;
                  }
               }

               for (int l = 0; l < 3; l++) {
                  if (this.y[l] > 0) {
                     List<class07317> list = this.N(var2x.method_30349(), class06584, l, this.y[l]);
                     if (!list.isEmpty()) {
                        class07317 class07317 = list.get(this.j.y(list.size()));
                        this.L[l] = class00750.N(class07317.y());
                        this.u[l] = class07317.L();
                     }
                  }
               }

               this.u();
            });
         } else {
            for (int ix = 0; ix < 3; ix++) {
               this.y[ix] = 0;
               this.L[ix] = -1;
               this.u[ix] = -1;
            }
         }
      }
   }

   @Override
   public boolean y(class08036 var1, int var2) {
      if (var2 >= 0 && var2 < this.y.length) {
         class06584 class06584x = this.i.method_5438(0);
         class06584 class06584x = this.i.method_5438(1);
         int ix = var2 + 1;
         if ((class06584x.R() || class06584x.c() < ix) && !var1.method_56992()) {
            return false;
         } else if (this.y[var2] <= 0
            || class06584x.R()
            || (var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < ix || var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < this.y[var2]) && !var1.method_56992()
            )
          {
            return false;
         } else {
            this.R.N_53((var6, var7) -> {
               class06584 class06584xx = class06584x;
               List<class07317> list = this.N(var6.method_30349(), class06584x, var2, this.y[var2]);
               if (!list.isEmpty()) {
                  var1.method_7286(class06584x, ix);
                  if (class06584x.N(class06570.jY)) {
                     class06584xx = class06584x.N((class07310)class06570.Gq);
                     this.i.method_5447(0, class06584xx);
                  }

                  for (class07317 class07317 : list) {
                     class06584xx.N(class07317.y(), class07317.L());
                  }

                  class06584.N(ix, (class07438)var1);
                  if (class06584.R()) {
                     this.i.method_5447(1, class06584.E);
                  }

                  var1.method_7281(class01235.NW);
                  if (var1 instanceof class04770) {
                     class06912.z.N((class04770)var1, class06584xx, ix);
                  }

                  this.i.method_5431();
                  this.v.N(var1.method_7278());
                  this.y(this.i);
                  var6.method_8396(null, var7, class04909.zI, class04911.field_15245, 1.0F, var6.field_9229.z() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         class07536.y(var1.method_74861() + " pressed invalid button id: " + var2);
         return false;
      }
   }

   public int E() {
      class06584 class06584 = this.i.method_5438(1);
      return class06584.R() ? 0 : class06584.c();
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.R, var1, class00869.MM);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584xx = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584xx = class06584x.t();
         if (var2 == 0) {
            if (!this.N(class06584x, 2, 38, true)) {
               return class06584.E;
            }
         } else if (var2 == 1) {
            if (!this.N(class06584x, 2, 38, true)) {
               return class06584.E;
            }
         } else if (class06584x.N(class06570.TL)) {
            if (!this.N(class06584x, 1, 2, true)) {
               return class06584.E;
            }
         } else {
            if (this.T.get(0).R() || !this.T.get(0).N(class06584x)) {
               return class06584.E;
            }

            class06584 class06584xx = class06584x.L(1);
            class06584x.B(1);
            this.T.get(0).u(class06584xx);
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584xx.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584xx;
   }

   private List<class07317> N(class01042 var1, class06584 var2, int var3, int var4) {
      this.j.N(this.v.y() + var3);
      Optional optional = var1.L(class04227.yR).N(class02625.U);
      if (optional.isEmpty()) {
         return List.of();
      } else {
         List<class07317> list = class07323.y(this.j, var2, var4, ((class03552)optional.get()).N());
         if (var2.N(class06570.jY) && list.size() > 1) {
            list.remove(this.j.y(list.size()));
         }

         return list;
      }
   }

   public int W() {
      return this.v.y();
   }
}
