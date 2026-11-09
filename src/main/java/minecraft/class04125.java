package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public record class04125(List<class03607> selectors) {
   public static final Codec<class04125> N = class06338.y(class03607.N.listOf()).xmap(class04125::new, class04125::N);

   public class04125(List<class03607> selectors) {
      super();
      this.selectors = selectors;
   }

   public List<class03607> N() {
      return this.selectors;
   }

   public class08855 N(class00507<class00891, class00500> var1) {
      Builder builder = ImmutableList.builderWithExpectedSize(this.selectors.size());

      for (class03607 class03607 : this.selectors) {
         builder.add(new class08866<>(class03607.N(var1), class03607.y()));
      }

      return new class08855(builder.build());
   }
}
