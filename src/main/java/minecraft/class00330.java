package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public record class00330(class03556<class06581> item) implements class00299 {
   public static final MapCodec<class00330> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06581.u.fieldOf("item").forGetter(class00330::y)).apply(var0, class00330::new)
   );
   public static final class02362<class04247, class00330> u = class02362.N(class06581.i, class00330::y, class00330::new);
   public static final class00319<class00330> i = new class00319<>(L, u);

   public class00330(class06581 var1) {
      this(var1.i());
   }

   public class00330(class03556<class06581> item) {
      super();
      this.item = item;
   }

   public class03556<class06581> y() {
      return this.item;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      return var2 instanceof class00287 ? Stream.of((T)((class00287)var2).N(this.item)) : Stream.empty();
   }

   @Override
   public class00319<class00330> N() {
      return i;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.item.N().N(var1);
   }
}
