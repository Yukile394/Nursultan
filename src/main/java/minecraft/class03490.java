package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record class03490(Optional<class06581> back, Optional<class06581> left, Optional<class06581> right, Optional<class06581> front) implements class02694 {
   public static final class03490 N = new class03490(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<class03490> y = class04206.B.T().sizeLimitedListOf(4).xmap(class03490::new, class03490::N);
   public static final class02362<class04247, class03490> L = class02389.N(class04227.F).N_33(class02389.L(4)).N_10(class03490::new, class03490::N);

   public Optional<class06581> L() {
      return this.left;
   }

   public class03490(Optional<class06581> back, Optional<class06581> left, Optional<class06581> right, Optional<class06581> front) {
      super();
      this.back = back;
      this.left = left;
      this.right = right;
      this.front = front;
   }

   public class03490(class06581 var1, class06581 var2, class06581 var3, class06581 var4) {
      this(List.of(var1, var2, var3, var4));
   }

   private class03490(List<class06581> var1) {
      this(N((List<class06581>)var1, 0), N((List<class06581>)var1, 1), N((List<class06581>)var1, 2), N((List<class06581>)var1, 3));
   }

   public Optional<class06581> i() {
      return this.front;
   }

   public Optional<class06581> u() {
      return this.right;
   }

   public Optional<class06581> y() {
      return this.back;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (!this.equals(N)) {
         var2.accept(class05220.N);
         N(var2, this.front);
         N(var2, this.left);
         N(var2, this.right);
         N(var2, this.back);
      }
   }

   private static void N(Consumer<class00392> var0, Optional<class06581> var1) {
      var0.accept(new class06584(var1.orElse(class06570.jl), 1).d().y().N(class06541.field_1080));
   }

   public List<class06581> N() {
      return Stream.of(this.back, this.left, this.right, this.front).map(var0 -> var0.orElse(class06570.jl)).toList();
   }

   private static Optional<class06581> N(List<class06581> var0, int var1) {
      if (var1 >= var0.size()) {
         return Optional.empty();
      } else {
         class06581 class06581 = (class06581)var0.get(var1);
         return class06581 == class06570.jl ? Optional.empty() : Optional.of(class06581);
      }
   }
}
