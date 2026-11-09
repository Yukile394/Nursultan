package minecraft;

import com.mojang.serialization.Lifecycle;

public record class03515<T>(class02042<T> owner, class02055<T> getter, Lifecycle elementsLifecycle) {
   public Lifecycle L() {
      return this.elementsLifecycle;
   }

   public class03515(class02042<T> owner, class02055<T> getter, Lifecycle elementsLifecycle) {
      super();
      this.owner = owner;
      this.getter = getter;
      this.elementsLifecycle = elementsLifecycle;
   }

   public class02055<T> y() {
      return this.getter;
   }

   public class02042<T> N() {
      return this.owner;
   }

   public static <T> class03515<T> N(class01921<T> var0) {
      return new class03515<>(var0, var0, var0.R());
   }
}
