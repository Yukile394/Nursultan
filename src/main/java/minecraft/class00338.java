package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00338 implements class00340 {
   private final class08097 N;
   private final class01686 y;

   public class00338(class08097 var1, class01686 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      var2.N();
      var2.N(0.5F, 0.5F, 0.5F);
      var3.N(this.y, var2, class03362.y.N(class06851::u), var4, var5, this.N.N(class03362.y), false, false, -1, null, var7);
      var2.y();
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.N(0.5F, 0.5F, 0.5F);
      this.y.N(class01421, var1);
   }
}
