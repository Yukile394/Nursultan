package minecraft;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("minecraft.ChunkRegionWrite")
@Label("Region File Write")
public class class02785 extends class02282 {
   public static final String E = "minecraft.ChunkRegionWrite";
   public static final EventType W = EventType.getEventType(class02785.class);

   public class02785(class02277 var1, class07321 var2, class05530 var3, int var4) {
      super(var1, var2, var3, var4);
   }
}
