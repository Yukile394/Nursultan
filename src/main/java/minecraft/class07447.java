package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class class07447 extends class00471<class07447> {
   private final Builder<class04129> N = ImmutableList.builder();
   private final class02928<?> y;

   public class07447(class02928<?> var1) {
      super();
      this.y = var1;
   }

   @Override
   public class08122 y() {
      return new class07437(this.R(), this.y, this.N.build());
   }

   protected class07447 L() {
      return this;
   }

   public class07447 N(class04111<?> var1) {
      this.N.add(var1.y());
      return this;
   }
}
