package minecraft;

import Nursultan.class10309;
import Nursultan.class10310;
import Nursultan.class10311;
import Nursultan.class10314;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class class04128<E extends class07438> implements Applicative<class10309<E>, class10314<E>> {
   public <Value> class04137<E, class04139<Mu<Unit>, Value>> L(class05378<Value> var1) {
      return new class10310<>(new class04104(var1));
   }

   public class04128() {
      super();
   }

   public <Value> class04137<E, class04139<com.mojang.datafixers.kinds.IdF.Mu, Value>> y(class05378<Value> var1) {
      return new class10310<>(new class04130(var1));
   }

   public <Value> Value y(class04139<com.mojang.datafixers.kinds.IdF.Mu, Value> var1) {
      return (Value)IdF.get(var1.N());
   }

   public <T1, T2, T3, R> class04137<E, R> ap3(
      App<class10309<E>, Function3<T1, T2, T3, R>> var1, App<class10309<E>, T1> var2, App<class10309<E>, T2> var3, App<class10309<E>, T3> var4
   ) {
      class04140 class04140xxx = class04137.y(var2);
      class04140 class04140x = class04137.y(var3);
      class04140 class04140xx = class04137.y(var4);
      class04140 class04140xxx = class04137.y(var1);
      return class04137.N(new class04117<>(this, class04140xxx, class04140x, class04140xx, class04140xxx));
   }

   public <A, B, R> class04137<E, R> ap2(App<class10309<E>, BiFunction<A, B, R>> var1, App<class10309<E>, A> var2, App<class10309<E>, B> var3) {
      class04140 class04140xx = class04137.y(var2);
      class04140 class04140x = class04137.y(var3);
      class04140 class04140xx = class04137.y(var1);
      return class04137.N(new class04124<>(this, class04140xx, class04140x, class04140xx));
   }

   public <T, R> class04137<E, R> map(Function<? super T, ? extends R> var1, App<class10309<E>, T> var2) {
      class04140 class04140 = class04137.y(var2);
      return class04137.N(new class04134<>(this, class04140, var1));
   }

   public <T1, T2, T3, T4, R> class04137<E, R> ap4(
      App<class10309<E>, Function4<T1, T2, T3, T4, R>> var1,
      App<class10309<E>, T1> var2,
      App<class10309<E>, T2> var3,
      App<class10309<E>, T3> var4,
      App<class10309<E>, T4> var5
   ) {
      class04140 class04140xxxx = class04137.y(var2);
      class04140 class04140x = class04137.y(var3);
      class04140 class04140xx = class04137.y(var4);
      class04140 class04140xxx = class04137.y(var5);
      class04140 class04140xxxx = class04137.y(var1);
      return class04137.N(new class04115<>(this, class04140xxxx, class04140x, class04140xx, class04140xxx, class04140xxxx));
   }

   public <Value> class04137<E, class04139<com.mojang.datafixers.kinds.OptionalBox.Mu, Value>> N(class05378<Value> var1) {
      return new class10310<>(new class04106(var1));
   }

   public class04137<E, Unit> N(class04118<? super E> var1) {
      return new class10311<>(var1);
   }

   public <A> class04137<E, A> point(A var1) {
      return new class04110<>((A)var1);
   }

   public <A> class04137<E, A> N(Supplier<String> var1, A var2) {
      return new class04110<>((A)var2, var1);
   }

   public <Value> Optional<Value> N(class04139<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> var1) {
      return OptionalBox.unbox(var1.N());
   }

   public <A, R> Function<App<class10309<E>, A>, App<class10309<E>, R>> lift1(App<class10309<E>, Function<A, R>> var1) {
      return var2 -> {
         class04140 class04140x = class04137.y(var2);
         class04140 class04140x = class04137.y(var1);
         return class04137.N(new class04146<>(this, class04140x, class04140x));
      };
   }
}
