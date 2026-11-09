package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05302 implements class06386 {
   public static final Codec<class05302> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02142.N(0, 3).fieldOf("reach").forGetter(var0x -> var0x.y), class02142.N(1, 10).fieldOf("height").forGetter(var0x -> var0x.L))
         .apply(var0, class05302::new)
   );
   private final class02142 y;
   private final class02142 L;

   public class05302(class02142 var1, class02142 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class02142 y() {
      return this.L;
   }

   public class02142 N() {
      return this.y;
   }
}
