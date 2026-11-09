package minecraft;

import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03130 {
   private static final Logger field_46904 = LogUtils.getLogger();
   private final Queue<class03950> field_46905;
   private volatile int field_46906;

   public class03130(List<class03950> var1) {
      super();
      this.field_46905 = Queues.newArrayDeque(var1);
      this.field_46906 = this.field_46905.size();
   }

   public int method_54646() {
      return this.field_46906;
   }

   public boolean method_54645() {
      return this.field_46905.isEmpty();
   }

   @Nullable
   public class03950 method_54642() {
      class03950 class03950 = this.field_46905.poll();
      if (class03950 != null) {
         this.field_46906 = this.field_46905.size();
         return class03950;
      } else {
         return null;
      }
   }

   public void method_54644(class03950 var1) {
      this.field_46905.add(var1);
      this.field_46906 = this.field_46905.size();
   }

   public static class03130 method_54643(int var0) {
      int i = Math.max(1, (int)(Runtime.getRuntime().maxMemory() * 0.3) / class03950.N);
      int j = Math.max(1, Math.min(var0, i));
      ArrayList arraylist = new ArrayList(j);

      try {
         for (int k = 0; k < j; k++) {
            arraylist.add(new class03950());
         }
      } catch (OutOfMemoryError outofmemoryerror) {
         field_46904.warn("Allocated only {}/{} buffers", arraylist.size(), j);
         int l = Math.min(arraylist.size() * 2 / 3, arraylist.size() - 1);

         for (int i1 = 0; i1 < l; i1++) {
            ((class03950)arraylist.remove(arraylist.size() - 1)).close();
         }
      }

      return new class03130(arraylist);
   }
}
