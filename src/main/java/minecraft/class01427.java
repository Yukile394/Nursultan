package minecraft;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class class01427 {
   private Optional<class03543<class00891>> N = Optional.empty();
   private Optional<class01400> y = Optional.empty();
   private Optional<class00809> L = Optional.empty();
   private class00142 u = class00142.N;

   private class01427() {
      super();
   }

   public class01392 y() {
      return new class01392(this.N, this.y, this.L, this.u);
   }

   public class01427 N(class07001 var1) {
      this.L = Optional.of(new class00809(var1));
      return this;
   }

   public class01427 N(class01408 var1) {
      this.y = var1.y();
      return this;
   }

   public class01427 N(class00142 var1) {
      this.u = var1;
      return this;
   }

   public class01427 N(class02055<class00891> var1, class03530<class00891> var2) {
      this.N = Optional.of(var1.y(var2));
      return this;
   }

   public static class01427 N() {
      return new class01427();
   }

   public class01427 N(class02055<class00891> var1, Collection<class00891> var2) {
      this.N = Optional.of(class03543.N(class00891::s, var2));
      return this;
   }

   public class01427 N(class02055<class00891> var1, class00891... var2) {
      return this.N(var1, Arrays.asList(var2));
   }
}
