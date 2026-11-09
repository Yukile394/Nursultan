package minecraft;

import java.util.function.BiConsumer;

public record class02502(class01929 registries) implements class02013 {
   public class02502(class01929 registries) {
      super();
      this.registries = registries;
   }

   public class01929 N() {
      return this.registries;
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      var1.accept(
         class06273.Nx,
         class05074.y()
            .N(
               class05441.N()
                  .N(class04711.N(2.0F))
                  .N(class03798.N(class06570.uc).N(class07621.N(class04711.N(1.0F))))
                  .N(class03798.N(class06570.uX).N(class07621.N(class04711.N(1.0F))))
            )
      );
      class08272.N
         .forEach((var1x, var2) -> var1.accept(class06273.yL.get(var1x), class05074.y().N(class05441.N().N(class06345.N(1.0F, 3.0F)).N(class03798.N(var2)))));
      var1.accept(class06273.yy, class05074.y().N(class01995.method_46031(class06273.yL)));
      var1.accept(
         class06273.ND,
         class05074.y()
            .N(
               class05441.N()
                  .N(
                     class04559.N(
                        class03367.N(class06273.Nh)
                           .y(class07700.N(class05919.field_935, class00810.N().N(class00159.N().N(class02471.N(class02484.NH, class07631.field_18109)).y()))),
                        class03367.N(class06273.Nr)
                           .y(class07700.N(class05919.field_935, class00810.N().N(class00159.N().N(class02471.N(class02484.NH, class07631.field_18110)).y())))
                     )
                  )
            )
      );
      var1.accept(class06273.Nh, class05074.y().N(class05441.N().N(class04711.N(5.0F)).N(class03798.N(class06570.uX))));
      var1.accept(class06273.Nr, class05074.y().N(class05441.N().N(class04711.N(5.0F)).N(class03798.N(class06570.uc))));
      var1.accept(class06273.yN, class05074.y().N(class05441.N().N(class04711.N(1.0F)).N(class03798.N(class06570.Rf))));
   }
}
