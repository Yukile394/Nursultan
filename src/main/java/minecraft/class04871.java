package minecraft;

import java.util.function.Supplier;

public record class04871(Supplier<class07948> any, Supplier<class07948> nonFishy) {
   public class04871(Supplier<class07948> any, Supplier<class07948> nonFishy) {
      super();
      this.any = any;
      this.nonFishy = nonFishy;
   }

   public Supplier<class07948> y() {
      return this.nonFishy;
   }

   public Supplier<class07948> N() {
      return this.any;
   }

   Supplier<class07948> N(boolean var1) {
      return var1 ? this.nonFishy : this.any;
   }
}
