package minecraft;

import java.util.List;

public record class00983(List<class00994> instances) implements class00972 {
   @Override
   public void submit(class01237 var1, class06959 var2) {
      class01421 class01421 = new class01421();
      class01781 class01781 = class06202.Nq().Ng();

      for (class00994 class00994 : this.instances) {
         class01781.N(class00994.N(), var2, class00994.y(), class00994.L(), class00994.u(), class01421, var1);
      }
   }

   public class00983(List<class00994> instances) {
      this.instances = instances;
   }

   public List<class00994> N() {
      return this.instances;
   }
}
