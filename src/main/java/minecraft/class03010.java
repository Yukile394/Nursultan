package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

record class03010(List<class03028> sequence) implements class03028 {
   static final class03979<class03010> N = class03979.N(class03028.y.listOf().xmap(class03010::new, class03010::y).fieldOf("sequence"));

   class03010(List<class03028> sequence) {
      super();
      this.sequence = sequence;
   }

   public List<class03028> y() {
      return this.sequence;
   }

   public class03003 apply(class04039 var1) {
      if (this.sequence.size() == 1) {
         return this.sequence.get(0).apply(var1);
      } else {
         Builder builder = ImmutableList.builder();

         for (class03028 class03028 : this.sequence) {
            builder.add(class03028.apply(var1));
         }

         return new class03014(builder.build());
      }
   }

   @Override
   public class03979<? extends class03028> N() {
      return N;
   }
}
