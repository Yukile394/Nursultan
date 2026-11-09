package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08721(class03530<class03689> types) {
   public static final Codec<class08721> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03530.y(class04227.yN).fieldOf("types").forGetter(class08721::N)).apply(var0, class08721::new)
   );
   public static final class02362<class04247, class08721> y = class02362.N(class03530.L(class04227.yN), class08721::N, class08721::new);

   public class08721(class03530<class03689> types) {
      super();
      this.types = types;
   }

   public class03530<class03689> N() {
      return this.types;
   }

   public boolean N(class07072 var1) {
      return var1.N(this.types);
   }
}
