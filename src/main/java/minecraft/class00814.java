package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;

public class class00814 {
   private final Builder<class03556<class07084>, class00849> N = ImmutableMap.builder();

   public class00814() {
      super();
   }

   public Optional<class00834> y() {
      return Optional.of(new class00834(this.N.build()));
   }

   public static class00814 N() {
      return new class00814();
   }

   public class00814 N(class03556<class07084> var1, class00849 var2) {
      this.N.put(var1, var2);
      return this;
   }

   public class00814 N(class03556<class07084> var1) {
      this.N.put(var1, new class00849());
      return this;
   }
}
