package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor;

class class00735<T> implements class00752<T>, SimpleRegistryTagLookup2Accessor {
   @Override
   public Stream<class03552<T>> L() {
      return this.N.values().stream();
   }

   class00735(Map var1) {
      this.N = var1;
      super();
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public Optional<class03552<T>> N(class03530<T> var1) {
      return Optional.ofNullable((class03552<T>)this.N.get(var1));
   }

   @Override
   public void N(BiConsumer<? super class03530<T>, ? super class03552<T>> var1) {
      this.N.forEach(var1);
   }
}
