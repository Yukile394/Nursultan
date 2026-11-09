package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;

public interface class00176 {
   class00176 N = new class00178();
   class02362<class04247, class00176> y = class02389.N(class00148.L)
      .N_10(var0 -> (class00176)DataFixUtils.orElse(var0, N), var0 -> var0 instanceof class00148 ? Optional.of((class00148)var0) : Optional.empty());

   static class00176 y(class06584 var0, class00147 var1) {
      return (class00176)(var0.R() ? N : new class00148(var0.Z(), var0.c(), class00146.N(var0.u(), var1)));
   }

   boolean N(class06584 var1, class00147 var2);
}
