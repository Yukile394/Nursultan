package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.epoll.EpollIoHandler;

class class06821 extends class00606 {
   class06821(String var1, Class var2, Class var3) {
      super(var1, var2, var3);
   }

   @Override
   protected IoHandlerFactory y() {
      return EpollIoHandler.newFactory();
   }
}
