package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.local.LocalIoHandler;

class class06819 extends class00606 {
   class06819(String var1, Class var2, Class var3) {
      super(var1, var2, var3);
   }

   @Override
   protected IoHandlerFactory y() {
      return LocalIoHandler.newFactory();
   }
}
