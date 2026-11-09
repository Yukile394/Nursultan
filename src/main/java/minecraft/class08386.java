package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08386() implements class08909 {
   public static final MapCodec<class08386> N = MapCodec.unit(new class08386());

   public class08386() {
      super();
   }

   @Override
   public MapCodec<class08386> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class06202 class06202 = class06202.Nq();
      class07049 class07049 = class06202.F();
      return class07049 != null ? var3 == class07049 : var3 == (class04453)class06202.T_4;
   }
}
