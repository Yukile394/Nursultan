package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08565(float horizontalBlockingAngle, Optional<class03543<class03689>> type, float base, float factor) {
   public static final Codec<class08565> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.t.optionalFieldOf("horizontal_blocking_angle", 90.0F).forGetter(class08565::N),
            class03541.N(class04227.yN).optionalFieldOf("type").forGetter(class08565::y),
            Codec.FLOAT.fieldOf("base").forGetter(class08565::L),
            Codec.FLOAT.fieldOf("factor").forGetter(class08565::u)
         )
         .apply(var0, class08565::new)
   );
   public static final class02362<class04247, class08565> y = class02362.N(
      class02389.E,
      class08565::N,
      class02389.L(class04227.yN).N_33(class02389::N),
      class08565::y,
      class02389.E,
      class08565::L,
      class02389.E,
      class08565::u,
      class08565::new
   );

   public float L() {
      return this.base;
   }

   public class08565(float horizontalBlockingAngle, Optional<class03543<class03689>> type, float base, float factor) {
      this.horizontalBlockingAngle = horizontalBlockingAngle;
      this.type = type;
      this.base = base;
      this.factor = factor;
   }

   public float u() {
      return this.factor;
   }

   public Optional<class03543<class03689>> y() {
      return this.type;
   }

   public float N() {
      return this.horizontalBlockingAngle;
   }

   public float N(class07072 var1, float var2, double var3) {
      if (var3 > (float) (Math.PI / 180.0) * this.horizontalBlockingAngle) {
         return 0.0F;
      } else {
         return this.type.isPresent() && !this.type.get().N(var1.E()) ? 0.0F : class04995.N(this.base + this.factor * var2, 0.0F, var2);
      }
   }
}
