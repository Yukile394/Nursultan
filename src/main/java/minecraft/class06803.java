package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class class06803 implements class02168<Predicate<class06584>, class06797, class06764> {
   private final class01929 N;
   private final class01921<class06581> y;
   private final class01921<class02477<?>> L;
   private final class01921<class02487<?>> u;

   @Override
   public Stream<class01894> L() {
      return Stream.concat(class06793.M.keySet().stream(), this.L.z().filter(var0 -> !var0.N().u()).map(var0 -> var0.B().N()));
   }

   public class06797 R(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException {
      class06797 class06797 = class06793.M.get(var2);
      if (class06797 != null) {
         return class06797;
      } else {
         class02477 class02477 = this.L.N(class05946.N(class04227.b, var2)).map(class03556::N).orElseThrow(() -> class06793.L.createWithContext(var1, var2));
         return class06797.N(var1, var2, class02477);
      }
   }

   class06803(class01929 var1) {
      super();
      this.N = var1;
      this.y = var1.y(class04227.F);
      this.L = var1.y(class04227.b);
      this.u = var1.y(class04227.T);
   }

   @Override
   public Stream<class01894> u() {
      return Stream.concat(class06793.B.keySet().stream(), this.u.n().map(class05946::N));
   }

   public class06764 i(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException {
      class06764 class06764 = class06793.B.get(var2);
      return class06764 != null
         ? class06764
         : this.u
            .N(class05946.N(class04227.T, var2))
            .map(class06764::new)
            .or(() -> this.L.N(class05946.N(class04227.b, var2)).map(class06793::N))
            .orElseThrow(() -> class06793.i.createWithContext(var1, var2));
   }

   public Predicate<class06584> M(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException {
      return var1x -> var1x.N(var0);
   }

   @Override
   public Stream<class01894> y() {
      return this.y.t().map(class03530::y);
   }

   public Predicate<class06584> y(ImmutableStringReader var1, class06797 var2, Dynamic<?> var3) throws CommandSyntaxException {
      return var2.N(var1, class03519.N(var3, this.N));
   }

   public Predicate<class06584> N(ImmutableStringReader var1, class06797 var2) {
      return var2.y();
   }

   public Predicate<class06584> N(ImmutableStringReader var1, class06764 var2, Dynamic<?> var3) throws CommandSyntaxException {
      return var2.N(var1, class03519.N(var3, this.N));
   }

   public Predicate<class06584> B(ImmutableStringReader var1, class01894 var2) throws CommandSyntaxException {
      return var1x -> var1x.N(var0);
   }

   public Predicate<class06584> y(List<Predicate<class06584>> var1) {
      return class07536.y(var1);
   }

   @Override
   public Stream<class01894> N() {
      return this.y.n().map(class05946::N);
   }

   public Predicate<class06584> N(Predicate<class06584> var1) {
      return var1.negate();
   }
}
