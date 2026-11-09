package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class00350(float period) implements class06572 {
   public static final MapCodec<class00350> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.t.optionalFieldOf("period", 1.0F).forGetter(class00350::y)).apply(var0, class00350::new)
   );

   public class00350(float period) {
      super();
      this.period = period;
   }

   public float y() {
      return this.period;
   }

   @Override
   public MapCodec<class00350> N() {
      return N;
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      class07438 class07438 = var3 == null ? null : var3.method_72393();
      return class07438 != null && class07438.method_6030() == var1 ? class07438.method_6014() % this.period : 0.0F;
   }
}
