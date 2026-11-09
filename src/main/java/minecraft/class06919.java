package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class06919 implements class06695, class06946 {
   private final class00743<class06584> N = class00743.method_10213(1, class06584.E);
   @Nullable
   private class03729<?> y;

   public class06919() {
      super();
   }

   @Override
   public void N(@Nullable class03729<?> var1) {
      this.y = var1;
   }

   @Nullable
   @Override
   public class03729<?> N() {
      return this.y;
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
      this.N.set(0, var2);
   }

   @Override
   public void method_5431() {
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      return class06686.N(this.N, 0);
   }

   @Override
   public class06584 method_5441(int var1) {
      return class06686.N(this.N, 0);
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
   public class06584 method_5438(int var1) {
      return this.N.get(0);
   }

   @Override
   public int method_5439() {
      return 1;
   }
}
