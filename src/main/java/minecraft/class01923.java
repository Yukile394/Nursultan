package minecraft;

import Nursultan.class09542;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public enum class01923 implements class05247 {
   field_37898(() -> N(5, 8, (var0, var1) -> -1)),
   field_37899(() -> {
      byte b0 = 5;
      byte b1 = 8;
      return N(5, 8, (var0x, var1x) -> var0x == 0 || var0x + 1 == 5 || var1x == 0 || var1x + 1 == 8 ? -1 : 0);
   });

   final class08280 field_37900;

   private class01923(Supplier<class08280> var3) {
      this.field_37900 = (class08280)var3.get();
   }

   private static class08280 N(int var0, int var1, class09542 var2) {
      class08280 class08280 = new class08280(class08247.field_4997, var0, var1, false);

      for (int i = 0; i < var1; i++) {
         for (int j = 0; j < var0; j++) {
            class08280.y(j, i, var2.getColor(j, i));
         }
      }

      class08280.M();
      return class08280;
   }

   @Nullable
   public class05272 N(class04690 var1) {
      return var1.N(this, new class01907(this));
   }

   @Override
   public float getAdvance() {
      return this.field_37900.N() + 1;
   }
}
