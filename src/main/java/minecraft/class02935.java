package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02935(Optional<class02648<class02824, class02918>> modifiers) implements class02465<class02833> {
   public static final Codec<class02935> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02648.N(class02918.N).optionalFieldOf("modifiers").forGetter(class02935::N)).apply(var0, class02935::new)
   );

   public class02935(Optional<class02648<class02824, class02918>> modifiers) {
      super();
      this.modifiers = modifiers;
   }

   @Override
   public class02477<class02833> y() {
      return class02484.b;
   }

   public boolean N(class02833 var1) {
      return !this.modifiers.isPresent() || this.modifiers.get().test((Iterable<class02824>)var1.y());
   }

   public Optional<class02648<class02824, class02918>> N() {
      return this.modifiers;
   }
}
