package minecraft;

import java.net.SocketAddress;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("minecraft.PacketSent")
@Label("Network Packet Sent")
public class class02780 extends class03199 {
   public static final String R = "minecraft.PacketSent";
   public static final EventType M = EventType.getEventType(class02780.class);

   public class02780(String var1, String var2, String var3, SocketAddress var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }
}
