package minecraft;

import java.util.function.Function;

public record class06875(Function<class01929, class02013> provider, class06929 paramSet) {

   public class06875(Function<class01929, class02013> provider, class06929 paramSet) {
      super();
      this.provider = provider;
      this.paramSet = paramSet;
   }

   public class06929 y() {
      return this.paramSet;
   }

   public Function<class01929, class02013> N() {
      return this.provider;
   }
}
