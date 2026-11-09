package minecraft;

import com.mojang.serialization.DataResult;
import java.util.List;

public class class05203 extends class05222 {
   private final class04927 y;

   public class05203(class00392 var1, List<class01028> var2, String var3, class06839<Integer> var4, class06839 var5) {
      super(var1, var3, var2);
      this.N = var1;
      this.y = new class04927((class01590)class05191.R(var1).i_3, 10, 5, 44, 20, var2.L().i("\n").i(var4).i("\n"));
      this.y.method_1852(var1.y.y(var5));
      this.y.method_1863(var2x -> {
         DataResult dataresult = var5.N(var2x);
         if (dataresult.isSuccess()) {
            this.y.method_1868(-2039584);
            this.N.y(this);
            this.N.y.N(var5, (Integer)dataresult.getOrThrow(), null);
         } else {
            this.y.method_1868(-65536);
            this.N.N(this);
         }
      });
      this.field_25630.add(this.y);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.method_29989(var1, this.method_73382(), this.method_73380());
      this.y.method_46421(this.method_73389() - 45);
      this.y.method_46419(this.method_73382());
      this.y.method_25394(var1, var2, var3, var5);
   }
}
