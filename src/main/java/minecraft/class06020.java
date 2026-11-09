package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06020 implements class06386 {
   public static final Codec<class06020> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00500.N.fieldOf("valid_base_block").forGetter(var0x -> var0x.y),
            class00500.N.fieldOf("stem_state").forGetter(var0x -> var0x.L),
            class00500.N.fieldOf("hat_state").forGetter(var0x -> var0x.u),
            class00500.N.fieldOf("decor_state").forGetter(var0x -> var0x.i),
            class04025.y.fieldOf("replaceable_blocks").forGetter(var0x -> var0x.M),
            Codec.BOOL.fieldOf("planted").orElse(false).forGetter(var0x -> var0x.B)
         )
         .apply(var0, class06020::new)
   );
   public final class00500 y;
   public final class00500 L;
   public final class00500 u;
   public final class00500 i;
   public final class04025 M;
   public final boolean B;

   public class06020(class00500 var1, class00500 var2, class00500 var3, class00500 var4, class04025 var5, boolean var6) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.M = var5;
      this.B = var6;
   }
}
