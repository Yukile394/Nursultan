package minecraft;

import java.util.HashSet;
import java.util.Set;

public record class02037(Set<class01894> features) implements class00381<class01656> {
   public static final class02362<class00667, class02037> N = class00381.N(class02037::N, class02037::new);

   private class02037(class00667 var1) {
      this(var1.N_15(HashSet::new, class00667::T));
   }

   public class02037(Set<class01894> features) {
      this.features = features;
   }

   public Set<class01894> N() {
      return this.features;
   }

   public void method_65081(class01656 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.N_12(this.features, class00667::N);
   }

   @Override
   public class02897<class02037> method_65080() {
      return class02867.R;
   }
}
