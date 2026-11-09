package minecraft;

import java.util.Collection;

public interface class06934 {
   default void N(Collection<class06584> var1) {
      this.N(var1, class06908.field_40191);
   }

   default void N(Collection<class06584> var1, class06908 var2) {
      var1.forEach(var2x -> this.method_45417(var2x, var2));
   }

   default void N(class07310 var1) {
      this.method_45417(new class06584(var1), class06908.field_40191);
   }

   default void N(class06584 var1) {
      this.method_45417(var1, class06908.field_40191);
   }

   default void N(class07310 var1, class06908 var2) {
      this.method_45417(new class06584(var1), var2);
   }

   void method_45417(class06584 var1, class06908 var2);
}
