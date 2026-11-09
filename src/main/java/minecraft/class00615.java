package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.nio.NioIoHandler;

class class00615 extends class00606 {
   class00615(String var1, Class var2, Class var3) {
      super(var1, var2, var3);
   }

   @Override
   protected IoHandlerFactory y() {
      return NioIoHandler.newFactory();
   }
}
