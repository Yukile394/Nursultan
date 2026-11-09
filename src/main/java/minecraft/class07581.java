package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07581<T>(int ticks, T value) {
   public class07581(int ticks, T value) {
      super();
      this.ticks = ticks;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public int N() {
      return this.ticks;
   }

   public static <T> Codec<class07581<T>> N(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(class06338.T.fieldOf("ticks").forGetter(class07581::N), var0.fieldOf("value").forGetter(class07581::y))
            .apply(var1, class07581::new)
      );
   }
}
