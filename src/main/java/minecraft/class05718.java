package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05718 implements class06386 {
   public static final Codec<class05718> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(0, class07376.L).fieldOf("height").forGetter(var0x -> var0x.y), class00500.N.fieldOf("state").forGetter(var0x -> var0x.L)
         )
         .apply(var0, class05718::new)
   );
   public final int y;
   public final class00500 L;

   public class05718(int var1, class00500 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }
}
