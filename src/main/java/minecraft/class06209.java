package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06209 {
   public static final Codec<class06209> N = RecordCodecBuilder.create(
      var0 -> var0.group(class05261.L.fieldOf("target").forGetter(var0x -> var0x.y), class00500.N.fieldOf("state").forGetter(var0x -> var0x.L))
         .apply(var0, class06209::new)
   );
   public final class05261 y;
   public final class00500 L;

   class06209(class05261 var1, class00500 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }
}
