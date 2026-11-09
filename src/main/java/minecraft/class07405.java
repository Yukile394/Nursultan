package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class class07405 {
   public class07405() {
      super();
   }

   public static <T> class07423<T> N(class07393 var0, class06839<T> var1, T var2) {
      return var0.u().N(var1, (T)var2);
   }

   public static <T> class07423<T> N(class07393 var0, class07423<T> var1, class07403 var2) {
      return var0.u().N(var1, var2);
   }

   private static <T> void N(class07393 var0, class06839<T> var1, List<class07423<?>> var2) {
      Object object = var0.u().N(var1);
      var2.add(N(var0, var1, Objects.requireNonNull(object)));
   }

   public static List<class07423<?>> N(class07393 var0) {
      ArrayList arraylist = new ArrayList();
      var0.u().N().forEach(var2 -> N(var0, (class06839<?>)var2, arraylist));
      return arraylist;
   }
}
