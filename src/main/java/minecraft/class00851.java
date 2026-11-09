package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class00851(class03556<class00891> block, Optional<class01400> properties) implements class05957 {
   public static final MapCodec<class00851> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(class04206.i.b().fieldOf("block").forGetter(class00851::L), class01400.N.optionalFieldOf("properties").forGetter(class00851::u))
            .apply(var0, class00851::new)
      )
      .validate(class00851::N);

   public class03556<class00891> L() {
      return this.block;
   }

   public class00851(class03556<class00891> block, Optional<class01400> properties) {
      this.block = block;
      this.properties = properties;
   }

   public Optional<class01400> u() {
      return this.properties;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.Z);
   }

   @Override
   public class05955 N() {
      return class07693.Z;
   }

   private static DataResult<class00851> N(class00851 var0) {
      return var0.u()
         .flatMap(var1 -> var1.N(var0.L().N().E()))
         .map(var1 -> DataResult.error(() -> "Block " + var0.L() + " has no property" + var1))
         .orElse(DataResult.success(var0));
   }

   public static class07670 N(class00891 var0) {
      return new class07670(var0);
   }

   public boolean test(class05908 var1) {
      class00500 class00500 = var1.L(class06551.Z);
      return class00500 != null && class00500.N(this.block) && (this.properties.isEmpty() || this.properties.get().N(class00500));
   }
}
