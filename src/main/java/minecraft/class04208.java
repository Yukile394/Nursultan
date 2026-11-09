package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public enum class04208 implements class05033 {
   field_41122("slim", "slim"),
   field_41123("wide", "default");

   public static final Codec<class04208> field_62533 = class05033.N(class04208::values);
   private static final Function<String, class04208> field_62913 = class05033.N(values(), var0 -> var0.field_62914);
   public static final class02362<ByteBuf, class04208> field_62534 = class02389.y.N_10(var0 -> var0 ? field_41122 : field_41123, var0 -> var0 == field_41122);
   private final String field_41124;
   private final String field_62914;

   private class04208(String var3, String var4) {
      this.field_41124 = var3;
      this.field_62914 = var4;
   }

   public static class04208 N(@Nullable String var0) {
      return Objects.requireNonNullElse(field_62913.apply(var0), field_41123);
   }

   @Override
   public String method_15434() {
      return this.field_41124;
   }
}
