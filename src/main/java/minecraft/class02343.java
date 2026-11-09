package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02343 extends class00453 {
   public static final MapCodec<class02343> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class02699.u.fieldOf("pages").forGetter(var0x -> var0x.y), class02489.N(100).forGetter(var0x -> var0x.L)))
         .apply(var0, class02343::new)
   );
   private final List<class02826<String>> y;
   private final class02489 L;

   protected class02343(List<class05957> var1, List<class02826<String>> var2, class02489 var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   public class02699 N(class02699 var1) {
      List list = this.L.N(var1.N(), this.y, 100);
      return var1.y(list);
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.Ny, class02699.N, this::N);
      return var1;
   }

   @Override
   public class05959<class02343> N() {
      return class07439.X;
   }
}
