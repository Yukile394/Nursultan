package minecraft;

import java.util.UUID;

class class00224 implements class03802 {
   class00224() {
      super();
   }

   @Override
   public void N(UUID var1, class03849 var2) {
      class00232.N.debug("Downloaded pack {} changed state to {}", var1, var2);
   }

   @Override
   public void N(UUID var1, class03824 var2) {
      class00232.N.debug("Downloaded pack {} finished with state {}", var1, var2);
   }
}
