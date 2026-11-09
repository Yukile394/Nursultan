package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.net.URI;
import java.net.URISyntaxException;

public class class06961 {
   public static final Codec<URI> N = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(new URI(var0));
      } catch (URISyntaxException urisyntaxexception) {
         return DataResult.error(urisyntaxexception::getMessage);
      }
   }, URI::toString);

   public class06961() {
      super();
   }

   public static URI N(String var0) {
      return URI.create("#/components/schemas/" + var0);
   }
}
