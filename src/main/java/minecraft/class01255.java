package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01255(class03556<class07376> type, class08088 generator) {
   public static final Codec<class01255> N = RecordCodecBuilder.create(
      var0 -> var0.group(class07376.E.fieldOf("type").forGetter(class01255::N), class08088.N.fieldOf("generator").forGetter(class01255::y))
         .apply(var0, var0.stable(class01255::new))
   );
   public static final class05946<class01255> y = class05946.N(class04227.yI, class01894.y("overworld"));
   public static final class05946<class01255> L = class05946.N(class04227.yI, class01894.y("the_nether"));
   public static final class05946<class01255> u = class05946.N(class04227.yI, class01894.y("the_end"));

   public class01255(class03556<class07376> type, class08088 generator) {
      this.type = type;
      this.generator = generator;
   }

   public class08088 y() {
      return this.generator;
   }

   public class03556<class07376> N() {
      return this.type;
   }
}
