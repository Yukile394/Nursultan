package minecraft;

import java.util.function.BooleanSupplier;

public final class class04752 extends class06709<Runnable> {
   @Override
   protected boolean L(Runnable var1) {
      return true;
   }

   @Override
   protected void M_1(Runnable var1) {
      class08700.N().R("runTask");
      super.M_1(var1);
   }

   class04752(class04751 var1, class07299 var2) {
      super("Chunk source main thread executor for " + var2.method_27983().N());
      this.N = var1;
   }

   @Override
   public boolean J() {
      if (this.N.Z()) {
         return true;
      } else {
         this.N.y.y();
         return super.J();
      }
   }

   @Override
   protected Thread k() {
      return this.N.N;
   }

   @Override
   public void y(BooleanSupplier var1) {
      super.y(() -> class02796.Nn() && var1.getAsBoolean());
   }

   @Override
   public Runnable y(Runnable var1) {
      return var1;
   }

   @Override
   protected boolean Y() {
      return true;
   }
}
