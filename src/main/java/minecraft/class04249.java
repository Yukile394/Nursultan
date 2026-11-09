package minecraft;

import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class class04249 {
   private final UnaryOperator<Supplier<Stream<class03529<class00201>>>> N;
   private final UnaryOperator<Supplier<Stream<class07209>>> y;

   public class04283 L(CommandContext<class07701> var1) {
      class07701 class07701 = (class07701)var1.getSource();
      return this.N(class07701, class04283.N, () -> class05514.N(class07209.method_49638(class07701.i()), class07701.z().method_14242(), class07701.R()));
   }

   public class04249() {
      super();
      this.N = var0 -> var0;
      this.y = var0 -> var0;
   }

   private class04249(UnaryOperator<Supplier<Stream<class03529<class00201>>>> var1, UnaryOperator<Supplier<Stream<class07209>>> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class04283 u(CommandContext<class07701> var1) {
      return this.N(var1, false);
   }

   public class04283 y(CommandContext<class07701> var1) {
      class07701 class07701 = (class07701)var1.getSource();
      class07209 class07209 = class07209.method_49638(class07701.i());
      return this.N(class07701, class04283.N, () -> class05514.L(class07209, 250, class07701.R()));
   }

   private static <Q> UnaryOperator<Supplier<Stream<Q>>> y(int var0) {
      return var1 -> {
         LinkedList linkedlist = new LinkedList();
         List list = ((Stream)var1.get()).toList();

         for (int i = 0; i < var0; i++) {
            linkedlist.addAll(list);
         }

         return linkedlist::stream;
      };
   }

   public class04283 N(CommandContext<class07701> var1, Collection<class03529<class00201>> var2) {
      return this.N((class07701)var1.getSource(), var2::stream, class04283.y);
   }

   public class04249 N(int var1) {
      return new class04249(y(var1), y(var1));
   }

   public class04283 N(CommandContext<class07701> var1) {
      class07701 class07701 = (class07701)var1.getSource();
      class07209 class07209 = class07209.method_49638(class07701.i());
      return this.N(class07701, class04283.N, () -> class05514.y(class07209, 15, class07701.R()).stream());
   }

   public class04283 N(CommandContext<class07701> var1, int var2) {
      class07701 class07701 = (class07701)var1.getSource();
      class07209 class07209 = class07209.method_49638(class07701.i());
      return this.N(class07701, class04283.N, () -> class05514.L(class07209, var2, class07701.R()));
   }

   public class04283 N(CommandContext<class07701> var1, boolean var2) {
      return this.N((class07701)var1.getSource(), () -> class00204.N().filter(var1x -> !var2 || var1x.N().B()), class04283.y);
   }

   private class04283 N(class07701 var1, class00211 var2, class00226 var3) {
      return new class04283(var1, this.N.apply(var2::findTests)::get, this.y.apply(var3::findTestPos)::get);
   }
}
