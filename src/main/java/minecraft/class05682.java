package minecraft;

import java.util.List;

class class05682 extends class05724<class05728> {
   public class05682(class05685 var1) {
      super(class06202.Nq(), var1.field_22789, var1.field_22790, 0, 36);
      this.N = var1;
   }

   private void y(class05728 var1) {
      for (class04981 class04981x : this.N.v) {
         this.method_25321(new class05100(this.N, class04981x));
      }

      for (class04981 class04981 : this.N.j) {
         Object object;
         if (class05685.N() && !class04981.Z()) {
            if (class04981.R == class04961.field_19435) {
               continue;
            }

            object = new class05135(this.N, class04981);
         } else {
            object = new class05698(this.N, class04981);
         }

         this.method_25321((class05728)object);
         if (var1 instanceof class05698 && ((class05698)var1).N.y == class04981.y) {
            this.method_25313((class05728)object);
         }
      }
   }

   void N(class05685 var1) {
      class05728 class05728 = this.method_25334();
      this.method_25339();

      for (class03576 class03576 : this.N.t) {
         if (class03576 instanceof class03605 class03605) {
            this.N(class03605, var1, class05728);
            this.N.N(List.of(class03576));
            break;
         }
      }

      this.y(class05728);
   }

   private void N(class03605 var1, class05685 var2, class05728 var3) {
      class00392 class00392 = var1.u();
      int i = class05685.u(this.N).y(class00392, class05713.i(this.method_25322()));
      class05713 class05713 = new class05713(this.N, var2, i, class00392, var1);
      this.method_73370(class05713, 38 + i);
      if (var3 instanceof class05713 && ((class05713)var3).N().equals(class00392)) {
         this.method_25313((class05728)class05713);
      }
   }

   public void method_25313(class05728 var1) {
      super.method_25313(var1);
      this.N.y();
   }

   @Override
   public int method_25322() {
      return 300;
   }
}
