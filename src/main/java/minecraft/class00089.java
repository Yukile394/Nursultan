package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class00089 extends class05096 {
   private static final class00392 L = class00392.L("mco.configure.world.region_preference.title");
   private static final int u = 8;
   private final class03686 i = new class03686(this);
   private final class05096 R;
   private final BiConsumer<class00050, class00082> M;
   final Map<class00082, class00073> N;
   private class00048 B;
   class08302 y;
   @Nullable
   private class05362 Z;

   public class00089(class05096 var1, BiConsumer<class00050, class00082> var2, Map<class00082, class00073> var3, class08302 var4) {
      super(L);
      this.R = var1;
      this.M = var2;
      this.N = var3;
      this.y = var4;
   }

   void y() {
      if (this.Z != null && this.B != null) {
         this.Z.field_22763 = this.B.method_25334() != null;
      }
   }

   void N() {
      if (this.y.y() != null) {
         this.M.accept(this.y.N(), this.y.y());
      }

      this.method_25419();
   }

   @Override
   public void method_25426() {
      class01885 class01885x = this.i.N(class01885.u().N(8));
      class01885x.L().y();
      class01885x.N(new class02071(this.method_25440(), this.field_22793));
      this.B = this.i.L(new class00048(this));
      class01885 class01885x = this.i.y(class01885.i().N(8));
      this.Z = class01885x.N(class05362.method_46430(class05220.u, var1x -> this.N()).N());
      class01885x.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N());
      this.B.method_25313(this.B.method_25396().stream().filter(var1x -> Objects.equals(var1x.N, this.y)).findFirst().orElse(null));
      this.i.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.i.N();
      if (this.B != null) {
         this.B.method_57712(this.field_22789, this.i);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }
}
