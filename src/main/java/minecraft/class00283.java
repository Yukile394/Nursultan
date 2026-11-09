package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;

public record class00283(List<class00299> contents) implements class00299 {
   public static final MapCodec<class00283> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00299.N.listOf().fieldOf("contents").forGetter(class00283::y)).apply(var0, class00283::new)
   );
   public static final class02362<class04247, class00283> u = class02362.N(class00299.y.N_33(class02389.N()), class00283::y, class00283::new);
   public static final class00319<class00283> i = new class00319<>(L, u);

   public class00283(List<class00299> contents) {
      this.contents = contents;
   }

   public List<class00299> y() {
      return this.contents;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      return this.contents.stream().flatMap(var2x -> var2x.N(var1, var2));
   }

   @Override
   public boolean N(class03767 var1) {
      return this.contents.stream().allMatch(var1x -> var1x.N(var1));
   }

   @Override
   public class00319<class00283> N() {
      return i;
   }
}
