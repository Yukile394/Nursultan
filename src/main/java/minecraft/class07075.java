package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;

public class class07075 implements class06695, class06941, SpecialLogicInventory {
   private final int y;
   public final class00743<class06584> N;
   @Nullable
   private List<class06712> u;
   private boolean i = false;

   public boolean L(class06584 var1) {
      boolean flag = false;

      for (class06584 class06584 : this.N) {
         if (class06584.R() || class06584.L(class06584, var1) && class06584.c() < class06584.U()) {
            flag = true;
            break;
         }
      }

      return flag;
   }

   public class07075(int var1) {
      super();
      this.y = var1;
      this.N = class00743.method_10213(var1, class06584.E);
   }

   public class07075(class06584... var1) {
      super();
      this.y = var1.length;
      this.N = class00743.method_10212(class06584.E, var1);
   }

   @Override
   public String toString() {
      return this.N.stream().filter(var0 -> !var0.R()).collect(Collectors.toList()).toString();
   }

   private void i(class06584 var1) {
      for (int ix = 0; ix < this.y; ix++) {
         class06584 class06584 = this.method_5438(ix);
         if (class06584.L(class06584, var1)) {
            this.N(var1, class06584);
            if (var1.R()) {
               return;
            }
         }
      }
   }

   private void u(class06584 var1) {
      for (int ix = 0; ix < this.y; ix++) {
         if (this.method_5438(ix).R()) {
            this.method_5447(ix, var1.M());
            return;
         }
      }
   }

   public class00743<class06584> y() {
      return this.N;
   }

   public void y(class06712 var1) {
      if (this.u != null) {
         this.u.remove(var1);
      }
   }

   private void N(class06584 var1, class06584 var2) {
      int ix = this.a_(var2);
      int j = Math.min(var1.c(), ix - var2.c());
      if (j > 0) {
         var2.M(j);
         var1.B(j);
         this.method_5431();
      }
   }

   public List<class06584> N() {
      List list = this.N.stream().filter(var0 -> !var0.R()).collect(Collectors.toList());
      this.method_5448();
      return list;
   }

   public void N(class07075 var1) {
      if (!this.i) {
         var1.method_5431();
      }
   }

   @Override
   public void N(class02741 var1) {
      for (class06584 class06584 : this.N) {
         var1.y(class06584);
      }
   }

   public class06584 N(class06584 var1) {
      if (var1.R()) {
         return class06584.E;
      } else {
         class06584 class06584 = var1.t();
         this.i(class06584);
         if (class06584.R()) {
            return class06584.E;
         } else {
            this.u(class06584);
            return class06584.R() ? class06584.E : class06584;
         }
      }
   }

   public class06584 N(class06581 var1, int var2) {
      class06584 class06584xx = new class06584(var1, 0);

      for (int ix = this.y - 1; ix >= 0; ix--) {
         class06584 class06584x = this.method_5438(ix);
         if (class06584x.B().equals(var1)) {
            int j = var2 - class06584xx.c();
            class06584 class06584xx = class06584x.N(j);
            class06584xx.M(class06584xx.c());
            if (class06584xx.c() == var2) {
               break;
            }
         }
      }

      if (!class06584xx.R()) {
         this.method_5431();
      }

      return class06584xx;
   }

   public void N(class06712 var1) {
      if (this.u == null) {
         this.u = Lists.newArrayList();
      }

      this.u.add(var1);
   }

   public void N(class08294<class06584> var1) {
      for (int ix = 0; ix < this.method_5439(); ix++) {
         class06584 class06584 = this.method_5438(ix);
         if (!class06584.R()) {
            var1.N(class06584);
         }
      }
   }

   public void N(class08310<class06584> var1) {
      this.method_5448();

      for (class06584 class06584 : var1) {
         this.N(class06584);
      }
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return true;
   }

   @Override
   public void method_5448() {
      this.N.clear();
      this.method_5431();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.N.set(var1, var2);
      var2.R(this.a_(var2));
      this.N(this);
   }

   @Override
   public void method_5431() {
      if (this.u != null) {
         Iterator<class06712> iterator = this.u.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(this);
         }
      }
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      class06584 class06584 = class06686.N(this.N, var1, var2);
      if (!class06584.R()) {
         this.method_5431();
      }

      return class06584;
   }

   @Override
   public class06584 method_5441(int var1) {
      class06584 class06584 = this.N.get(var1);
      if (class06584.R()) {
         return class06584.E;
      } else {
         this.N.set(var1, class06584.E);
         return class06584;
      }
   }

   @Override
   public boolean method_5442() {
      Iterator<class06584> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
   }

   public void fabric_setSuppress(boolean var1) {
      this.i = var1;
   }

   @Override
   public class06584 method_5438(int var1) {
      return var1 >= 0 && var1 < this.N.size() ? this.N.get(var1) : class06584.E;
   }

   @Override
   public int method_5439() {
      return this.y;
   }
}
