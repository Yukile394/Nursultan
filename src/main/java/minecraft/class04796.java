package minecraft;

import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class04796(class06378 provider, class05338 range) implements class05957 {
   public static final MapCodec<class04796> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06339.N.fieldOf("value").forGetter(class04796::L), class05338.N.fieldOf("range").forGetter(class04796::u))
         .apply(var0, class04796::new)
   );

   public class06378 L() {
      return this.provider;
   }

   public class04796(class06378 provider, class05338 range) {
      super();
      this.provider = provider;
      this.range = range;
   }

   public class05338 u() {
      return this.range;
   }

   @Override
   public Set<class07491<?>> y() {
      return Sets.union(this.provider.y(), this.range.N());
   }

   public boolean test(class05908 var1) {
      return this.range.y(var1, this.provider.N(var1));
   }

   @Override
   public class05955 N() {
      return class07693.b;
   }

   public static class05952 N(class06378 var0, class05338 var1) {
      return () -> new class04796(var0, var1);
   }
}
