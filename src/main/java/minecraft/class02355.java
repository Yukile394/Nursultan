package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public class class02355 extends class00453 {
   public static final MapCodec<class02355> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02501.N(class02827.L, 256).optionalFieldOf("explosions").forGetter(var0x -> var0x.L),
               class06338.s.optionalFieldOf("flight_duration").forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class02355::new)
   );
   public static final class02813 y = new class02813(0, List.of());
   private final Optional<class02501<class02827>> L;
   private final Optional<Integer> u;

   protected class02355(List<class05957> var1, Optional<class02501<class02827>> var2, Optional<Integer> var3) {
      super(var1);
      this.L = var2;
      this.u = var3;
   }

   private class02813 N(class02813 var1) {
      return new class02813(this.u.orElseGet(var1::N), this.L.<List<class02827>>map(var1x -> var1x.N(var1.y())).orElse(var1.y()));
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.NT, y, this::N);
      return var1;
   }

   @Override
   public class05959<class02355> N() {
      return class07439.V;
   }
}
