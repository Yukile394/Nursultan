package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02913(Optional<class02648<class06584, class00845>> items) implements class02465<class02830> {
   public static final Codec<class02913> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02648.N(class00845.N).optionalFieldOf("items").forGetter(class02913::N)).apply(var0, class02913::new)
   );

   public class02913(Optional<class02648<class06584, class00845>> items) {
      this.items = items;
   }

   @Override
   public class02477<class02830> y() {
      return class02484.D;
   }

   public boolean N(class02830 var1) {
      return !this.items.isPresent() || this.items.get().test(var1.L());
   }

   public Optional<class02648<class06584, class00845>> N() {
      return this.items;
   }
}
