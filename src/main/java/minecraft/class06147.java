package minecraft;

import net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory;
import net.caffeinemc.mods.lithium.common.util.ArrayConstants;
import org.jspecify.annotations.Nullable;

class class06147 extends class07075 implements class07054, BlockStateOnlyInventory {
   private final class00500 y;
   private final class07284 u;
   private final class07209 i;
   private boolean R;

   public class06147(class00500 var1, class07284 var2, class07209 var3, class06584 var4) {
      super(var4);
      this.y = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   public boolean y(int var1, class06584 var2, class07211 var3) {
      return !this.R && var3 == class07211.field_11033 && var2.N(class06570.vQ);
   }

   @Override
   public int[] N(class07211 var1) {
      return var1 == class07211.field_11033 ? ArrayConstants.ZERO : ArrayConstants.EMPTY;
   }

   @Override
   public boolean N(int var1, class06584 var2, @Nullable class07211 var3) {
      return false;
   }

   @Override
   public int method_5444() {
      return 1;
   }

   @Override
   public void method_5431() {
      class05836.N(null, this.y, this.u, this.i);
      this.R = true;
   }
}
