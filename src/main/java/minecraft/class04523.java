package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import org.slf4j.Logger;

public record class04523<T>(T value, int weight) {
   private static final Logger L = LogUtils.getLogger();

   public class04523(T value, int weight) {
      if (weight < 0) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException("Weight should be >= 0"));
      } else {
         if (weight == 0 && class07529.ND) {
            L.warn("Found 0 weight, make sure this is intentional!");
         }

         this.value = (T)value;
         this.weight = weight;
      }
   }

   public int y() {
      return this.weight;
   }

   public T N() {
      return this.value;
   }

   public static <E> Codec<class04523<E>> N(MapCodec<E> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(var0.forGetter(class04523::N), class06338.T.fieldOf("weight").forGetter(class04523::y)).apply(var1, class04523::new)
      );
   }

   public static <B extends ByteBuf, T> class02362<B, class04523<T>> N(class02362<B, T> var0) {
      return class02362.N(var0, class04523::N, class02389.B, class04523::y, class04523::new);
   }

   public static <E> Codec<class04523<E>> N(Codec<E> var0) {
      return N(var0.fieldOf("data"));
   }

   public <U> class04523<U> N(Function<T, U> var1) {
      return (class04523<U>)(new class04523<>(var1.apply(this.N()), this.weight));
   }
}
