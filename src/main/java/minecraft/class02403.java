package minecraft;

import io.netty.channel.ChannelHandlerContext;

@FunctionalInterface
public interface class02403 {
   void run(ChannelHandlerContext var1);

   default class02403 N(class02403 var1) {
      return var2 -> {
         this.run(var2);
         var1.run(var2);
      };
   }
}
