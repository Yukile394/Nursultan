package minecraft;

import java.util.function.BiConsumer;

public record class06893(class01929 registries) implements class02013 {
   public class06893(class01929 registries) {
      super();
      this.registries = registries;
   }

   public class01929 y() {
      return this.registries;
   }

   public static class05062 N() {
      return class05074.y()
         .N(
            class05441.N()
               .N(class03798.N(class06570.vu).N(60))
               .N(class03798.N(class06570.vi).N(25))
               .N(class03798.N(class06570.vR).N(2))
               .N(class03798.N(class06570.vM).N(13))
         );
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      class01921 class01921 = this.registries.y(class04227.NA);
      var1.accept(
         class06273.NW,
         class05074.y()
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03367.N(class06273.Nm).N(10).y(-2))
                  .N(class03367.N(class06273.NP).N(5).y(2).y(class07700.N(class05919.field_935, class00810.N().N(class01365.N(true)))))
                  .N(class03367.N(class06273.Ns).N(85).y(-1))
            )
      );
      var1.accept(class06273.Ns, N());
      var1.accept(
         class06273.Nm,
         class05074.y()
            .N(
               class05441.N()
                  .N(class03798.N(class00869.RS).N(17))
                  .N(class03798.N(class06570.bB).N(10).N(class07882.N(class06345.N(0.0F, 0.9F))))
                  .N(class03798.N(class06570.js).N(10))
                  .N(class03798.N(class06570.vO).N(10))
                  .N(class03798.N(class06570.ns).N(10).N(class04030.N(class06506.N)))
                  .N(class03798.N(class06570.Th).N(5))
                  .N(class03798.N(class06570.jr).N(2).N(class07882.N(class06345.N(0.0F, 0.9F))))
                  .N(class03798.N(class06570.sC).N(10))
                  .N(class03798.N(class06570.Tx).N(5))
                  .N(class03798.N(class06570.vz).N(1).N(class07621.N(class04711.N(10.0F))))
                  .N(class03798.N(class00869.MG).N(10))
                  .N(class03798.N(class06570.nZ).N(10))
                  .N(
                     class03798.N(class00869.mx)
                        .y(class00859.N(class00818.N().N(class03543.N(class01921.y(class00795.d), class01921.y(class00795.w), class01921.y(class00795.k)))))
                        .N(10)
                  )
            )
      );
      var1.accept(
         class06273.NP,
         class05074.y()
            .N(
               class05441.N()
                  .N(class03798.N(class06570.lN))
                  .N(class03798.N(class06570.PF))
                  .N(class03798.N(class06570.sx).N(class07882.N(class06345.N(0.0F, 0.25F))).N(class08611.N(this.registries, class04711.N(30.0F))))
                  .N(class03798.N(class06570.jr).N(class07882.N(class06345.N(0.0F, 0.25F))).N(class08611.N(this.registries, class04711.N(30.0F))))
                  .N(class03798.N(class06570.jY).N(class08611.N(this.registries, class04711.N(30.0F))))
                  .N(class03798.N(class06570.dj))
            )
      );
   }
}
