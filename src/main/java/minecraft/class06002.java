package minecraft;

public class class06002 extends class04430 {
   private static final class00392 y = class00392.L("multiplayerWarning.header").N(class06541.field_1067);
   private static final class00392 L = class00392.L("multiplayerWarning.message");
   private static final class00392 u = class00392.L("multiplayerWarning.check").y(-2039584);
   private static final class00392 i = y.L().i("\n").y(L);
   private final class05096 R;

   public class06002(class05096 var1) {
      super(y, L, u, i);
      this.R = var1;
   }

   @Override
   protected class03695 N() {
      class01885 class01885 = class01885.i().N(8);
      class01885.N(class05362.method_46430(class05220.Z, var1x -> {
         if (this.N.y()) {
            ((class05630)this.field_22787.i_7).v = true;
            ((class05630)this.field_22787.i_7).Np();
         }

         this.field_22787.N(new class05304(this.R));
      }).N());
      class01885.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      return class01885;
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }
}
