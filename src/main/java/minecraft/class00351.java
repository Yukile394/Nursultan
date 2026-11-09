package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00351 implements class00368<class02695> {
   private final class08097 N;
   private final class04534 y;

   public class00351(class08097 var1, class04534 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.y(1.0F, -1.0F, -1.0F);
      this.y.method_63512().N(class01421, var1);
   }

   public void N(@Nullable class02695 var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, boolean var7, int var8) {
      class02708 class02708 = var1 != null ? var1.a_(class02484.Nv, class02708.L) : class02708.L;
      class06563 class06563 = var1 != null ? var1.method_58694(class02484.Nn) : null;
      boolean flag = !class02708.y().isEmpty() || class06563 != null;
      var3.N();
      var3.y(1.0F, -1.0F, -1.0F);
      class05913 class05913 = flag ? class08874.Z : class08874.z;
      var4.N(this.y.L(), var3, this.y.method_23500(class05913.N()), var5, var6, this.N.N(class05913), false, false, -1, null, var8);
      if (flag) {
         class03571.N(
            this.N,
            var3,
            var4,
            var5,
            var6,
            this.y,
            class06244.field_17274,
            class05913,
            false,
            Objects.requireNonNullElse(class06563, class06563.field_7952),
            class02708,
            var7,
            null,
            var8
         );
      } else {
         var4.N(this.y.y(), var3, this.y.method_23500(class05913.N()), var5, var6, this.N.N(class05913), false, var7, -1, null, var8);
      }

      var3.y();
   }

   @Nullable
   public class02695 y(class06584 var1) {
      return var1.i();
   }
}
