package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class07685 extends class07796 {
   private final class06563 N;

   protected class07685(class06563 var1, class01362 var2) {
      super(var2);
      this.N = var1;
   }

   public class06563 y() {
      return this.N;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00393(var1, var2, this.N);
   }

   @Override
   protected abstract MapCodec<? extends class07685> N();

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      class00394 class00394 = var1.method_8321(var2);
      return class00394 instanceof class00393 ? ((class00393)class00394).L() : super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean c_(class00500 var1) {
      return true;
   }
}
