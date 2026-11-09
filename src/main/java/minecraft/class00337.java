package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00337 implements class00340 {
   private final class03360 N;
   private final float y;
   private final class07211 L;
   private final class05913 u;

   public class00337(class03360 var1, float var2, class07211 var3, class05913 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      this.N.N(var2, var3, var4, var5, this.L, this.y, null, this.u, var7);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      this.N.N(this.L, this.y, var1);
   }
}
