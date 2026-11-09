package minecraft;

import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class04328 extends class05914 {
   private static final class00392 N = class00392.L("options.online.title");
   @Nullable
   private class04370<Unit> y;

   public class04328(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   private class04370<?>[] N(class05630 var1, class06202 var2) {
      ArrayList arraylist = new ArrayList();
      arraylist.add(var1.NB());
      arraylist.add(var1.NZ());
      class04370 class04370 = class01962.N(
         (class03448)var2.T_3,
         var0 -> {
            class07086 class07086 = ((class03448)var0).y();
            return new class04370<>(
               "options.difficulty.online",
               class04370.method_42399(),
               (var1x, var2x) -> class07086.y(),
               new class04380<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               var0x -> {}
            );
         }
      );
      if (class04370 != null) {
         this.y = class04370;
         arraylist.add(class04370);
      }

      return arraylist.toArray(new class04370[0]);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      if (this.y != null) {
         class06478 class06478 = this.field_51824.y(this.y);
         if (class06478 != null) {
            class06478.field_22763 = false;
         }
      }
   }

   @Override
   protected void method_60325() {
      this.field_51824.N(this.N(this.field_21336, this.field_22787));
   }
}
