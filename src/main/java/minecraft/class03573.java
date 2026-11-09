package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.stream.Collectors;

public class class03573 {
   public static final Codec<class03573> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03562.i.fieldOf("preset").forGetter(var0x -> var0x.L), class03519.L(class04227.NA)).apply(var0, class03573::new)
   );
   public static final Codec<class03556<class03573>> y = class01281.N(class04227.yU, N);
   private final class03562 L;
   private final class03221<class03556<class00780>> u;

   public class03573(class03562 var1, class02055<class00780> var2) {
      super();
      this.L = var1;
      this.u = var1.L().N(var2::y);
   }

   public static Map<class03562, class03221<class05946<class00780>>> y() {
      return class03562.u.values().stream().collect(Collectors.toMap(var0 -> (class03562)var0, var0 -> var0.L().N(var0x -> var0x)));
   }

   public class03221<class03556<class00780>> N() {
      return this.u;
   }
}
