package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05841 implements class03358<class05875, class00982> {
   private static final float N = 0.375F;
   private final class08943 y;

   public class05841(class04811 var1) {
      super();
      this.y = var1.L();
   }

   public void N(class00982 var1, class01421 var2, class01237 var3, class06959 var4) {
      class07211 class07211 = var1.y;
      List<class08898> list = var1.N;

      for (int i = 0; i < list.size(); i++) {
         class08898 class08898 = list.get(i);
         if (!class08898.i()) {
            var2.N();
            var2.N(0.5F, 0.44921875F, 0.5F);
            float f = -class07211.y((i + class07211.u()) % 4).U();
            var2.N(class02058.u.N(f));
            var2.N(class02058.y.N(90.0F));
            var2.N(-0.3125F, -0.3125F, 0.0F);
            var2.y(0.375F, 0.375F, 0.375F);
            class08898.N(var2, var3, var1.Z, class01384.u, 0);
            var2.y();
         }
      }
   }

   public class00982 i() {
      return new class00982();
   }

   public void N(class05875 var1, class00982 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.y = var1.w().L(class05847.i);
      int i = (int)var1.d().method_10063();
      var2.N = new ArrayList<>();

      for (int j = 0; j < var1.N().size(); j++) {
         class08898 class08898 = new class08898();
         this.y.N(class08898, var1.N().get(j), class03662.field_4319, var1.G(), null, i + j);
         var2.N.add(class08898);
      }
   }
}
