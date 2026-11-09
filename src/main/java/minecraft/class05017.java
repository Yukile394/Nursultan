package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;

public abstract class class05017<M extends class05017<M>> {
   private static final int y = 2;
   private final long[] L = new long[2];
   private final class00536[] u = new class00536[2];
   private boolean i;
   protected final Long2ObjectOpenHashMap<class00536> N;

   @Nullable
   public class00536 L(long var1) {
      if (this.i) {
         for (int ix = 0; ix < 2; ix++) {
            if (var1 == this.L[ix]) {
               return this.u[ix];
            }
         }
      }

      class00536 class00536 = (class00536)this.N.get(var1);
      if (class00536 == null) {
         return null;
      } else {
         if (this.i) {
            for (int j = 1; j > 0; j--) {
               this.L[j] = this.L[j - 1];
               this.u[j] = this.u[j - 1];
            }

            this.L[0] = var1;
            this.u[0] = class00536;
         }

         return class00536;
      }
   }

   public void L() {
      for (int ix = 0; ix < 2; ix++) {
         this.L[ix] = Long.MAX_VALUE;
         this.u[ix] = null;
      }
   }

   protected class05017(Long2ObjectOpenHashMap<class00536> var1) {
      super();
      this.N = var1;
      this.L();
      this.i = true;
   }

   @Nullable
   public class00536 u(long var1) {
      return (class00536)this.N.remove(var1);
   }

   public void u() {
      this.i = false;
   }

   public abstract M y();

   public boolean y(long var1) {
      return this.N.containsKey(var1);
   }

   public class00536 N(long var1) {
      class00536 class00536 = ((class00536)this.N.get(var1)).y();
      this.N.put(var1, class00536);
      this.L();
      return class00536;
   }

   public void N(long var1, class00536 var3) {
      this.N.put(var1, var3);
   }
}
