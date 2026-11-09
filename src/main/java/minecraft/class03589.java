package minecraft;

public interface class03589 extends class07290 {
   class07211[] R = class07211.values();

   default boolean L(class07209 var1, class07211 var2) {
      return this.u(var1, var2) > 0;
   }

   default int m(class07209 var1) {
      int i = 0;
      int j = R.length;

      for (int k = 0; k < j; k++) {
         class07211 class07211 = R[k];
         int l = this.u(var1.method_10093(class07211), class07211);
         if (l >= 15) {
            return 15;
         }

         if (l > i) {
            i = l;
         }
      }

      return i;
   }

   default int u(class07209 var1, class07211 var2) {
      class00500 class00500 = this.method_8320(var1);
      int i = class00500.N(this, var1, var2);
      return class00500.u(this, var1) ? Math.max(i, this.a_(var1)) : i;
   }

   default int y(class07209 var1, class07211 var2) {
      return this.method_8320(var1).y(this, var1, var2);
   }

   default int N(class07209 var1, class07211 var2, boolean var3) {
      class00500 class00500 = this.method_8320(var1);
      if (var3) {
         return class06781.E(class00500) ? this.y(var1, var2) : 0;
      } else if (class00500.N(class00869.BF)) {
         return 15;
      } else if (class00500.N(class00869.Lf)) {
         return class00500.L(class06884.R);
      } else {
         return class00500.j() ? this.y(var1, var2) : 0;
      }
   }

   default boolean W(class07209 var1) {
      if (this.u(var1.method_10074(), class07211.field_11033) > 0) {
         return true;
      } else if (this.u(var1.method_10084(), class07211.field_11036) > 0) {
         return true;
      } else if (this.u(var1.method_10095(), class07211.field_11043) > 0) {
         return true;
      } else if (this.u(var1.method_10072(), class07211.field_11035) > 0) {
         return true;
      } else {
         return this.u(var1.method_10067(), class07211.field_11039) > 0 ? true : this.u(var1.method_10078(), class07211.field_11034) > 0;
      }
   }

   default int a_(class07209 var1) {
      int i = 0;
      i = Math.max(i, this.y(var1.method_10074(), class07211.field_11033));
      if (i >= 15) {
         return i;
      } else {
         i = Math.max(i, this.y(var1.method_10084(), class07211.field_11036));
         if (i >= 15) {
            return i;
         } else {
            i = Math.max(i, this.y(var1.method_10095(), class07211.field_11043));
            if (i >= 15) {
               return i;
            } else {
               i = Math.max(i, this.y(var1.method_10072(), class07211.field_11035));
               if (i >= 15) {
                  return i;
               } else {
                  i = Math.max(i, this.y(var1.method_10067(), class07211.field_11039));
                  if (i >= 15) {
                     return i;
                  } else {
                     i = Math.max(i, this.y(var1.method_10078(), class07211.field_11034));
                     return i >= 15 ? i : i;
                  }
               }
            }
         }
      }
   }
}
