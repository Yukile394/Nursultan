package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08356() implements class00372<class05946<class07078<?>>> {
   public static final Codec<class05946<class07078<?>>> N = class05946.N(class04227.I);
   public static final class00336<class08356, class05946<class07078<?>>> y = class00336.N(MapCodec.unit(new class08356()), N);

   public class08356() {
      super();
   }

   @Override
   public Codec<class05946<class07078<?>>> y() {
      return N;
   }

   @Override
   public class00336<class08356, class05946<class07078<?>>> N() {
      return y;
   }

   @Nullable
   public class05946<class07078<?>> y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var3 == null ? null : var3.method_5864().T().B();
   }
}
