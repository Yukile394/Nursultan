package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02685(class03556<class02195> type, double x, double z, float rotation) {
   public static final Codec<class02685> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02195.y.fieldOf("type").forGetter(class02685::N),
            Codec.DOUBLE.fieldOf("x").forGetter(class02685::y),
            Codec.DOUBLE.fieldOf("z").forGetter(class02685::L),
            Codec.FLOAT.fieldOf("rotation").forGetter(class02685::u)
         )
         .apply(var0, class02685::new)
   );

   public double L() {
      return this.z;
   }

   public class02685(class03556<class02195> type, double x, double z, float rotation) {
      super();
      this.type = type;
      this.x = x;
      this.z = z;
      this.rotation = rotation;
   }

   public float u() {
      return this.rotation;
   }

   public double y() {
      return this.x;
   }

   public class03556<class02195> N() {
      return this.type;
   }
}
