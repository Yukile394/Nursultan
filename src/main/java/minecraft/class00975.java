package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class00975 implements class06143 {
   public List<class08388> N;

   public class00975() {
      super();
   }

   public void N(List<class08388> var1) {
      this.N = ImmutableList.copyOf(var1);
   }

   @Override
   public class08388 method_18138(int var1, int var2) {
      return this.N.get(var1 * (this.N.size() - 1) / var2);
   }

   @Override
   public class08388 method_74304() {
      return this.N.getFirst();
   }

   @Override
   public class08388 method_18139(class06069 var1) {
      return this.N.get(var1.y(this.N.size()));
   }
}
