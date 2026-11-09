package minecraft;

import com.google.common.collect.ImmutableMap;

public class class02956 extends class05765<class02976> {
   private final int N;

   public class02956(int var1) {
      super(ImmutableMap.of());
      this.N = var1 * 20;
   }

   protected boolean N(class04782 var1, class02976 var2) {
      return !var2.method_5799() && var2.yB() >= this.N && !var2.g_() && var2.method_24828() && !var2.method_42148() && var2.yN();
   }

   protected void u(class04782 var1, class02976 var2, long var3) {
      if (var2.yy()) {
         var2.yR();
      } else if (!var2.Nk()) {
         var2.yi();
      }
   }
}
