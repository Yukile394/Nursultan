package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public interface class08578<Context, Condition extends class08584<Context>> {
   static <Context, Condition extends class08584<Context>> List<class08556<Context, Condition>> N(int var0) {
      return List.of(new class08556<>(Optional.empty(), var0));
   }

   static <Context, Condition extends class08584<Context>> List<class08556<Context, Condition>> N(Condition var0, int var1) {
      return List.of(new class08556<>((Condition)var0, var1));
   }

   static <C, T> Optional<T> N(Stream<T> var0, Function<T, class08578<C, ?>> var1, class06069 var2, C var3) {
      return class07536.y_9(N(var0, var1, var3).toList(), var2);
   }

   static <C, T> Stream<T> N(Stream<T> var0, Function<T, class08578<C, ?>> var1, C var2) {
      ArrayList arraylist = new ArrayList();
      var0.forEach(var2x -> {
         for (class08556 class08556 : ((class08578)var1.apply(var2x)).N()) {
            arraylist.add(new class08560<>(var2x, class08556.y(), (class08584<C>)DataFixUtils.orElseGet(class08556.N(), class08584::L)));
         }
      });
      arraylist.sort(class08560.L);
      Iterator iterator = arraylist.iterator();
      int i = Integer.MIN_VALUE;

      while (iterator.hasNext()) {
         class08560 class08560 = (class08560)iterator.next();
         if (class08560.y() < i) {
            iterator.remove();
         } else if (class08560.L().test((C)var2)) {
            i = class08560.y();
         } else {
            iterator.remove();
         }
      }

      return arraylist.stream().map(class08560::N);
   }

   List<class08556<Context, Condition>> N();
}
