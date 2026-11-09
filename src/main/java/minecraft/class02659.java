package minecraft;

import java.util.function.BiConsumer;

public record class02659(class01929 registries) implements class02013 {
   public class02659(class01929 registries) {
      this.registries = registries;
   }

   public class01929 N() {
      return this.registries;
   }

   public static class05062 N(class06581 var0, class06581 var1, class03254 var2, class01921<class07304> var3) {
      return class05074.y()
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .y(class07657.N(0.5F))
               .N(
                  class03798.N(var0)
                     .N(class02702.N(class02484.Nu, var2))
                     .N(
                        new class04829()
                           .N(var3.y(class07314.N), class04711.N(4.0F))
                           .N(var3.y(class07314.i), class04711.N(4.0F))
                           .N(var3.y(class07314.y), class04711.N(4.0F))
                     )
               )
         )
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .y(class07657.N(0.5F))
               .N(
                  class03798.N(var1)
                     .N(class02702.N(class02484.Nu, var2))
                     .N(
                        new class04829()
                           .N(var3.y(class07314.N), class04711.N(4.0F))
                           .N(var3.y(class07314.i), class04711.N(4.0F))
                           .N(var3.y(class07314.y), class04711.N(4.0F))
                     )
               )
         );
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      class01921 class01921xx = this.registries.y(class04227.yk);
      class01921 class01921x = this.registries.y(class04227.yw);
      class01921 class01921xx = this.registries.y(class04227.yR);
      class03254 class03254x = new class03254(class01921x.y(class03270.i), class01921xx.y(class03247.T));
      class03254 class03254x = new class03254(class01921x.y(class03270.i), class01921xx.y(class03247.b));
      var1.accept(
         class06273.NZ,
         class05074.y()
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03367.N(N(class06570.bW, class06570.bm, class03254x, class01921xx).L()).N(4))
                  .N(class03367.N(N(class06570.bT, class06570.bb, class03254x, class01921xx).L()).N(2))
                  .N(class03367.N(N(class06570.bn, class06570.bt, class03254x, class01921xx).L()).N(1))
            )
      );
      var1.accept(
         class06273.NU,
         class05074.y()
            .N(class05441.N().N(class04711.N(1.0F)).N(class03367.N(class06273.NZ)))
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03798.N(class06570.To).N(4))
                  .N(class03798.N(class06570.To).N(new class04829().N(class01921xx.y(class07314.m), class04711.N(1.0F))))
                  .N(class03798.N(class06570.To).N(new class04829().N(class01921xx.y(class07314.T), class04711.N(1.0F))))
                  .N(class03798.N(class06570.TH))
            )
      );
      var1.accept(
         class06273.Nz,
         class05074.y()
            .N(class05441.N().N(class04711.N(1.0F)).N(class03367.N(class06273.NZ)))
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03798.N(class06570.sx).N(2))
                  .N(class03798.N(class06570.sx).N(new class04829().N(class01921xx.y(class07314.d), class04711.N(1.0F))))
                  .N(class03798.N(class06570.sx).N(new class04829().N(class01921xx.y(class07314.w), class04711.N(1.0F))))
            )
      );
   }
}
