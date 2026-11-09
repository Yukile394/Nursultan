package minecraft;

import Nursultan.class10769;
import Nursultan.class10771;

public class class07570 extends class07610 {
   private static final class01894 j = class01894.y("container/slot/saddle");
   private static final class01894 v = class01894.y("container/slot/nautilus_armor_inventory");

   public class07570(int var1, class08044 var2, class06695 var3, class08156 var4, int var5) {
      super(var1, var2, var3, var4);
      class06695 class06695x = var4.y_6(class07085.field_55946);
      this.N(new class10769(this, class06695x, var4, class07085.field_55946, 0, 8, 18, j, var4));
      class06695 class06695x = var4.y_6(class07085.field_48824);
      this.N(new class10771(this, class06695x, var4, class07085.field_48824, 0, 8, 36, v, var4));
      this.L(var2, 8, 84);
   }

   @Override
   protected boolean N(class06695 var1) {
      return ((class08156)this.y).N(var1);
   }
}
