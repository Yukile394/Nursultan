package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;
import jdk.jfr.Timespan;

@Name("minecraft.ServerTickTime")
@Label("Server Tick Time")
@Category({"Minecraft", "Ticking"})
@StackTrace(false)
@Period("1 s")
public class class02788 extends Event {
   public static final String N = "minecraft.ServerTickTime";
   public static final EventType y = EventType.getEventType(class02788.class);
   @Name("averageTickDuration")
   @Label("Average Server Tick Duration")
   @Timespan
   public final long L;

   public class02788(float var1) {
      super();
      this.L = (long)(1000000.0F * var1);
   }
}
