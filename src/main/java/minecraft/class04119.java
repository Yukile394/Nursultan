package minecraft;

public abstract class class04119<E extends class07438> implements class04118<E>, class04142<E> {
   private class05748 N = class05748.field_18337;

   public class04119() {
      super();
   }

   @Override
   public String method_46910() {
      return this.getClass().getSimpleName();
   }

   @Override
   public final void method_18925(class04782 var1, E var2, long var3) {
      this.N = class05748.field_18337;
   }

   @Override
   public final void method_18923(class04782 var1, E var2, long var3) {
      this.method_18925(var1, (E)var2, var3);
   }

   @Override
   public final class05748 method_18921() {
      return this.N;
   }

   @Override
   public final boolean method_18922(class04782 var1, E var2, long var3) {
      if (this.trigger(var1, (E)var2, var3)) {
         this.N = class05748.field_18338;
         return true;
      } else {
         return false;
      }
   }
}
