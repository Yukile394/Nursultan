package minecraft;

import Nursultan.class10644;
import Nursultan.class10662;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.api.inventory.LithiumCooldownReceivingInventory;
import net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory;
import net.caffeinemc.mods.lithium.mixin.block.hopper.ContainerMixin;
import org.jspecify.annotations.Nullable;

public interface class06695
   extends class05266,
   class06843,
   Iterable<class06584>,
   LithiumCooldownReceivingInventory,
   LithiumTransferConditionInventory,
   ContainerMixin {
   float c_ = 4.0F;

   @Nullable
   @Override
   default class04803 method_32318(int var1) {
      return var1 >= 0 && var1 < this.method_5439() ? new class10662(this, var1) : null;
   }

   @Override
   default Iterator<class06584> iterator() {
      return new class10644(this);
   }

   default boolean N_13(Set<class06581> var1) {
      return this.N_60(var1x -> !var1x.R() && var1.contains(var1x.B()));
   }

   default boolean N_60(Predicate<class06584> var1) {
      for (class06584 class06584 : this) {
         if (var1.test(class06584)) {
            return true;
         }
      }

      return false;
   }

   default int N_61(class06581 var1) {
      int i = 0;

      for (class06584 class06584 : this) {
         if (class06584.B().equals(var1)) {
            i += class06584.c();
         }
      }

      return i;
   }

   default boolean N(class06695 var1, int var2, class06584 var3) {
      return true;
   }

   static boolean N(class00394 var0, class08036 var1, float var2) {
      class07299 class07299 = var0.G();
      class07209 class07209 = var0.d();
      if (class07299 == null) {
         return false;
      } else {
         return class07299.method_8321(class07209) != var0 ? false : var1.method_56093(class07209, var2);
      }
   }

   static boolean N(class00394 var0, class08036 var1) {
      return N(var0, var1, 4.0F);
   }

   boolean method_5443(class08036 var1);

   default void method_5432(class08978 var1) {
   }

   default void method_5435(class08978 var1) {
   }

   default boolean method_5437(int var1, class06584 var2) {
      return true;
   }

   default int method_5444() {
      return 99;
   }

   void method_5447(int var1, class06584 var2);

   void method_5431();

   class06584 method_5434(int var1, int var2);

   class06584 method_5441(int var1);

   boolean method_5442();

   default List<class08978> j_() {
      return List.of();
   }

   default int a_(class06584 var1) {
      return Math.min(this.method_5444(), var1.U());
   }

   class06584 method_5438(int var1);

   int method_5439();
}
