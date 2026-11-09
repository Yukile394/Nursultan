package minecraft;

import com.mojang.brigadier.StringReader;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class class00156 implements class02350<StringReader> {
   private final Set<String> N = Stream.concat(Stream.of("false", "true"), class00174.i.keySet().stream().map(class00164::N)).collect(Collectors.toSet());

   class00156() {
      super();
   }

   @Override
   public Stream<String> possibleValues(class02325<StringReader> var1) {
      return this.N.stream();
   }
}
