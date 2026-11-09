package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00367 implements class00368<class03490> {
   private final class03574 N;

   public class00367(class03574 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      this.N.N(var1);
   }

   public void N(@Nullable class03490 var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, boolean var7, int var8) {
      this.N.N(var3, var4, var5, var6, Objects.requireNonNullElse(var1, class03490.N), var8);
   }

   @Nullable
   public class03490 y(class06584 var1) {
      return var1.method_58694(class02484.Nt);
   }
}
