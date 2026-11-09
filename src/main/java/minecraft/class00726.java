package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper;

class class00726<T> implements class01903<T>, TagAliasEnabledRegistryWrapper {
   class00726(class00731 var1, ImmutableMap var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public Stream<class03552<T>> u() {
      return this.N.values().stream();
   }

   @Override
   public Optional<class03552<T>> N(class03530<T> var1) {
      return Optional.ofNullable((class03552<T>)this.N.get(var1));
   }

   @Override
   public class01921<T> N() {
      return this.y;
   }

   public void fabric_loadTagAliases(Map var1) {
      ((TagAliasEnabledRegistryWrapper)this.N()).fabric_loadTagAliases(var1);
   }
}
