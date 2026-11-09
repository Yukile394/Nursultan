package minecraft;

import java.util.Optional;

record class04147<T>(class02082<T> value, Optional<class03529<T>> holder) {
   class04147(class02082<T> value, Optional<class03529<T>> holder) {
      this.value = value;
      this.holder = holder;
   }

   public Optional<class03529<T>> y() {
      return this.holder;
   }

   public class02082<T> N() {
      return this.value;
   }
}
