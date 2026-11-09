package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.OptionalInt;

public record class01643(int left, int top, int right, int bottom) {
   private static final Codec<class01643> R = class06338.b.flatComapMap(var0 -> new class01643(var0, var0, var0, var0), var0 -> {
      OptionalInt optionalint = var0.i();
      return optionalint.isPresent() ? DataResult.success(optionalint.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
   });
   private static final Codec<class01643> M = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.fieldOf("left").forGetter(class01643::N),
            class06338.T.fieldOf("top").forGetter(class01643::y),
            class06338.T.fieldOf("right").forGetter(class01643::L),
            class06338.T.fieldOf("bottom").forGetter(class01643::u)
         )
         .apply(var0, class01643::new)
   );
   static final Codec<class01643> N = Codec.either(R, M).xmap(Either::unwrap, var0 -> var0.i().isPresent() ? Either.left(var0) : Either.right(var0));

   public int L() {
      return this.right;
   }

   public class01643(int left, int top, int right, int bottom) {
      this.left = left;
      this.top = top;
      this.right = right;
      this.bottom = bottom;
   }

   private OptionalInt i() {
      return this.N() == this.y() && this.y() == this.L() && this.L() == this.u() ? OptionalInt.of(this.N()) : OptionalInt.empty();
   }

   public int u() {
      return this.bottom;
   }

   public int y() {
      return this.top;
   }

   public int N() {
      return this.left;
   }
}
