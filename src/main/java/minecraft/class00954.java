package minecraft;

public class class00954 extends class00962<class05848> {
   private final class06166 u;
   final class00965 L = new class00965();

   public class00954(class04410 var1, class06166 var2) {
      super(var1);
      this.u = var2;
   }

   @Override
   public class00972 N(class01383 var1, class05363 var2, float var3) {
      for (class05848 class05848 : this.y) {
         if (var1.method_74404(class05848.field_3874, class05848.field_3854, class05848.field_3871)) {
            try {
               class05848.method_3074(this.L, var2, var3);
            } catch (Throwable throwable) {
               class07080 class07080 = class07080.N(throwable, "Rendering Particle");
               class07074 class07074 = class07080.N("Particle being rendered");
               class07074.N("Particle", class05848::toString);
               class07074.N("Particle Type", this.u::toString);
               throw new class07878(class07080);
            }
         }
      }

      return this.L;
   }
}
