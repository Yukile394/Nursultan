package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.util.List;

public class class07424 extends MessageToMessageDecoder<TextWebSocketFrame> {
   public class07424() {
      super();
   }

   protected void decode(ChannelHandlerContext var1, TextWebSocketFrame var2, List<Object> var3) {
      JsonElement jsonelement = JsonParser.parseString(var2.text());
      var3.add(jsonelement);
   }
}
