package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04316 extends class01458 {
   public static final Codec<class04316> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("state_provider").forGetter(var0x -> var0x.y),
            class06338.b.fieldOf("spread_width").forGetter(var0x -> var0x.u),
            class06338.b.fieldOf("spread_height").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class04316::new)
   );
   public final int u;
   public final int i;

   public class04316(class01471 var1, int var2, int var3) {
      super(var1);
      this.u = var2;
      this.i = var3;
   }
}
