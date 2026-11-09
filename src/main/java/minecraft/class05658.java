package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05658 implements class06262 {
   static final Logger N = LogUtils.getLogger();
   private final class08280 L;
   private final class03475<class05656> u;

   class05658(class08280 var1, class03475<class05656> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void close() {
      this.L.close();
   }

   @Override
   public IntSet N() {
      return IntSets.unmodifiable(this.u.y());
   }

   @Nullable
   @Override
   public class00947 N(int var1) {
      return this.u.N(var1);
   }
}
