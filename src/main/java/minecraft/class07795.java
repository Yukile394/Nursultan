package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class07795(Optional<class00845> predicate) implements class05957 {
   public static final MapCodec<class07795> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00845.N.optionalFieldOf("predicate").forGetter(class07795::L)).apply(var0, class07795::new)
   );

   public Optional<class00845> L() {
      return this.predicate;
   }

   public class07795(Optional<class00845> predicate) {
      super();
      this.predicate = predicate;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.U);
   }

   public boolean test(class05908 var1) {
      class06584 class06584 = var1.L(class06551.U);
      return class06584 != null && (this.predicate.isEmpty() || this.predicate.get().test(class06584));
   }

   @Override
   public class05955 N() {
      return class07693.z;
   }

   public static class05952 N(class00837 var0) {
      return () -> new class07795(Optional.of(var0.y()));
   }
}
