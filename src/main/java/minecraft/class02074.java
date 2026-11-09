package minecraft;

import Nursultan.class09558;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class02074 implements class01929 {
   class02074(Map var1) {
      super();
      this.N = var1;
   }

   @Override
   public Stream<class05946<? extends class00751<?>>> y() {
      return this.N.keySet().stream();
   }

   @Override
   public <V> class03519<V> N(DynamicOps<V> var1) {
      return class03519.N(var1, new class09558(this));
   }

   public <T> Optional<class04132<T>> N(class05946<? extends class00751<? extends T>> var1) {
      return Optional.ofNullable((class04132<T>)this.N.get(var1));
   }

   @Override
   public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1) {
      return this.N(var1).map(class04132::N);
   }
}
