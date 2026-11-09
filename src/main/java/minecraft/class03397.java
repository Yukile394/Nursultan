package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03397 {
   public static final int N = -1;
   private static final int y = 128;
   private final class04469[] L;

   public class03397(int var1) {
      super();
      this.L = new class04469[var1];
   }

   public void N(class03079 var1, @Nullable class04469 var2) {
      List<class04469> list = var1.u().y();
      ArrayDeque arraydeque = new ArrayDeque(list.size() + 1);
      arraydeque.addAll(list);
      if (var2 != null) {
         arraydeque.add(var2);
      }

      this.N(arraydeque);
   }

   void N(List<class04469> var1) {
      this.N(new ArrayDeque<>(var1));
   }

   private void N(ArrayDeque<class04469> var1) {
      ObjectOpenHashSet objectopenhashset = new ObjectOpenHashSet(var1);

      for (int i = 0; !var1.isEmpty() && i < this.L.length; i++) {
         class04469 class04469 = this.L[i];
         this.L[i] = (class04469)var1.removeLast();
         if (class04469 != null && !objectopenhashset.contains(class04469)) {
            var1.addFirst(class04469);
         }
      }
   }

   @Nullable
   public class04469 N(int var1) {
      return this.L[var1];
   }

   public int N(class04469 var1) {
      for (int i = 0; i < this.L.length; i++) {
         if (var1.equals(this.L[i])) {
            return i;
         }
      }

      return -1;
   }

   public static class03397 N() {
      return new class03397(128);
   }
}
