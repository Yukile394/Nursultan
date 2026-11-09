package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public final class class01017 extends class04748 {
   public static final class02216 N = class02216.y;
   public static final class02610 y = class02610.field_52238;
   public static final int R = 128;
   public static final int M = 0;
   public static final int B = 20;
   public static final MapCodec<class01017> Z = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               N(var0),
               class05281.y.fieldOf("start_pool").forGetter(var0x -> var0x.z),
               class01894.N.optionalFieldOf("start_jigsaw_name").forGetter(var0x -> var0x.U),
               Codec.intRange(0, 20).fieldOf("size").forGetter(var0x -> var0x.E),
               class03855.L.fieldOf("start_height").forGetter(var0x -> var0x.W),
               Codec.BOOL.fieldOf("use_expansion_hack").forGetter(var0x -> var0x.m),
               class07830.field_24772.optionalFieldOf("project_start_to_heightmap").forGetter(var0x -> var0x.P),
               class01031.N.fieldOf("max_distance_from_center").forGetter(var0x -> var0x.s),
               Codec.list(class03129.y).optionalFieldOf("pool_aliases", List.of()).forGetter(var0x -> var0x.T),
               class02216.N.optionalFieldOf("dimension_padding", N).forGetter(var0x -> var0x.b),
               class02610.field_52239.optionalFieldOf("liquid_settings", y).forGetter(var0x -> var0x.j)
            )
            .apply(var0, class01017::new)
      )
      .validate(class01017::N);
   private final class03556<class05281> z;
   private final Optional<class01894> U;
   private final int E;
   private final class03855 W;
   private final boolean m;
   private final Optional<class07830> P;
   private final class01031 s;
   private final List<class03129> T;
   private final class02216 b;
   private final class02610 j;

   public List<class03129> M() {
      return this.T;
   }

   public class01017(class04758 var1, class03556<class05281> var2, int var3, class03855 var4, boolean var5) {
      this(var1, var2, Optional.empty(), var3, var4, var5, Optional.empty(), new class01031(80), List.of(), N, y);
   }

   public class01017(class04758 var1, class03556<class05281> var2, int var3, class03855 var4, boolean var5, class07830 var6) {
      this(var1, var2, Optional.empty(), var3, var4, var5, Optional.of(var6), new class01031(80), List.of(), N, y);
   }

   public class01017(
      class04758 var1,
      class03556<class05281> var2,
      Optional<class01894> var3,
      int var4,
      class03855 var5,
      boolean var6,
      Optional<class07830> var7,
      class01031 var8,
      List<class03129> var9,
      class02216 var10,
      class02610 var11
   ) {
      super(var1);
      this.z = var2;
      this.U = var3;
      this.E = var4;
      this.W = var5;
      this.m = var6;
      this.P = var7;
      this.s = var8;
      this.T = var9;
      this.b = var10;
      this.j = var11;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class07321 class07321 = var1.B();
      int i = this.W.N(var1.R(), new class06057(var1.y(), var1.Z()));
      class07209 class07209 = new class07209(class07321.i(), i, class07321.R());
      return class04848.N(var1, this.z, this.U, this.E, class07209, this.m, this.P, this.s, class03098.N(this.T, class07209, var1.M()), this.b, this.j);
   }

   @Override
   public class04367<?> N() {
      return class04367.R;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static DataResult<class01017> N(class01017 var0) {
      byte b0 = switch (var0.i()) {
         case field_28922 -> 0;
         case field_28923, field_38431, field_38432, field_51413 -> 12;
      };
      return var0.s.N() + b0 > 128
         ? DataResult.error(() -> "Horizontal structure size including terrain adaptation must not exceed 128")
         : DataResult.success(var0);
   }

   public class03556<class05281> R() {
      return this.z;
   }
}
