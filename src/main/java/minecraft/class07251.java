package minecraft;

import java.util.UUID;

class class07251 implements class07238 {
   private final class06685 N;
   private final class06702 y;

   class07251(class06685 var1, class06702 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class07251(class04247 var1) {
      super();
      this.N = var1.y(class06685.class);
      this.y = var1.y(class06702.class);
   }

   @Override
   public void N(UUID var1, class07262 var2) {
      var2.N(var1, this.N, this.y);
   }

   @Override
   public void N(class04247 var1) {
      var1.N(this.N);
      var1.N(this.y);
   }

   @Override
   public class07239 N() {
      return class07239.field_29111;
   }
}
