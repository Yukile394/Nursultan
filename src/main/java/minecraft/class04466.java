package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public class class04466 extends class00453 {
   public static final MapCodec<class04466> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class03530.y(class04227.yZ).fieldOf("options").forGetter(var0x -> var0x.y)).apply(var0, class04466::new)
   );
   private final class03530<class04449> y;

   private class04466(List<class05957> var1, class03530<class04449> var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      Optional optional = var2.u().method_30349().L(class04227.yZ).N(this.y, var2.y());
      if (optional.isPresent()) {
         var1.N(class02484.NZ, new class08582((class03556<class04449>)optional.get()));
      }

      return var1;
   }

   @Override
   public class05959<class04466> N() {
      return class07439.J;
   }

   public static class00471<?> N(class03530<class04449> var0) {
      return N(var1 -> new class04466(var1, var0));
   }
}
