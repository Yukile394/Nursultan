package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Function;

public record class02216(int bottom, int top) {
   private static final Codec<class02216> i = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.lenientOptionalFieldOf("bottom", 0).forGetter(var0x -> var0x.bottom),
            class06338.T.lenientOptionalFieldOf("top", 0).forGetter(var0x -> var0x.top)
         )
         .apply(var0, class02216::new)
   );
   public static final Codec<class02216> N = Codec.either(class06338.T, i)
      .xmap(var0 -> (class02216)var0.map(class02216::new, Function.identity()), var0 -> var0.N() ? Either.left(var0.bottom) : Either.right(var0));
   public static final class02216 y = new class02216(0);

   public int L() {
      return this.top;
   }

   public class02216(int var1) {
      this(var1, var1);
   }

   public class02216(int bottom, int top) {
      super();
      this.bottom = bottom;
      this.top = top;
   }

   public int y() {
      return this.bottom;
   }

   public boolean N() {
      return this.top == this.bottom;
   }
}
