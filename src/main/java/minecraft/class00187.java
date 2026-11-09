package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;

class class00187 implements class03542 {
   class00187(class00191 var1) {
      super();
      this.N = var1;
   }

   @Override
   public <T> Optional<class03515<T>> N(class05946<? extends class00751<? extends T>> var1) {
      return this.N.N.<T>method_46759(var1).map(class03515::N).or(() -> Optional.of(new class03515<>(this.N.y.y(), this.N.y.N(), Lifecycle.experimental())));
   }
}
