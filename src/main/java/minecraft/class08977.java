package minecraft;

import org.jspecify.annotations.Nullable;

public class class08977 implements class01285 {
   public class08977() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      String s = "GPU: " + (class06202.yE() > 100.0 ? class06541.field_1061 + "100%" : Math.round(class06202.yE()) + "%");
      var1.y(s);
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
