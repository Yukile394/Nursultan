package minecraft;

import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category({"Minecraft", "Network"})
@StackTrace(false)
@Enabled(false)
public abstract class class03199 extends Event {
   @Name("protocolId")
   @Label("Protocol Id")
   public final String N;
   @Name("packetDirection")
   @Label("Packet Direction")
   public final String y;
   @Name("packetId")
   @Label("Packet Id")
   public final String L;
   @Name("remoteAddress")
   @Label("Remote Address")
   public final String u;
   @Name("bytes")
   @Label("Bytes")
   @DataAmount
   public final int i;

   public class03199(String var1, String var2, String var3, SocketAddress var4, int var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4.toString();
      this.i = var5;
   }
}
