package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class class03779 extends class05096 {
   private static final class00392 y = class00392.L("selectWorld.experimental.title");
   private static final class00392 L = class00392.L("selectWorld.experimental.message");
   private static final class00392 u = class00392.L("selectWorld.experimental.details");
   private static final int i = 10;
   private static final int R = 100;
   private final BooleanConsumer M;
   final Collection<class01055> N;
   private final class02060 B = new class02060().N(10).y(20);

   public class03779(Collection<class01055> var1, BooleanConsumer var2) {
      super(y);
      this.N = var1;
      this.M = var2;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      class02080 class02080 = this.B.u(2);
      class02072 class02072 = class02080.y().y();
      class02080.N(new class02071(this.field_22785, this.field_22793), 2, class02072);
      class02080.N(new class04230(L, this.field_22793).N(true), 2, class02072).N(310);
      class02080.N(class05362.method_46430(u, var1x -> this.field_22787.N(new class03790(this))).N(100).N(), 2, class02072);
      class02080.N(class05362.method_46430(class05220.Z, var1x -> this.M.accept(true)).N());
      class02080.N(class05362.method_46430(class05220.U, var1x -> this.M.accept(false)).N());
      this.B.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.B.N();
      this.method_48640();
   }

   @Override
   public void method_48640() {
      class02077.N(this.B, 0, 0, this.field_22789, this.field_22790, 0.5F, 0.5F);
   }

   @Override
   public void method_25419() {
      this.M.accept(false);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), L);
   }
}
