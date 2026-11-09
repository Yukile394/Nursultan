package minecraft;

import org.jspecify.annotations.Nullable;

public class class04713 extends class05407 {
   private static final class00392 N = class00392.L("mco.account.privacy.information");
   private static final int y = 15;
   private final class01885 L = class01885.u();
   private final class05096 u;
   @Nullable
   private class04230 i;

   public class04713(class05096 var1) {
      super(class05153.N);
      this.u = var1;
   }

   @Override
   public void method_25426() {
      this.L.N(15).L().y();
      this.i = new class04230(N, this.field_22793).N(true);
      this.L.N(this.i);
      class01885 class01885 = this.L.N(class01885.i().N(8));
      class05216 class05216 = class00392.L("mco.account.privacy.info.button");
      class01885.N(class05362.method_46430(class05216, class01321.y(this, class03597.N)).N());
      class01885.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.L.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      if (this.i != null) {
         this.i.N(this.field_22789 - 15);
      }

      this.L.N();
      class02077.N(this.L, this.method_48202());
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.u);
   }

   @Override
   public class00392 method_25435() {
      return N;
   }
}
