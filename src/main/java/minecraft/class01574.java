package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class class01574 extends class04748 {
   public static final MapCodec<class01574> N = N(class01574::new);

   public class01574(class04758 var1) {
      super(var1);
   }

   @Override
   public class04367<?> N() {
      return class04367.i;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      return N(var1, class07830.field_13194, var2 -> this.N(var2, var1));
   }

   private void N(class03291 var1, class04764 var2) {
      class07321 class07321 = var2.B();
      class07836 class07836 = var2.R();
      class07209 class07209 = new class07209(class07321.i(), 90, class07321.R());
      class06993 class06993 = class06993.N(class07836);
      class05173.N(var2.i(), class07209, class06993, var1, class07836);
   }
}
