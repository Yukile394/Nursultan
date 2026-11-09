package minecraft;

import com.mojang.serialization.Codec;

record class01401(boolean state) implements class01385 {
   public static final Codec<class01401> N = Codec.BOOL.xmap(class01401::new, class01401::N);

   class01401(boolean state) {
      super();
      this.state = state;
   }

   public boolean N() {
      return this.state;
   }

   public boolean test(class08019 var1) {
      return var1.N() == this.state;
   }
}
