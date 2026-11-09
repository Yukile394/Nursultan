package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00375 implements class00368<class02708> {
   private final class03571 N;
   private final class06563 y;

   public class00375(class06563 var1, class03571 var2) {
      super();
      this.N = var2;
      this.y = var1;
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      this.N.N(var1);
   }

   public void N(@Nullable class02708 var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, boolean var7, int var8) {
      this.N.N(var3, var4, var5, var6, this.y, Objects.requireNonNullElse(var1, class02708.L), var8);
   }

   @Nullable
   public class02708 y(class06584 var1) {
      return var1.method_58694(class02484.Nv);
   }
}
