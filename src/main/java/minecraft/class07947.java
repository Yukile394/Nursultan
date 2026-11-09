package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.UUID;

public record class07947(Optional<UUID> id, Optional<String> name) {
   public static final MapCodec<class07947> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01487.u.optionalFieldOf("id").forGetter(class07947::N), Codec.STRING.optionalFieldOf("name").forGetter(class07947::y))
         .apply(var0, class07947::new)
   );

   public class07947(Optional<UUID> id, Optional<String> name) {
      this.id = id;
      this.name = name;
   }

   public Optional<String> y() {
      return this.name;
   }

   public static class07947 N(GameProfile var0) {
      return new class07947(Optional.of(var0.id()), Optional.of(var0.name()));
   }

   public static class07947 N(class08774 var0) {
      return new class07947(Optional.of(var0.N()), Optional.of(var0.y()));
   }

   public Optional<UUID> N() {
      return this.id;
   }

   public static class07947 N(class04770 var0) {
      return N(var0.method_7334());
   }
}
