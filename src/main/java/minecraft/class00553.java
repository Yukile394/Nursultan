package minecraft;

import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;

public class class00553 implements class01099, WrappedBlockEntityTickInvokerAccessor {
   private class01099 N;

   class00553(class01099 var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return this.N + " <wrapped>";
   }

   void N(class01099 var1) {
      this.N = var1;
   }

   @Override
   public String method_31706() {
      return this.N.method_31706();
   }

   @Override
   public class07209 method_31705() {
      return this.N.method_31705();
   }

   @Override
   public boolean method_31704() {
      return this.N.method_31704();
   }

   @Override
   public void method_31703() {
      this.N.method_31703();
   }
}
