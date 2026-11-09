package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class06191 implements class06386 {
   public static final Codec<class06191> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.list(class06209.N).fieldOf("targets").forGetter(var0x -> var0x.y),
            Codec.intRange(0, 64).fieldOf("size").forGetter(var0x -> var0x.L),
            Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class06191::new)
   );
   public final List<class06209> y;
   public final int L;
   public final float u;

   public class06191(class05261 var1, class00500 var2, int var3) {
      this(ImmutableList.of(new class06209(var1, var2)), var3, 0.0F);
   }

   public class06191(class05261 var1, class00500 var2, int var3, float var4) {
      this(ImmutableList.of(new class06209(var1, var2)), var3, var4);
   }

   public class06191(List<class06209> var1, int var2) {
      this(var1, var2, 0.0F);
   }

   public class06191(List<class06209> var1, int var2, float var3) {
      super();
      this.L = var2;
      this.y = var1;
      this.u = var3;
   }

   public static class06209 N(class05261 var0, class00500 var1) {
      return new class06209(var0, var1);
   }
}
