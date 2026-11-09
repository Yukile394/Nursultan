package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;

public class class05457 implements class07297<class05457>, class08967<class05457>, FabricLootPoolBuilder, net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder {
   private final Builder<class04129> N = ImmutableList.builder();
   private final Builder<class05957> y = ImmutableList.builder();
   private final Builder<class08122> L = ImmutableList.builder();
   private class06378 u = class04711.N(1.0F);
   private class06378 i = class04711.N(0.0F);

   public class05441 L() {
      return new class05441(this.N.build(), this.y.build(), this.L.build(), this.u, this.i);
   }

   public class05457() {
      super();
   }

   public class05457 apply(Collection var1) {
      this.L.addAll(var1);
      return this.u();
   }

   public class05457 apply(class08122 var1) {
      this.L.add(var1);
      return this.u();
   }

   public class05457 with(class04129 var1) {
      this.N.add(var1);
      return this.u();
   }

   public class05457 with(Collection var1) {
      this.N.addAll(var1);
      return this.u();
   }

   private class05457 u() {
      return this;
   }

   public class05457 N(class08137 var1) {
      this.L.add(var1.y());
      return this;
   }

   public class05457 y(class06378 var1) {
      this.i = var1;
      return this;
   }

   public class05457 M() {
      return this;
   }

   public class05457 N(class06378 var1) {
      this.u = var1;
      return this;
   }

   public class05457 N(class04111<?> var1) {
      this.N.add(var1.y());
      return this;
   }

   public class05457 y(class05952 var1) {
      this.y.add(var1.build());
      return this;
   }

   public class05457 conditionally(class05957 var1) {
      this.y.add(var1);
      return this.u();
   }

   public class05457 conditionally(Collection var1) {
      this.y.addAll(var1);
      return this.u();
   }
}
