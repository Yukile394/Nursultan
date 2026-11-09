package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public record class00355(class07030 kind, Optional<class01894> textureOverride, float animation) implements class00335 {
   public static final MapCodec<class00355> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07030.y.fieldOf("kind").forGetter(class00355::y),
            class01894.N.optionalFieldOf("texture").forGetter(class00355::L),
            Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(class00355::u)
         )
         .apply(var0, class00355::new)
   );

   public Optional<class01894> L() {
      return this.textureOverride;
   }

   public class00355(class07030 var1) {
      this(var1, Optional.empty(), 0.0F);
   }

   public class00355(class07030 kind, Optional<class01894> textureOverride, float animation) {
      super();
      this.kind = kind;
      this.textureOverride = textureOverride;
      this.animation = animation;
   }

   public float u() {
      return this.animation;
   }

   public class07030 y() {
      return this.kind;
   }

   @Override
   public MapCodec<class00355> N() {
      return N;
   }

   @Nullable
   @Override
   public class00368<?> N(class00331 var1) {
      class01097 class01097 = class03359.N(var1.y(), this.kind);
      class01894 class01894 = this.textureOverride
         .<class01894>map(var0 -> var0.N((UnaryOperator<String>)(var0x -> "textures/entity/" + var0x + ".png")))
         .orElse(null);
      if (class01097 == null) {
         return null;
      } else {
         class07311 class07311 = class03359.N(this.kind, class01894);
         return new class00352(class01097, this.animation, class07311);
      }
   }
}
