package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Name("minecraft.LoadWorld")
@Label("Create/Load World")
@Category({"Minecraft", "World Generation"})
@StackTrace(false)
public class class02790 extends Event {
   public static final String N = "minecraft.LoadWorld";
   public static final EventType y = EventType.getEventType(class02790.class);

   public class02790() {
      super();
   }
}
