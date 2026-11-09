package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public record class07602(float x1, float y1, float x2, float y2) {
   public static final Codec<class07602> i = Codec.FLOAT
      .listOf(4, 4)
      .xmap(
         var0 -> new class07602((Float)var0.get(0), (Float)var0.get(1), (Float)var0.get(2), (Float)var0.get(3)),
         var0 -> List.of(var0.x1, var0.y1, var0.x2, var0.y2)
      )
      .validate(class07602::i);

   public float L() {
      return this.x2;
   }

   public class07602(float x1, float y1, float x2, float y2) {
      super();
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }

   private DataResult<class07602> i() {
      if (this.x1 < 0.0F || this.x1 > 1.0F) {
         return DataResult.error(() -> "x1 must be in range [0; 1]");
      } else {
         return !(this.x2 < 0.0F) && !(this.x2 > 1.0F) ? DataResult.success(this) : DataResult.error(() -> "x2 must be in range [0; 1]");
      }
   }

   public float u() {
      return this.y2;
   }

   public float y() {
      return this.y1;
   }

   public float N() {
      return this.x1;
   }
}
