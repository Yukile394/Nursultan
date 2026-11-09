package minecraft;

import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03703 {
   private final class00392 N;
   private final BooleanSupplier y;
   private final Consumer<Boolean> L;
   @Nullable
   private class00392 u;
   @Nullable
   private BooleanSupplier i;
   private final int R;

   class03703(class00392 var1, BooleanSupplier var2, Consumer<Boolean> var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.R = var4;
   }

   public class03703 N(BooleanSupplier var1) {
      this.i = var1;
      return this;
   }

   public class03703 N(class00392 var1) {
      this.u = var1;
      return this;
   }

   class03680 N(class03658 var1, class02060 var2, int var3) {
      var1.N();
      class02071 class02071 = new class02071(this.N, (class01590)class06202.Nq().i_3);
      var2.N(class02071, var1.u, var3, var2.y().N(0.0F, 0.5F).y(var1.y));
      Optional<class03676> optional = var1.i;
      class06347<Boolean> class06347 = class06366.N(this.y.getAsBoolean());
      class06347.N();
      boolean flag = this.u != null && optional.isEmpty();
      if (flag) {
         class04141 var8 = class04141.N(this.u);
         class06347.N(var1x -> var8);
      }

      if (this.u != null && !flag) {
         class06347.N_57(var1x -> class05220.N(this.N, var1x.L(), this.u));
      } else {
         class06347.N_57(var1x -> class05220.N(this.N, var1x.L()));
      }

      class06366<Boolean> class06366 = class06347.N(0, 0, this.R, 20, class00392.i(), (var1x, var2x) -> this.L.accept(var2x));
      if (this.i != null) {
         class06366.field_22763 = this.i.getAsBoolean();
      }

      var2.N(class06366, var1.u, var3 + 1, var2.y().L());
      if (this.u != null) {
         optional.ifPresent(var4x -> {
            class05216 class05216 = this.u.L().N(class06541.field_1080);
            class01590 class01590 = (class01590)class06202.Nq().i_3;
            class04230 class04230 = new class04230(class05216, class01590);
            class04230.N(var1.N - var1.y - this.R);
            class04230.y(var4x.N());
            var1.N();
            int ix = var4x.y() ? 9 * var4x.N() - class04230.method_25364() : 0;
            var2.N(class04230, var1.u, var3, var2.y().L(-var1.L).i(ix));
         });
      }

      return new class03680(class06366, this.y, this.i);
   }
}
