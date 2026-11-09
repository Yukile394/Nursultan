package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class07318(Optional<class00759> predicate) implements class05957 {
   public static final MapCodec<class07318> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00759.N.optionalFieldOf("predicate").forGetter(class07318::L)).apply(var0, class07318::new)
   );

   public Optional<class00759> L() {
      return this.predicate;
   }

   public class07318(Optional<class00759> predicate) {
      this.predicate = predicate;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.B, class06551.i);
   }

   public boolean test(class05908 var1) {
      class07072 class07072 = var1.L(class06551.i);
      class06889 class06889 = var1.L(class06551.B);
      return class06889 != null && class07072 != null ? this.predicate.isEmpty() || this.predicate.get().N(var1.u(), class06889, class07072) : false;
   }

   @Override
   public class05955 N() {
      return class07693.W;
   }

   public static class05952 N(class00789 var0) {
      return () -> new class07318(Optional.of(var0.y()));
   }
}
