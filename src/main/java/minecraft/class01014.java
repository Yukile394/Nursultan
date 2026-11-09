package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationMarker;

public class class01014 implements class01042, BiomeModificationMarker {
   private final Map<? extends class05946<? extends class00751<?>>, ? extends class00751<?>> L;
   private boolean u;

   public class01014(Stream<class01012<?>> var1) {
      super();
      this.L = var1.collect(ImmutableMap.toImmutableMap(class01012::N, class01012::y));
   }

   public class01014(Map<? extends class05946<? extends class00751<?>>, ? extends class00751<?>> var1) {
      super();
      this.L = Map.copyOf(var1);
   }

   public class01014(List<? extends class00751<?>> var1) {
      super();
      this.L = var1.stream().collect(Collectors.toUnmodifiableMap(class00751::i, var0 -> (class00751<?>)var0));
   }

   public void fabric_markModified() {
      if (this.u) {
         throw new IllegalStateException("This dynamic registries instance has already been modified");
      } else {
         this.u = true;
      }
   }

   @Override
   public <E> Optional<class00751<E>> method_46759(class05946<? extends class00751<? extends E>> var1) {
      return Optional.ofNullable(this.L.get(var1)).map(var0 -> (class00751<E>)var0);
   }

   @Override
   public Stream<class01012<?>> method_40311() {
      return this.L.entrySet().stream().map(class01012::N);
   }
}
