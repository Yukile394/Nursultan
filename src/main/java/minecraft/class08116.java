package minecraft;

import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class08116 implements class03358<class08965, class00960> {
   private final Map<class08973, class07914> N = new HashMap<>();

   public class08116(class04811 var1) {
      super();
      class01140 class01140 = var1.R();
      this.N.put(class08973.field_61414, new class07914(class01140.N(class04802.Nm)));
      this.N.put(class08973.field_61416, new class07914(class01140.N(class04802.Ns)));
      this.N.put(class08973.field_61415, new class07914(class01140.N(class04802.NT)));
      this.N.put(class08973.field_61417, new class07914(class01140.N(class04802.Nb)));
   }

   public void N(class00960 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.M.i() instanceof class08981 class08981) {
         var2.N();
         var2.N(0.5F, 0.0F, 0.5F);
         class07914 class07914 = this.N.get(var1.N);
         class07211 class07211 = var1.y;
         class07311 class07311 = class06851.M(class08971.N(class08981.y()).i());
         var3.N(class07914, class07211, var2, class07311, var1.Z, class01384.u, 0, var1.z);
         var2.y();
      }
   }

   public class00960 i() {
      return new class00960();
   }

   public void N(class08965 var1, class00960 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.y = var1.w().L(class08981.y);
      var2.N = var1.w().L(class06665.yK);
   }
}
