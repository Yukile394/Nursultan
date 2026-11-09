package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public record class07829<WC extends class06034>(class02158<WC> worldCarver, WC config) {
   public static final Codec<class07829<?>> N = class04206.c.T().dispatch(var0 -> var0.worldCarver, class02158::L);
   public static final Codec<class03556<class07829<?>>> y = class01281.N(class04227.ND, N);
   public static final Codec<class03543<class07829<?>>> L = class03541.N(class04227.ND, N);

   public class07829(class02158<WC> worldCarver, WC config) {
      super();
      this.worldCarver = worldCarver;
      this.config = (WC)config;
   }

   public WC y() {
      return this.config;
   }

   public boolean N(
      class06080 var1, class08050 var2, Function<class07209, class03556<class00780>> var3, class06069 var4, class03460 var5, class07321 var6, class03322 var7
   ) {
      return class07529.N(var2.R()) ? false : this.worldCarver.N(var1, this.config, var2, var3, var4, var5, var6, var7);
   }

   public class02158<WC> N() {
      return this.worldCarver;
   }

   public boolean N(class06069 var1) {
      return this.worldCarver.N(this.config, var1);
   }
}
