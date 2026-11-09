package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class00374() implements class00372<class07070> {
   public static final Codec<class07070> N = class07070.field_45121;
   public static final class00336<class00374, class07070> y = class00336.N(MapCodec.unit(new class00374()), N);

   public class00374() {
   }

   @Override
   public Codec<class07070> y() {
      return N;
   }

   @Override
   public class00336<class00374, class07070> N() {
      return y;
   }

   @Nullable
   public class07070 y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var3 == null ? null : var3.method_6068();
   }
}
