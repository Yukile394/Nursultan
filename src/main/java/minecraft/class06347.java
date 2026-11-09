package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

public class class06347<T> {
   private final Supplier<T> N;
   private final Function<T, class00392> y;
   private class04355<T> L = var0 -> null;
   private class06372<T> u = (var0, var1x) -> null;
   private Function<class06366<T>, class05216> i = class06366::L;
   private class06363<T> R = class06363.N(ImmutableList.of());
   private class06343 M = class06343.field_64539;

   public class06347(Function<T, class00392> var1, Supplier<T> var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public class06366<T> N(int var1, int var2, int var3, int var4, class00392 var5) {
      return this.N(var1, var2, var3, var4, var5, (var0, var1x) -> {});
   }

   public class06366<T> N(class00392 var1, class06355<T> var2) {
      return this.N(0, 0, 150, 20, var1, var2);
   }

   public class06347<T> N() {
      return this.N(class06343.field_64540);
   }

   public class06347<T> N(class06343 var1) {
      this.M = var1;
      return this;
   }

   public class06366<T> N(int var1, int var2, int var3, int var4, class00392 var5, class06355<T> var6) {
      List list = this.R.y();
      if (list.isEmpty()) {
         throw new IllegalStateException("No values for cycle button");
      } else {
         Object object = this.N.get();
         int ix = list.indexOf(object);
         class00392 class00392 = this.y.apply((T)object);
         Object object1 = this.M == class06343.field_64540 ? class00392 : class05220.N(var5, class00392);
         return new class06366<>(var1, var2, var3, var4, (class00392)object1, var5, ix, (T)object, this.N, this.R, this.y, this.i, var6, this.L, this.M, this.u);
      }
   }

   public class06347<T> N(BooleanSupplier var1, List<T> var2, List<T> var3) {
      return this.N(class06363.N(var1, var2, var3));
   }

   public class06347<T> N(List<T> var1, List<T> var2) {
      return this.N(class06363.N(class06366.N, var1, var2));
   }

   @SafeVarargs
   public final class06347<T> N(T... var1) {
      return this.N((Collection<T>)ImmutableList.copyOf(var1));
   }

   public class06347<T> N(Collection<T> var1) {
      return this.N(class06363.N(var1));
   }

   public class06347<T> N(class06372<T> var1) {
      this.u = var1;
      return this;
   }

   public class06347<T> N_57(Function<class06366<T>, class05216> var1) {
      this.i = var1;
      return this;
   }

   public class06347<T> N(class04355<T> var1) {
      this.L = var1;
      return this;
   }

   public class06347<T> N(class06363<T> var1) {
      this.R = var1;
      return this;
   }
}
