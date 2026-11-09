package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class08531 implements class06386 {
   public static final Codec<class08531> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("trunk_provider").forGetter(var0x -> var0x.y),
            class02142.N(0, 16).fieldOf("log_length").forGetter(var0x -> var0x.L),
            class01474.y.listOf().fieldOf("stump_decorators").forGetter(var0x -> var0x.u),
            class01474.y.listOf().fieldOf("log_decorators").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class08531::new)
   );
   public final class01471 y;
   public final class02142 L;
   public final List<class01474> u;
   public final List<class01474> i;

   protected class08531(class01471 var1, class02142 var2, List<class01474> var3, List<class01474> var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }
}
