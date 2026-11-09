package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01904(float roll) implements class07126 {
   public static final MapCodec<class01904> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.FLOAT.fieldOf("roll").forGetter(var0x -> var0x.roll)).apply(var0, class01904::new)
   );
   public static final class02362<class04247, class01904> y = class02362.N(class02389.E, var0 -> var0.roll, class01904::new);

   public class01904(float roll) {
      this.roll = roll;
   }

   public float N() {
      return this.roll;
   }

   @Override
   public class07103<class01904> method_10295() {
      return class07107.H;
   }
}
