package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.jspecify.annotations.Nullable;

public class class07933 extends class04430 {
   private static final class00392 y = class00392.L("multiplayer.codeOfConduct.title").N(class06541.field_1067);
   private static final class00392 L = class00392.L("multiplayer.codeOfConduct.check");
   @Nullable
   private final class04568 u;
   private final String i;
   private final BooleanConsumer R;
   private final class05096 M;

   private class07933(@Nullable class04568 var1, class05096 var2, class00392 var3, String var4, BooleanConsumer var5) {
      super(y, var3, L, y.L().i("\n").y(var3));
      this.u = var1;
      this.M = var2;
      this.i = var4;
      this.R = var5;
   }

   public class07933(@Nullable class04568 var1, class05096 var2, String var3, BooleanConsumer var4) {
      this(var1, var2, class00392.y(var3), var3, var4);
   }

   private void N(boolean var1) {
      this.R.accept(var1);
      if (this.u != null) {
         if (var1 && this.N.y()) {
            this.u.y(this.i);
         } else {
            this.u.M();
         }

         class04563.y(this.u);
      }
   }

   @Override
   protected class03695 N() {
      class01885 class01885 = class01885.i().N(8);
      class01885.N(class05362.method_46430(class05220.W, var1x -> this.N(true)).N());
      class01885.N(class05362.method_46430(class05220.T, var1x -> this.N(false)).N());
      return class01885;
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (this.M instanceof class05763 || this.M instanceof class01871) {
         this.M.method_25393();
      }
   }
}
