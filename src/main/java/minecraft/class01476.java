package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public class class01476 implements class06386 {
   public static final Codec<class01476> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("trunk_provider").forGetter(var0x -> var0x.y),
            class05291.y.fieldOf("trunk_placer").forGetter(var0x -> var0x.u),
            class01471.N.fieldOf("foliage_provider").forGetter(var0x -> var0x.i),
            class01479.L.fieldOf("foliage_placer").forGetter(var0x -> var0x.M),
            class03647.u.optionalFieldOf("root_placer").forGetter(var0x -> var0x.B),
            class01471.N.fieldOf("dirt_provider").forGetter(var0x -> var0x.L),
            class05054.N.fieldOf("minimum_size").forGetter(var0x -> var0x.Z),
            class01474.y.listOf().fieldOf("decorators").forGetter(var0x -> var0x.z),
            Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(var0x -> var0x.U),
            Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter(var0x -> var0x.E)
         )
         .apply(var0, class01476::new)
   );
   public final class01471 y;
   public final class01471 L;
   public final class05291 u;
   public final class01471 i;
   public final class01479 M;
   public final Optional<class03647> B;
   public final class05054 Z;
   public final List<class01474> z;
   public final boolean U;
   public final boolean E;

   protected class01476(
      class01471 var1,
      class05291 var2,
      class01471 var3,
      class01479 var4,
      Optional<class03647> var5,
      class01471 var6,
      class05054 var7,
      List<class01474> var8,
      boolean var9,
      boolean var10
   ) {
      super();
      this.y = var1;
      this.u = var2;
      this.i = var3;
      this.M = var4;
      this.B = var5;
      this.L = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
      this.E = var10;
   }
}
