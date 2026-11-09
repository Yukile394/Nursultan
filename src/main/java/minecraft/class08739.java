package minecraft;

import org.jspecify.annotations.Nullable;

public class class08739 extends class05096 {
   private static final class00392 N = class00392.L("gui.waitingForResponse.title");
   private static final class00392[] y = new class00392[]{
      class00392.i(),
      class00392.N("gui.waitingForResponse.button.inactive", 4),
      class00392.N("gui.waitingForResponse.button.inactive", 3),
      class00392.N("gui.waitingForResponse.button.inactive", 2),
      class00392.N("gui.waitingForResponse.button.inactive", 1),
      class05220.U
   };
   private static final int L = 1;
   private static final int u = 5;
   @Nullable
   private final class05096 i;
   private final class03686 R;
   private final class05362 M;
   private int B;

   public class08739(@Nullable class05096 var1) {
      super(N);
      this.i = var1;
      this.R = new class03686(this, 33, 0);
      this.M = class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(200).N();
   }

   @Nullable
   public class05096 N() {
      return this.i;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.R.N(N, this.field_22793);
      this.R.L(this.M);
      this.M.field_22764 = false;
      this.M.field_22763 = false;
      this.R.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return this.M.field_22763;
   }

   @Override
   public void method_48640() {
      this.R.N();
      class02077.N(this.R, this.method_48202());
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (!this.M.field_22763) {
         int ix = this.B++ / 20;
         this.M.field_22764 = ix >= 1;
         this.M.method_25355(y[ix]);
         if (ix == 5) {
            this.M.field_22763 = true;
            this.method_37064(true);
         }
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }

   @Override
   public boolean method_25421() {
      return false;
   }
}
