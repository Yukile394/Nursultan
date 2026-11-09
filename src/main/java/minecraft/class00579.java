package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00579 {
   private final Map<class00607<?>, class00597<?>> u = new Reference2ObjectOpenHashMap();
   private final Function<class00607<?>, class00597<?>> i = var1 -> new class00597(this, var1);
   @Nullable
   class07299 N;
   @Nullable
   class06889 y;
   final class00602 L = new class00602();

   public class00579() {
      super();
   }

   public <Value> Value N(class00607<Value> var1, float var2) {
      return (Value)this.u.computeIfAbsent(var1, this.i).N(var1, var2);
   }

   public void N(class07299 var1, class06889 var2) {
      this.N = var1;
      this.y = var2;
      this.u.values().removeIf(class00597::N);
      this.L.N();
      class00618.N(var2.L(0.25), var1.method_22385()::N, (var1x, var3) -> this.L.N(var1x, var3.N().R()));
   }

   public void N() {
      this.N = null;
      this.y = null;
      this.L.N();
      this.u.clear();
   }
}
