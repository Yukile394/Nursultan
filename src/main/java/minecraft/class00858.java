package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00858(Optional<class05196> player, Optional<class03556<class00891>> block, Optional<class01400> state) implements class01425 {
   public static final Codec<class00858> N = RecordCodecBuilder.create(
         var0 -> var0.group(
               class00821.y.optionalFieldOf("player").forGetter(class00858::N),
               class04206.i.b().optionalFieldOf("block").forGetter(class00858::y),
               class01400.N.optionalFieldOf("state").forGetter(class00858::L)
            )
            .apply(var0, class00858::new)
      )
      .validate(class00858::N);

   public Optional<class01400> L() {
      return this.state;
   }

   public class00858(Optional<class05196> player, Optional<class03556<class00891>> block, Optional<class01400> state) {
      super();
      this.player = player;
      this.block = block;
      this.state = state;
   }

   public Optional<class03556<class00891>> y() {
      return this.block;
   }

   public boolean N(class00500 var1) {
      return this.block.isPresent() && !var1.N(this.block.get()) ? false : !this.state.isPresent() || this.state.get().N(var1);
   }

   public static class06915<class00858> N(class00891 var0) {
      return class06912.i.N(new class00858(Optional.empty(), Optional.of(var0.s()), Optional.empty()));
   }

   private static DataResult<class00858> N(class00858 var0) {
      return var0.block
         .<DataResult<class00858>>flatMap(
            var1 -> var0.state
               .<String>flatMap(var1x -> var1x.N(((class00891)var1.N()).E()))
               .map(var1x -> DataResult.error(() -> "Block" + var1 + " has no property " + var1x))
         )
         .orElseGet(() -> DataResult.success(var0));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
