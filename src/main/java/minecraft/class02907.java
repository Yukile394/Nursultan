package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public class class02907 extends class00453 {
   public static final MapCodec<class02907> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class00845.N.fieldOf("item_filter").forGetter(var0x -> var0x.y),
               class07439.L.optionalFieldOf("on_pass").forGetter(var0x -> var0x.L),
               class07439.L.optionalFieldOf("on_fail").forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class02907::new)
   );
   private final class00845 y;
   private final Optional<class08122> L;
   private final Optional<class08122> u;

   class02907(List<class05957> var1, class00845 var2, Optional<class08122> var3, Optional<class08122> var4) {
      super(var1);
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);
      this.L.ifPresent(var1x -> var1x.N(var1.N(new class10419("on_pass"))));
      this.u.ifPresent(var1x -> var1x.N(var1.N(new class10419("on_fail"))));
   }

   @Override
   public class05959<class02907> N() {
      return class07439.t;
   }

   public static class02938 N(class00845 var0) {
      return new class02938(var0);
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      Optional optional = this.y.test(var1) ? this.L : this.u;
      return optional.isPresent() ? ((class08122)optional.get()).apply(var1, var2) : var1;
   }
}
