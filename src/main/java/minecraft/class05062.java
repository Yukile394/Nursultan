package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder;

public class class05062 implements class08967<class05062>, FabricLootTableBuilder, net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder {
   private Builder<class05441> N = ImmutableList.builder();
   private final Builder<class08122> y = ImmutableList.builder();
   private class06929 L = class05074.y;
   private Optional<class01894> u = Optional.empty();

   public class05074 L() {
      return new class05074(this.L, this.u, this.N.build(), this.y.build());
   }

   public class05062() {
      super();
   }

   public class05062 apply(class08122 var1) {
      this.y.add(var1);
      return this.u();
   }

   public class05062 apply(Collection var1) {
      this.y.addAll(var1);
      return this.u();
   }

   public class05062 pool(class05441 var1) {
      this.N.add(var1);
      return this.u();
   }

   private class05062 u() {
      return this;
   }

   public class05062 N() {
      return this;
   }

   public class05062 N(class08137 var1) {
      this.y.add(var1.y());
      return this;
   }

   public class05062 N(class05457 var1) {
      this.N.add(var1.L());
      return this;
   }

   public class05062 N(class06929 var1) {
      this.L = var1;
      return this;
   }

   public class05062 N(class01894 var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public class05062 pools(Collection var1) {
      this.N.addAll(var1);
      return this.u();
   }

   public class05062 modifyPools(Consumer var1) {
      ArrayList arraylist = new ArrayList(this.N.build());
      ListIterator listiterator = arraylist.listIterator();

      while (listiterator.hasNext()) {
         class05457 class05457 = FabricLootPoolBuilder.copyOf((class05441)listiterator.next());
         var1.accept(class05457);
         listiterator.set(class05457.L());
      }

      this.N = ImmutableList.builder();
      this.N.addAll(arraylist);
      return this.u();
   }
}
