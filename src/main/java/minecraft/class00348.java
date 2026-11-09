package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class00348 implements class00340 {
   private final class03852 N;

   public class00348(class03852 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      var2.N();
      var2.y(1.0F, -1.0F, -1.0F);
      var3.N(this.N.method_63512(), var2, this.N.method_23500(class03852.N), var4, var5, null, false, var6, -1, null, var7);
      var2.y();
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.y(1.0F, -1.0F, -1.0F);
      this.N.method_63512().N(class01421, var1);
   }
}
