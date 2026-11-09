package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public class class02359 extends class00453 {
   public static final MapCodec<class02359> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02826.N(Codec.string(0, 32)).optionalFieldOf("title").forGetter(var0x -> var0x.L),
               Codec.STRING.optionalFieldOf("author").forGetter(var0x -> var0x.y),
               class06338.N(0, 3).optionalFieldOf("generation").forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class02359::new)
   );
   private final Optional<String> y;
   private final Optional<class02826<String>> L;
   private final Optional<Integer> u;

   public class02359(List<class05957> var1, Optional<class02826<String>> var2, Optional<String> var3, Optional<Integer> var4) {
      super(var1);
      this.y = var3;
      this.L = var2;
      this.u = var4;
   }

   @Override
   public class05959<class02359> N() {
      return class07439.H;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.NL, class02706.N, this::N);
      return var1;
   }

   private class02706 N(class02706 var1) {
      return new class02706(this.L.orElseGet(var1::u), this.y.orElseGet(var1::i), this.u.orElseGet(var1::R), var1.N(), var1.M());
   }
}
