package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public enum class04575 {
   field_3768("enabled"),
   field_3764("disabled"),
   field_3767("prompt");

   public static final MapCodec<class04575> field_56800 = Codec.BOOL
      .optionalFieldOf("acceptTextures")
      .xmap(var0 -> var0.<class04575>map(var0x -> var0x ? field_3768 : field_3764).orElse(field_3767), var0 -> {
         return switch (var0) {
            case field_3768 -> Optional.of(true);
            case field_3764 -> Optional.of(false);
            case field_3767 -> Optional.empty();
         };
      });
   private final class00392 field_3765;

   private class04575(String var3) {
      this.field_3765 = class00392.L("manageServer.resourcePack." + var3);
   }

   public class00392 N() {
      return this.field_3765;
   }
}
