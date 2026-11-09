package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record class07245(Object2IntMap<class04907<?>> stats) implements class00381<class07280> {
   private static final class02362<class04247, Object2IntMap<class04907<?>>> L = class02389.N(Object2IntOpenHashMap::new, class04907.P, class02389.B);
   public static final class02362<class04247, class07245> N = L.N_10(class07245::new, class07245::N);

   public class07245(Object2IntMap<class04907<?>> stats) {
      super();
      this.stats = (Object2IntMap<class04907<?>>)stats;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public Object2IntMap<class04907<?>> N() {
      return this.stats;
   }

   @Override
   public class02897<class07245> method_65080() {
      return class04248.i;
   }
}
