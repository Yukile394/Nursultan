package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class04690 implements AutoCloseable {
   private final class08627 y;
   public final class01894 N;
   private final List<class05250> L = new ArrayList<>();

   public class04690(class08627 var1, class01894 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public void close() {
      this.N();
   }

   public void N() {
      int i = this.L.size();
      this.L.clear();

      for (int j = 0; j < i; j++) {
         this.y.L(this.N(j));
      }
   }

   @Nullable
   public class05272 N(class05247 var1, class05237 var2) {
      for (class05250 class05250x : this.L) {
         class05272 class05272 = class05250x.N(var1, var2);
         if (class05272 != null) {
            return class05272;
         }
      }

      int i = this.L.size();
      class01894 class01894 = this.N(i);
      boolean flag = var2.method_2033();
      class03504 class03504 = flag ? class03504.y(class01894) : class03504.N(class01894);
      class05250 class05250x = new class05250(class01894::toString, class03504, flag);
      this.L.add(class05250x);
      this.y.N(class01894, class05250x);
      return class05250x.N(var1, var2);
   }

   private class01894 N(int var1) {
      return this.N.M("/" + var1);
   }
}
