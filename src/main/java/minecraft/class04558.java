package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class04558(class00836 blocksSetOnFire, Optional<class00821> entityStruck) implements class03622 {
   public static final MapCodec<class04558> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00836.u.optionalFieldOf("blocks_set_on_fire", class00836.L).forGetter(class04558::y),
            class00821.N.optionalFieldOf("entity_struck").forGetter(class04558::L)
         )
         .apply(var0, class04558::new)
   );

   public Optional<class00821> L() {
      return this.entityStruck;
   }

   public class04558(class00836 blocksSetOnFire, Optional<class00821> entityStruck) {
      this.blocksSetOnFire = blocksSetOnFire;
      this.entityStruck = entityStruck;
   }

   public class00836 y() {
      return this.blocksSetOnFire;
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      return !(var1 instanceof class00672 class00672)
         ? false
         : this.blocksSetOnFire.u(class00672.y())
            && (this.entityStruck.isEmpty() || class00672.L().anyMatch(var3x -> this.entityStruck.get().N(var2, var3, var3x)));
   }

   public static class04558 N(class00836 var0) {
      return new class04558(var0, Optional.empty());
   }

   @Override
   public MapCodec<class04558> N() {
      return class03631.N;
   }
}
