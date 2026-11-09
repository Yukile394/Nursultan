package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public record class08099(class01929 registries) implements class02013 {
   private static final List<class08114> y = List.of(
      new class08114(class06273.yi, class07078.Nr, class06570.GO),
      new class08114(class06273.yR, class07078.q, class06570.GY),
      new class08114(class06273.yM, class07078.ym, class06570.Gl),
      new class08114(class06273.yB, class07078.yA, class06570.Gd),
      new class08114(class06273.yZ, class07078.yx, class06570.Gk)
   );

   public class08099(class01929 registries) {
      super();
      this.registries = registries;
   }

   public class01929 N() {
      return this.registries;
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      class01921 class01921 = this.registries.y(class04227.I);
      ArrayList arraylist = new ArrayList(y.size());

      for (class08114 class08114 : y) {
         var1.accept(class08114.N(), class05074.y().N(class05441.N().N(class04711.N(1.0F)).N(class03798.N(class08114.L()))));
         class05952 class05952 = class07700.N(class05919.field_935, class00810.N().N(class00829.N(class01921, class08114.y())));
         arraylist.add(class03367.N(class08114.N()).y(class05952));
      }

      var1.accept(class06273.yu, class05074.y().N(class05441.N().N(class04711.N(1.0F)).N(class04559.N(arraylist.toArray(class04111[]::new)))));
   }
}
