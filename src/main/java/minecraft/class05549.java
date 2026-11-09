package minecraft;

import java.util.Optional;

public interface class05549 {
   boolean B();

   class04891 E();

   @Deprecated
   static void N(class07079 var0, class06584 var1) {
      var1.N(class02484.B, var0);
      class02837.N(class02484.NM, var1, var1x -> {
         if (var0.Nt()) {
            var1x.N("NoAI", var0.Nt());
         }

         if (var0.method_5701()) {
            var1x.N("Silent", var0.method_5701());
         }

         if (var0.method_5740()) {
            var1x.N("NoGravity", var0.method_5740());
         }

         if (var0.method_36361()) {
            var1x.N("Glowing", var0.method_36361());
         }

         if (var0.method_5655()) {
            var1x.N("Invulnerable", var0.method_5655());
         }

         var1x.N("Health", var0.method_6032());
      });
   }

   @Deprecated
   static void N(class07079 var0, class07001 var1) {
      var1.T("NoAI").ifPresent(var0::u);
      var1.T("Silent").ifPresent(var0::method_5803);
      var1.T("NoGravity").ifPresent(var0::method_5875);
      var1.T("Glowing").ifPresent(var0::method_5834);
      var1.T("Invulnerable").ifPresent(var0::method_5684);
      var1.M("Health").ifPresent(var0::method_6033);
   }

   static <T extends class07438 & class05549> Optional<class07082> N(class08036 var0, class07050 var1, T var2) {
      class06584 class06584xx = var0.method_5998(var1);
      if (class06584xx.B() == class06570.jE && var2.method_5805()) {
         var2.method_5783(((class05549)var2).E(), 1.0F, 1.0F);
         class06584 class06584x = ((class05549)var2).Y();
         ((class05549)var2).e_(class06584x);
         class06584 class06584xx = class05970.N(class06584xx, var0, class06584x, false);
         var0.method_6122(var1, class06584xx);
         if (!var2.method_73183().method_8608()) {
            class06912.U.N((class04770)var0, class06584x);
         }

         var2.method_31472();
         return Optional.of(class07082.N);
      } else {
         return Optional.empty();
      }
   }

   void N(class07001 var1);

   void N(boolean var1);

   class06584 Y();

   void e_(class06584 var1);
}
