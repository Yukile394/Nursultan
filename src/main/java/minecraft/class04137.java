package minecraft;

import Nursultan.class10309;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Unit;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class class04137<E extends class07438, M> implements App<class10309<E>, M> {
   private final class04140<E, M> N;

   public class04137(class04140<E, M> var1) {
      super();
      this.N = var1;
   }

   public static <E extends class07438, M> class04140<E, M> y(App<class10309<E>, M> var0) {
      return N(var0).N;
   }

   public static <E extends class07438, M> class04137<E, M> N(class04140<E, M> var0) {
      return new class04137<>(var0);
   }

   public static <E extends class07438> class04119<E> N_44(Predicate<E> var0, class04119<? super E> var1) {
      return N(N_43(var0), var1);
   }

   public static <E extends class07438> class04119<E> N(class04118<? super E> var0, class04118<? super E> var1) {
      return N_42(var2 -> var2.group(var2.N(var0)).apply(var2, var1xx -> var1::trigger));
   }

   public static <E extends class07438> class04119<E> N_42(Function<class04128<E>, ? extends App<class10309<E>, class04118<E>>> var0) {
      class04140 class04140 = y((App<class10309<E>, M>)var0.apply(N()));
      return new class04143<>(class04140);
   }

   public static <E extends class07438> class04128<E> N() {
      return new class04128<>();
   }

   public static <E extends class07438> class04119<E> N_43(Predicate<E> var0) {
      return N_42(var1 -> var1.point((var1x, var2, var3) -> var0.test(var2)));
   }

   public static <E extends class07438> class04119<E> N(BiPredicate<class04782, E> var0) {
      return N_42(var1 -> var1.point((var1x, var2, var3) -> var0.test(var1x, var2)));
   }

   public static <E extends class07438, M> class04137<E, M> N(App<class10309<E>, M> var0) {
      return (class04137<E, M>)var0;
   }
}
