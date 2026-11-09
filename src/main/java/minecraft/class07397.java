package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Objects;
import java.util.Optional;

public record class07397(class07947 player, Optional<class08195> permissionLevel, Optional<Boolean> bypassesPlayerLimit) {
   public static final MapCodec<class07397> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07947.N.codec().fieldOf("player").forGetter(class07397::N),
            class08195.field_63202.optionalFieldOf("permissionLevel").forGetter(class07397::y),
            Codec.BOOL.optionalFieldOf("bypassesPlayerLimit").forGetter(class07397::L)
         )
         .apply(var0, class07397::new)
   );

   public Optional<Boolean> L() {
      return this.bypassesPlayerLimit;
   }

   public class07397(class07947 player, Optional<class08195> permissionLevel, Optional<Boolean> bypassesPlayerLimit) {
      this.player = player;
      this.permissionLevel = permissionLevel;
      this.bypassesPlayerLimit = bypassesPlayerLimit;
   }

   public Optional<class08195> y() {
      return this.permissionLevel;
   }

   public static class07397 N(class01087 var0) {
      return new class07397(class07947.N(Objects.requireNonNull(var0.B())), Optional.of(var0.N().N()), Optional.of(var0.y()));
   }

   public class07947 N() {
      return this.player;
   }
}
