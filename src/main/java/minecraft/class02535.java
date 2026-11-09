package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02535(class02538 type, float offset, float scale) {
   public static final MapCodec<class02535> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class02538.field_51725.fieldOf("type").forGetter(class02535::N),
               Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(class02535::y),
               class06338.t.optionalFieldOf("scale", 1.0F).forGetter(class02535::L)
            )
            .apply(var0, class02535::new)
      )
      .validate(
         var0 -> var0.N() == class02538.field_51723 && var0.L() != 1.0F
            ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
            : DataResult.success(var0)
      );

   public float L() {
      return this.scale;
   }

   public class02535(class02538 type, float offset, float scale) {
      this.type = type;
      this.offset = offset;
      this.scale = scale;
   }

   public float y() {
      return this.offset;
   }

   public double N(double var1, double var3, float var5, class06069 var6) {
      return this.type.N(var1, var3, var5 * this.scale, var6) + this.offset;
   }

   public class02538 N() {
      return this.type;
   }
}
