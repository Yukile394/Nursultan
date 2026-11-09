package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class05737 extends class05096 {
   private static final class00392 u = class00392.L("createWorld.customize.flat.title");
   static final class01894 N = class01894.y("container/slot");
   private static final int i = 18;
   private static final int R = 20;
   private static final int M = 1;
   private static final int B = 1;
   private static final int Z = 2;
   private static final int z = 2;
   private final class03686 U = new class03686(this, 33, 64);
   protected final class05213 y;
   private final Consumer<class01584> E;
   class01584 L;
   private class05732 W;
   @Nullable
   private class05362 m;

   private boolean L() {
      return this.W != null && this.W.method_25334() instanceof class05749;
   }

   public class05737(class05213 var1, Consumer<class01584> var2, class01584 var3) {
      super(u);
      this.y = var1;
      this.E = var2;
      this.L = var3;
   }

   void y() {
      if (this.m != null) {
         this.m.field_22763 = this.L();
      }
   }

   public class01584 N() {
      return this.L;
   }

   public void N(class01584 var1) {
      this.L = var1;
      if (this.W != null) {
         this.W.y();
         this.y();
      }
   }

   @Override
   public void method_25426() {
      this.U.N(this.field_22785, this.field_22793);
      this.W = this.U.L(new class05732(this));
      class01885 class01885xx = this.U.y(class01885.u().N(4));
      class01885xx.L().i();
      class01885 class01885x = class01885xx.N(class01885.i().N(8));
      class01885 class01885xx = class01885xx.N(class01885.i().N(8));
      this.m = class01885x.N(class05362.method_46430(class00392.L("createWorld.customize.flat.removeLayer"), var1x -> {
         if (this.W != null && this.W.method_25334() instanceof class05749 class05749) {
            this.W.N(class05749);
         }
      }).N());
      class01885x.N(class05362.method_46430(class00392.L("createWorld.customize.presets"), var1x -> {
         this.field_22787.N(new class05720(this));
         this.L.M();
         this.y();
      }).N());
      class01885xx.N(class05362.method_46430(class05220.u, var1x -> {
         this.E.accept(this.L);
         this.method_25419();
         this.L.M();
      }).N());
      class01885xx.N(class05362.method_46430(class05220.i, var1x -> {
         this.method_25419();
         this.L.M();
      }).N());
      this.L.M();
      this.y();
      this.U.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public void method_48640() {
      if (this.W != null) {
         this.W.method_57712(this.field_22789, this.U);
      }

      this.U.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.y);
   }
}
