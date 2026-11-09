package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public class class08651 {
   private static final int N = 2000962815;
   private final List<class08675> y = new ArrayList<>();
   private int L = Integer.MAX_VALUE;
   private class08675 u;
   private final Set<Object> i = new HashSet<>();
   @Nullable
   private class03255 R;

   public void L(Consumer<class08647> var1) {
      class08675 class08675 = this.u;
      this.y(var2x -> {
         if (var2x.M != null) {
            this.u = var2x;

            for (class08647 class08647 : var2x.M) {
               var1.accept(class08647);
            }
         }
      }, class08677.field_60315);
      this.u = class08675;
   }

   public void L() {
      if (this.u.y == null) {
         this.u.y = new class08675(this.u);
      }

      this.u = this.u.y;
   }

   public class08651() {
      super();
      this.N();
   }

   public void i() {
      this.i.clear();
      this.y.clear();
      this.L = Integer.MAX_VALUE;
      this.N();
   }

   public Set<Object> u() {
      return this.i;
   }

   private void y(class03255 var1) {
      class08675 class08675 = this.y.getLast();

      while (class08675.y != null) {
         class08675 = class08675.y;
      }

      boolean flag = false;

      while (!flag) {
         flag = this.N(var1, class08675.L) || this.N(var1, class08675.i) || this.N(var1, class08675.R) || this.N(var1, class08675.M);
         if (class08675.N == null) {
            break;
         }

         if (!flag) {
            class08675 = class08675.N;
         }
      }

      this.u = class08675;
      if (flag) {
         this.L();
      }
   }

   public void y(class08669 var1) {
      this.u.y(var1);
   }

   private void y(Consumer<class08675> var1, class08677 var2) {
      int ix = 0;
      int j = this.y.size();
      if (var2 == class08677.field_60316) {
         j = Math.min(this.L, this.y.size());
      } else if (var2 == class08677.field_60317) {
         ix = this.L;
      }

      for (int k = ix; k < j; k++) {
         class08675 class08675 = this.y.get(k);
         this.N(class08675, var1);
      }
   }

   public void y(Consumer<class08652> var1) {
      class08675 class08675 = this.u;
      this.y(var2x -> {
         if (var2x.R != null) {
            for (class08652 class08652 : var2x.R) {
               this.u = var2x;
               var1.accept(class08652);
            }
         }
      }, class08677.field_60315);
      this.u = class08675;
   }

   public void y() {
      if (this.L != Integer.MAX_VALUE) {
         throw new IllegalStateException("Can only blur once per frame");
      } else {
         this.L = this.y.size() - 1;
      }
   }

   public void N(class08650 var1) {
      if (this.N((class08320)var1)) {
         this.i.add(var1.L().Z());
         this.u.N(var1);
         this.N(var1.comp_4274());
      }
   }

   private void N(class08675 var1, Consumer<class08675> var2) {
      var2.accept(var1);
      if (var1.y != null) {
         this.N(var1.y, var2);
      }
   }

   public void N(Comparator<class08669> var1) {
      this.y(var1x -> {
         if (var1x.L != null) {
            if (class07529.l) {
               Collections.shuffle(var1x.L);
            }

            var1x.L.sort(var1);
         }
      }, class08677.field_60315);
   }

   public void N() {
      this.u = new class08675(null);
      this.y.add(this.u);
   }

   public void N(class08647 var1) {
      if (this.N((class08320)var1)) {
         this.u.N(var1);
         this.N(var1.comp_4274());
      }
   }

   public void N(class08661 var1) {
      this.u.N(var1);
   }

   private boolean N(class03255 var1, @Nullable List<? extends class08320> var2) {
      if (var2 != null) {
         Iterator iterator = var2.iterator();

         while (iterator.hasNext()) {
            class03255 class03255 = ((class08320)iterator.next()).comp_4274();
            if (class03255 != null && class03255.L(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean N(class08320 var1) {
      class03255 class03255 = var1.comp_4274();
      if (class03255 == null) {
         return false;
      } else {
         if (this.R != null && this.R.u(class03255)) {
            this.L();
         } else {
            this.y(class03255);
         }

         this.R = class03255;
         return true;
      }
   }

   private void N(@Nullable class03255 var1) {
      if (class07529.w && var1 != null) {
         this.L();
         this.u.N(new class08656(class08394.NH, class08679.N(), new Matrix3x2f(), 0, 0, 10000, 10000, 2000962815, 2000962815, var1));
      }
   }

   public void N(class08652 var1) {
      if (this.N((class08320)var1)) {
         this.u.N(var1);
         this.N(var1.comp_4274());
      }
   }

   public void N(class08669 var1) {
      if (this.N((class08320)var1)) {
         this.u.N(var1);
         this.N(var1.comp_4274());
      }
   }

   public void N(Consumer<class08650> var1) {
      class08675 class08675 = this.u;
      this.y(var2x -> {
         if (var2x.i != null) {
            this.u = var2x;

            for (class08650 class08650 : var2x.i) {
               var1.accept(class08650);
            }
         }
      }, class08677.field_60315);
      this.u = class08675;
   }

   public void N(Consumer<class08669> var1, class08677 var2) {
      this.y(var1x -> {
         if (var1x.L != null || var1x.u != null) {
            if (var1x.L != null) {
               for (class08669 class08669x : var1x.L) {
                  var1.accept(class08669x);
               }
            }

            if (var1x.u != null) {
               for (class08669 class08669 : var1x.u) {
                  var1.accept(class08669);
               }
            }
         }
      }, var2);
   }
}
