package minecraft;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import page.langeweile.ok_zoomer.mixin.common.key_binds.KeyBindsListAccessor;

public class class01402 extends class06318<class01388> implements KeyBindsListAccessor {
   private static final int y = 20;
   final class01827 N;
   private int L;

   public void L() {
      this.method_25396().forEach(class01388::N);
   }

   public class01402(class01827 var1, class06202 var2) {
      super(var2, var1.field_22789, var1.field_49503.u(), var1.field_49503.L(), 20);
      this.N = var1;
      class06428[] aclass06428 = (class06428[])ArrayUtils.clone(((class05630)var2.i_7).Nn);
      Arrays.sort((Object[])aclass06428);
      class06384 class06384x = null;

      for (class06428 class06428 : aclass06428) {
         class06384 class06384x = class06428.M();
         if (class06384x != class06384x) {
            class06384x = class06384x;
            this.method_25321(new class01411(this, class06384x));
         }

         class05216 class05216 = class00392.L(class06428.U());
         int i = ((class01590)var2.i_3).N(class05216);
         if (i > this.L) {
            this.L = i;
         }

         this.method_25321(new class01409(this, class06428, class05216));
      }
   }

   public void y() {
      class06428.i();
      this.L();
   }

   @Override
   public int method_25322() {
      return 340;
   }
}
