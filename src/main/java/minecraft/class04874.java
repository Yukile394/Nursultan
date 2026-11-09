package minecraft;

public class class04874 implements class05975 {
   private int N;

   public class04874() {
      super();
   }

   @Override
   public void N(class04782 var1, boolean var2) {
      if (var2) {
         if (var1.method_64395().N(class07305.D)) {
            class06069 class06069 = var1.field_9229;
            this.N--;
            if (this.N <= 0) {
               this.N = this.N + 12000 + class06069.y(1200);
               if (var1.method_8530()) {
                  if (class06069.y(5) == 0) {
                     int i = var1.method_18456().size();
                     if (i >= 1) {
                        class08036 class08036 = var1.method_18456().get(class06069.y(i));
                        if (!class08036.method_7325()) {
                           if (!var1.method_19497(class08036.method_24515(), 2)) {
                              int j = (24 + class06069.y(24)) * (class06069.Z() ? -1 : 1);
                              int k = (24 + class06069.y(24)) * (class06069.Z() ? -1 : 1);
                              class07218 class07218 = class08036.method_24515().method_25503().y(j, 0, k);
                              byte b0 = 10;
                              if (var1.N(
                                 class07218.method_10263() - 10, class07218.method_10260() - 10, class07218.method_10263() + 10, class07218.method_10260() + 10
                              )) {
                                 if (var1.method_75728().N(class00608.p, class07218)) {
                                    int l = (int)Math.ceil(var1.method_8404(class07218).y()) + 1;

                                    for (int i1 = 0; i1 < l; i1++) {
                                       class07218.method_10099(var1.N(class07830.field_13203, class07218).method_10264());
                                       if (i1 == 0) {
                                          if (!this.N(var1, class07218, class06069, true)) {
                                             break;
                                          }
                                       } else {
                                          this.N(var1, class07218, class06069, false);
                                       }

                                       class07218.method_20787(class07218.method_10263() + class06069.y(5) - class06069.y(5));
                                       class07218.method_20788(class07218.method_10260() + class06069.y(5) - class06069.y(5));
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean N(class04782 var1, class07209 var2, class06069 var3, boolean var4) {
      class00500 class00500 = var1.method_8320(var2);
      if (!class00803.N(var1, var2, class00500, class00500.Y(), class07078.yy)) {
         return false;
      } else if (!class06091.N(class07078.yy, var1, class06113.field_16527, var2, var3)) {
         return false;
      } else {
         class06091 class06091 = class07078.yy.N(var1, class06113.field_16527);
         if (class06091 != null) {
            if (var4) {
               class06091.M(true);
               class06091.I();
            }

            class06091.method_5814(var2.method_10263(), var2.method_10264(), var2.method_10260());
            class06091.N(var1, var1.method_8404(var2), class06113.field_16527, null);
            var1.y(class06091);
            return true;
         } else {
            return false;
         }
      }
   }
}
