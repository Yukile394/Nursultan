package minecraft;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06284 extends class05765<class08041> {
   @Nullable
   private class04877 N;

   protected void L(class04782 var1, class08041 var2, long var3) {
      class06069 class06069 = var2.method_59922();
      if (class06069.y(100) == 0) {
         var2.NQ();
      }

      if (class06069.y(200) == 0 && class06286.N(var1, var2, var2.method_24515())) {
         class06563 class06563 = class07536.N((class06563[])class06563.values(), class06069);
         int i = class06069.y(3);
         class06584 class06584 = this.N(class06563, i);
         class08005.N(new class08006(var2.method_73183(), var2, var2.method_23317(), var2.method_23320(), var2.method_23321(), class06584), var1, class06584);
      }
   }

   public class06284(int var1, int var2) {
      super(ImmutableMap.of(), var1, var2);
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      this.N = null;
      var2.method_18868().N(var1.method_75728(), var1.N(), var2.method_73189());
   }

   private class06584 N(class06563 var1, int var2) {
      class06584 class06584 = new class06584(class06570.GJ);
      class06584.N(class02484.NT, new class02813((byte)var2, List.of(new class02827(class02835.field_7970, IntList.of(var1.i()), IntList.of(), false, false))));
      return class06584;
   }

   protected boolean N(class04782 var1, class08041 var2) {
      class07209 class07209 = var2.method_24515();
      this.N = var1.method_19502(class07209);
      return this.N != null && this.N.i() && class06286.N(var1, var2, class07209);
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return this.N != null && !this.N.u();
   }
}
