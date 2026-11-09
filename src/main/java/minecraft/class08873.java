package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

class class08873 implements class02006<class08875> {
   class08873(class08855 var1) {
      super();
      this.N = var1;
   }

   public class08875 y(class02028 var1) {
      Builder builder = ImmutableList.builderWithExpectedSize(this.N.N.size());

      for (class08866<class08880> class08866 : this.N.N) {
         builder.add(class08866.N(class08866.y().method_68521(var1)));
      }

      return new class08875(builder.build());
   }
}
