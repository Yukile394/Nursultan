package minecraft;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
public interface class01028 {
   class01028 N = var0 -> true;

   boolean accept(class05197 var1);

   static class01028 y(String var0, class00405 var1, Int2IntFunction var2) {
      return var0.isEmpty() ? N : var3 -> class05232.y(var0, var1, N(var3, var2));
   }

   static class01028 y(class01028 var0, class01028 var1) {
      return var2 -> var0.accept(var2) && var1.accept(var2);
   }

   static class01028 y(List<class01028> var0) {
      return var1 -> {
         Iterator iterator = var0.iterator();

         while (iterator.hasNext()) {
            if (!((class01028)iterator.next()).accept(var1)) {
               return false;
            }
         }

         return true;
      };
   }

   static class01028 y(String var0, class00405 var1) {
      return var0.isEmpty() ? N : var2 -> class05232.y(var0, var1, var2);
   }

   static class01028 N(String var0, class00405 var1, Int2IntFunction var2) {
      return var0.isEmpty() ? N : var3 -> class05232.N(var0, var1, N(var3, var2));
   }

   static class01028 N(class01028... var0) {
      return y(ImmutableList.copyOf(var0));
   }

   static class01028 N(class01028 var0, class01028 var1) {
      return y(var0, var1);
   }

   static class01028 N(class01028 var0) {
      return var0;
   }

   static class05197 N(class05197 var0, Int2IntFunction var1) {
      return (var2, var3, var4) -> var0.accept(var2, var3, (Integer)var1.apply(var4));
   }

   static class01028 N(int var0, class00405 var1) {
      return var2 -> var2.accept(0, var1, var0);
   }

   static class01028 aE_() {
      return N;
   }

   static class01028 a_(String var0, class00405 var1) {
      return var0.isEmpty() ? N : var2 -> class05232.N(var0, var1, var2);
   }

   static class01028 a_(List<class01028> var0) {
      switch (var0.size()) {
         case 0:
            return N;
         case 1:
            return (class01028)var0.get(0);
         case 2:
            return y((class01028)var0.get(0), (class01028)var0.get(1));
         default:
            return y(ImmutableList.copyOf(var0));
      }
   }
}
