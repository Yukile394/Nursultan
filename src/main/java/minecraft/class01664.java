package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01664(int width, int height, class01643 border, boolean stretchInner) implements class01650 {
   public static final MapCodec<class01664> L = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class06338.b.fieldOf("width").forGetter(class01664::y),
               class06338.b.fieldOf("height").forGetter(class01664::L),
               class01643.N.fieldOf("border").forGetter(class01664::u),
               Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(class01664::i)
            )
            .apply(var0, class01664::new)
      )
      .validate(class01664::N);

   public int L() {
      return this.height;
   }

   public class01664(int width, int height, class01643 border, boolean stretchInner) {
      super();
      this.width = width;
      this.height = height;
      this.border = border;
      this.stretchInner = stretchInner;
   }

   public boolean i() {
      return this.stretchInner;
   }

   public class01643 u() {
      return this.border;
   }

   public int y() {
      return this.width;
   }

   @Override
   public class01655 N() {
      return class01655.field_45658;
   }

   private static DataResult<class01664> N(class01664 var0) {
      class01643 class01643 = var0.u();
      if (class01643.N() + class01643.L() >= var0.y()) {
         return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + class01643.N() + " + " + class01643.L() + " >= " + var0.y());
      } else {
         return class01643.y() + class01643.u() >= var0.L()
            ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + class01643.y() + " + " + class01643.u() + " >= " + var0.L())
            : DataResult.success(var0);
      }
   }
}
