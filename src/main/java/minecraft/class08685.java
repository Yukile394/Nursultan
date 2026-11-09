package minecraft;

import java.util.UUID;

public class class08685 implements class08657 {
   private static final class01894 i = class01894.y("hud/locator_bar_background");
   private static final class01894 R = class01894.y("hud/locator_bar_arrow_up");
   private static final class01894 M = class01894.y("hud/locator_bar_arrow_down");
   private static final int B = 9;
   private static final int Z = 60;
   private static final int z = 7;
   private static final int U = 5;
   private static final int E = 1;
   private static final int W = 1;
   private final class06202 m;

   public class08685(class06202 var1) {
      super();
      this.m = var1;
   }

   @Override
   public void y(class01054 var1, class02233 var2) {
      int ix = this.y(this.m.Nt());
      class07049 class07049 = this.m.F();
      if (class07049 != null) {
         class07299 class07299 = class07049.method_73183();
         class03106 class03106 = class07299.method_54719();
         class00945 class00945 = var2x -> var2.N(!class03106.N(var2x));
         ((class01683)((class04453)this.m.T_4).y_0)
            .O()
            .N(
               class07049,
               var6x -> {
                  if (!var6x.N().left().map(var1xx -> var1xx.equals(class07049.method_5667())).orElse(false)) {
                     double d0 = var6x.N(class07299, ((class03386)this.m.i_5).s(), class00945);
                     if (!(d0 <= -60.0) && !(d0 > 60.0)) {
                        int j = class04995.u((var1.N() - 9) / 2.0F);
                        class00028 class00028 = var6x.y();
                        class08301 class08301 = this.m.a().N(class00028.u);
                        float f = class04995.N((float)var6x.N(class07049));
                        class01894 class01894x = class08301.N(f);
                        int k = class00028.i
                           .orElseGet(
                              () -> (Integer)var6x.N()
                                 .map(
                                    var0x -> class02566.L(class02566.R(255, var0x.hashCode()), 0.9F),
                                    var0x -> class02566.L(class02566.R(255, var0x.hashCode()), 0.9F)
                                 )
                           );
                        int l = class04995.N(d0 * 173.0 / 2.0 / 60.0);
                        var1.N(class08394.Na, class01894x, j + l, ix - 2, 9, 9, k);
                        class00036 class00036 = var6x.N(class07299, (class03386)this.m.i_5, class00945);
                        if (class00036 != class00036.field_60423) {
                           byte b0;
                           class01894 class01894x;
                           if (class00036 == class00036.field_60425) {
                              b0 = 6;
                              class01894x = M;
                           } else {
                              b0 = -6;
                              class01894x = R;
                           }

                           var1.N(class08394.Na, class01894x, j + l + 1, ix + b0, 7, 5);
                        }
                     }
                  }
               }
            );
      }
   }

   @Override
   public void N(class01054 var1, class02233 var2) {
      var1.N(class08394.Na, i, this.N(this.m.Nt()), this.y(this.m.Nt()), 182, 5);
   }
}
