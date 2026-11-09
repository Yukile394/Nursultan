package minecraft;

import java.util.Optional;

public abstract class class04347 extends class04748 {
   private final class04378 N;
   private final int y;
   private final int R;

   public class04347(class04378 var1, int var2, int var3, class04758 var4) {
      super(var4);
      this.N = var1;
      this.y = var2;
      this.R = var3;
   }

   private void N(class03291 var1, class04764 var2) {
      class07321 class07321 = var2.B();
      var1.N(this.N.construct(var2.R(), class07321.i(), class07321.R()));
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      return N(var1, this.y, this.R) < var1.y().R() ? Optional.empty() : N(var1, class07830.field_13194, var2 -> this.N(var2, var1));
   }
}
