package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;

public class class08779 implements class00368<class07923> {
   private final class07949 N;
   private final class01097 y;

   class08779(class07949 var1, class01097 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class07923 y(class06584 var1) {
      class02689 class02689 = var1.method_58694(class02484.Nb);
      return class02689 == null ? null : this.N.N(class02689);
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.N(0.5F, 0.0F, 0.5F);
      class01421.y(-1.0F, -1.0F, 1.0F);
      this.y.method_63512().N(class01421, var1);
   }

   public void N(class07923 var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, boolean var7, int var8) {
      class07311 class07311 = var1 != null ? var1.L() : class07949.N;
      class03359.N(null, 180.0F, 0.0F, var3, var4, var5, this.y, class07311, var8, null);
   }
}
