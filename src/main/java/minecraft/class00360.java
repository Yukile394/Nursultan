package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00360(class01894 texture, float openness) implements class00335 {
   public static final MapCodec<class00360> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("texture").forGetter(class00360::y), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(class00360::L))
         .apply(var0, class00360::new)
   );

   public float L() {
      return this.openness;
   }

   public class00360(class01894 var1) {
      this(var1, 0.0F);
   }

   public class00360(class01894 texture, float openness) {
      this.texture = texture;
      this.openness = openness;
   }

   public class01894 y() {
      return this.texture;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      class02443 class02443 = new class02443(var1.y().N(class04802.D));
      class05913 class05913 = class05911.b.N(this.texture);
      return new class00344(var1.L(), class02443, class05913, this.openness);
   }

   @Override
   public MapCodec<class00360> N() {
      return N;
   }
}
