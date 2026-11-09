package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class08136 implements class00340 {
   private static final class07211 N = class07211.field_11035;
   private final class07914 y;
   private final class01894 L;

   public class08136(class07914 var1, class01894 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7) {
      N(var2);
      var3.N(this.y, class07211.field_11035, var2, class06851.M(this.L), var4, var5, -1, null, var7, null);
   }

   private static void N(class01421 var0) {
      var0.N(0.5F, 1.5F, 0.5F);
      var0.y(-1.0F, -1.0F, 1.0F);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      N(class01421);
      this.y.method_2819(N);
      this.y.method_63512().N(class01421, var1);
   }
}
