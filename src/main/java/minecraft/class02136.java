package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class class02136<E> {
   private final Builder<class04523<E>> N = ImmutableList.builder();

   public class02136() {
      super();
   }

   public class04540<E> N() {
      return new class04540<>(this.N.build());
   }

   public class02136<E> N(E var1, int var2) {
      this.N.add(new class04523<>(var1, var2));
      return this;
   }

   public class02136<E> N(E var1) {
      return this.N((E)var1, 1);
   }
}
