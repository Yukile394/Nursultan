package minecraft;

import java.net.InetSocketAddress;

class class03445 implements class03437 {
   @Override
   public int L() {
      return this.N.getPort();
   }

   class03445(InetSocketAddress var1) {
      super();
      this.N = var1;
   }

   @Override
   public InetSocketAddress u() {
      return this.N;
   }

   @Override
   public String y() {
      return this.N.getAddress().getHostAddress();
   }

   @Override
   public String N() {
      return this.N.getAddress().getHostName();
   }
}
