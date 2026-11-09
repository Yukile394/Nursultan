package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;

public record class00744(float x, float y, float z) {
   public static final Codec<class00744> u = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new class00744((Float)var0x.get(0), (Float)var0x.get(1), (Float)var0x.get(2))),
         var0 -> List.of(var0.N(), var0.y(), var0.L())
      );
   public static final class02362<ByteBuf, class00744> i = new class00722();

   public float L() {
      return this.z;
   }

   public class00744(float x, float y, float z) {
      x = !Float.isInfinite(x) && !Float.isNaN(x) ? x % 360.0F : 0.0F;
      y = !Float.isInfinite(y) && !Float.isNaN(y) ? y % 360.0F : 0.0F;
      z = !Float.isInfinite(z) && !Float.isNaN(z) ? z % 360.0F : 0.0F;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public float N() {
      return this.x;
   }
}
