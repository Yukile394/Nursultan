package minecraft;

import com.mojang.serialization.Lifecycle;

record class02082<T>(T value, Lifecycle lifecycle) {

   class02082(T value, Lifecycle lifecycle) {
      super();
      this.value = (T)value;
      this.lifecycle = lifecycle;
   }

   public Lifecycle y() {
      return this.lifecycle;
   }

   public T N() {
      return this.value;
   }
}
