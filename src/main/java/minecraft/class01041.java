package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01041 implements class06386 {
   public static final Codec<class01041> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00500.N.fieldOf("target").forGetter(var0x -> var0x.y),
            class00500.N.fieldOf("state").forGetter(var0x -> var0x.L),
            class02142.N(0, 12).fieldOf("radius").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01041::new)
   );
   public final class00500 y;
   public final class00500 L;
   private final class02142 u;

   public class01041(class00500 var1, class00500 var2, class02142 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public class02142 N() {
      return this.u;
   }
}
