package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class02896<T extends class00638, B extends ByteBuf, C> {
   final class00648 N;
   final class00423 y;
   private final List<class02898<T, ?, B, C>> L = new ArrayList<>();
   @Nullable
   private class03276 u;

   public static <T extends class01636, B extends ByteBuf, C> class00160<T, B, C> L(class00648 var0, Consumer<class02896<T, B, C>> var1) {
      return y(var0, class00423.field_11941, var1);
   }

   public class02896(class00648 var1, class00423 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public static <T extends class01673, B extends ByteBuf, C> class00160<T, B, C> u(class00648 var0, Consumer<class02896<T, B, C>> var1) {
      return y(var0, class00423.field_11942, var1);
   }

   private static <L extends class00638, B extends ByteBuf, C> class00160<L, B, C> y(class00648 var0, class00423 var1, Consumer<class02896<L, B, C>> var2) {
      class02896 class02896 = new class02896(var0, var1);
      var2.accept(class02896);
      return class02896.N();
   }

   public static <T extends class01673, B extends ByteBuf> class00165<T, B> y(class00648 var0, Consumer<class02896<T, B, class06244>> var1) {
      return N(var0, class00423.field_11942, var1);
   }

   private static <L extends class00638, B extends ByteBuf> class00165<L, B> N(class00648 var0, class00423 var1, Consumer<class02896<L, B, class06244>> var2) {
      class02896 class02896 = new class02896(var0, var1);
      var2.accept(class02896);
      return class02896.N(class06244.field_17274);
   }

   public static <T extends class01636, B extends ByteBuf> class00165<T, B> N(class00648 var0, Consumer<class02896<T, B, class06244>> var1) {
      return N(var0, class00423.field_11941, var1);
   }

   public class00160<T, B, C> N() {
      List list = List.copyOf(this.L);
      class03276 class03276 = this.u;
      class04262 class04262 = N(this.N, this.y, list);
      return new class02882<>(this, list, class03276, class04262);
   }

   public <P extends class00381<? super T>> class02896<T, B, C> N(class02897<P> var1, class02362<? super B, P> var2) {
      this.L.add(new class02898<>(var1, var2, null));
      return this;
   }

   public <P extends class03260<? super T>, D extends class03242<? super T>> class02896<T, B, C> N(
      class02897<P> var1, Function<Iterable<class00381<? super T>>, P> var2, D var3
   ) {
      class02362 class02362 = class02362.N(var3);
      class02897 class02897 = var3.method_65080();
      this.L.add(new class02898<>(class02897, class02362, null));
      this.u = class03276.N(var1, var2, var3);
      return this;
   }

   class02362<ByteBuf, class00381<? super T>> N(Function<ByteBuf, B> var1, List<class02898<T, ?, B, C>> var2, C var3) {
      class02890 class02890 = new class02890(this.y);
      Iterator iterator = var2.iterator();

      while (iterator.hasNext()) {
         ((class02898)iterator.next()).N(class02890, var1, var3);
      }

      return class02890.N();
   }

   private static class04262 N(class00648 var0, class00423 var1, List<? extends class02898<?, ?, ?, ?>> var2) {
      return new class02865(var0, var1, var2);
   }

   public class00165<T, B> N(C var1) {
      List list = List.copyOf(this.L);
      class03276 class03276 = this.u;
      class04262 class04262 = N(this.N, this.y, list);
      return new class02888<>(this, list, var1, class03276, class04262);
   }

   public <P extends class00381<? super T>> class02896<T, B, C> N(class02897<P> var1, class02362<? super B, P> var2, class00145<B, P, C> var3) {
      this.L.add(new class02898<>(var1, var2, var3));
      return this;
   }
}
