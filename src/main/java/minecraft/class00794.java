package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class class00794 implements class05952 {
   private final Builder<String, class05338> N = ImmutableMap.builder();
   private final class05919 y;

   public class00794(class05919 var1) {
      super();
      this.y = var1;
   }

   @Override
   public class05957 build() {
      return new class00805(this.N.build(), this.y);
   }

   public class00794 N(String var1, class05338 var2) {
      this.N.put(var1, var2);
      return this;
   }
}
