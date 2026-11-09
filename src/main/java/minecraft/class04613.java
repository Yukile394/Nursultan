package minecraft;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class class04613 {
   public final List<class04638> N;

   class04613(class04638... var1) {
      this(Arrays.asList(var1));
   }

   class04613(List<class04638> var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04613 class04613 = (class04613)var1;
         return Objects.equals(this.N, class04613.N);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Line{segments=" + this.N + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.N);
   }
}
