package minecraft;

import java.util.Objects;
import java.util.function.Consumer;

public class class05357 extends class05096 {
   private static final class00392 u = class00392.L("createWorld.customize.buffet.search").L(class04927.field_62466);
   private static final int i = 3;
   private static final int R = 15;
   final class03686 N;
   private final class05096 M;
   private final Consumer<class03556<class00780>> B;
   final class00751<class00780> y;
   private class05371 Z;
   class03556<class00780> L;
   private class05362 z;

   public class05357(class05096 var1, class01896 var2, Consumer<class03556<class00780>> var3) {
      super(class00392.L("createWorld.customize.buffet.title"));
      this.M = var1;
      this.B = var3;
      this.N = new class03686(this, 13 + 9 + 3 + 15, 33);
      this.y = var2.N().L(class04227.NA);
      class03556<class00780> class03556 = this.y.N(class00795.y).or(() -> this.y.z().findAny()).orElseThrow();
      this.L = var2.i().N().u().L().stream().findFirst().orElse(class03556);
   }

   void N() {
      this.z.field_22763 = this.Z.method_25334() != null;
   }

   @Override
   public void method_25426() {
      class01885 class01885x = this.N.N(class01885.u().N(3));
      class01885x.L().y();
      class01885x.N(new class02071(this.method_25440(), this.field_22793));
      class04927 class04927 = class01885x.N(new class04927(this.field_22793, 200, 15, class00392.i()));
      class05371 class05371 = new class05371(this);
      class04927.method_47404(u);
      class04927.method_1863(class05371::N);
      this.Z = this.N.L(class05371);
      class01885 class01885x = this.N.y(class01885.i().N(8));
      this.z = class01885x.N(class05362.method_46430(class05220.u, var1x -> {
         this.B.accept(this.L);
         this.method_25419();
      }).N());
      class01885x.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N());
      this.Z.method_25313(this.Z.method_25396().stream().filter(var1x -> Objects.equals(var1x.N, this.L)).findFirst().orElse(null));
      this.N.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.N.N();
      this.Z.method_57712(this.field_22789, this.N);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.M);
   }
}
