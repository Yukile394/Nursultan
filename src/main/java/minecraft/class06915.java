package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record class06915<T extends class06516>(class06583<T> trigger, T triggerInstance) {
   private static final MapCodec<class06915<?>> u = class06338.N("trigger", "conditions", (Codec<class06583<T>>)class06912.N, class06915::N, class06915::N);
   public static final Codec<class06915<?>> N = u.codec();

   public class06915(class06583<T> trigger, T triggerInstance) {
      super();
      this.trigger = trigger;
      this.triggerInstance = (T)triggerInstance;
   }

   public T y() {
      return this.triggerInstance;
   }

   public class06583<T> N() {
      return this.trigger;
   }

   private static <T extends class06516> Codec<class06915<T>> N(class06583<T> var0) {
      return var0.N().xmap(var1 -> new class06915<>(var0, var1), class06915::y);
   }
}
