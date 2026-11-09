package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Predicate;

public record class02620<T, P extends Predicate<T>>(P test, class00836 count) {
   public class02620(P test, class00836 count) {
      this.test = (P)test;
      this.count = count;
   }

   public class00836 y() {
      return this.count;
   }

   public P N() {
      return this.test;
   }

   public static <T, P extends Predicate<T>> Codec<class02620<T, P>> N(Codec<P> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(var0.fieldOf("test").forGetter(class02620::N), class00836.u.fieldOf("count").forGetter(class02620::y)).apply(var1, class02620::new)
      );
   }

   public boolean N(Iterable<T> var1) {
      int i = 0;

      for (Object object : var1) {
         if (this.test.test((T)object)) {
            i++;
         }
      }

      return this.count.u(i);
   }
}
