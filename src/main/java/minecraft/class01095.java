package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class01095 extends class00453 {
   public static final MapCodec<class01095> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class02708.u.fieldOf("patterns").forGetter(var0x -> var0x.y), Codec.BOOL.fieldOf("append").forGetter(var0x -> var0x.L)))
         .apply(var0, class01095::new)
   );
   private final class02708 y;
   private final boolean L;

   class01095(List<class05957> var1, class02708 var2, boolean var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   @Override
   public class05959<class01095> N() {
      return class07439.g;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      if (this.L) {
         var1.N(class02484.Nv, class02708.L, this.y, (var0, var1x) -> new class02701().N(var0).N(var1x).N());
      } else {
         var1.N(class02484.Nv, this.y);
      }

      return var1;
   }

   public static class01123 N(boolean var0) {
      return new class01123(var0);
   }
}
