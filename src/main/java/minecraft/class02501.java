package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02501<T>(List<T> value, class02489 operation) {
   public class02501(List<T> value, class02489 operation) {
      this.value = value;
      this.operation = operation;
   }

   public class02489 y() {
      return this.operation;
   }

   public List<T> N(List<T> var1) {
      return this.operation.N(var1, this.value);
   }

   public List<T> N() {
      return this.value;
   }

   public static <T> Codec<class02501<T>> N(Codec<T> var0, int var1) {
      return RecordCodecBuilder.create(
         var2 -> var2.group(
               var0.sizeLimitedListOf(var1).fieldOf("values").forGetter(var0xx -> var0xx.value), class02489.N(var1).forGetter(var0xx -> var0xx.operation)
            )
            .apply(var2, class02501::new)
      );
   }
}
