package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class class02321 extends class00453 {
   public static final MapCodec<class02321> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02835.field_49322.optionalFieldOf("shape").forGetter(var0x -> var0x.L),
               class02827.y.optionalFieldOf("colors").forGetter(var0x -> var0x.u),
               class02827.y.optionalFieldOf("fade_colors").forGetter(var0x -> var0x.i),
               Codec.BOOL.optionalFieldOf("trail").forGetter(var0x -> var0x.R),
               Codec.BOOL.optionalFieldOf("twinkle").forGetter(var0x -> var0x.B)
            )
         )
         .apply(var0, class02321::new)
   );
   public static final class02827 y = new class02827(class02835.field_7976, IntList.of(), IntList.of(), false, false);
   final Optional<class02835> L;
   final Optional<IntList> u;
   final Optional<IntList> i;
   final Optional<Boolean> R;
   final Optional<Boolean> B;

   public class02321(
      List<class05957> var1, Optional<class02835> var2, Optional<IntList> var3, Optional<IntList> var4, Optional<Boolean> var5, Optional<Boolean> var6
   ) {
      super(var1);
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.B = var6;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.Ns, y, this::N);
      return var1;
   }

   private class02827 N(class02827 var1) {
      return new class02827(
         this.L.orElseGet(var1::N), this.u.orElseGet(var1::y), this.i.orElseGet(var1::L), this.R.orElseGet(var1::u), this.B.orElseGet(var1::i)
      );
   }

   @Override
   public class05959<class02321> N() {
      return class07439.e;
   }
}
