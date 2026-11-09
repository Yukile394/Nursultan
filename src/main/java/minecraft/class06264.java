package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06264(class06243 hat) {
   public static final Codec<class06264> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06243.field_55540.optionalFieldOf("hat", class06243.field_17160).forGetter(class06264::N)).apply(var0, class06264::new)
   );
   public static final class02968<class06264> y = new class02968<>("villager", N);

   public class06264(class06243 hat) {
      this.hat = hat;
   }

   public class06243 N() {
      return this.hat;
   }
}
