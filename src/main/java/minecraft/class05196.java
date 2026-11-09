package minecraft;

import Nursultan.class10413;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class class05196 {
   public static final Codec<class05196> N = class05957.L.listOf().xmap(class05196::new, var0 -> var0.y);
   private final List<class05957> y;
   private final Predicate<class05908> L;

   class05196(List<class05957> var1) {
      super();
      this.y = var1;
      this.L = class07536.N(var1);
   }

   public void N(class05561 var1) {
      for (int i = 0; i < this.y.size(); i++) {
         this.y.get(i).N(var1.N(new class10413(i)));
      }
   }

   public static class05196 N(class05957... var0) {
      return new class05196(List.of(var0));
   }

   public boolean N(class05908 var1) {
      return this.L.test(var1);
   }
}
