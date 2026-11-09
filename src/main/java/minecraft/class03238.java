package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record class03238<FC extends class06386, F extends class06391<FC>>(F feature, FC config) {
   public static final Codec<class03238<?, ?>> N = class04206.X.T().dispatch(var0 -> var0.feature, class06391::N);
   public static final Codec<class03556<class03238<?, ?>>> y = class01281.N(class04227.Nh, N);
   public static final Codec<class03543<class03238<?, ?>>> L = class03541.N(class04227.Nh, N);

   public FC L() {
      return this.config;
   }

   public class03238(F feature, FC config) {
      super();
      this.feature = (F)feature;
      this.config = (FC)config;
   }

   @Override
   public String toString() {
      return "Configured: " + this.feature + ": " + this.config;
   }

   public F y() {
      return this.feature;
   }

   public Stream<class03238<?, ?>> N() {
      return Stream.concat(Stream.of(this), this.config.u());
   }

   public boolean N(class05974 var1, class08088 var2, class06069 var3, class07209 var4) {
      return this.feature.N(this.config, var1, var2, var3, var4);
   }
}
