package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public record class03505(float x, float y) {
   public static final class03505 L = new class03505(0.0F, 0.0F);
   public static final Codec<class03505> u = Codec.floatRange(-512.0F, 512.0F)
      .listOf()
      .comapFlatMap(var0 -> class07536.N(var0, 2).map(var0x -> new class03505((Float)var0x.get(0), (Float)var0x.get(1))), var0 -> List.of(var0.x, var0.y));

   public class03505(float x, float y) {
      this.x = x;
      this.y = y;
   }

   public float N() {
      return this.x;
   }
}
