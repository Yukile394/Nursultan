package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00353 implements class00340 {
   private final class03357 N;
   private final class05913 y;

   public class00353(class03357 var1, class05913 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      this.N.N(var2, var3, var4, var5, this.y, var7);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      this.N.N(var1);
   }
}
