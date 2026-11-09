package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class00334(boolean remaining) implements class06572 {
   public static final MapCodec<class00334> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(class00334::y)).apply(var0, class00334::new)
   );

   public class00334(boolean remaining) {
      super();
      this.remaining = remaining;
   }

   public boolean y() {
      return this.remaining;
   }

   @Override
   public MapCodec<class00334> N() {
      return N;
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      class07438 class07438 = var3 == null ? null : var3.method_72393();
      if (class07438 != null && class07438.method_6030() == var1) {
         return this.remaining ? class07438.method_6014() : N(var1, class07438);
      } else {
         return 0.0F;
      }
   }

   public static int N(class06584 var0, class07438 var1) {
      return var0.N(var1) - var1.method_6014();
   }
}
