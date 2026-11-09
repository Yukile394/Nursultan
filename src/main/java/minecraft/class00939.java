package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class class00939<S extends class08800, M extends class06078<S>> extends class06249<S, M> {
   private final Function<S, Optional<class00500>> N;
   private final Consumer<class01421> y;

   public class00939(class06252<S, M> var1, Function<S, Optional<class00500>> var2, Consumer<class01421> var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   @Override
   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      Optional optional = this.N.apply((S)var4);
      if (!optional.isEmpty()) {
         class00500 class00500 = (class00500)optional.get();
         class00891 class00891 = class00500.i();
         boolean flag = class00891 instanceof class08981;
         var1.N();
         this.y.accept(var1);
         if (!flag) {
            var1.N(class02058.R.N(180.0F));
         }

         if (flag || class00891 instanceof class07688 || class00891 instanceof class07685 || class00891 instanceof class05982) {
            var1.N(class02058.u.N(180.0F));
         }

         if (class00891 instanceof class08612) {
            var1.N(-0.25, -1.5, -0.25);
         } else if (!flag) {
            var1.N(-0.5, -1.5, -0.5);
         } else {
            var1.N(-0.5, 0.0, -0.5);
         }

         var2.N(var1, class00500, var3, class01384.u, var4.l);
         var1.y();
      }
   }
}
