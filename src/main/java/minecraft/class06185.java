package minecraft;

import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class class06185 implements class01285 {
   private static final class01894 N = class01894.y("looking_at_entity");

   public class06185() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class07049 class07049 = (class07049)class06202.Nq().M_2;
      ArrayList arraylist = new ArrayList();
      if (class07049 != null) {
         arraylist.add(class06541.field_1073 + "Targeted Entity");
         arraylist.add(String.valueOf(class04206.M.y(class07049.method_5864())));
      }

      var1.N(N, arraylist);
   }
}
