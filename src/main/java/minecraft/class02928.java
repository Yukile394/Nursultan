package minecraft;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface class02928<T> {
   T y();

   default void N(class06584 var1, UnaryOperator<class06584> var2) {
      Object object = var1.method_58694(this.N());
      if (object != null) {
         UnaryOperator unaryoperator = var1x -> {
            if (var1x.R()) {
               return var1x;
            } else {
               class06584 class06584 = var2.apply(var1x);
               class06584.R(class06584.U());
               return class06584;
            }
         };
         this.N(var1, this.N((T)object).map(unaryoperator));
      }
   }

   default class06838 N(class06584 var1) {
      return () -> {
         Object object = var1.method_58694(this.N());
         return object != null ? this.N((T)object).filter(var0 -> !var0.R()) : Stream.empty();
      };
   }

   class02477<T> N();

   T N(T var1, Stream<class06584> var2);

   Stream<class06584> N(T var1);

   default void N(class06584 var1, T var2, Stream<class06584> var3) {
      Object object = var1.a_(this.N(), (T)var2);
      Object object1 = this.N((T)object, var3);
      var1.N(this.N(), (T)object1);
   }

   default void N(class06584 var1, Stream<class06584> var2) {
      this.N(var1, this.y(), var2);
   }
}
