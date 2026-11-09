package minecraft;

import Nursultan.class10757;
import Nursultan.class10760;

public class class07479 extends class07610 {
   private static final class01894 j = class01894.y("container/slot/saddle");
   private static final class01894 v = class01894.y("container/slot/llama_armor");
   private static final class01894 n = class01894.y("container/slot/horse_armor");

   public class07479(int var1, class08044 var2, class06695 var3, class07862 var4, int var5) {
      super(var1, var2, var3, var4);
      class06695 class06695x = var4.y_6(class07085.field_55946);
      this.N(new class10757(this, class06695x, var4, class07085.field_55946, 0, 8, 18, j, var4));
      boolean flag = var4 instanceof class00683;
      class01894 class01894 = flag ? v : n;
      class06695 class06695x = var4.y_6(class07085.field_48824);
      this.N(new class10760(this, class06695x, var4, class07085.field_48824, 0, 8, 36, class01894, var4, flag));
      if (var5 > 0) {
         for (int i = 0; i < 3; i++) {
            for (int jx = 0; jx < var5; jx++) {
               this.N(new class06937(var3, jx + i * var5, 80 + jx * 18, 18 + i * 18));
            }
         }
      }

      this.L(var2, 8, 84);
   }

   @Override
   protected boolean N(class06695 var1) {
      return ((class07862)this.y).N(var1);
   }
}
