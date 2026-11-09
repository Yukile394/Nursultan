package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05199 {
   private final List<class05936> N = Lists.newArrayList();

   public void L() {
      this.N.clear();
   }

   public class05199() {
      super();
   }

   public class05936 y() {
      class05936 class05936 = this.N();
      return class05936 != null ? class05936 : class05936.u;
   }

   public void N(class05936 var1) {
      this.N.add(var1);
   }

   @Nullable
   public class05936 N() {
      if (this.N.isEmpty()) {
         return null;
      } else {
         return this.N.size() == 1 ? this.N.get(0) : class05936.N(this.N);
      }
   }
}
