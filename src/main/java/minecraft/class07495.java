package minecraft;

import java.util.Iterator;
import java.util.List;

public class class07495 implements class03507 {
   private final class00743<class06584> N;
   private final int y;
   private final int u;
   private final class07482 i;

   public class07495(class07482 var1, int var2, int var3) {
      this(var1, var2, var3, class00743.method_10213(var2 * var3, class06584.E));
   }

   private class07495(class07482 var1, int var2, int var3, class00743<class06584> var4) {
      super();
      this.N = var4;
      this.i = var1;
      this.y = var2;
      this.u = var3;
   }

   @Override
   public int y() {
      return this.y;
   }

   @Override
   public int N() {
      return this.u;
   }

   @Override
   public void N(class02741 var1) {
      for (class06584 class06584 : this.N) {
         var1.N(class06584);
      }
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return true;
   }

   @Override
   public void method_5448() {
      this.N.clear();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.N.set(var1, var2);
      this.i.y(this);
   }

   @Override
   public void method_5431() {
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      class06584 class06584 = class06686.N(this.N, var1, var2);
      if (!class06584.R()) {
         this.i.y(this);
      }

      return class06584;
   }

   @Override
   public class06584 method_5441(int var1) {
      return class06686.N(this.N, var1);
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

   @Override
   public List<class06584> aC_() {
      return List.copyOf(this.N);
   }

   @Override
   public class06584 method_5438(int var1) {
      return var1 >= this.method_5439() ? class06584.E : this.N.get(var1);
   }

   @Override
   public int method_5439() {
      return this.N.size();
   }
}
