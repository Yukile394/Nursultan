package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08832(float temperature, float downfall) implements class08843 {
   public static final MapCodec<class08832> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.N(0.0F, 1.0F).fieldOf("temperature").forGetter(class08832::y), class06338.N(0.0F, 1.0F).fieldOf("downfall").forGetter(class08832::L)
         )
         .apply(var0, class08832::new)
   );

   public float L() {
      return this.downfall;
   }

   public class08832() {
      this(0.5F, 1.0F);
   }

   public class08832(float temperature, float downfall) {
      this.temperature = temperature;
      this.downfall = downfall;
   }

   public float y() {
      return this.temperature;
   }

   @Override
   public MapCodec<class08832> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      return class07287.N(this.temperature, this.downfall);
   }
}
