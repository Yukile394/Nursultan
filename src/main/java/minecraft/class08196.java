package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class08196 extends class08201 {
   private final LongSet L = new LongOpenHashSet();
   private final int u;
   private final String i;

   @Nullable
   @Override
   protected class06256 L() {
      return this.L.size() < this.u ? super.L() : null;
   }

   public class08196(class08199<Runnable> var1, Executor var2, int var3) {
      super(var1, var2);
      this.u = var3;
      this.i = var1.as_();
   }

   public String u() {
      return this.i + "=[" + this.L.longStream().mapToObj(var0 -> var0 + ":" + new class07321(var0)).collect(Collectors.joining(",")) + "], s=" + this.y;
   }

   @Override
   protected void N(long var1) {
      this.L.remove(var1);
   }

   @Override
   protected void N(class06256 var1) {
      this.L.add(var1.N());
      super.N(var1);
   }
}
