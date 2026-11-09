package minecraft;

import com.mojang.serialization.Codec;

public record class02926(class02952 predicate) implements class02465<class02827> {
   public static final Codec<class02926> N = class02952.N.xmap(class02926::new, class02926::N);

   public class02926(class02952 predicate) {
      super();
      this.predicate = predicate;
   }

   @Override
   public class02477<class02827> y() {
      return class02484.Ns;
   }

   public boolean N(class02827 var1) {
      return this.predicate.test(var1);
   }

   public class02952 N() {
      return this.predicate;
   }
}
