package minecraft;

import java.util.ArrayList;
import java.util.List;

public abstract class class03260<T extends class00638> implements class00381<T> {
   private final Iterable<class00381<? super T>> N;

   protected class03260(Iterable<class00381<? super T>> var1) {
      var1 = N(var1);
      super();
      this.N = var1;
   }

   private static Iterable N(Iterable var0) {
      ArrayList arraylist = new ArrayList();
      N(var0, arraylist);
      return arraylist;
   }

   private static void N(Iterable var0, List var1) {
      for (class00381 class00381 : var0) {
         if (class00381 instanceof class03260) {
            N(((class03260)class00381).N(), var1);
         } else {
            var1.add(class00381);
         }
      }
   }

   public final Iterable<class00381<? super T>> N() {
      return this.N;
   }

   @Override
   public abstract class02897<? extends class03260<T>> method_65080();
}
