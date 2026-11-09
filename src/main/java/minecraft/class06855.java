package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.kqueue.KQueueIoHandler;

class class06855 extends class00606 {
   class06855(String var1, Class var2, Class var3) {
      super(var1, var2, var3);
   }

   @Override
   protected IoHandlerFactory y() {
      return KQueueIoHandler.newFactory();
   }
}
