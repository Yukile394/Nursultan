package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;

@Name("minecraft.ClientFps")
@Label("Client fps")
@Category({"Minecraft", "Ticking"})
@StackTrace(false)
@Period("1 s")
public class class02784 extends Event {
   public static final String N = "minecraft.ClientFps";
   public static final EventType y = EventType.getEventType(class02784.class);
   @Name("fps")
   @Label("Client fps")
   public final int L;

   public class02784(int var1) {
      super();
      this.L = var1;
   }
}
