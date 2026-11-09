package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08421(int index, Optional<Integer> time) {
   public static final Codec<class08421> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.T.fieldOf("index").forGetter(class08421::N), class06338.b.optionalFieldOf("time").forGetter(class08421::y))
         .apply(var0, class08421::new)
   );
   public static final Codec<class08421> y = Codec.either(class06338.T, N)
      .xmap(var0 -> (class08421)var0.map(class08421::new, var0x -> var0x), var0 -> var0.time.isPresent() ? Either.right(var0) : Either.left(var0.index));

   public class08421(int var1) {
      this(var1, Optional.empty());
   }

   public class08421(int index, Optional<Integer> time) {
      super();
      this.index = index;
      this.time = time;
   }

   public Optional<Integer> y() {
      return this.time;
   }

   public int N() {
      return this.index;
   }

   public int N(int var1) {
      return this.time.orElse(var1);
   }
}
