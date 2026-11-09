package minecraft;

import com.mojang.serialization.Codec;

public record class00829(class03543<class07078<?>> types) {
   public static final Codec<class00829> N = class03541.N(class04227.I).xmap(class00829::new, class00829::N);

   public class00829(class03543<class07078<?>> types) {
      this.types = types;
   }

   public static class00829 N(class02055<class07078<?>> var0, class03530<class07078<?>> var1) {
      return new class00829(var0.y(var1));
   }

   public class03543<class07078<?>> N() {
      return this.types;
   }

   public boolean N(class07078<?> var1) {
      return var1.N(this.types);
   }

   public static class00829 N(class02055<class07078<?>> var0, class07078<?> var1) {
      return new class00829(class03543.N(var1.T()));
   }
}
