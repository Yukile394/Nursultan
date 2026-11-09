package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class06917 implements class06695 {
   private final class07288 N;
   private final class00743<class06584> y = class00743.method_10213(3, class06584.E);
   @Nullable
   private class07324 u;
   private int i;
   private int R;

   public int L() {
      return this.R;
   }

   public class06917(class07288 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   public class07324 y() {
      return this.u;
   }

   private boolean y(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public void N() {
      this.u = null;
      class06584 class06584x;
      class06584 class06584x;
      if (this.y.get(0).R()) {
         class06584x = this.y.get(1);
         class06584x = class06584.E;
      } else {
         class06584x = this.y.get(0);
         class06584x = this.y.get(1);
      }

      if (class06584x.R()) {
         this.method_5447(2, class06584.E);
         this.R = 0;
      } else {
         class07316 class07316 = this.N.y();
         if (!class07316.isEmpty()) {
            class07324 class07324 = class07316.N(class06584x, class06584x, this.i);
            if (class07324 == null || class07324.b()) {
               this.u = class07324;
               class07324 = class07316.N(class06584x, class06584x, this.i);
            }

            if (class07324 != null && !class07324.b()) {
               this.u = class07324;
               this.method_5447(2, class07324.B());
               this.R = class07324.T();
            } else {
               this.method_5447(2, class06584.E);
               this.R = 0;
            }
         }

         this.N.d_(this.method_5438(2));
      }
   }

   public void N(int var1) {
      this.i = var1;
      this.N();
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return this.N.N() == var1;
   }

   @Override
   public void method_5448() {
      this.y.clear();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.y.set(var1, var2);
      var2.R(this.a_(var2));
      if (this.y(var1)) {
         this.N();
      }
   }

   @Override
   public void method_5431() {
      this.N();
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      class06584 class06584x = this.y.get(var1);
      if (var1 == 2 && !class06584x.R()) {
         return class06686.N(this.y, var1, class06584x.c());
      } else {
         class06584 class06584x = class06686.N(this.y, var1, var2);
         if (!class06584x.R() && this.y(var1)) {
            this.N();
         }

         return class06584x;
      }
   }

   @Override
   public class06584 method_5441(int var1) {
      return class06686.N(this.y, var1);
   }

   @Override
   public boolean method_5442() {
      Iterator<class06584> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class06584 method_5438(int var1) {
      return this.y.get(var1);
   }

   @Override
   public int method_5439() {
      return this.y.size();
   }
}
