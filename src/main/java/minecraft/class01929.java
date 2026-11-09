package minecraft;

import Nursultan.class09547;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface class01929 extends class02063 {
   default Stream<class01921<?>> L() {
      return this.y().map(this::y);
   }

   default Lifecycle u() {
      return this.L().map(class01921::R).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   Stream<class05946<? extends class00751<?>>> y();

   default <T> class01921<T> y(class05946<? extends class00751<? extends T>> var1) {
      return this.method_46759((class05946<? extends class00751<?>>)var1).orElseThrow(() -> new IllegalStateException("Registry " + var1.N() + " not found"));
   }

   static class01929 N(Stream<class01921<?>> var0) {
      Map map = var0.collect(Collectors.toUnmodifiableMap(class01921::i, var0x -> (class01921)var0x));
      return new class09547(map);
   }

   default <V> class03519<V> N(DynamicOps<V> var1) {
      return class03519.N(var1, this);
   }

   @Override
   <T> Optional<? extends class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1);
}
