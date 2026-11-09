package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map.Entry;

public record class02470<T extends class02500>(class02487<T> type, T predicate) {
   public class02470(class02487<T> type, T predicate) {
      super();
      this.type = type;
      this.predicate = (T)predicate;
   }

   public T y() {
      return this.predicate;
   }

   public class02487<T> N() {
      return this.type;
   }

   static <T extends class02500> MapCodec<class02470<T>> N(class02487<T> var0, Codec<T> var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(var1.fieldOf("value").forGetter(class02470::y)).apply(var2, var1xx -> new class02470<>(var0, var1xx))
      );
   }

   public static <T extends class02500> class02470<T> N(Entry<class02487<?>, T> var0) {
      return new class02470<>((class02487<T>)var0.getKey(), (T)var0.getValue());
   }
}
