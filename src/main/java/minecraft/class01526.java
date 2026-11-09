package minecraft;

import java.util.function.BiConsumer;

public record class01526(class01929 registries) implements class02013 {
   public class01526(class01929 registries) {
      super();
      this.registries = registries;
   }

   public class01929 N() {
      return this.registries;
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      class01921 class01921 = this.registries.y(class04227.yR);
      var1.accept(
         class06273.Na,
         class05074.y()
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03798.N(class06570.jY).N(5).N(new class08848().N(class01921.y(class07314.E))))
                  .N(class03798.N(class06570.bv).N(8).N(new class08848().N(class01921.y(class07314.E))))
                  .N(class03798.N(class06570.ns).N(8).N(class04030.N(class06506.E)))
                  .N(class03798.N(class06570.lO).N(8).N(class04030.N(class06506.E)))
                  .N(class03798.N(class06570.ns).N(10).N(class04030.N(class06506.N)))
                  .N(class03798.N(class06570.lF).N(10).N(class07621.N(class06345.N(10.0F, 36.0F))))
                  .N(class03798.N(class06570.nz).N(10).N(class07621.N(class06345.N(2.0F, 4.0F))))
                  .N(class03798.N(class06570.EU).N(10).N(class07621.N(class04711.N(1.0F))))
                  .N(class03798.N(class06570.Th).N(20).N(class07621.N(class06345.N(3.0F, 9.0F))))
                  .N(class03798.N(class06570.Tu).N(20).N(class07621.N(class06345.N(5.0F, 12.0F))))
                  .N(class03798.N(class06570.Rz).N(40))
                  .N(class03798.N(class06570.wE).N(40).N(class07621.N(class06345.N(1.0F, 3.0F))))
                  .N(class03798.N(class06570.GZ).N(40))
                  .N(class03798.N(class06570.js).N(40).N(class07621.N(class06345.N(2.0F, 4.0F))))
                  .N(class03798.N(class06570.Rx).N(40).N(class07621.N(class06345.N(2.0F, 8.0F))))
                  .N(class03798.N(class06570.GK).N(40).N(class07621.N(class06345.N(2.0F, 8.0F))))
                  .N(class03798.N(class06570.lg).N(40).N(class07621.N(class06345.N(6.0F, 12.0F))))
                  .N(class03798.N(class06570.NE).N(40).N(class07621.N(class06345.N(8.0F, 16.0F))))
                  .N(class03798.N(class06570.wW).N(40).N(class07621.N(class06345.N(8.0F, 16.0F))))
            )
      );
   }
}
