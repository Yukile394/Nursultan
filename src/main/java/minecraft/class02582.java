package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public record class02582(int entityId, List<class02769> lerpSteps) implements class00381<class07280> {
   public static final class02362<class00667, class02582> N = class02362.N(
      class02389.B, class02582::N, class02769.R.N_33(class02389.N()), class02582::y, class02582::new
   );

   public class02582(int entityId, List<class02769> lerpSteps) {
      this.entityId = entityId;
      this.lerpSteps = lerpSteps;
   }

   public List<class02769> y() {
      return this.lerpSteps;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.entityId;
   }

   @Nullable
   public class07049 N(class07299 var1) {
      return var1.method_8469(this.entityId);
   }

   @Override
   public class02897<class02582> method_65080() {
      return class04248.h;
   }
}
