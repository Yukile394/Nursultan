package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.function.Predicate;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess;

public interface class08974 extends class06695, SpecialLogicAccess {
   default int y() {
      return (int)this.N().stream().filter(Predicate.not(class06584::R)).count();
   }

   default boolean N(class06584 var1) {
      return true;
   }

   default void N(int var1, class06584 var2) {
      this.N().set(var1, var2);
      var2.R(this.a_(var2));
   }

   private void N(class08974 var1, Operation var2) {
      if (!this.fabric_shouldSuppressSpecialLogic()) {
         var2.call(new Object[]{var1});
      }
   }

   class00743<class06584> N();

   @Override
   default void method_5448() {
      this.N().clear();
   }

   @Override
   default boolean method_5437(int var1, class06584 var2) {
      return this.N(var2) && (this.method_5438(var1).R() || this.method_5438(var1).c() < this.a_(var2));
   }

   @Override
   default void method_5447(int var1, class06584 var2) {
      this.N(var1, var2);
      this.N(this, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_11596]");
         ((class08974)var0[0]).method_5431();
         return (Void)null;
      });
   }

   @Override
   default class06584 method_5434(int var1, int var2) {
      class06584 class06584 = class06686.N(this.N(), var1, var2);
      if (!class06584.R()) {
         this.method_5431();
      }

      return class06584;
   }

   @Override
   default class06584 method_5441(int var1) {
      return class06686.N(this.N(), var1, this.method_5444());
   }

   @Override
   default boolean method_5442() {
      return this.N().stream().allMatch(class06584::R);
   }

   @Override
   default class06584 method_5438(int var1) {
      return this.N().get(var1);
   }

   @Override
   default int method_5439() {
      return this.N().size();
   }
}
