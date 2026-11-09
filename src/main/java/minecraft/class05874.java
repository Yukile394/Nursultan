package minecraft;

import net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory;
import net.caffeinemc.mods.lithium.common.util.ArrayConstants;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class05874 extends class07075 implements class07054, BlockStateOnlyInventory {
   private final class00500 y;
   private final class07284 u;
   private final class07209 i;
   private boolean R;

   public class05874(class00500 var1, class07284 var2, class07209 var3) {
      super(1);
      this.y = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   public boolean y(int var1, class06584 var2, class07211 var3) {
      return false;
   }

   @Override
   public int[] N(class07211 var1) {
      return var1 == class07211.field_11036 ? ArrayConstants.ZERO : ArrayConstants.EMPTY;
   }

   private void N(CallbackInfo var1) {
      this.R = false;
   }

   @Override
   public boolean N(int var1, class06584 var2, @Nullable class07211 var3) {
      return !this.R && var3 == class07211.field_11036 && class05836.R.containsKey(var2.B());
   }

   @Override
   public int method_5444() {
      return 1;
   }

   @Override
   public void method_5431() {
      class06584 class06584 = this.method_5438(0);
      if (!class06584.R()) {
         this.R = true;
         class00500 class00500 = class05836.N(null, this.y, this.u, this.i, class06584);
         this.u.N(1500, this.i, class00500 != this.y ? 1 : 0);
         this.N(null);
         this.method_5441(0);
      }
   }
}
