package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class02754 {
   public static final int N = -1;
   public static final class02754 y = new class02754(List.of(), IntList.of());
   private final List<class06510> L;
   private final IntList u;

   public boolean L() {
      return this.u.isEmpty();
   }

   private class02754(List<class06510> var1, IntList var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public List<class06510> y() {
      return this.L;
   }

   public static class02754 y(List<class06510> var0) {
      int i = var0.size();
      IntArrayList intarraylist = new IntArrayList(i);

      for (int j = 0; j < i; j++) {
         if (((class06510)var0.get(j)).method_65799()) {
            return y;
         }

         intarraylist.add(j);
      }

      return new class02754(var0, intarraylist);
   }

   public IntList N() {
      return this.u;
   }

   public static class02754 N(class06510 var0) {
      return var0.method_65799() ? y : new class02754(List.of(var0), IntList.of(0));
   }

   public static class02754 N(List<Optional<class06510>> var0) {
      int i = var0.size();
      ArrayList arraylist = new ArrayList(i);
      IntArrayList intarraylist = new IntArrayList(i);
      int j = 0;

      for (Optional optional : var0) {
         if (optional.isPresent()) {
            class06510 class06510 = (class06510)optional.get();
            if (class06510.method_65799()) {
               return y;
            }

            arraylist.add(class06510);
            intarraylist.add(j++);
         } else {
            intarraylist.add(-1);
         }
      }

      return new class02754(arraylist, intarraylist);
   }
}
