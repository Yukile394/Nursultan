package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class08611 extends class00453 {
   public static final MapCodec<class08611> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class06339.N.fieldOf("levels").forGetter(var0x -> var0x.y), class03541.N(class04227.yR).optionalFieldOf("options").forGetter(var0x -> var0x.L)
            )
         )
         .apply(var0, class08611::new)
   );
   private final class06378 y;
   private final Optional<class03543<class07304>> L;

   class08611(List<class05957> var1, class06378 var2, Optional<class03543<class07304>> var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.y();
   }

   public static class08619 N(class01929 var0, class06378 var1) {
      return new class08619(var1).N(var0.y(class04227.yR).y(class02625.m));
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class06069 class06069 = var2.y();
      class01042 class01042 = var2.u().method_30349();
      return class07323.N(class06069, var1, this.y.N(var2), class01042, this.L);
   }

   @Override
   public class05959<class08611> N() {
      return class07439.M;
   }
}
