package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08940<T>(List<T> values, class08895 model) {

   public class08940(List<T> values, class08895 model) {
      this.values = values;
      this.model = model;
   }

   public class08895 y() {
      return this.model;
   }

   public List<T> N() {
      return this.values;
   }

   public static <T> Codec<class08940<T>> N(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(class06338.y(class06338.N(var0)).fieldOf("when").forGetter(class08940::N), class08913.y.fieldOf("model").forGetter(class08940::y))
            .apply(var1, class08940::new)
      );
   }
}
