package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02326 extends class00453 {
   public static final MapCodec<class02326> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class02706.B.fieldOf("pages").forGetter(var0x -> var0x.y), class02489.N.forGetter(var0x -> var0x.L)))
         .apply(var0, class02326::new)
   );
   private final List<class02826<class00392>> y;
   private final class02489 L;

   protected class02326(List<class05957> var1, List<class02826<class00392>> var2, class02489 var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   public class02706 N(class02706 var1) {
      List list = this.L.N(var1.N(), this.y);
      return var1.y(list);
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.NL, class02706.N, this::N);
      return var1;
   }

   @Override
   public class05959<class02326> N() {
      return class07439.c;
   }
}
