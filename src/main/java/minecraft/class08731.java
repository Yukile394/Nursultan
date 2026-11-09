package minecraft;

import java.util.Set;

public enum class08731 {
   field_54080("SINGLE", 0, true) {
      @Override
      void N(class07079 var1, class07079 var2, class08234 var3) {
         class07049 class07049xxx = var1.method_31483();
         var2.method_5719(var1);
         var2.method_18799(var1.method_18798());
         if (class07049xxx != null) {
            class07049xxx.method_5848();
            class07049xxx.field_5951 = 0;

            for (class07049 class07049x : var2.method_5685()) {
               class07049x.method_5848();
               class07049x.method_5650(class07062.field_26999);
            }

            class07049xxx.method_5804(var2);
         }

         class07049 class07049x = var1.method_5854();
         if (class07049x != null) {
            var1.method_5848();
            var2.method_5873(class07049x, false, false);
         }

         if (var3.y()) {
            for (class07085 class07085 : class07085.field_54086) {
               class06584 class06584 = var1.method_6118(class07085);
               if (!class06584.R()) {
                  var2.method_5673(class07085, class06584.M());
                  var2.N(class07085, var1.NE().y(class07085));
               }
            }
         }

         var2.field_6017 = var1.field_6017;
         var2.method_5729(7, var1.method_6128());
         var2.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = var1.fields_6212a028292fd3c078969e3ee4c71d9e8_0;
         var2.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = var1.fields_2212a028292fd3c078969e3ee4c71d9e8_0;
         var2.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
         var2.method_24830(var1.method_24828());
         var1.method_18398().ifPresent(var2::method_18402);
         class07049 class07049xx = var1.yW();
         if (class07049xx != null) {
            var2.N(class07049xx, true);
         }

         this.y(var1, var2, var3);
      }
   },
   field_54081("SPLIT_ON_DEATH", 1, false) {
      @Override
      void N(class07079 var1, class07079 var2, class08234 var3) {
         class07049 class07049 = var1.method_31483();
         if (class07049 != null) {
            class07049.method_5848();
         }

         if (var1.yW() != null) {
            var1.yU();
         }

         this.y(var1, var2, var3);
      }
   };

   private static final Set<class02477<?>> field_60523 = Set.of(class02484.B, class02484.y);
   private final boolean field_54082;

   class08731(boolean var3) {
      this.field_54082 = var3;
   }

   void y(class07079 var1, class07079 var2, class08234 var3) {
      var2.method_6073(var1.method_6067());

      for (class07055 var5 : var1.method_6026()) {
         var2.method_6092(new class07055(var5));
      }

      if (var1.method_6109()) {
         var2.y(true);
      }

      if (var1 instanceof class07077 class07077x && var2 instanceof class07077 class07077) {
         class07077.u(class07077x.K());
         class07077.T = class07077x.T;
         class07077.b = class07077x.b;
      }

      class01289 class01289x = var1.method_18868();
      class01289<?> class01289x = var2.method_18868();
      if (class01289x.N_22(class05378.NW, class05367.field_18458) && class01289x.N(class05378.NW)) {
         class01289x.N(class05378.NW, class01289x.L(class05378.NW));
      }

      if (var3.L()) {
         var2.L(var1.method_5936());
      }

      var2.i(var1.NG());
      var2.u(var1.Nt());
      if (var1.Nm()) {
         var2.NW();
      }

      var2.method_5880(var1.method_5807());
      var2.method_33572(var1.method_5809());
      var2.method_5684(var1.method_5655());
      var2.method_5875(var1.method_5740());
      var2.method_51850(var1.method_51848());
      var2.method_5803(var1.method_5701());
      var1.method_5752().forEach(var2::method_5780);

      for (class02477<?> class02477 : field_60523) {
         N(var1, var2, class02477);
      }

      if (var3.u() != null) {
         class06683 class06683 = var2.method_73183().method_8428();
         class06683.N(var2.method_5845(), var3.u());
         if (var1.method_5781() != null && var1.method_5781() == var3.u()) {
            class06683.y(var1.method_5845(), var1.method_5781());
         }
      }

      if (var1 instanceof class08004 class08004x && class08004x.Q() && var2 instanceof class08004 class08004) {
         class08004.M(true);
      }
   }

   abstract void N(class07079 var1, class07079 var2, class08234 var3);

   private static <T> void N(class07079 var0, class07079 var1, class02477<T> var2) {
      Object object = var0.method_58694(var2);
      if (object != null) {
         var1.method_66653(var2, object);
      }
   }

   public boolean N() {
      return this.field_54082;
   }
}
