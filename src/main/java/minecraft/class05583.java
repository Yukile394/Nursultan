package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class class05583 implements class06386 {
   public static final Codec<class05583> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04206.i.T().fieldOf("block").flatXmap(class05583::N, DataResult::success).orElse((class08815)class00869.RX).forGetter(var0x -> var0x.y),
            Codec.intRange(1, 64).fieldOf("search_range").orElse(10).forGetter(var0x -> var0x.L),
            Codec.BOOL.fieldOf("can_place_on_floor").orElse(false).forGetter(var0x -> var0x.u),
            Codec.BOOL.fieldOf("can_place_on_ceiling").orElse(false).forGetter(var0x -> var0x.i),
            Codec.BOOL.fieldOf("can_place_on_wall").orElse(false).forGetter(var0x -> var0x.M),
            Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spreading").orElse(0.5F).forGetter(var0x -> var0x.B),
            class03541.N(class04227.Z).fieldOf("can_be_placed_on").forGetter(var0x -> var0x.Z)
         )
         .apply(var0, class05583::new)
   );
   public final class08815 y;
   public final int L;
   public final boolean u;
   public final boolean i;
   public final boolean M;
   public final float B;
   public final class03543<class00891> Z;
   private final ObjectArrayList<class07211> z;

   public class05583(class08815 var1, int var2, boolean var3, boolean var4, boolean var5, float var6, class03543<class00891> var7) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = new ObjectArrayList(6);
      if (var4) {
         this.z.add(class07211.field_11036);
      }

      if (var3) {
         this.z.add(class07211.field_11033);
      }

      if (var5) {
         class07221.field_11062.forEach(this.z::add);
      }
   }

   private static DataResult<class08815> N(class00891 var0) {
      return var0 instanceof class08815 ? DataResult.success((class08815)var0) : DataResult.error(() -> "Growth block should be a multiface spreadeable block");
   }

   public List<class07211> N(class06069 var1, class07211 var2) {
      return class07536.N(this.z.stream().filter(var1x -> var1x != var2), var1);
   }

   public List<class07211> N(class06069 var1) {
      return class07536.N(this.z, var1);
   }
}
