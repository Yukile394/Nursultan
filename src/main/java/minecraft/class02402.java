package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;

class class02402 implements class02362<ByteBuf, JsonElement> {
   private static final Gson y = new GsonBuilder().disableHtmlEscaping().create();

   class02402(int var1) {
      super();
      this.N = var1;
   }

   public JsonElement decode(ByteBuf var1) {
      String s = class01663.N(var1, this.N);

      try {
         return class08314.N(s);
      } catch (JsonSyntaxException jsonsyntaxexception) {
         throw new DecoderException("Failed to parse JSON", jsonsyntaxexception);
      }
   }

   public void encode(ByteBuf var1, JsonElement var2) {
      String s = y.toJson(var2);
      class01663.N(var1, s, this.N);
   }
}
