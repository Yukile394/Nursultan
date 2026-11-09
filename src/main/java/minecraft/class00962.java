package minecraft;

import com.google.common.collect.EvictingQueue;
import java.util.Iterator;
import java.util.Queue;

public abstract class class00962<P extends class04406> {
   private static final int L = 16384;
   protected final class04410 N;
   protected final Queue<P> y = EvictingQueue.create(16384);

   public int L() {
      return this.y.size();
   }

   public class00962(class04410 var1) {
      super();
      this.N = var1;
   }

   public Queue<P> u() {
      return this.y;
   }

   private void y(class04406 var1) {
      try {
         var1.method_3070();
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Ticking Particle");
         class07074 class07074 = class07080.N("Particle being ticked");
         class07074.N("Particle", var1::toString);
         class07074.N("Particle Type", var1.method_74274()::toString);
         throw new class07878(class07080);
      }
   }

   public void y() {
      if (!this.y.isEmpty()) {
         Iterator iterator = this.y.iterator();

         while (iterator.hasNext()) {
            class04406 class04406 = (class04406)iterator.next();
            this.y(class04406);
            if (!class04406.method_3086()) {
               class04406.method_34019().ifPresent(var1x -> this.N.N(var1x, -1));
               iterator.remove();
            }
         }
      }
   }

   public abstract class00972 N(class01383 var1, class05363 var2, float var3);

   public void N(class04406 var1) {
      this.y.add((P)var1);
   }

   public boolean N() {
      return this.y.isEmpty();
   }
}
