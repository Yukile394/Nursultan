package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public record class07824(byte[] iconBytes) {
   private static final String L = "data:image/png;base64,";
   public static final Codec<class07824> N = Codec.STRING.comapFlatMap(var0 -> {
      if (!var0.startsWith("data:image/png;base64,")) {
         return DataResult.error(() -> "Unknown format");
      } else {
         try {
            String s = var0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
            byte[] abyte = Base64.getDecoder().decode(s.getBytes(StandardCharsets.UTF_8));
            return DataResult.success(new class07824(abyte));
         } catch (IllegalArgumentException illegalargumentexception) {
            return DataResult.error(() -> "Malformed base64 server icon");
         }
      }
   }, var0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode(var0.iconBytes), StandardCharsets.UTF_8));

   public class07824(byte[] iconBytes) {
      this.iconBytes = iconBytes;
   }

   public byte[] N() {
      return this.iconBytes;
   }
}
