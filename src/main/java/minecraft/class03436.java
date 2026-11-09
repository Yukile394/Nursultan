package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.function.Predicate;

class class03436 implements class03422 {
   class03436(ImmutableList var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean N(class03420 var1) {
      String s = var1.N();
      return this.N.stream().noneMatch(var1x -> var1x.test(s));
   }

   @Override
   public boolean N(class03437 var1) {
      String s = var1.N();
      String s1 = var1.y();
      return this.N.stream().noneMatch(var2x -> var2x.test(s) || var2x.test(s1));
   }
}
