package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class class00453 implements class08122 {
   protected final List<class05957> M;
   private final Predicate<class05908> N;

   public class00453(List<class05957> var1) {
      super();
      this.M = var1;
      this.N = class07536.N(var1);
   }

   public final class06584 apply(class06584 var1, class05908 var2) {
      return this.N.test(var2) ? this.N(var1, var2) : var1;
   }

   protected static class00471<?> N(Function<List<class05957>, class08122> var0) {
      return new class00460(var0);
   }

   @Override
   public void N(class05561 var1) {
      class08122.super.N(var1);

      for (int i = 0; i < this.M.size(); i++) {
         this.M.get(i).N(var1.N(new class10416("conditions", i)));
      }
   }

   protected abstract class06584 N(class06584 var1, class05908 var2);

   protected static <T extends class00453> P1<Mu<T>, List<class05957>> N(Instance<T> var0) {
      return var0.group(class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(var0x -> var0x.M));
   }

   @Override
   public abstract class05959<? extends class00453> N();
}
