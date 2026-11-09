package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class01121 {
   public final class01471 N;
   public final class01471 y;
   public final class01471 L;
   public final class01471 u;
   public final class01471 i;
   public final List<class00500> R;
   public final class03530<class00891> M;
   public final class03530<class00891> B;
   public static final Codec<class01121> Z = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("filling_provider").forGetter(var0x -> var0x.N),
            class01471.N.fieldOf("inner_layer_provider").forGetter(var0x -> var0x.y),
            class01471.N.fieldOf("alternate_inner_layer_provider").forGetter(var0x -> var0x.L),
            class01471.N.fieldOf("middle_layer_provider").forGetter(var0x -> var0x.u),
            class01471.N.fieldOf("outer_layer_provider").forGetter(var0x -> var0x.i),
            class06338.y(class00500.N.listOf()).fieldOf("inner_placements").forGetter(var0x -> var0x.R),
            class03530.y(class04227.Z).fieldOf("cannot_replace").forGetter(var0x -> var0x.M),
            class03530.y(class04227.Z).fieldOf("invalid_blocks").forGetter(var0x -> var0x.B)
         )
         .apply(var0, class01121::new)
   );

   public class01121(
      class01471 var1,
      class01471 var2,
      class01471 var3,
      class01471 var4,
      class01471 var5,
      List<class00500> var6,
      class03530<class00891> var7,
      class03530<class00891> var8
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
   }
}
