package minecraft;

import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class05191 extends class05096 implements EditGameRulesScreenAccessor {
   private static final class00392 L = class00392.L("editGamerule.title");
   private static final int u = 8;
   final class03686 N = new class03686(this);
   private final Consumer<Optional<class07305>> i;
   private final Set<class05211> R = Sets.newHashSet();
   final class07305 y;
   private class05218 M;
   @Nullable
   private class05362 B;

   public class05191(class07305 var1, Consumer<Optional<class07305>> var2) {
      super(L);
      this.y = var1;
      this.i = var2;
   }

   void y(class05211 var1) {
      this.R.remove(var1);
      this.N();
   }

   private void N() {
      if (this.B != null) {
         this.B.field_22763 = this.R.isEmpty();
      }
   }

   void N(class05211 var1) {
      this.R.add(var1);
      this.N();
   }

   @Override
   public void method_25426() {
      this.N.N(L, this.field_22793);
      this.M = this.N.L(new class05218(this, this.y));
      class01885 class01885 = this.N.y(class01885.i().N(8));
      this.B = class01885.N(class05362.method_46430(class05220.u, var1x -> this.i.accept(Optional.of(this.y))).N());
      class01885.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N());
      this.N.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.N.N();
      if (this.M != null) {
         this.M.method_57712(this.field_22789, this.N);
      }
   }

   @Override
   public void method_25419() {
      this.i.accept(Optional.empty());
   }
}
