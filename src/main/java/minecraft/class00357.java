package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00357(class01894 texture, float openness, class07211 orientation) implements class00335 {
   public static final MapCodec<class00357> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("texture").forGetter(class00357::y),
            Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(class00357::L),
            class07211.field_29502.optionalFieldOf("orientation", class07211.field_11036).forGetter(class00357::u)
         )
         .apply(var0, class00357::new)
   );

   public float L() {
      return this.openness;
   }

   public class00357(class01894 texture, float openness, class07211 orientation) {
      this.texture = texture;
      this.openness = openness;
      this.orientation = orientation;
   }

   public class00357(class06563 var1) {
      this(class05911.i(var1), 0.0F, class07211.field_11036);
   }

   public class00357() {
      this(class01894.y("shulker"), 0.0F, class07211.field_11036);
   }

   public class07211 u() {
      return this.orientation;
   }

   public class01894 y() {
      return this.texture;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00337(new class03360(var1), this.openness, this.orientation, class05911.n.N(this.texture));
   }

   @Override
   public MapCodec<class00357> N() {
      return N;
   }
}
