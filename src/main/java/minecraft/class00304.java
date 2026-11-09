package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public record class00304(class03530<class06581> tag) implements class00299 {
   public static final MapCodec<class00304> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03530.N(class04227.F).fieldOf("tag").forGetter(class00304::y)).apply(var0, class00304::new)
   );
   public static final class02362<class04247, class00304> u = class02362.N(class03530.L(class04227.F), class00304::y, class00304::new);
   public static final class00319<class00304> i = new class00319<>(L, u);

   public class00304(class03530<class06581> tag) {
      this.tag = tag;
   }

   public class03530<class06581> y() {
      return this.tag;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      if (var2 instanceof class00287 class00287) {
         class01929 class01929 = var1.L(class00282.y);
         if (class01929 != null) {
            return class01929.y(class04227.F).N(this.tag).map(var1x -> var1x.N().map(class00287::N)).stream().flatMap(var0 -> var0);
         }
      }

      return Stream.empty();
   }

   @Override
   public class00319<class00304> N() {
      return i;
   }
}
