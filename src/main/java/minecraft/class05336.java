package minecraft;

import java.util.Arrays;

public class class05336 extends class05914 {
   public static final class00392 N = class00392.L("options.accessibility.title");

   public class05336(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   private static class04370<?>[] N(class05630 var0) {
      return new class04370[]{
         var0.NV(),
         var0.NU(),
         var0.k(),
         var0.G(),
         var0.d(),
         var0.NW(),
         var0.n(),
         var0.t(),
         var0.q(),
         var0.K(),
         var0.Ns(),
         var0.NY(),
         var0.NQ(),
         var0.NO(),
         var0.NJ(),
         var0.Ng(),
         var0.NI(),
         var0.y(),
         var0.N(),
         var0.w(),
         var0.L(),
         var0.Q(),
         var0.C(),
         var0.Y()
      };
   }

   private boolean N() {
      return (class03448)this.field_22787.T_3 != null && ((class03448)this.field_22787.T_3).method_45162().y(class03794.u);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      class06478 class06478x = this.field_51824.y(this.field_21336.k());
      if (class06478x != null && !this.field_22787.t().L().contains("high_contrast")) {
         class06478x.field_22763 = false;
         class06478x.method_47400(class04141.N(class00392.L("options.accessibility.high_contrast.error.tooltip")));
      }

      class06478 class06478x = this.field_51824.y(this.field_21336.C());
      if (class06478x != null) {
         class06478x.field_22763 = this.N();
      }
   }

   @Override
   protected boolean method_72798() {
      return !(this.field_21335 instanceof class03263);
   }

   @Override
   protected void method_60325() {
      class04370<?>[] class04370 = N(this.field_21336);
      class05362 class05362 = class05362.method_46430(class05716.N, var1x -> this.field_22787.N(new class01395(this, this.field_21336))).N();
      class04370<?> class04370x = class04370[0];
      this.field_51824.N(class04370x.method_57701(this.field_21336), this.field_21336.NV(), class05362);
      this.field_51824.N(Arrays.stream(class04370).filter(var1x -> var1x != class04370).toArray(class04370[]::new));
   }

   @Override
   protected void method_31387() {
      class01885 class01885 = this.field_49503.y(class01885.i().N(8));
      class01885.N(class05362.method_46430(class00392.L("options.accessibility.link"), class01321.y(this, class03597.E)).N());
      class01885.N(class05362.method_46430(class05220.u, var1x -> this.field_22787.N(this.field_21335)).N());
   }
}
