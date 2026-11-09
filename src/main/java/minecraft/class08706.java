package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record class08706(class01894 textureId, Optional<class08689> dyeable, boolean usePlayerTexture) {
   public static final Codec<class08706> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.fieldOf("texture").forGetter(class08706::N),
            class08689.N.optionalFieldOf("dyeable").forGetter(class08706::y),
            Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(class08706::L)
         )
         .apply(var0, class08706::new)
   );

   public boolean L() {
      return this.usePlayerTexture;
   }

   public class08706(class01894 var1) {
      this(var1, Optional.empty(), false);
   }

   public class08706(class01894 textureId, Optional<class08689> dyeable, boolean usePlayerTexture) {
      this.textureId = textureId;
      this.dyeable = dyeable;
      this.usePlayerTexture = usePlayerTexture;
   }

   public Optional<class08689> y() {
      return this.dyeable;
   }

   public static class08706 y(class01894 var0, boolean var1) {
      return new class08706(var0, var1 ? Optional.of(new class08689(Optional.empty())) : Optional.empty(), false);
   }

   public class01894 N(class08719 var1) {
      return this.textureId.N((UnaryOperator<String>)(var1x -> "textures/entity/equipment/" + var1.method_15434() + "/" + var1x + ".png"));
   }

   public static class08706 N(class01894 var0, boolean var1) {
      return new class08706(var0, var1 ? Optional.of(new class08689(Optional.of(-6265536))) : Optional.empty(), false);
   }

   public class01894 N() {
      return this.textureId;
   }
}
