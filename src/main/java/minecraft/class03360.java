package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03360 implements class03358<class07278, class00950> {
   private final class08097 N;
   private final class03353 y;

   public class03360(class01140 var1, class08097 var2) {
      super();
      this.N = var2;
      this.y = new class03353(var1.N(class04802.uR));
   }

   public class03360(class00331 var1) {
      this(var1.y(), var1.L());
   }

   public class03360(class04811 var1) {
      this(var1.R(), var1.B());
   }

   public void N(class07211 var1, float var2, Consumer<Vector3fc> var3) {
      class01421 class01421 = new class01421();
      this.N(class01421, var1, var2);
      this.y.method_63512().N(class01421, var3);
   }

   public void N(class01421 var1, class01237 var2, int var3, int var4, class07211 var5, float var6, @Nullable class08141 var7, class05913 var8, int var9) {
      var1.N();
      this.N(var1, var5, var6);
      var2.N(this.y, var6, var1, var8.N(this.y::method_23500), var3, var4, -1, this.N.N(var8), var9, var7);
      var1.y();
   }

   public void N(class07278 var1, class00950 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = var1.w().N(class07027.L, class07211.field_11036);
      var2.y = var1.z();
      var2.L = var1.N(var3);
   }

   public void N(class00950 var1, class01421 var2, class01237 var3, class06959 var4) {
      class06563 class06563 = var1.y;
      class05913 class05913;
      if (class06563 == null) {
         class05913 = class05911.l;
      } else {
         class05913 = class05911.u(class06563);
      }

      this.N(var2, var3, var1.Z, class01384.u, var1.N, var1.L, var1.z, class05913, 0);
   }

   public class00950 i() {
      return new class00950();
   }

   private void N(class01421 var1, class07211 var2, float var3) {
      var1.N(0.5F, 0.5F, 0.5F);
      float f = 0.9995F;
      var1.y(0.9995F, 0.9995F, 0.9995F);
      var1.N(var2.y());
      var1.y(1.0F, -1.0F, -1.0F);
      var1.N(0.0F, -1.0F, 0.0F);
      this.y.method_2819(var3);
   }
}
