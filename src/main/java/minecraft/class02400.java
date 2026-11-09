package minecraft;

import io.netty.channel.ChannelHandlerContext;

@FunctionalInterface
public interface class02400 {
   void run(ChannelHandlerContext var1);

   default class02400 N(class02400 var1) {
      return var2 -> {
         this.run(var2);
         var1.run(var2);
      };
   }
}
