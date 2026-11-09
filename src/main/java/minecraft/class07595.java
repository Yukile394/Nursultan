package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Consumer;

public class class07595 {
   private Optional<Integer> N = Optional.empty();
   private final Builder<class00607<?>, class07605<?, ?>> y = ImmutableMap.builder();

   class07595() {
      super();
   }

   public class07587 N() {
      return new class07587(this.N, this.y.build());
   }

   public <Value> class07595 N(class00607<Value> var1, Consumer<class07585<Value>> var2) {
      return this.N(var1, class00619.N(), var2);
   }

   public <Value, Argument> class07595 N(class00607<Value> var1, class00619<Value, Argument> var2, Consumer<class07585<Argument>> var3) {
      var1.N().N(var2);
      class07585 class07585 = new class07585();
      var3.accept(class07585);
      this.y.put(var1, new class07605(var2, class07585.N()));
      return this;
   }

   public class07595 N(int var1) {
      this.N = Optional.of(var1);
      return this;
   }
}
