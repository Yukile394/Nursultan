package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00601(float value, float alpha) {
   private static final Codec<class00601> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.FLOAT.fieldOf("value").forGetter(class00601::N), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("alpha", 1.0F).forGetter(class00601::y)
         )
         .apply(var0, class00601::new)
   );
   public static final Codec<class00601> N = Codec.either(Codec.FLOAT, u)
      .xmap(var0 -> (class00601)var0.map(class00601::new, var0x -> var0x), var0 -> var0.y() == 1.0F ? Either.left(var0.N()) : Either.right(var0));

   public class00601(float var1) {
      this(var1, 1.0F);
   }

   public class00601(float value, float alpha) {
      super();
      this.value = value;
      this.alpha = alpha;
   }

   public float y() {
      return this.alpha;
   }

   public float N() {
      return this.value;
   }
}
