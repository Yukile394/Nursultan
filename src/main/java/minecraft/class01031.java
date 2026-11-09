package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Function;

public record class01031(int horizontal, int vertical) {
   private static final Codec<Integer> u = Codec.intRange(1, 128);
   private static final Codec<class01031> i = RecordCodecBuilder.create(
      var0 -> var0.group(
            u.fieldOf("horizontal").forGetter(class01031::N), class06338.N(1, class07376.L).optionalFieldOf("vertical", class07376.L).forGetter(class01031::y)
         )
         .apply(var0, class01031::new)
   );
   public static final Codec<class01031> N = Codec.either(i, u)
      .xmap(
         var0 -> (class01031)var0.map(Function.identity(), class01031::new),
         var0 -> var0.horizontal == var0.vertical ? Either.right(var0.horizontal) : Either.left(var0)
      );

   public class01031(int var1) {
      this(var1, var1);
   }

   public class01031(int horizontal, int vertical) {
      super();
      this.horizontal = horizontal;
      this.vertical = vertical;
   }

   public int y() {
      return this.vertical;
   }

   public int N() {
      return this.horizontal;
   }
}
