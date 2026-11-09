package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class01145 implements class01166 {
   private final List<class01187> y = Lists.newArrayList();
   private final Set<class01187> L = Sets.newHashSet();
   private final List<class01187> u = Lists.newArrayList();
   private boolean i;
   private final class04782 R;
   private final int M;
   private final class01169 B;

   public class01145(class04782 var1, int var2, class01169 var3) {
      super();
      this.R = var1;
      this.M = var2;
      this.B = var3;
   }

   @Override
   public void y(class01187 var1) {
      if (this.i) {
         this.L.add(var1);
      } else {
         this.y.remove(var1);
      }

      if (this.y.isEmpty()) {
         this.B.apply(this.M);
      }
   }

   private static Optional<class06889> N(class04782 var0, class06889 var1, class01187 var2) {
      Optional<class06889> optional = var2.N().N(var0);
      if (optional.isEmpty()) {
         return Optional.empty();
      } else {
         double d0 = class07209.method_49638(optional.get()).method_10262(class07209.method_49638(var1));
         int ix = var2.y() * var2.y();
         return d0 > ix ? Optional.empty() : optional;
      }
   }

   @Override
   public boolean N(class03556<class01194> var1, class06889 var2, class01164 var3, class01159 var4) {
      this.i = true;
      boolean flag = false;

      try {
         Iterator<class01187> iterator = this.y.iterator();

         while (iterator.hasNext()) {
            class01187 class01187 = iterator.next();
            if (this.L.remove(class01187)) {
               iterator.remove();
            } else {
               Optional<class06889> optional = N(this.R, var2, class01187);
               if (optional.isPresent()) {
                  var4.visit(class01187, optional.get());
                  flag = true;
               }
            }
         }
      } finally {
         this.i = false;
      }

      if (!this.u.isEmpty()) {
         this.y.addAll(this.u);
         this.u.clear();
      }

      if (!this.L.isEmpty()) {
         this.y.removeAll(this.L);
         this.L.clear();
      }

      return flag;
   }

   private static void N(class04782 var0, class01187 var1) {
      if (var0.method_74535().y(class00429.m)) {
         class00454 class00454 = new class00454(var1.y());
         class01190 class01190 = var1.N();
         if (class01190 instanceof class01155 class01155) {
            var0.method_74535().N(class01155.y(), class00429.m, class00454);
         } else if (class01190 instanceof class01177 class01177) {
            class07049 class07049 = var0.method_66347(class01177.y());
            if (class07049 != null) {
               var0.method_74535().N(class07049, class00429.m, class00454);
            }
         }
      }
   }

   @Override
   public void N(class01187 var1) {
      if (this.i) {
         this.u.add(var1);
      } else {
         this.y.add(var1);
      }

      N(this.R, var1);
   }

   @Override
   public boolean N() {
      return this.y.isEmpty();
   }
}
