package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class08364 implements class00340 {
   private final class08097 N;
   private final class06260 y;
   private final class05913 L;

   public class08364(class08097 var1, class06260 var2, class05913 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      class02030.N(this.N, var2, var3, var4, var5, this.y, this.L);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class02030.N(class01421, 0.0F);
      class01421.y(1.0F, -1.0F, -1.0F);
      this.y.method_63512().N(class01421, var1);
   }
}
