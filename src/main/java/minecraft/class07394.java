package minecraft;

import com.google.gson.JsonElement;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.util.List;

public class class07394 extends MessageToMessageEncoder<JsonElement> {
   public class07394() {
      super();
   }

   protected void encode(ChannelHandlerContext var1, JsonElement var2, List<Object> var3) {
      var3.add(new TextWebSocketFrame(var2.toString()));
   }
}
