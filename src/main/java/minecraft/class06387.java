package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

public class class06387 extends class04748 {
   public static final MapCodec<class06387> N = N(class06387::new);

   public class06387(class04758 var1) {
      super(var1);
   }

   @Override
   public class04367<?> N() {
      return class04367.L;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class06993 class06993 = class06993.N(var1.R());
      class07209 class07209 = this.N(var1, class06993);
      return class07209.method_10264() < 60
         ? Optional.empty()
         : Optional.of(new class04780(class07209, (Consumer<class03291>)(var4 -> this.N(var4, class07209, class06993, var1))));
   }

   private void N(class03291 var1, class07209 var2, class06993 var3, class04764 var4) {
      ArrayList arraylist = Lists.newArrayList();
      class05160.N(var4.i(), var2, var3, arraylist, var4.R());
      arraylist.forEach(var1::N);
   }
}
