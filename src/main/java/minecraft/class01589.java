package minecraft;

public class class01589 implements class07825 {
   private static final class00392 N = class00392.L("disconnect.ignoring_status_request");
   private final class02796 y;
   private final class00642 L;

   public class01589(class02796 var1, class00642 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private void N(class07821 var1, boolean var2) {
      this.L.method_56329(class04279.u);
      if (var1.N() != class07529.y().comp_4027()) {
         class05216 class05216;
         if (var1.N() < 754) {
            class05216 = class00392.N("multiplayer.disconnect.outdated_client", class07529.y().comp_4025());
         } else {
            class05216 = class00392.N("multiplayer.disconnect.incompatible", class07529.y().comp_4025());
         }

         this.L.method_10743(new class07814(class05216));
         this.L.method_10747(class05216);
      } else {
         this.L.method_56330(class04279.y, new class01610(this.y, this.L, var2));
      }
   }

   @Override
   public void N(class07821 var1) {
      switch (var1.u()) {
         case field_44975:
            this.N(var1, false);
            break;
         case field_44974:
            class07806 class07806 = this.y.NC();
            this.L.method_56329(class04290.u);
            if (this.y.A() && class07806 != null) {
               this.L.method_56330(class04290.y, new class01606(class07806, this.L));
            } else {
               this.L.method_10747(N);
            }
            break;
         case field_48227:
            if (!this.y.Nz()) {
               this.L.method_56329(class04279.u);
               class05216 class05216 = class00392.L("multiplayer.disconnect.transfers_disabled");
               this.L.method_10743(new class07814(class05216));
               this.L.method_10747(class05216);
            } else {
               this.N(var1, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + var1.u());
      }
   }

   @Override
   public boolean method_48106() {
      return this.L.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
   }
}
