package minecraft;

import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07975 extends class07953 {
   private final class07625 N;
   @Nullable
   private class07438 y;
   private final class01328 L = class01328.N().N(64.0);

   @Override
   public void L() {
      this.N.y(this.y);
      super.L();
   }

   public class07975(class07625 var1) {
      super(var1, false, true);
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18408));
   }

   @Override
   public boolean N() {
      class00734 class00734 = this.N.method_5829().L(10.0, 8.0, 10.0);
      class04782 class04782 = N(this.N);
      List<class08041> list = class04782.N(class08041.class, this.L, this.N, class00734);
      List<class08036> list1 = class04782.N(this.L, this.N, class00734);

      for (class07438 class07438 : list) {
         class08041 class08041 = (class08041)class07438;

         for (class08036 class08036x : list1) {
            if (class08041.u(class08036x) <= -100) {
               this.y = class08036x;
            }
         }
      }

      return this.y == null ? false : !(this.y instanceof class08036 class08036x && (class08036x.method_7325() || class08036x.method_68878()));
   }
}
