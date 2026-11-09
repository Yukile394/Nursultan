package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00352 implements class00340 {
   private final class01097 N;
   private final float y;
   private final class07311 L;

   public class00352(class01097 var1, float var2, class07311 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      class03359.N(null, 180.0F, this.y, var2, var3, var4, this.N, this.L, var7, null);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.N(0.5F, 0.0F, 0.5F);
      class01421.y(-1.0F, -1.0F, 1.0F);
      class01112 class01112 = new class01112();
      class01112.N = this.y;
      class01112.y = 180.0F;
      this.N.method_2819(class01112);
      this.N.method_63512().N(class01421, var1);
   }
}
