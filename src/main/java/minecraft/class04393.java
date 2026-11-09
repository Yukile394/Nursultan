package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class04393<R extends class06521<?>> {
   private static final int N = -1;
   private final class08044 y;
   private final class04056<R> L;
   private final boolean u;
   private final int i;
   private final int R;
   private final List<class06937> M;
   private final List<class06937> B;

   private int L() {
      int ix = 0;
      Iterator<class06584> iterator = this.y.u().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().R()) {
            ix++;
         }
      }

      return ix;
   }

   private class04393(class04056<R> var1, class08044 var2, boolean var3, int var4, int var5, List<class06937> var6, List<class06937> var7) {
      super();
      this.L = var1;
      this.y = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.B = var7;
   }

   private void y(class03729<R> var1, class02741 var2) {
      boolean flag = this.L.N(var1);
      int ix = var2.y(var1.y(), null);
      if (flag) {
         for (class06937 class06937 : this.M) {
            class06584 class06584 = class06937.i();
            if (!class06584.R() && Math.min(ix, class06584.U()) < class06584.c() + 1) {
               return;
            }
         }
      }

      int j = this.N(ix, flag);
      ArrayList arraylist = new ArrayList();
      if (var2.N(var1.y(), j, arraylist::add)) {
         int k = N(j, arraylist);
         if (k != j) {
            arraylist.clear();
            if (!var2.N(var1.y(), k, arraylist::add)) {
               return;
            }
         }

         this.N();
         class02604.N(this.i, this.R, var1.y(), var1.y().method_61671().N(), (var3x, var4x, var5, var6x) -> {
            if (var3x != -1) {
               class06937 class06937x = this.M.get(var4x);
               class03556 class03556 = (class03556)arraylist.get(var3x);
               int l = k;

               while (l > 0) {
                  l = this.N(class06937x, class03556, l);
                  if (l == -1) {
                     return;
                  }
               }
            }
         });
      }
   }

   private boolean y() {
      ArrayList arraylist = Lists.newArrayList();
      int ix = this.L();
      Iterator<class06937> iterator = this.M.iterator();

      while (iterator.hasNext()) {
         class06584 class06584x = iterator.next().i().t();
         if (!class06584x.R()) {
            int j = this.y.R(class06584x);
            if (j == -1 && arraylist.size() <= ix) {
               for (class06584 class06584x : arraylist) {
                  if (class06584.y(class06584x, class06584x) && class06584x.c() != class06584x.U() && class06584x.c() + class06584x.c() <= class06584x.U()) {
                     class06584x.M(class06584x.c());
                     class06584x.i(0);
                     break;
                  }
               }

               if (!class06584x.R()) {
                  if (arraylist.size() >= ix) {
                     return false;
                  }

                  arraylist.add(class06584x);
               }
            } else if (j == -1) {
               return false;
            }
         }
      }

      return true;
   }

   private int N(class06937 var1, class03556<class06581> var2, int var3) {
      class06584 class06584xx = var1.i();
      int ix = this.y.N(var2, class06584xx);
      if (ix == -1) {
         return -1;
      } else {
         class06584 class06584x = this.y.method_5438(ix);
         class06584 class06584xx;
         if (var3 < class06584x.c()) {
            class06584xx = this.y.method_5434(ix, var3);
         } else {
            class06584xx = this.y.method_5441(ix);
         }

         int j = class06584xx.c();
         if (class06584xx.R()) {
            var1.i(class06584xx);
         } else {
            class06584xx.M(j);
         }

         return var3 - j;
      }
   }

   private int N(int var1, boolean var2) {
      if (this.u) {
         return var1;
      } else if (var2) {
         int ix = Integer.MAX_VALUE;
         Iterator<class06937> iterator = this.M.iterator();

         while (iterator.hasNext()) {
            class06584 class06584 = iterator.next().i();
            if (!class06584.R() && ix > class06584.c()) {
               ix = class06584.c();
            }
         }

         if (ix != Integer.MAX_VALUE) {
            ix++;
         }

         return ix;
      } else {
         return 1;
      }
   }

   public static <I extends class02950, R extends class06521<I>> class06910 N(
      class04056<R> var0, int var1, int var2, List<class06937> var3, List<class06937> var4, class08044 var5, class03729<R> var6, boolean var7, boolean var8
   ) {
      class04393 class04393 = new class04393(var0, var5, var7, var1, var2, var3, var4);
      if (!var8 && !class04393.y()) {
         return class06910.field_52572;
      } else {
         class02741 class02741 = new class02741();
         var5.N(class02741);
         var0.N(class02741);
         return class04393.N(var6, class02741);
      }
   }

   private class06910 N(class03729<R> var1, class02741 var2) {
      if (var2.N(var1.y(), null)) {
         this.y(var1, var2);
         this.y.method_5431();
         return class06910.field_52572;
      } else {
         this.N();
         this.y.method_5431();
         return class06910.field_52573;
      }
   }

   private void N() {
      for (class06937 class06937 : this.B) {
         class06584 class06584 = class06937.i().t();
         this.y.N(class06584, false);
         class06937.i(class06584);
      }

      this.L.N();
   }

   private static int N(int var0, List<class03556<class06581>> var1) {
      for (class03556 class03556 : var1) {
         var0 = Math.min(var0, ((class06581)class03556.N()).M());
      }

      return var0;
   }
}
