package minecraft;

import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;

@Name("minecraft.NetworkSummary")
@Label("Network Summary")
@Category({"Minecraft", "Network"})
@StackTrace(false)
@Period("10 s")
public class class02779 extends Event {
   public static final String N = "minecraft.NetworkSummary";
   public static final EventType y = EventType.getEventType(class02779.class);
   @Name("remoteAddress")
   @Label("Remote Address")
   public final String L;
   @Name("sentBytes")
   @Label("Sent Bytes")
   @DataAmount
   public long u;
   @Name("sentPackets")
   @Label("Sent Packets")
   public int i;
   @Name("receivedBytes")
   @Label("Received Bytes")
   @DataAmount
   public long R;
   @Name("receivedPackets")
   @Label("Received Packets")
   public int M;

   public class02779(String var1) {
      super();
      this.L = var1;
   }
}
