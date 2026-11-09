package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class04639 implements class01285 {
   public class04639() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      if ((class04453)class06202.T_4 != null) {
         var1.y(class06202.Nr().B() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(((class04453)class06202.T_4).m() * 100.0F)));
      }
   }
}
